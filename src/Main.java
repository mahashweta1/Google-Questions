import java.util.*;

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

//        ImplementQueueWithStacks q = new ImplementQueueWithStacks();
//        q.push(2);
//        q.push(3);
//        q.push(10);
//        q.push(8);
//        q.push(100);
//        q.push(7);
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        q.push(12);
//        q.push(14);
//        q.push(0);
//        System.out.println(q.pop());
//        System.out.println(q.pop());

//        GameOfTwoStacks g = new GameOfTwoStacks();
//        Stack<Integer> l1 = new Stack<>();
//        Stack<Integer> l2 = new Stack<>();
//        l1.push(5); l1.push(4); l1.push(3); l1.push(2); l1.push(1);
//        l2.push(9); l2.push(8); l2.push(7); l2.push(6);
//        System.out.println(g.findMaxSum(l1,l2,10, 0,0));


//        LargestRectangleInHistogram l = new LargestRectangleInHistogram();
//        List<Integer> input = Arrays.asList(2,1,5,6,2,3);
//        System.out.println(l.findValue(input));

//        ValidParenthesis v = new ValidParenthesis();
//        List<String> s = Arrays.asList("(","(",")","(");
//        List<String> s2 = Arrays.asList("(",")","(",")",")",")");
//        v.checkParenthesis(s);
//        v.checkParenthesis(s2);

//        minimumAddToMakeParenthesisValid parenthesis = new minimumAddToMakeParenthesisValid();
//        System.out.println(parenthesis.solution1(s));
//        System.out.println(parenthesis.solution2("(()))"));
//        System.out.println(parenthesis.solution2("()()(("));
//        System.out.println(parenthesis.solution2("))))"));
        findingAllSubsets subsets = new findingAllSubsets();
        List<Integer> input = Arrays.asList(1,2,3);
        List<List<Integer>> ans = new ArrayList<>();
        System.out.println(subsets.solution1(input,0,0,ans).toString());
    }
}