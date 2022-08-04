package builders

import connectors.ex
import elements.HTMLElement
import elements.Script
import util.wrapInQuotes

/**
 * Helper function to create a [Script] element.
 *
 * This function be called on its own, outside the scope of another [HTMLElement].
 *
 * @param type Specifies the media type of the script file.
 * @param src Specifies the URL of an external script file.
 */
fun script(type: String, src: String) = Script(type, src)

/**
 * Helper method to create a [Script] element, and add it to the parent's [children][HTMLElement.children].
 *
 * This method must be called within the scope of an [HTMLElement].
 *
 * @param type Specifies the media type of the script file.
 * @param src Specifies the URL of an external script file.
 */
inline fun <reified e: HTMLElement> e.script(type: String, src: String) = this ex Script(type, src)
