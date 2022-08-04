package connectors

import elements.HTMLElement

/**
 * Adds a given [HTMLElement] to the [children][HTMLElement.children] of the parent element.
 *
 * Helper infix function to allow idiomatic addition of elements, usually retrieved from an external function.
 *
 * @param element the [HTMLElement] to add.
 * @see additionalwaystoaddelements
 */
infix fun <T: HTMLElement> T.con(element: HTMLElement) = this ex element

/**
 * Adds a list of given [HTMLElements][HTMLElement] to the [children][HTMLElement.children] of the parent element.
 *
 * Helper infix function to allow idiomatic addition of elements, usually retrieved from an external function.
 *
 * @param elements a list of [HTMLElements][HTMLElement] to add.
 * @see additionalwaystoaddelements
 */
infix fun <T: HTMLElement> T.con(elements: List<HTMLElement>) = this ex elements

/**
 * Adds the given text to the [children][HTMLElement.children] of the parent element.
 *
 * Helper infix function to allow idiomatic addition of text elements, which automatically converts
 * the string to a [TextLiteral].
 *
 * @param text the text to add.
 * @see additionalwaystoaddelements
 */
infix fun <T: HTMLElement> T.con(text: String) = this txt text

/**
 * Adds a list of text to the [children][HTMLElement.children] of the parent element.
 *
 * Helper function to allow idiomatic addition of text elements, which automatically converts the
 * strings to their respective [TextLiteral].
 *
 * This is split off into a pure function (non infix), as it would otherwise have
 * the same signature as another [con].
 *
 * @param texts a list of text to add.
 * @see additionalwaystoaddelements
 */
fun <T: HTMLElement> T.con(vararg texts: String) = texts.forEach { this txt it }
