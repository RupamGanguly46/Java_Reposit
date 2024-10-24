package LeetCode;
import java.util.*;
public class ValidBrackets {
    public boolean isValid(String s) {
        ArrayList<Character> openBrackets = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char bracket = s.charAt(i);
            if(bracket =='(' || bracket =='{' || bracket=='['){
                openBrackets.add(bracket);
            }

            else{

                if(openBrackets.isEmpty()){
                    return false;
                }

                char lastopen = openBrackets.get(openBrackets.size()-1);

                if((bracket==')' && lastopen == '(') || (bracket=='}' && lastopen == '{') || (bracket == ']' && lastopen == '[')){
                    openBrackets.remove(openBrackets.size()-1);
                }
                else{
                    return false;
                }

            }
        }

        if(openBrackets.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}