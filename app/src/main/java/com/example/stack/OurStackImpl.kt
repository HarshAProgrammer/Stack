package com.example.stack

class OurStackImpl<T : Any> : OurStack<T> {

    private val storage = arrayListOf<T>()


    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        return if (storage.size == 0){
            null
        }else{
            storage.removeAt(storage.size - 1)
        }

    }

    override fun peek(): T? {
        return storage[storage.size - 1]
    }

    override fun size(): Int {
        return storage.size
    }

    override fun isEmpty(): Boolean {
        return if(storage.size == 0){
            true
        }else{
            false
        }
    }


    override fun toString() = buildString {
        appendLine("---Top---")
        storage.reversed().forEach{
            appendLine("$it")
        }
        appendLine("---------")
    }


}

