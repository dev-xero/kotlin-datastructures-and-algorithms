package testdatastructures

import datastructures.LinkedList
import org.junit.jupiter.api.BeforeEach

class TestLinkedList {
    private lateinit var linkedList: LinkedList<Int>

    @BeforeEach
    fun setup() {
        linkedList = LinkedList()
    }
}