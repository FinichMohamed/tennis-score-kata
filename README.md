
# Tennis Score Kata

Ce projet implémente un système simple de gestion du score d'un jeu de tennis en Java 21, conçu avec une approche de développement piloté par les tests (TDD).

## Fonctionnalités

- Respect des règles classiques du scoring au tennis (0, 15, 30, 40, égalité, avantage, victoire)
- Mise à jour du score en ligne de commande via la méthode `play(String sequence)`
- Couverture complète des tests unitaires avec JUnit 5

## Prérequis

- Java 21
- Maven 3.9+

## Compilation et tests

Pour compiler et lancer les tests, exécutez la commande suivante :

```bash
mvn clean test
```

## Utilisation

Pour simuler un déroulement de jeu, utilisez la méthode `play` de la classe `TennisGame` :

```java
TennisGame game = new TennisGame();
game.play("ABABAA");
```

Cette méthode joue la séquence de points donnée en paramètre (A pour Player A, B pour Player B) et affiche le score à chaque point.

## Exemple d'affichage

```
Player A : 15 / Player B : 0
Player A : 30 / Player B : 0
Player A : 40 / Player B : 0
Player A : 40 / Player B : 15
Player A : 40 / Player B : 30
Deuce
Advantage Player A
Deuce
```

## Règles de scoring

Pour rappel, voici les règles standards utilisées dans ce projet :

- Le score passe de 0 à 15, puis 30, puis 40.
- À 40-40, on parle de "Deuce" (égalité).
- Après "Deuce", un joueur peut obtenir un "Avantage".
- Si le joueur avec l'avantage marque à nouveau, il gagne le jeu.
- Si le joueur adverse marque, le score revient à "Deuce".

Pour plus d'informations, voir [Wikipedia Tennis Scoring](http://en.wikipedia.org/wiki/Tennis#Scoring).

---


## 🧱 Structure du projet

```
tennis-score-kata/
├── src/
│   ├── main/
│   │   └── java/com/kata/tennis/
│   │       ├── Score.java
│   │       ├── Player.java
│   │       └── TennisGame.java
│   └── test/
│       └── java/com/kata/tennis/
│           └── TennisGameTest.java
├── README.md
└── pom.xml
```

---
## Tests unitaires

Les tests sont réalisés avec JUnit 5 et couvrent :

- Le score initial
- La progression des points pour chaque joueur
- Les situations de "Deuce" et "Avantage"
- La victoire directe ou après avantage
- Le retour à "Deuce" après perte d'avantage

---

## Auteur

Mohamed FINICH

---

## Licence

Projet open-source, libre d’utilisation.
