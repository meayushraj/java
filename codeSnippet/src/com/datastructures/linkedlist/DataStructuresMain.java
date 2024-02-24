package com.datastructures.linkedlist;

public class DataStructuresMain {
    public static void main(String[] args) {
        Node node = new Node(1234567890);
        System.out.println("Path --> " + node + " | Node --> " + node.value + " | Value --> " + node.value + "\n");

        SingleLinkedList singleLinkedList = new SingleLinkedList(1);
        System.out.println("SingleLinkedList Initial Value " + singleLinkedList.head);

        singleLinkedList.insertAtEnd(2);
        singleLinkedList.insertAtEnd(3);
        singleLinkedList.insertAtEnd(101);
        singleLinkedList.insertAtEnd(1001);
        singleLinkedList.insertAtEnd(4);
        singleLinkedList.insertAtEnd(5);
        singleLinkedList.insertAtBeginning(0);

        singleLinkedList.deleteNodeByValue(101);
        singleLinkedList.deleteNodeByIndex(5);

        singleLinkedList.search(2);

    singleLinkedList.insertAfterIndex(2);
//    singleLinkedList.insertAftervalue(0);
        singleLinkedList.printNode();
    }
}
