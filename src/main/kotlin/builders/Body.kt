package builders

import elements.Body
import util.ContentBlock
import connectors.ex
import elements.HTML

/**
 * Helper function to create a [Body] element.
 *
 * This function be called on its own, outside the scope of another [HTMLElement].
 *
 * @param content A scope wrapped in a [Body] element, that allows you to add children and configure any settings.
 */
inline fun body(content: ContentBlock<Body> = {}) = Body().apply(content)

/**
 * Helper method to create a [Body] element, and add it to the parent's [children][HTML.children].
 *
 * This method must be called within the scope of an [HTML] element.
 *
 * @param content A scope wrapped in a [Body] element, that allows you to add children and configure any settings.
 */
inline fun HTML.body(content: ContentBlock<Body> = {}) = this ex Body().apply(content)
