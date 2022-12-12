package com.shivam.practice.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Bin_Tree {
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int node[])
        {
            idx++;
            if(node[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(node[idx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);

            return newNode;
        }
    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }
    public static void level_order(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr==null)
            {
                System.out.println();
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }else
            {
                System.out.print(curr.data+" ");
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
        }
    }
    public static int count_node(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return count_node(root.left)+count_node(root.right)+1;
    }
    public static int sum_node(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        return sum_node(root.left)+sum_node(root.right)+root.data;


    }
    public static void main(String[] args) {

        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(arr);
        System.out.println(root.data);
        System.out.println("Preorder - > ");
        preorder(root);
        System.out.println();
        System.out.println("Inorder - > ");
        inorder(root);
        System.out.println();
        System.out.println("Postorder - > ");
        postorder(root );
        System.out.println();
        System.out.println("Level_order - > ");
        level_order(root);
        System.out.println();
        System.out.println("no of node-> "+count_node(root));
        System.out.println();
        System.out.println("Sum of node-> "+sum_node(root));


    }
}
