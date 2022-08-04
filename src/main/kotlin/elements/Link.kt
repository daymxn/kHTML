package elements

import util.applyIf
import util.wrapInQuotes

/**
 * Defines the relationship between the current document and an external resource.
 *
 * Most often used to link to external style sheets.
 *
 * @property rel Specifies the relationship between the current document and the linked document.
 * @property href Specifies the location of the linked document.
 * @property type Optional type that specifies what kind of media the linked document is.
 */
class Link(val rel: String, val href: String, val type: String? = null): HTMLElement() {
    override fun toString(): String =
        "<link rel=${rel.wrapInQuotes()} href=${href.wrapInQuotes()}".applyIf(type != null) {
            plus(" type= ${type!!.wrapInQuotes()}")
        }.plus(">")
}
