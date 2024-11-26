import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    private Node rootNode;
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int input){
            this.data = input;
        }
    }

    public void createRootNode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root node Value: ");
        int root = sc.nextInt();
        this.rootNode = new Node(root);
        populate(this.rootNode);
    }

    private void populate(Node node){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to enter Left Node value?" + node.data);
        boolean bLeft = sc.nextBoolean();
        if(bLeft){
            System.out.println("Enter Value: ");
            int ldata = sc.nextInt();
            node.left = new Node(ldata);
            populate(node.left);
        }
        System.out.println("Do you want to enter Right Node value?" + node.data);
        boolean bRight = sc.nextBoolean();
        if(bRight){
            System.out.println("Enter Value: ");
            int rdata = sc.nextInt();
            node.right = new Node(rdata);
            populate(node.right);
        }
    }

    public  void printBTData(){
        this.printBTData(rootNode, "");
    }
    public void printBTData(Node node, String space){
        if(node == null)
           return;
        System.out.println(node.data);
        printBTData(node.left, "\t");
        printBTData(node.right, "\t");
    }



}
