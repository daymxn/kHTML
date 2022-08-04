package builders

import elements.Base
import util.LinkTarget
import connectors.ex
import elements.Head

/**
 * Helper function to create a [Base] element.
 *
 * This function be called on its own, outside the scope of a [Head] element.
 *
 * @param href Specifies the base URL for all relative URLs in the page.
 * @param target Specifies the default target for all hyperlinks and forms on the page.
 */
fun base(href: String, target: LinkTarget) = Base(href, target)

/**
 * Helper method to create a [Base] element, and add it to the parent's [children][Head.children].
 *
 * This method must be called within the scope of a [Head] element.
 *
 * @param href Specifies the base URL for all relative URLs in the page.
 * @param target Specifies the default target for all hyperlinks and forms on the page.
 */
fun Head.base(href: String, target: LinkTarget) = this ex Base(href, target)
