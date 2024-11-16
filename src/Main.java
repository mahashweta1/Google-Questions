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
        ArrayList<String> str = new ArrayList<>();
        str.add("pintu"); str.add("geeksfor"); str.add("geeksgeeks"); str.add("forgeek");
        FindLargestWordInDictionaryByDeletingSomeCharacters s = new FindLargestWordInDictionaryByDeletingSomeCharacters();
        System.out.println(s.solution(str, "uytpintuiop"));

    }
}