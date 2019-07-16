package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        Double result = Math.sqrt(value);

        return result;
    }

    public static Double square(Double value) {

        return value*value;
    }

    public static Double[] squareRoots(Double... value) {

        Double[] result = new Double[value.length];

        for (int i = 0; i <value.length ; i++) {

            result[i] = Math.sqrt(value[i]);
        }


        return result;
    }

    public static Double[] squares(Double... values) {
        Double[] result = new Double[values.length];
        for (int i = 0; i <values.length ; i++) {
            result[i] = values[i]*values[i];

        }
        return result;
    }

    public static Double add(Double value1, Double value2) {


        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {

        return  value1 - value2;

    }


    public static Double divide(Double divisor, Double dividend) {
       return divisor/dividend;
    }
}
