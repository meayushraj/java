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

        boolean breakFlag = true;
        Node prev = head;
        Node curr = head.next;

        while (curr.next != null && breakFlag) {
            if (curr.value == value) {
                prev.next = curr.next;
                breakFlag = false;
            } else {
                prev = prev.next;
                curr = curr.next;
            }

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

    public void insertAfterIndex(int index) {
    }
}
