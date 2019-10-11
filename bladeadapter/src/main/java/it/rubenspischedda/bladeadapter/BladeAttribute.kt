package it.rubenspischedda.bladeadapter

abstract class BladeAttribute<T> {

    abstract val id: String
    abstract var value: T

    abstract fun copy(): BladeAttribute<T>
}

class AttributeBoolean(override val id: String, override var value: Boolean): BladeAttribute<Boolean>() {

    override fun copy(): BladeAttribute<Boolean> {
        return AttributeBoolean(id, value)
    }

}

class AttributeInt(override val id: String, override var value: Int): BladeAttribute<Int>() {

    override fun copy(): BladeAttribute<Int> {
        return AttributeInt(id, value)
    }

}

class AttributeString(override val id: String, override var value: String): BladeAttribute<String>() {

    override fun copy(): BladeAttribute<String> {
        return AttributeString(id, value)
    }

}

fun ArrayList<BladeAttribute<*>>.copy(): ArrayList<BladeAttribute<*>> {
    val clonedArrayList = arrayListOf<BladeAttribute<*>>()

    forEach { f ->
        clonedArrayList.add(f.copy())
    }

    return clonedArrayList

}