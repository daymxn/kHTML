package builders

import elements.Break
import elements.HTMLElement

/**
 * Helper variable to create a [Break] element.
 *
 * When referenced, the get method will add a new [Break] to the parent element's [children][HTMLElement.children].
 */
val <e: HTMLElement> e.br: e
    get() = apply { children.add(Break()) }
