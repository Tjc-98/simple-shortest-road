# simple-shortest-road

Shortest road finder through a four-zone network in Java.

---

## About

Written in Java, this project calculates the shortest route from a start point X to an end point Y through intermediate zones U and V. The user provides the number of U and V stations and the distances between them. The program then finds the combination of U and V stations that minimizes total distance and prints the result.

## Usage

Run the program and follow the prompts to enter the number of stations for U and V, followed by the distances for each segment (X to U, U to V, and V to Y). The shortest path and its length are printed to stdout.

## Getting Started

### Prerequisites

- Java 8 or later

### Building

**Unix**
```
javac GetTheShortestRoad.java ShortestRoad.java
```

**Windows**
```
javac GetTheShortestRoad.java ShortestRoad.java
```

### Running

**Unix**
```
java GetTheShortestRoad
```

**Windows**
```
java GetTheShortestRoad
```

---

MIT License - see [LICENSE](LICENSE)
