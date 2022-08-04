package builders

import elements.Head
import elements.Link
import util.applyIf
import util.wrapInQuotes
import connectors.ex

/**
 * Helper function to create a [Link] element.
 *
 * This function be called on its own, outside the scope of a [Head] element.
 *
 * @param rel Specifies the relationship between the current document and the linked document.
 * @param href Specifies the location of the linked document.
 * @param type Optional type that specifies what kind of media the linked document is.
 */
fun link(rel: String, href: String, type: String? = null) = Link(rel, href, type)

/**
 * Helper method to create a [Link] element, and add it to the parent's [children][Head.children].
 *
 * This method must be called within the scope of a [Head] element.
 *
 * @param rel Specifies the relationship between the current document and the linked document.
 * @param href Specifies the location of the linked document.
 * @param type Optional type that specifies what kind of media the linked document is.
 */
fun Head.link(rel: String, href: String, type: String? = null) = this ex Link(rel, href, type)
