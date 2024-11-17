import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        SumFindAllTripletsWithZeroSum s = new SumFindAllTripletsWithZeroSum();
//        String[] arr = {"1","0","?", "?"};
//        System.out.println(s.findSum(arr, 5));
//        System.out.println("Hi world");

//        GenerateAllBinaryStringsFromGivenPattern s = new GenerateAllBinaryStringsFromGivenPattern();
//        s.solution1(arr, 0);

//        CountOfStringsThatCanBeFormed s = new CountOfStringsThatCanBeFormed();
//        ArrayList<String> str = new ArrayList<>();
//        str.add("?"); str.add("?"); str.add("?");
//        s.recurrsion(str, 0);
//        ArrayList<String> str = new ArrayList<>();
//        str.add("pintu"); str.add("geeksfor"); str.add("geeksgeeks"); str.add("forgeek");
//        FindLargestWordInDictionaryByDeletingSomeCharacters s = new FindLargestWordInDictionaryByDeletingSomeCharacters();
//        System.out.println(s.solution(str, "uytpintuiop"));

//        BinaryTree bt = new BinaryTree();
//        bt.createRootNode();
//        bt.printBTData();

//        BinarySearchTree bst = new BinarySearchTree();
//        bst.createRootNode();
//        bst.insert(8);
//        bst.insert(3);
//        bst.insert(9);
//        bst.insert(14);
//        bst.insert(12);
//        bst.insert(15);
//        bst.Display();

        ImplementQueueWithStacks q = new ImplementQueueWithStacks();
        q.push(2);
        q.push(3);
        q.push(10);
        q.push(8);
        q.push(100);
        q.push(7);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.push(12);
        q.push(14);
        q.push(0);
        System.out.println(q.pop());
        System.out.println(q.pop());



    }
}