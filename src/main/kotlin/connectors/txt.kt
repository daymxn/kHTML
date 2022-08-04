package connectors

import elements.HTMLElement
import elements.TextLiteral

/**
 * Adds the given text to the [children][HTMLElement.children] of the parent element.
 *
 * Helper infix function to allow idiomatic addition of text elements, which automatically converts
 * the string to a [TextLiteral].
 *
 * @param text the text to add.
 * @see addingtexttoelements
 */
infix fun <T: HTMLElement> T.txt(text: String) = also { children.add(TextLiteral(text)) }

/**
 * Adds a list of text to the [children][HTMLElement.children] of the parent element.
 *
 * Helper infix function to allow idiomatic addition of text elements, which automatically converts the
 * strings to their respective [TextLiteral]
 *
 * @param texts a list of text to add.
 * @see addingtexttoelements
 */
infix fun <T: HTMLElement> T.txt(texts: List<String>) = also { texts.forEach { children.add(TextLiteral(it)) } }
