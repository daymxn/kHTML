[//]: # (title: Basics)
[//]: # (order: 1)

This section covers the basics of kHTML.

## From Zero to Hero

An _element_ in kHTML is a 1:1 representation of an element in HTML (for the most part).
You can create an element in kHTML by calling the given helper function for the element, and then using the extension
methods of elements to add children. Most commonly, this will start from the HTML tag, like so:

```kotlin
html {
    body {
        div {}
    }
}
```
Each `HTMLElement` has a property called `children`, which keeps track of all sub elements for that given
element. You can take advantage of this by declaring more elements, and kHTML will handle adding
the elements to the respective `children` property.

```kotlin
html {
    body {
        div {}
        div {}
        div {}
    }
}
```

Some elements will even have their own special properties, like hyperlinks.

```kotlin
html {
    body {
        div {}
        a("https://daymxn.com") {
            // more content
        }
    }
}
```

And since kHTML elements are objects, you can even store the elements in variables

```kotlin
val webContent = html {
    body {
        // more content
    }
}
```

## Compiling kHTML to HTML

All kHTML elements override the default `toString()` method, and provide a means for the element
to be translated to raw HTML. This is a recursive solution, so compiling a parent element will also
compile all of its children.

```kotlin
val webContent = html {
    body {
        // more content
    }
}

return webContent.toString()
```
Output:
```
<html><body></body></html>
```
