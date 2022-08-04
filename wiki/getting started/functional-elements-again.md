[//]: # (title: More Functional Elements)
[//]: # (order: 4)

This section covers how to create elements functionally.

## How many functions do we need?

From a stylistic point of view, you may think that the extension (`ext`) methods are
horrendous, and should be burned with fire. Don't worry, I won't take it to the heart.
I get that the style is not for everyone. Thankfully, I'm a nice guy- generous even.
Along with the extension methods, you can take advantage of two other infix methods:
`con` and `write`.

## con mi funcion

```kotlin
fun userEntry(name: String) =
    div {
        this txt "Hello, my name is $name!"
    }

html {
    body {
        this con userEntry("Daymon")
    }
}
```

Derived from the spanish preposition of "with", `con` describes that one element is
coming "with" another element.

## ~~Write~~ The right way

What? ¿Tu español es malo? Fine, I guess you can use `write`:

```kotlin
fun userEntry(name: String) =
    div {
        this txt "Hello, my name is $name!"
    }

html {
    body {
        this write userEntry("Daymon")
    }
}
```

Personally, `write` is my favorite. It just feels... right.

## Consistency with text

You can also utilize both of these infix methods to make writing text more idiomatic as well,
if consistency is your thing.

```kotlin
div {
    this txt "Hello, my name is $name!"
    this con "Hello, my name is $name!"
    this write "Hello, my name is $name!"
}
```

Unfortunately, if you want to take advantage of either of these infix methods for multiple `String` at
a time, you'll be unable to utilize the `infix` variant.

```kotlin
val people = listOf("Daymon", "Gerdin", "Armandizzle")

div {
    con(people)
    write(people)
}
```

Although, you can always go the old-school route as well.

```kotlin
val people = listOf("Daymon", "Gerdin", "Armandizzle")

div {
    people.forEach { 
        this con it
        this write it
    }
}
```

The reason you're unable to take advantage of the infix variant, is that the common
naming between the methods overlaps when used alongside `List<HTMLElement>`. So, you **can**
still use the infix variants for multiple elements- but not `List<String>`.

```kotlin
val people = listOf("Daymon", "Gerdin", "Armandizzle")
fun personEntry(name: String) =
    div {
        this txt "Hello, my name is $name!"
    }

body {
    this con people.map(::personEntry)
    this write people.map(::personEntry)
}
```
