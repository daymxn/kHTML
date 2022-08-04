[//]: # (title: Text)
[//]: # (order: 2)

This section covers how to add Text to elements.

## How do I get to Texas from here?

Elements in their own right are all fun and games, but a webpage isn't complete without
some actual text content to fill it. You can add text to an element at any stage, as you
normally would in html, by utilizing the `txt` infix operator.

```kotlin
html {
    body {
        this txt "Hello world!"
    }
}
```

Alternatively, you can call the `txt()` method on any `HTMLElement`- if that's more your style.

```kotlin
html {
    body {
        txt("Hello world!")
    }
}
```

Both of these samples do the same thing, they append the provided text as a child to the parent element.
Although, children of elements must be of type `HTMLElement`, so the provided string is first
translated into a wrapper element called `TextLiteral`.

```kotlin
class TextLiteral(val text: String): HTMLElement() {
    override fun toString(): String {
        return text
    }
}
```

This serves as a way for text to be provided to an `HTMLElement`, while still retaining type safety.

Compiling either of the above segments will look like so:
```
<html><body>Hello world!</body></body>
```

## Adding even more text

The aforementioned methods are not limited to a single string, they also offer overrides
for a `List<String>`.

```kotlin
val people = listOf("Daymon", "Gerdin", "Armandizzle")

html {
    body {
        this txt people
    }
}
```

Or if you wanted to go old-school, you could also add them individually.

```kotlin
val people = listOf("Daymon", "Gerdin", "Armandizzle")

html {
    body {
        people.forEach { 
            this txt it
        }
    }
}
```

## Calling methods

The cool thing about the `txt` infix/method, is that they only care about the final type. So long
as you provide them with a `String` (or even a `List<String>`)- they don't care where it comes from.

```kotlin
fun convertAgeToColor(age: Int) = 
    when(age) {
        in 0..10 -> "Blue"
        in 11..20 -> "Red"
        in 21..30 -> "Green"
        else -> "Yellow"
    }

val people = listOf(16, 13, 12, 30, 51)
html {
    body {
        this txt people.map(::convertAgeToColor)
    }
}
```
