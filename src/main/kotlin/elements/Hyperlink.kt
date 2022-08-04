package elements

import util.LinkTarget
import util.putIfNotNull

/**
 * Used to link from one page to another.
 *
 * A link is normally displayed in the current browser window, unless you specify another [target][LinkTarget].
 *
 * @property href Specifies the URL of the page the link goes to.
 * @property target Specifies where to open the linked document.
 */
class Hyperlink(val href: String, val target: LinkTarget?) :
    HTMLElement("a",
            additionalImmutableProps = mutableMapOf("href" to href).apply { putIfNotNull("target", target?.toString()) }
    )
