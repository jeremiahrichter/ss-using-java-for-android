import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println("Type your inputs, enter \"-h\" for help: ");
        Scanner in = new Scanner(System.in);
        String input = "", word = "";
        boolean r = false, a = false; //reverse, alphabetize flags
        while (in.hasNextLine()) {
            input = in.nextLine();
            if (input.contains("-r")) {
                r = true;
                break;
            } else if (input.contains("-a")) {
                a = true;
                break;
            } else if (input.contains("-q")) {
                break;
            } else if (input.contains("-h")) {
                System.out.println("Flags are:\n" +
                        "-h for this help text\n" +
                        "-r to reverse the input\n" +
                        "-a to alphabetize the list of inputs entered\n" +
                        "-q to quit");
            } else {
                userInput.add(input.toLowerCase());
            }
            in.close();

            if (r) {
                userInput = reverse(userInput);
            } else if (a) {
                userInput = alphabetize(userInput);
            }
            print(userInput);
            System.out.println("--------------\n");
            System.out.println("Thanks!");
        }

    }

}
