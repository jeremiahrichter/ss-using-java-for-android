import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.sort;

public class Sorter {
    private static ArrayList<String> userInput = new ArrayList<String>();

    private static ArrayList<String> reverse(ArrayList<String> array) {
        ArrayList<String> reverse = new ArrayList<String>();
        for (int i = array.size(); i >= 0; i--) {
            reverse.add(array.get(i));
        }
        return reverse;
    }

    private static void alphabetize(ArrayList<String> array) {
        sort(array);
        userInput = array;
    }

    private static void print(ArrayList<String> array) {
        array.forEach(System.out::println);
    }

    public static void main(String[] args) {
    }

}
