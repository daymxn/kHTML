[//]: # (title: Configuring Elements)
[//]: # (order: 5)

This section covers how to configure elements.

## Where do I set the rules?

Elements often need more configuration than just their basic state, and some have required configurations. These are
often referred to as "props". You can configure the most common props within your element's scope.

```kotlin
div {
    id = "daymonDiv"
    styles += "color: #FFF"
    classes += "daymonRelated"
    
    this txt "My name is Daymon!"
}
```

`styles` and `classes` offer a way for you to add multiple styles and classes to elements at a time. Although, sometimes
you may already have a long list of configurations to assign. If you don't want to manually create a list of styles or
classes, just to add them, you can instead use the `style` and `className` helper properties.

```kotlin
div {
    style = "color: #FFF; text-align: center; font-size: 5rem; font-family: cursive"
    className = "daymonRelated names divs mainContent"
    this txt "My name is Daymon!"
}
```

## Required props

Some elements have what's referred to as required props- meaning the element can not be created without supplying the
props. You have to pass these props to the element inside the constructor during creation.

```kotlin
div {
    a(href = "https://daymxn.com") { // specifying the name of the prop is not required
        this txt "Visit my website!"
    }
}
```

## Custom props

If any elements are missing a prop you need, or maybe you want to add some to your own element, you can utilize the
`additionalProps` property.

```kotlin
html {
    additionalProps += "lang" to "en"
}
```

## Predefined configurations

Oftentimes, elements may require the same set of props- but just slightly different. Or maybe your element requires
a large amount of props that would otherwise cloud up your methods. For times like these, kHTML offers an idiomatic way
to save and reuse your props- called configurations.

```kotlin
val config: HTMLElementConfig<Div> = {
    classes += "logEntry"
    styles += "text-align: center"
}

fun logEntry(name: String) = 
    div {
        this withConfig config
        p {
            this write name
        }
    }
```

If your configurations are dynamic, you can provide your own function to generate them.

```kotlin
fun Div.config(name: String) {
    if(name.isNotBlank()) {
        classes += "logEntry"
        styles += "text-align: center"
    }
}

fun logEntry(name: String) = 
    div {
        config(name) // custom functions don't require the withConfig infix method
        p {
            this write name
        }
    }
```
