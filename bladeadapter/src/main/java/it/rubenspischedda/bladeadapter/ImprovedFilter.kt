package it.rubenspischedda.bladeadapter

data class ImprovedFilter<T>(val id: String, val operation: (T) -> Boolean) {

    fun copy(): ImprovedFilter<T> {
        return ImprovedFilter(id, operation)
    }
}

fun <T> ArrayList<ImprovedFilter<T>>.copy(): ArrayList<ImprovedFilter<T>> {
    val clonedArrayList = arrayListOf<ImprovedFilter<T>>()

    forEach { f ->
        clonedArrayList.add(f.copy())
    }

    return clonedArrayList

}