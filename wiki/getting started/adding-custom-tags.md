[//]: # (title: Adding Custom Tags)
[//]: # (order: 6)

This section covers how to add your own elements and tags.

## Let me do my own thing!

All elements in kHTML are children of the base element `HTMLElement`. This class is abstract and public by design, so
implementing your own tags doesn't require you to recompile the source!

All you need to do is extend the base element, and provide a tag for the element.

```kotlin
class CustomElement : HTMLElement("customElement")
```

And that's it, your element is ready to use!

## Adding custom props

You can take advantage of the `immutableAdditionalProps` to add your own required props during construction.

```kotlin
class Person(val name: String) : HTMLElement("person", immutableAdditionalProps = mapOf("name" to name))
```

If you want to provide optional properties, you can take advantage of kotlin's idiomatic getters/setters.

```kotlin
class Person : HTMLElement("person") {
    var name: String = ""
        set(value) {
            field = name
            additionalProps["name"] = value
        }
}
```

## Changing how the element is rendered

The default rendering scheme compiles elements in the format of:

```kotlin
"<[TAG] [PROPS]>[CHILDREN]</[TAG]>"
```

Which may not be suitable for some elements. For example, the **br** element requires its own format:
```kotlin
"<br>"
```

To provide your own rendering scheme, all you have to do is override the `toString()` method.
```kotlin
class Person(val name: String) : HTMLElement("person") {
    override fun toString() = "<$name>"
}
```

Although, if you provide your own rendering scheme, don't forget to include children (if your element should support them).

```kotlin
class Person(val name: String) : HTMLElement("person") {
    override fun toString() =
        "<person_$name>$children</person_$name>"
}
```

This will automatically recursively call the `toString()` method on each child, compiling them to the expected HTML.

## Creating builder methods

All provided kHTML elements come with their own builder variants to make implementing them easier. You can create these
methods for your own elements as well.

```kotlin
inline fun person(content: ContentBlock<Person> = {}) = Person().apply(content)
inline fun <reified e: HTMLElement> e.div(content: ContentBlock<Person> = {}) = this ex Person().apply(content)
```

The first method allows you to create `Person` elements on their own, like so:

```kotlin
fun makePerson(name: String) = 
    person {
        this write name
    }
```

The second method allows you to create and automatically add a `Person` element to another `HTMLElement`, like so:

```kotlin
div {
    person {
        this write "Daymon"
    }
}
```
