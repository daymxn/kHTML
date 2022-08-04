package builders

import connectors.ex
import elements.HTMLElement
import elements.Hyperlink
import util.ContentBlock
import util.LinkTarget

/**
 * Helper function to create a [Hyperlink] element.
 *
 * This function be called on its own, outside the scope of another [HTMLElement].
 *
 * @param href Specifies the URL of the page the link goes to.
 * @param target Specifies where to open the linked document.
 * @param content A scope wrapped in a [Hyperlink] element, that allows you to add children and configure any settings.
 */
inline fun a(href: String, target: LinkTarget? = null, content: ContentBlock<Hyperlink> = {}) = Hyperlink(href, target).apply(content)

/**
 * Helper method to create a [Hyperlink] element, and add it to the parent's [children][HTMLElement.children].
 *
 * This method must be called within the scope of an [HTMLElement].
 *
 * @param href Specifies the URL of the page the link goes to.
 * @param target Specifies where to open the linked document.
 * @param content A scope wrapped in a [Hyperlink] element, that allows you to add children and configure any settings.
 */
inline fun <reified e: HTMLElement> e.a(href: String, target: LinkTarget? = null, content: ContentBlock<Hyperlink> = {}) = this ex Hyperlink(href, target).apply(content)
