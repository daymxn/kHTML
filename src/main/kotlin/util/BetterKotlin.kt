package util

internal fun <R,T> MutableMap<R,T>.putIfNotNull(key: R, value: T?) {
    value?.let { put(key, it) }
}

internal fun <T> T.applyIf(condition: Boolean, block: T.() -> T) = if(condition) block() else this

internal fun String.wrapInQuotes() = "\"$this\""
internal fun String.plusIfAbsent(str: String) = applyIf(!endsWith(str)) { plus(str) }
internal fun String.plusIfAbsent(char: Char) = applyIf(last() != char) { plus(char) }

internal fun <T> Iterable<T>.joinToStringOrNull(seperator: String) = takeUnless { firstOrNull() == null }?.joinToString(seperator)
