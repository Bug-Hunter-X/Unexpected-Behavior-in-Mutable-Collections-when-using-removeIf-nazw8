# Kotlin Mutable Collection Iteration Bug

This repository demonstrates an uncommon but easily encountered bug in Kotlin when using the `removeIf` function on mutable collections like `MutableList` and `MutableMap`. The bug stems from modifying the collection while directly iterating over it.

## Bug Description
The `removeIf` function iterates through the collection and removes elements based on a predicate.  However, if the removal of an element affects the iteration process (e.g., by shifting indices), it can lead to unexpected elements being skipped or not removed.

## Reproduction
The `bug.kt` file shows the original code with the bug.  Run this code and observe the output; it's likely not what you expect.

## Solution
The `bugSolution.kt` file provides a solution, demonstrating the correct way to iterate and remove elements from a mutable collection to avoid these issues. 

## How to Solve this bug
Always create a copy of the iterable object or use an iterator in a way that does not invalidate the iteration.