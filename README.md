# Lab: MyCharacter

## Objectives

- Create a Java class with static methods.
- Implement basic character-related operations.
- Practice using conditional statements, comparison operators, and logical operators.

## Program Description

A utility class in Java provides static methods that can be used across an application. The Math class in Java is an example of such a utility class, offering common mathematical functions. The `Character` class in Java provides many static methods to work with characters.
In this project, you will create your own simplified utility classes utility class named `MyMath` and `MyCharacter` that provide basic methods similar to those in Java's `Math` and `Character` classes.

These methods will help perform calculations, and check and transform characters **without** using built-in methods from the `Math` nor  `Character` class.

## Program Specifications

### Part 1: MyMath
Create a class named `MyMath`. The class must include the following static methods and constants:

### Constants:
- `public static final double PI = 3.141592653589793;`
- `public static final double E = 2.718281828459045;`

| Return Type | Method | Description |
|------------|--------|-------------|
| `double` | `add(double a, double b)` | Returns the sum of two integers. |
| `double` | `subtract(double a, double b)` | Returns the result of subtracting the second integer from the first. |
| `double` | `multiply(double a, double b)` | Returns the product of two integers. |
| `double` | `divide(double a, double b)` | Returns the result of dividing the first integer by the second. The divisor `b` cannot be zero. |
| `double` | `max(double a, double b)` | Returns the greater of two integers. |
| `double` | `min(double a, double b)` | Returns the smaller of two integers. |
| `boolean` | `isEven(int a)` | Returns `true` if the integer is even, `false` otherwise. |
| `boolean` | `isOdd(int a)` | Returns `true` if the integer is odd, `false` otherwise. |

### Part 1: MyCharacter
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
- Do **not** use the `Math` nor `Character` class methods in your implementation.
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
