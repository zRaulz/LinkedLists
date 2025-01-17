package com.company;

public class Main {


    Node head;

    static class Node {

        int data;
        Node next;


        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    public static Main insert(Main list, int data)
    {

        Node new_node = new Node(data);
        new_node.next = null;


        if (list.head == null) {
            list.head = new_node;
        }
        else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
        }


        return list;
    }

public static Main delete(Main list, int key)
{



    Node currNode = list.head, prev = null;



    if (currNode != null && currNode.data == key) {
        list.head = currNode.next;


        System.out.println(key + " found and deleted");


        return list;
    }


    while (currNode != null && currNode.data != key) {

        prev = currNode;
        currNode = currNode.next;
    }

    if (currNode != null) {

        prev.next = currNode.next;
        System.out.println(key + " found and deleted");
    }


    if (currNode == null) {

        System.out.println(key + " not found");
    }


    return list;

}
    public static void printList(Main list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");


        while (currNode != null) {

            System.out.print(currNode.data + " ");


            currNode = currNode.next;
        }

        System.out.println();
    }
    public static void main(String[] args)
    {

        Main list = new Main();


        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        delete(list,6);

        printList(list);
    }
}
