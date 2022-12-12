package com.shivam.practice.linkList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null)
            tail=head;

        size+=1;
    }
    public void insertLast(int val)
    {
        if(tail==null){
            insertFirst(val);
        }
        else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size += 1;
        }
    }
    public void insertRec(int val,int index)
    {
        head=insertRec(val,index,head);
    }

    private Node insertRec(int val,int index,Node node){
        if(index==0)
        {
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;

    }

    public void insertAt(int val,int index){
        if(index==0)
        {
            insertFirst(val);
            return;
        }
        if (index==size)
        {
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i = 0; index > i; i++)
        {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;

        size+=1;

    }
    public void deleteTop(){
        if(head==null)
            return;

        if(head==tail)
        {
            head=tail=null;
            return;
        }
        head=head.next;

        size-=1;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }


    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
