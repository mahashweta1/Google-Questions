//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.util.HashMap;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {

    Map<String, String> mapping = Map.of("1", "", "2", "abc", "3", "def", "4", "ghi",
            "5", "jkl", "6","mno", "7", "pqrs", "8", "tuv", "9", "wxyz");
    void solution1(String out, String in ){
        if(in.isBlank()){
            System.out.println(out);
            return;
        }
        String val = mapping.get(String.valueOf(in.charAt(0)));
        for(int k=0;k<val.length();k++){
            solution1(out + val.charAt(k), in.replace(String.valueOf(in.charAt(0)), ""));
        }
    }
}

