package com.datastructures.linkedlist;

public class SingleLinkedList {
    Node head;

    public SingleLinkedList(int i) {
        this.head = new Node(i);
    }

    public void printNode() {
        while (this.head != null) {
            System.out.println(this.head.value);
            this.head = this.head.next;
        }
    }

    public void insertAtEnd(int i) {
        Node last = head;
        while (last.next != null) last = last.next;
        last.next = new Node(i);
    }

    public void insertAtBeginning(int i) {
        Node new_node = new Node(i);
        new_node.next = head;
        head = new_node;
    }

    public void deleteNodeByValue(int value) {

        if (head.value == value) {
            head = head.next;
        }

        Node curr = head;

        boolean breakFlag = true;
        while (curr.next != null && breakFlag) {
            if (curr.next.value == value) {
                curr.next = curr.next.next;
                breakFlag = false;
            } else curr = curr.next;

        }
    }

    public void deleteNodeByIndex(int index) {
        if (index <= 1) head = head.next;

        int count = 1;
        Node curr = head;

        while (curr.next != null) {
            if (count == index - 1) {
                curr.next = curr.next.next;
                break;
            }
            count++;
            curr = curr.next;
        }
    }

    public void search(int element) {
        boolean isFound = false;
        int indexCount = 1;
        Node current = head;
        while (current.next != null) {
            if (current.value == element) {
                isFound = true;
                break;
            }
            current = current.next;
            indexCount++;
        }
        if (isFound) System.out.println("Element " + element + " Found at index " + indexCount);
        else System.out.println(element + " Not Found");

    }

    public void insertAfterIndex(int index, int element) {
        Node new_node = new Node(element);
        if (index <= 1) {
            new_node.next = head;
            head = new_node;
            return;
        }
        Node current_node = head;
        int countIdx = 1;

        while (current_node.next != null) {
            if (countIdx++ == index - 1) {
                new_node.next = current_node.next;
                current_node.next = new_node;
                break;
            }
            current_node = current_node.next;
        }
        if (index - 1 == countIdx) {
            current_node.next = new_node;
        } else {
            System.err.println("Error in insertAfterIndex: Given index Exceed by length " + (index - countIdx - 1));
        }

    }
}
