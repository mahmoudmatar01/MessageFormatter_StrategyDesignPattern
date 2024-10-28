# MessageFormatter_StrategyDesignPattern

This project demonstrates the **Strategy Design Pattern** by implementing a versatile message formatting system. Using this approach, different message formats such as JSON, XML, and plain text can be applied to a message based on the selected strategy.

---

## Table of Contents

1. [Features](#features)
2. [Technologies](#technologies)
3. [Design Pattern Explanation](#design-pattern-explanation)
4. [Usage](#usage)

---

## Features

- **Strategy Design Pattern** implementation for flexible message formatting.
- Supports **JSON**, **XML**, and **Plain Text** formats for messages.
- **Runtime flexibility** to switch between different message formats.

---

## Technologies

- **Language**: Java
- **Pattern**: Strategy Design Pattern

---

## Design Pattern Explanation

The Strategy Design Pattern is employed to provide interchangeable formatting algorithms for messages. This design enables the application to switch between different formatting styles at runtime based on user needs.

### Classes Overview

- **`MessageFormatter` Interface**: Defines the structure for formatting strategies, including methods to format the message and get the format type.
    - **`JsonMessageFormatter`**: Formats messages in JSON.
    - **`XmlMessageFormatter`**: Formats messages in XML.
    - **`PlainTextMessageFormatter`**: Formats messages in plain text.
- **`MessageContext`**: Context class that uses a `MessageFormatter` to apply a chosen message format.

---

## Usage

### Setup

1. Clone the repository and import it into your Java IDE.
2. Compile and run the `Main` class to see the Strategy Design Pattern in action.

### Example Code

Here’s an example code snippet illustrating how the system works:

```java
public class Main {
    public static void main(String[] args) {
        // Create a message context with an initial formatter
        MessageContext messageContext = new MessageContext(new JsonMessageFormatter());
        System.out.println(messageContext.getFormatterType() + " Format ");
        System.out.println(messageContext.formatMessage("Hello, World!"));

        // Change formatter to XML
        messageContext.setMessageFormatter(new XmlMessageFormatter());
        System.out.println(messageContext.getFormatterType() + " Format ");
        System.out.println(messageContext.formatMessage("Hello, World!"));

        // Change formatter to Plain Text
        messageContext.setMessageFormatter(new PlainTextMessageFormatter());
        System.out.println(messageContext.getFormatterType() + " Format ");
        System.out.println(messageContext.formatMessage("Hello, World!"));
    }
}
```

### Expected Output

``` mathematica
JSON Format
{ "message": "Hello, World!" }
XML Format
<message>Hello, World!</message>
PLAIN_TEXT Format
Hello, World!
```
