package elements

import util.joinToStringOrNull
import util.plusIfAbsent
import util.putIfNotNull
import util.wrapInQuotes

/**
 * The base class for all HTML elements.
 *
 * An element is a single tag, or block, of HTML on a page.
 * This class also defines all the global attributes for elements.
 *
 * @property tag The text to use for the HTML's tag.
 * @property styles A list of inline CSS styles for the element.
 * @property id Specifies a unique id for the element.
 * @property classes A list of classnames for the element, usually referring to a style sheet.
 * @property additionalProps Map for extra props to be added- that may not currently be support, or are needed on a niche basis.
 * @property additionalImmutableProps Map for extra props to be added, that should be changed. Usually utilized from required class props (like [href][Hyperlink.href])
 * @property children A list of all sub elements (if any) for this element.
 */
abstract class HTMLElement(
    val tag: String = "",
    val styles: MutableList<String> = mutableListOf(),
    var id: String? = null,
    val classes: MutableList<String> = mutableListOf(),
    val additionalProps: MutableMap<String, String> = mutableMapOf(),
    val additionalImmutableProps: Map<String, String> = mutableMapOf(),

    val children: MutableList<HTMLElement> = mutableListOf()
) {

    /**
     * Helper variable for [styles][HTMLElement.styles].
     *
     * Reading this variable will return all current styles in this element, as they would read in compiled HTML.
     * Setting this variable will add the style(s) to styles.
     *
     * You can also set multiple styles in one go.
     *
     * @see example
     */
    var style: String
        get() = styles.joinToString(";")
        set(value) = value.split(";").forEach { styles.add(it) }

    /**
     * Helper variable for [classes][HTMLElement.classes].
     *
     * Reading this variable will return all current classes in this element, as they would read in compiled HTML.
     * Setting this variable will add the classes(s) to classes.
     *
     * You can also set multiple classes in one go.
     *
     * @see example
     */
    var className: String
        get() = classes.joinToString(" ")
        set(value) = value.split(" ").forEach { classes.add(it) }

    private fun generateHeaderTag() = tag.attachProps(condenseProps())
    private fun condenseProps() = additionalProps.apply {
        putIfNotNull("id", id)
        putIfNotNull("style", styles.joinToStringOrNull(";")?.plusIfAbsent(';')?.wrapInQuotes())
        putIfNotNull("class", classes.joinToStringOrNull(" ")?.wrapInQuotes())
        putAll(additionalImmutableProps)
    }
    private fun String.attachProps(props: Map<String, String>) = props.entries.fold(this) {currentTag, prop ->
        currentTag + " ${prop.key}=${prop.value}"
    }

    /**
     * Compiles the element into its respective HTML.
     *
     * Will also recursively compile the children of this element.
     */
    override fun toString(): String = "<${generateHeaderTag()}>${children.joinToString("")}</$tag>"
}
