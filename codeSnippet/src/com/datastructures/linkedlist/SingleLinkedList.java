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

    public void insertAfter(int i) {
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

    public boolean search(int i) {

        return true;
    }
}
