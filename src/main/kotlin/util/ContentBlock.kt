package util

/**
 * Defines a scope for a given [HTMLElement] to be called under.
 *
 * Utilized in most extension function to create an idiomatic way of adding children to elements.
 *
 * @sample example
 */
typealias ContentBlock<T> = (T).() -> Unit
