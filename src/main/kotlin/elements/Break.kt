package elements

/**
 * Inserts a line break.
 *
 * Can be placed between text, or between elements.
 */
class Break: HTMLElement() {
    override fun toString(): String {
        return "<br>"
    }
}
