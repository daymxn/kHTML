package builders

import elements.HTML
import util.ContentBlock

/**
 * Helper function to create an [HTML] element.
 *
 * This function be called on its own, outside the scope of another [HTMLElement].
 *
 * @param content A scope wrapped in a [HTML] element, that allows you to add children and configure any settings.
 */
inline fun html(content: ContentBlock<HTML> = {}) = HTML().apply(content)
