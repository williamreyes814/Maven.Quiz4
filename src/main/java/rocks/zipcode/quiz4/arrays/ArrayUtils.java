package rocks.zipcode.quiz4.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        String middleJawn = values[values.length / 2];

        return middleJawn;

    }

    public static String[] removeMiddleElement(String[] values) {
        List<String> myList = new ArrayList<>();
        String middleJawn = values[values.length/2];
        for (String i:values) {
            if(i != middleJawn){
                myList.add(i);
            }
        }

        String[] myArray = new String[myList.size()];
        myArray = myList.toArray(myArray);

        return myArray;
    }

    public static String getLastElement(String[] values) {
        List<String> myList = new ArrayList<>(Arrays.asList(values));
        String stringToReturn =  myList.get(myList.size() -1);

        return stringToReturn;
    }


    public static String[] removeLastElement(String[] values){
        List<String> myList = new ArrayList<>(Arrays.asList(values));
        myList.remove(myList.size() -1);

        String[] myArray = new String[myList.size()];
        myArray = myList.toArray(myArray);


        return myArray;

    }

}