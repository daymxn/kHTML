package util

import elements.HTMLElement

/**
 * Defines a configurable block for a given [HTMLElement].
 *
 * Optional alternative to functionally define configurations of elements.
 *
 * @see configs
 */
typealias HTMLElementConfig<T> = (T).() -> Unit

/**
 * Links an [HTMLElement] with an [HTMLElementConfig].
 *
 * Helper infix function to allow idiomatic linkage between an element, and its respective configuration.
 *
 * @param config the [HTMLElementConfig] to link with.
 * @see configs
 */
infix fun <T: HTMLElement> T.withConfig(config: HTMLElementConfig<T>) = also { config() }
