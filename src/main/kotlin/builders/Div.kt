package builders

import connectors.ex
import elements.Div
import elements.HTMLElement
import util.ContentBlock

/**
 * Helper function to create a [Div] element.
 *
 * This function be called on its own, outside the scope of another [HTMLElement].
 *
 * @param content A scope wrapped in a [Div] element, that allows you to add children and configure any settings.
 */
inline fun div(content: ContentBlock<Div> = {}) = Div().apply(content)

/**
 * Helper method to create a [Div] element, and add it to the parent's [children][HTMLElement.children].
 *
 * This method must be called within the scope of an [HTMLElement].
 *
 * @param content A scope wrapped in a [Div] element, that allows you to add children and configure any settings.
 */
inline fun <reified e: HTMLElement> e.div(content: ContentBlock<Div> = {}) = this ex Div().apply(content)
