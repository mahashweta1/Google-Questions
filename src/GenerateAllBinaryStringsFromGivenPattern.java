//Given a string containing of ‘0’, ‘1’ and ‘?’ wildcard characters, generate all binary strings that can be formed by replacing each wildcard character by ‘0’ or ‘1’.
//Example :
//
//
//Input: str = “1??0?101”
//Output:
//        10000101
//        10001101
//        10100101
//        10101101
//        11000101
//        11001101
//        11100101
//        11101101


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GenerateAllBinaryStringsFromGivenPattern {
    public void solution1(String[] arr, int i){
        if(i == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(arr[i].equals("?")){
            arr[i] = "0";
            solution1(arr,i+1);
            arr[i] = "1";
            solution1(arr, i+1);
            arr[i] = "?";
        }else{
            solution1(arr, i+1);
        }
    }
}
