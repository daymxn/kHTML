package builders

import elements.Head
import util.ContentBlock
import connectors.ex
import elements.HTML

/**
 * Helper function to create a [Head] element.
 *
 * This function be called on its own, outside the scope of another [HTMLElement].
 *
 * @param content A scope wrapped in a [Head] element, that allows you to add children and configure any settings.
 */
inline fun head(content: ContentBlock<Head> = {}) = Head().apply(content)

/**
 * Helper method to create a [Head] element, and add it to the parent's [children][HTML.children].
 *
 * This method must be called within the scope of an [HTML] element.
 *
 * @param content A scope wrapped in a [Head] element, that allows you to add children and configure any settings.
 */
inline fun HTML.head(content: ContentBlock<Head> = {}) = this ex Head().apply(content)
