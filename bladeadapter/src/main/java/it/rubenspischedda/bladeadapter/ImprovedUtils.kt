package it.rubenspischedda.bladeadapter

fun <T> List<T>.copyArray(copyFunction: (T) -> T): ArrayList<T> {
    val copiedArray = arrayListOf<T>()

    forEach {  element ->
        copiedArray.add(copyFunction(element))
    }

    return copiedArray
}