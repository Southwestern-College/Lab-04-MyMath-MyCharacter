# Lab: MyCharacter

## Objectives

- Create a Java class with static methods.
- Implement basic character-related operations.
- Practice using conditional statements, comparison operators, and logical operators.

## Program Description

The `Character` class in Java provides many static methods to work with characters.  
In this project, you will create your own simplified utility class named `MyCharacter` that provides basic methods similar to those in Java’s `Character` class.

These methods will help check and transform characters **without** using built-in methods from the `Character` class.

## Program Specifications

Create a class named `MyCharacter`. The class must include the following static methods:

| Return Type | Method | Description |
|-------------|--------|-------------|
| `boolean`   | `isLetter(char c)` | Returns `true` if `c` is an uppercase or lowercase letter (A–Z or a–z), otherwise returns `false`. |
| `boolean`   | `isDigit(char c)` | Returns `true` if `c` is between '0' and '9', otherwise returns `false`. |
| `boolean`   | `isUpperCase(char c)` | Returns `true` if `c` is an uppercase letter (A–Z). |
| `boolean`   | `isLowerCase(char c)` | Returns `true` if `c` is a lowercase letter (a–z). |
| `char`      | `toUpperCase(char c)` | If `c` is a lowercase letter, returns its uppercase version. Otherwise, returns `c` unchanged. |
| `char`      | `toLowerCase(char c)` | If `c` is an uppercase letter, returns its lowercase version. Otherwise, returns `c` unchanged. |

### Notes:
- Do **not** use the `Character` class methods in your implementation.
- Use comparison operators (`<`, `>`, `==`, `!=`) and conditional statements (`if`, `else`) to implement the logic.
- ASCII values may help! (e.g., `'A'` to `'Z'` are consecutive values).

## Sample Test

The following tester class should be saved in a separate file named `TestMyCharacter.java`.

```java
public class TestMyCharacter {
    public static void main(String[] args) {
        System.out.println(MyCharacter.isLetter('A'));   // true
        System.out.println(MyCharacter.isLetter('9'));   // false
        System.out.println(MyCharacter.isDigit('5'));    // true
        System.out.println(MyCharacter.isUpperCase('Z')); // true
        System.out.println(MyCharacter.isLowerCase('z')); // true
        System.out.println(MyCharacter.toUpperCase('b')); // B
        System.out.println(MyCharacter.toLowerCase('M')); // m
        System.out.println(MyCharacter.toUpperCase('!')); // !
    }
}
```

## Coding Standards

1. Follow the program specifications.
2. Use meaningful variable names.
3. Remove any auto-generated comments.
4. Use JavaDoc to document your code.
5. Include a program description and attribute yourself using the `@author`.
6. Your output should be user-friendly.

For documentation reference: [JavaDoc](https://en.wikipedia.org/wiki/Javadoc)
