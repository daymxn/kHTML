package util

/**
 * Tells the browser what this button should do when clicked.
 */
enum class ButtonType {
    /**
     * A standard, clickable button.
     */
    button,

    /**
     * Resets form data to it's initial values.
     */
    reset,

    /**
     * Submits form data.
     */
    submit
}
