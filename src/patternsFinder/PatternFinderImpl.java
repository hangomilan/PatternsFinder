package patternsFinder;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class PatternFinderImpl implements PatternFinder {

	@Override
	public int countPattern(int[] numbers, int... pattern) {

		int count = 0;
		int patternLength = pattern.length;

		if (pattern == null || pattern.length == 0 || numbers == null || numbers.length == 0
				|| pattern.length > numbers.length) {
			return count;
		}
		for (int i = 0; i <= numbers.length - patternLength; i++) {
			boolean match = true;
			for (int j = 0; j < patternLength; j++) {
				if (pattern[j] != numbers[i + j]) {
					match = false;
					break;
				}
			}
			if (match) {
				count++;
				i += patternLength - 1;
			}
		}
		return count;
	}

	// Solution with regex

	// @Override
	// public int countPattern(int[] numbers, int... pattern) {
	//
	// StringBuilder numbersIN = new StringBuilder();
	// StringBuilder regex = new StringBuilder();
	//
	// for (int i = 0; i < numbers.length; i++) {
	// numbersIN.append(numbers[i]);
	// }
	// for (int i = 0; i < pattern.length; i++) {
	// regex.append(pattern[i]);
	// }
	//
	// Pattern p = Pattern.compile(regex.toString());
	// Matcher matcher = p.matcher(numbersIN);
	//
	// int count = 0;
	// while (matcher.find()) {
	// count++;
	// }
	// return count;
	// }
}
