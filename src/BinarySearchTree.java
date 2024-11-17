import java.time.temporal.ValueRange;
import java.util.Scanner;

import static java.lang.Math.max;


public class BinarySearchTree {
    Node rootNode = new Node();
    public static class Node{
        int value;
        Node left;
        Node right;
        int height =0;
    Node(int value){
        this.value = value;
    }
    Node(){}
    }

    public void createRootNode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root Node");
        this.rootNode.value = sc.nextInt();
    }
    
    public void insert(int value){
        this.insertData(this.rootNode, value);
    }

    private int height(Node node){
        if(node == null)
            return 0;
        else return node.height;

    }

    public Node insertData(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insertData(node.left, value);
        }
        if(value >  node.value){
            node.right = insertData(node.right, value);
        }
        node.height = max(height(node.left), height(node.right)) +1;
        return node;
    }

    public void Display(Node node, String space){
        if(node == null)
            return;
        System.out.println(node.value);
        Display(node.left, space +"\t");
        Display(node.right, space+ "\t");
    }
    public void Display(){
        this.Display(this.rootNode, " ");
        System.out.println("Height of the BST: "+ this.rootNode.height);
    }
}
