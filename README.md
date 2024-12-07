# Kotlin NumberFormatException Handling

This example showcases a common error in Kotlin: the `NumberFormatException` that can occur when attempting to convert a String to an integer using `toInt()`.  The included `bug.kt` file demonstrates this potential error, while `bugSolution.kt` provides an improved solution. 

**Problem:**
The `processData` function in `bug.kt` is vulnerable to `NumberFormatException` if the input string `data` is not a valid integer representation. This leads to a potential program crash or unexpected behavior.

**Solution:**
The `bugSolution.kt` file provides a more robust approach using `toIntOrNull()` which returns null instead of throwing an exception if conversion fails. This allows cleaner error handling and prevents unexpected crashes.