import java.util.ArrayList;

import static java.util.Collections.sort;

public class Sorter {
    private static ArrayList<String> userInput = new ArrayList<>();

    private static ArrayList<String> reverse(ArrayList<String> array) {
        ArrayList<String> reverse = new ArrayList<String>();
        for (int i = array.size(); i >= 0; i--) {
            reverse.add(array.get(i));
        }
        return reverse;
    }

    private static ArrayList<String> alphabetize(ArrayList<String> array) {
        sort(array);
         return array;
    }

    private static void print(ArrayList<String> array) {
        array.forEach(System.out::println);
    }

    public static void main(String[] args) {
    }

}
