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
}
