package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        char middleChar = string.charAt(string.length()/2) ;

        return middleChar;
    }

    public static String capitalizeMiddleCharacter(String str) {

        List<String> myList = new ArrayList<>(Arrays.asList(str));

        for (int i = 0; i <myList.size() ; i++) {
            if(i == myList.size()/2){

            }

        }

            return null;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return null;
    }

    public static Boolean isIsogram(String str) {
        char[] newCharArray = str.toCharArray();

        for (int i = 0; i <newCharArray.length -1 ; i++) {
            for (int j = newCharArray.length+1; j <newCharArray.length -1  ; j++) {

                if(newCharArray[i] == newCharArray[j]){

                }
            }

        }


        return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {

        char[] newCharArray = str.toCharArray();

        for (int i = 0; i < newCharArray.length -1 ; i++) {
            if(newCharArray[i] == newCharArray[i] +1){


            }
                return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}