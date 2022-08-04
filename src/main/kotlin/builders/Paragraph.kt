package builders

import connectors.ex
import elements.HTMLElement
import elements.Paragraph
import util.ContentBlock

/**
 * Helper method to create a [Paragraph] element, and add it to the parent's [children][HTMLElement.children].
 *
 * This method must be called within the scope of an [HTMLElement].
 *
 * @param content A scope wrapped in a [Paragraph] element, that allows you to add children and configure any settings.
 */
inline fun <reified e: HTMLElement> e.p(content: ContentBlock<Paragraph> = {}) = this ex Paragraph().apply(content)
