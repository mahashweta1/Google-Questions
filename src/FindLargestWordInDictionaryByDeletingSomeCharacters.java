import java.util.ArrayList;
//https://www.geeksforgeeks.org/find-largest-word-dictionary-deleting-characters-given-string/

public class FindLargestWordInDictionaryByDeletingSomeCharacters {
    public String solution(ArrayList<String> input, String pattern){
        String ans = "";
        for(int i =0;i<input.size();i++){
            for(int j=0;j<input.get(i).length();j++){
                char[] data = input.get(i).toCharArray();
                if(pattern.contains(String.valueOf(data[i]))){
                    if(ans.length() < input.get(i).length()){
                        ans = input.get(i);
                    }
                }
            }
        }
        return ans;
    }
}
