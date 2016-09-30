package patternsFinder;

public class Main {

	public static void main(String[] args) {
		int [] numbersArray = new int[] {1, 2, 3, 4, 5, 6, 7, 1, 2, 8, 9, 1, 2};
		//int[] numbersArray = new int[] { 1, 2 };
		PatternFinder patternFinder = new PatternFinderImpl();
		System.out.println(patternFinder.countPattern(numbersArray, 1, 2) + " occurrence");
	}

	// Solution with regex

	// public static void dumpPatternCount(PatternFinder patternFinder)
	// {
	// int[] array = {9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
	// int[] pattern = {9, 1};
	//
	// System.out.println(patternFinder.countPattern(array, pattern));
	// }
	//
	// public static void main(String[] args) {
	// PatternFinder patternFinder = new PatternFinderImpl();
	// Main.dumpPatternCount(patternFinder);
	// }

}