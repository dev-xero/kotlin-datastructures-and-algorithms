package testdatastructures

import datastructures.LinkedList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestLinkedList {
    private lateinit var linkedList: LinkedList<Int>

    @BeforeEach
    fun setup() {
        linkedList = LinkedList()
    }

    @Test
    fun testLinkedListEmptyReturnsTrue() {
        assertTrue(linkedList.isEmpty())
    }

    @Test
    fun testNonEmptyLinkedListReturnsFalse() {
        linkedList.addToTail(1)
        linkedList.addToTail(2)

        assertFalse(linkedList.isEmpty())
    }

    @Test
    fun testListSizeUpdatesCorrectlyAfterAddingToHead() {
        linkedList.addToHead(3)
        linkedList.addToHead(2)
        linkedList.addToHead(1)

        assertEquals(linkedList.size, 3)
    }

    @Test
    fun testListSizeUpdatesCorrectlyAfterAddingToTail() {
        linkedList.addToTail(1)
        linkedList.addToTail(2)

        assertEquals(linkedList.size, 2)
    }

    @Test
    fun testListSizeUpdatesCorrectlyAfterAdding() {
        linkedList.addToHead(2)
        linkedList.addToHead(1)
        linkedList.addToTail(3)
        linkedList.addToTail(4)

        assertEquals(linkedList.size, 4)
    }

    @Test
    fun testLinkedListHeadIsCorrect() {
        linkedList.addToTail(2)
        linkedList.addToTail(3)
        linkedList.addToHead(1)
        linkedList.addToTail(4)

        assertEquals(linkedList.headNode?.item, 1)
    }

    @Test
    fun testLinkedListTailNodeIsCorrect() {
        linkedList.addToHead(4)
        linkedList.addToHead(3)
        linkedList.addToHead(2)

        assertEquals(linkedList.tailNode?.item, 4)
    }

    @Test
    fun testLinkedListPointsToCorrectNode() {
        linkedList.addToTail(1)
        linkedList.addToTail(2)
        linkedList.addToTail(3)
        linkedList.addToTail(4)
        linkedList.addToHead(0)

        assertEquals(linkedList.headNode?.item, 0)
        assertEquals(linkedList.headNode?.next?.item, 1)
        assertEquals(linkedList.headNode?.next?.next?.item, 2)
        assertEquals(linkedList.headNode?.next?.next?.next?.item, 3)
        assertEquals(linkedList.headNode?.next?.next?.next?.next?.item, 4)
        assertEquals(linkedList.tailNode?.item, 4)
        assertEquals(linkedList.tailNode?.next?.item, null)
    }

    @Test
    fun testContainNodeItemReturnsCorrectly() {
        linkedList.addToTail(1)
        linkedList.addToTail(2)
        assertFalse(linkedList.containsNodeItem(3))

        linkedList.addToTail(3)
        assertTrue(linkedList.containsNodeItem(3))
    }

    @Test
    fun testLinkedListRemovesNodeCorrectly() {
        linkedList.addToTail(1)
        linkedList.addToTail(2)

        assertEquals(linkedList.removeNodeItem(3), null)
        assertEquals(linkedList.size, 2)

        linkedList.addToTail(3)
        linkedList.addToTail(4)

        assertEquals(linkedList.removeNodeItem(3), 3)
        assertEquals(linkedList.size, 3)
    }
}