package datastructures

class LinkedList<T>() {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var listSize: Int = 0

    val headNode: Node<T>?
        get() = head

    val tailNode: Node<T>?
        get() = tail

    val size: Int
        get() = listSize

    fun isEmpty(): Boolean { return head == null }

    fun addToHead(item: T): Node<T> {
        val newHead = Node(item)
        val currentHead = head

        if (head == null) {
            head = newHead
            tail = newHead
            listSize += 1

            return newHead
        }

        newHead.setNextNode(currentHead)
        head = newHead

        listSize += 1

        return newHead
    }

    fun addToTail(item: T): Node<T> {
        val newTail = Node(item)
        val currentTail = tail

        if (head == null) {
            head = newTail
            tail = newTail
            listSize += 1

            return newTail
        }

        currentTail?.setNextNode(newTail)
        tail = newTail
        listSize += 1

        return newTail
    }

    fun containsNodeItem(item: T): Boolean {
        var currentNode = head

        while (currentNode != null) {
            if (currentNode.item == item) {
                return true
            }
            currentNode = currentNode.next
        }

        return false
    }
}