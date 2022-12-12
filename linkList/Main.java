package com.shivam.practice.linkList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(2);
        list.insertAt(9,2);
        list.deleteTop();
        list.insertRec(2,3);
        list.display();
//
//        DLL list=new DLL();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.diplay();
    }
}
