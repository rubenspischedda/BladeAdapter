package it.rubenspischedda.bladeadapter

data class BladeFilter<T>(val id: String, val operation: (T) -> Boolean) {

    fun copy(): BladeFilter<T> {
        return BladeFilter(id, operation)
    }
}

fun <T> ArrayList<BladeFilter<T>>.copy(): ArrayList<BladeFilter<T>> {
    val clonedArrayList = arrayListOf<BladeFilter<T>>()

    forEach { f ->
        clonedArrayList.add(f.copy())
    }

    return clonedArrayList

}