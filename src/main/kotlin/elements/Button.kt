package elements

import util.ButtonType

/**
 * Defines a clickable button.
 *
 * You can use other [HTMLElement] tags inside buttons as well.
 *
 * @property type Tells the browser what this button should do when clicked.
 */
class Button(val type: ButtonType) : HTMLElement("button", additionalImmutableProps = mapOf("type" to type.toString()))
