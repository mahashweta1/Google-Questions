public class GenerateAllPermutationOfGivenString {

    void solution1(String outString, String inString){
        if(inString.isBlank()){
            System.out.println(outString);
            return;
        }
        for(int i=0;i<inString.length();i++){
            solution1(outString + inString.charAt(i), inString.replace(String.valueOf(inString.charAt(i)), ""));
        }
    }
}
