package connectors

import elements.HTMLElement

/**
 * Adds a given [HTMLElement] to the [children][HTMLElement.children] of the parent element.
 *
 * Helper infix function to allow idiomatic addition of elements, usually retrieved from an external function.
 *
 * @param element the [HTMLElement] to add.
 * @see addingelementsfunctionally
 */
infix fun <T: HTMLElement> T.ex(element: HTMLElement) = also { children.add(element) }

/**
 * Adds a list of given [HTMLElements][HTMLElement] to the [children][HTMLElement.children] of the parent element.
 *
 * Helper infix function to allow idiomatic addition of elements, usually retrieved from an external function.
 *
 * @param elements a list of [HTMLElements][HTMLElement] to add.
 * @see addingelementsfunctionally
 */
infix fun <T: HTMLElement> T.ex(elements: List<HTMLElement>) = also { children.addAll(elements) }
