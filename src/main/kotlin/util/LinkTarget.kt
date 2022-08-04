package util

/**
 * Specifies how links should be opened.
 */
enum class LinkTarget {
    /**
     * Opens the link in a new window or tab.
     */
    _blank,

    /**
     * Opens the link in the parent frame.
     */
    _parent,

    /**
     * Opens the link in the same frame as it was clicked.
     */
    _self,

    /**
     * Opens the link in the full body of the window.
     */
    _top
}
