package testdatastructures

import datastructures.LinkedList
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
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
}