# Contributing

Any and all contributions are entirely welcomed! Before you contribute though, there are
some things you should know.

## Getting started

Since this project is very lightweight, I didn't bother creating any subdirectory
specific markdown files for design and engineering purposes. Generally speaking, the repo is designed as such:

```
elements/
    Element.kt -> Contains the base definition of your element.
builders/
    Element.kt -> Contains additional helper methods for creating your element.
util/
    ElementType.kt -> Contains extra class(es) for your element
```


## Making changes

To make changes, clone the repo to your local disk

`git clone git@github.com:daymxn/kHTML.git`

Then, checkout to a new feature branch labeled in the following format

`git checkout -b NAME-CATEGORY-FEATURE`

Where `NAME` is your *firstLast* name or your *github* username. `CATEGORY` is something like; feature or bugfix.
And `FEATURE` is the title of the new feature (or bug) you're contributing for.

After you've made changes to your local branch, and you want to submit, you can open a Pull Request (PR)
via the [GitHub web panel](https://github.com/daymxn/kHTML/compare).

> Note that making public contributions to this repo means you accept the LICENSE in place, and are contributing code that also respects that same license

### Code Formatting

Code in this repo is formatted with the ktfmt tool for google-java-format. You can enable
this formatting in IntelliJ by downloading and installing the
[ktfmt plugin](https://github.com/facebookincubator/ktfmt).
