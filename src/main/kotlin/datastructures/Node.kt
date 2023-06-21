package datastructures

class Node<T>(val item: T) {
    var next: Node<T>? = null

    fun setNextNode(node: Node<T>?) {
        next = node
    }
}