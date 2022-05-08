package lab8.assignment.problem4;

import java.util.Arrays;
import java.util.List;

public class WordCountProblem {

	public static void main(String[] args) {

		WordCountProblem wordcounts = new WordCountProblem();

		List<String> words = Arrays.asList("hello", "world", " nirmal", "silwal", "zebra");
		char c = 'l';
		char d = 'z';
		int len = 5;

		System.out.println(String.format("word count is: " + wordcounts.countWords(words, c, d, len)));

	}

	public int countWords(List<String> words, char c, char d, int len) {

		return (int) words.stream()
				.filter(currentWord -> currentWord.length() == len)
				.filter(currentWord -> containsChar(currentWord, c))
				.filter(currentWord -> !containsChar(currentWord, d))
				.count(); 
	}

	private boolean containsChar(String currentWord, char c) {
		for (char ch : currentWord.toCharArray()) {
			if (ch == c)
				return true;
		}
		return false;
	}
}
