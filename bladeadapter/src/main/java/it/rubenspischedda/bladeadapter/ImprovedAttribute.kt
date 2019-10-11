package it.rubenspischedda.bladeadapter

abstract class ImprovedAttribute<T> {

    abstract val id: String
    abstract var value: T

    abstract fun copy(): ImprovedAttribute<T>
}

class AttributeBoolean(override val id: String, override var value: Boolean): ImprovedAttribute<Boolean>() {

    override fun copy(): ImprovedAttribute<Boolean> {
        return AttributeBoolean(id, value)
    }

}

class AttributeInt(override val id: String, override var value: Int): ImprovedAttribute<Int>() {

    override fun copy(): ImprovedAttribute<Int> {
        return AttributeInt(id, value)
    }

}

class AttributeString(override val id: String, override var value: String): ImprovedAttribute<String>() {

    override fun copy(): ImprovedAttribute<String> {
        return AttributeString(id, value)
    }

}

fun ArrayList<ImprovedAttribute<*>>.copy(): ArrayList<ImprovedAttribute<*>> {
    val clonedArrayList = arrayListOf<ImprovedAttribute<*>>()

    forEach { f ->
        clonedArrayList.add(f.copy())
    }

    return clonedArrayList

}