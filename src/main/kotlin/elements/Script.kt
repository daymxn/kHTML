package elements

import util.wrapInQuotes

/**
 * Links to an external script file (usually JavaScript).
 *
 * Although it is normally possible within HTML, embedded JavaScript is not currently supported in this DSL.
 *
 * @property type Specifies the media type of the script file.
 * @property src Specifies the URL of an external script file.
 */
class Script(val type: String, val src: String): HTMLElement() {
    override fun toString() = "<script type=${type.wrapInQuotes()} src=${src.wrapInQuotes()} />"
}
