import java.io.*;
import java.util.*;

class Node
{
    Node left, right;
    int data;

    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

class day23
{
    static void levelOrder(Node root)
    {
        Queue<Node> myQueue = new LinkedList<Node>();

        if (root != null)
        {
            myQueue.add(root);
        }

        while(!myQueue.isEmpty())
        {
            Node node = myQueue.remove();
            System.out.print(node.data + " ");

            if (node.left != null)
            {
                myQueue.add(node.left);
            }

            if (node.right != null)
            {
                myQueue.add(node.right);
            }
        }
    }

    public static Node insert(Node root, int data)
    {
        if(root == null)
        {
            return new Node(data);
        }

        else
        {
            Node cur;

            if(data <= root.data)
            {
                cur = insert(root.left, data);
                root.left = cur;
            }

            else
            {
                cur = insert(root.right, data);
                root.right = cur;
            }

            return root;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;

        while(T-->0)
        {
            int data = sc.nextInt();
            root = insert(root, data);
        }

        levelOrder(root);
    }
}