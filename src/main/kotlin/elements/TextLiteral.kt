package elements

/**
 * Helper element that wraps text in an [HTMLElement].
 *
 * Utilized as a way to keep the [children][HTMLElement.children] of an [HTMLElement] as a common type.
 *
 * @property text The string to wrap an element around.
 *
 * @see [txt]
 */
class TextLiteral(val text: String): HTMLElement() {
    override fun toString(): String {
        return text
    }
}
