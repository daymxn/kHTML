<p align="center">
<img src="wiki/logo.svg" alt="kHTML logo" width="350"/>
</p>

![GitHub release (latest by date)](https://img.shields.io/github/v/release/daymxn/kHTML?style=flat-square)
![GitHub last commit (branch)](https://img.shields.io/github/last-commit/daymxn/kHTML/master?style=flat-square)
![GitHub issues](https://img.shields.io/github/issues/daymxn/kHTML?style=flat-square)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/daymxn/kHTML?style=flat-square)
![GitHub](https://img.shields.io/github/license/daymxn/kHTML?style=flat-square)
# kHTML

Super light-weight HTML5 DSL written in pure Kotlin!

Learn how to use kHTML by reading our wiki [here.](https://daymxn.github.io/kHTML/en/overview/)

## Example

```kotlin
fun makeUserDisplay(users: List<String>) =
    html {
        body {
            this write users.map { userEntry(it) }
        }
    }

fun userEntry(name: String) =
    div {
        p {
            this write "Hello! My name is $name"
        }
    }
```

## Installation

Unfortunately, kHTML artifacts are not currently available on maven central. The reasoning for this can be found [here.](https://github.com/daymxn/kHTML/issues/1)

For the time being, you can pull kHTML artifacts from GitHub Packages.

**_Gradle_**
```kotlin
implementation("com.daymxn:khtml:1.0.0")
```

**_Maven_**
```xml
<dependency>
  <groupId>com.daymxn</groupId>
  <artifactId>khtml</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Notable features

- 1:1 Mapping between HTML elements and Kotlin classes
- Easily compile kHTML elements to string representations of HTML5
- Functional element creation support
- Fully documented API
- Modular API to allow easy extendability
- Lightweight DSL

## Roadmap

- Add unit tests
- Add support for additional common HTML5 elements
- Extend elements to offer _all_ props typically offered from their HTML counterpart

## Getting Started

[Basics](https://daymxn.github.io/kHTML/en/getting%20started/basics/)

[Adding Text](https://daymxn.github.io/kHTML/en/getting%20started/text/)

[Functional Elements](https://daymxn.github.io/kHTML/en/getting%20started/functional-elements/)

[More Functional Elements](https://daymxn.github.io/kHTML/en/getting%20started/functional-elements-again/)

[Configuring Elements](https://daymxn.github.io/kHTML/en/getting%20started/configuring-elements/)

[Adding custom Tags](https://daymxn.github.io/kHTML/en/getting%20started/adding-custom-tags/)

## Contributing

Contributions are always welcome!

See [contributing.md](/contributing.md) for ways to get started.


## License

[Apache 2.0](/LICENSE)
