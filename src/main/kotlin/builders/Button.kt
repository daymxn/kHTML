package builders

import connectors.ex
import elements.Button
import elements.HTMLElement
import util.ButtonType
import util.ContentBlock

/**
 * Helper function to create a [Button] element.
 *
 * This function be called on its own, outside the scope of another [HTMLElement].
 *
 * @param type Tells the browser what this button should do when clicked.
 * @param content A scope wrapped in a [Button] element, that allows you to add children and configure any settings.
 */
inline fun button(type: ButtonType, content: ContentBlock<Button> = {}) = Button(type).apply(content)

/**
 * Helper method to create a [Button] element, and add it to the parent's [children][HTMLElement.children].
 *
 * This method must be called within the scope of an [HTMLElement].
 *
 * @param type Tells the browser what this button should do when clicked.
 * @param content A scope wrapped in a [Button] element, that allows you to add children and configure any settings.
 */
inline fun <reified e: HTMLElement> e.button(type: ButtonType, content: ContentBlock<Button> = {}) = this ex Button(type).apply(content)
