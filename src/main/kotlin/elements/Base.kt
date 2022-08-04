package elements

import util.LinkTarget
import util.wrapInQuotes

/**
 * Specifies a default URL and target for all links on a page.
 *
 * There can only be one [Base] element, and it must be inside the [Head].
 *
 * @property href Specifies the base URL for all relative URLs in the page.
 * @property target Specifies the default target for all hyperlinks and forms on the page.
 */
class Base(val href: String, val target: LinkTarget): HTMLElement() {
    override fun toString(): String =
        "<base href=${href.wrapInQuotes()} target=${target.toString().wrapInQuotes()}>"
}
