import java.util.ArrayList;

//https://www.geeksforgeeks.org/count-strings-can-formed-using-b-c-given-constraints/
public class CountOfStringsThatCanBeFormed {
    int count(ArrayList<String> str, String id){
        int c = 0;
        for (String s : str) {
            if (s.equals(id)) c = c + 1;
        }
        return c;
    }
    public void recurrsion(ArrayList<String> arr, int i){
        if(i==arr.size()){
            System.out.println(arr);
            return;
        }
        if(arr.get(i).equals("?")){
            arr.set(i,"a");
            recurrsion(arr, i+1);
            arr.set(i,"b");
            recurrsion(arr, i+1);
            arr.set(i,"c");
            recurrsion(arr, i+1);
            arr.set(i, "?");
        }
    }
}
