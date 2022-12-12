package com.shivam.practice.linkList;

public class DLL {

    Node head;
    int size=0;

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;
        size+=1;
    }
    public void diplay(){
        Node node=head;
        Node last=null;
        while(node!=null)
        {
            System.out.print(node.val+"->");
            last=node;
            node=node.next;
        }

        System.out.println("In reverse order");
        while(last!=null)
        {
            System.out.print(last.val+"->");
            last=last.prev;
        }
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
