import java.util.ArrayList;

public class Sorter {
	private static ArrayList<String> userInput = new ArrayList<String>();
	
	private static ArrayList<String> reverse(ArrayList<String> array) {
		ArrayList<String> reverse = new ArrayList<String>();
		for (int i = array.size(); i >= 0; i--) {
			reverse.add(array.get(i));
		}
		return reverse;
	}
	
	private static ArrayList<String> alphabetize(ArrayList<String> array) {
		return array;
	}
	
	public static void main(String[] args) {

	}

}
