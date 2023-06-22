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
}