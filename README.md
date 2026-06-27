# TopicsWiseDSA

Topic-wise Java practice repository for data structures, algorithms, Java 8 streams, collections, and multithreading interview problems.

## Repository Overview

This project is organized by topic under the `src` directory. Each package contains small runnable examples or practice methods that can be used for revision and interview preparation.

## Topics Covered

| Topic | Package / File | Problems and Concepts |
| --- | --- | --- |
| Arrays | `src/ArraysRelatedNotINanCategory/MyMain.java` | Reverse array, rotate array by `k`, move zeroes to end, subarray with given sum, prime check |
| Sliding Window | `src/SlidingWindow/SlidingWindow.java` | Longest substring without repeating characters, maximum sum subarray of size `k` |
| Strings and Hashing | `src/StringRelated/MyMainClass.java` | Valid anagram, group anagrams, two sum, top K frequent elements, permutation in string, reverse string |
| Collections | `src/Collections/CollectionsMain.java` | `HashMap`, `TreeMap`, reverse sorting, map iteration and lookup |
| Java 8 Streams | `src/Java8Package/MainJava8.java` | Stream filtering, summing, nested list filtering, employee-department examples |
| Arrays / Kadane's Algorithm | `src/Threads/Mains.java` | Maximum subarray sum, character frequency with streams |
| Threads | `src/Threads` | Producer-consumer, executor service, singleton, CompletableFuture usage, interview-style thread questions |
| CompletableFuture | `src/ThreadsPackage` | Parallel task execution using `Future` and `CompletableFuture` |

## Project Structure

```text
TopicsWiseDSA/
|-- src/
|   |-- ArraysRelatedNotINanCategory/
|   |-- Collections/
|   |-- Java8Package/
|   |-- SlidingWindow/
|   |-- StringRelated/
|   |-- Threads/
|   `-- ThreadsPackage/
|-- bin/
|-- .classpath
|-- .project
`-- README.md
```

## Prerequisites

- Java JDK 8 or higher
- Eclipse IDE, IntelliJ IDEA, VS Code, or any Java-supported editor

## How to Run

### Option 1: Run from Eclipse

1. Open Eclipse.
2. Select `File > Import > Existing Projects into Workspace`.
3. Choose the `TopicsWiseDSA` folder.
4. Open any class with a `main` method.
5. Right-click the file and select `Run As > Java Application`.

### Option 2: Run from Terminal

From the project root:

```bash
javac -d bin src/SlidingWindow/SlidingWindow.java
java -cp bin SlidingWindow.SlidingWindow
```

Replace `SlidingWindow/SlidingWindow.java` and `SlidingWindow.SlidingWindow` with the package and class you want to run.

## Practice Roadmap

1. Arrays
2. Strings and Hashing
3. Sliding Window
4. Collections
5. Java 8 Streams
6. Threads and Concurrency
7. CompletableFuture and ExecutorService

## Notes

- Most examples are written as standalone Java classes with a `main` method.
- The repository is useful for quick revision before Java, DSA, and backend interview rounds.
- New problems can be added topic-wise by creating a new package under `src`.

## Suggested Future Additions

- Linked List
- Stack and Queue
- Binary Search
- Recursion and Backtracking
- Trees and Binary Search Trees
- Graphs
- Dynamic Programming
- Unit tests for core DSA methods
