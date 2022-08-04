package elements

/**
 * Defines the title of the document.
 *
 * There can only be one [Title] element, and it must be inside the [Head].
 *
 * @property content Specifies the title text to utilize.
 */
class Title(val content: String): HTMLElement("title", children = mutableListOf(TextLiteral(content)))
