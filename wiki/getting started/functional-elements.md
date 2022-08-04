[//]: # (title: Functional Elements)
[//]: # (order: 3)

This section covers how to create elements functionally.

## Fun()ctional who?

Up until now, we've had to declare all the elements we want for a given tree in-line.
This isn't always the most feasible, nor is it very desirable. You often want your
elements to be modular and reusable. Thankfully, kHTML allows you to do that, by taking
advantage of the `ext` infix method.

```kotlin
fun makeBody() =
    body {
        this txt "Hello world!"
    }

html {
    this ext makeBody()
}
```

As always, you can alternatively directly call the method instead.

```kotlin
fun makeBody() =
    body {
        this txt "Hello world!"
    }

html {
    ext(makeBody())
}
```

Or if you're feeling dangerous, you don't even need to include the scope block.

```kotlin
fun makeBody() =
    body {
        this txt "Hello world!"
    }

html().ext(makeBody())
```

Which also means you can reduce your `makeBody` function to method calls.

```kotlin
fun makeBody() = body().txt( "Hello world!")

html().ext(makeBody())

// or...

fun makeBody() = body() txt "Hello world!"

html() ext makeBody()
```


In an ideal world, you would be able to call the method directly (within the scope), without the need for
the extension (`ext`) method, like so:
```kotlin
html {
    makeBody()
}
```
Unfortunately, without heavy reflection- it's not possible to know when and if an arbitrary method is called within a
defined scope. The next best thing would be to provide an easy way to add the arbitrary elements, in a predefined way.
One could also argue that this makes it easier to tell where user-defined elements are
originating from, but that's a design opinion at the end of the day.
