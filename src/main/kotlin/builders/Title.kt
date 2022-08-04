package builders

import connectors.ex
import elements.Head
import elements.Title

/**
 * Helper function to create a [Title] element.
 *
 * This function be called on its own, outside the scope of a [Head] element.
 *
 * @param content Specifies the title text to utilize.
 */
fun title(content: String) = Title(content)

/**
 * Helper method to create a [Title] element, and add it to the parent's [children][Head.children].
 *
 * This method must be called within the scope of a [Head] element.
 *
 * @param content Specifies the title text to utilize.
 */
fun Head.title(content: String) = this ex Title(content)
