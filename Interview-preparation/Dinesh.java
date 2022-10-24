package walmart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dinesh {

    public static List<String> find(String[] words, String input) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (checkScramble(word, input)) result.add(word);
        }
        if (result.size() == 0) result.add("_"); // if no scramble found
        return result;
    }

    private static boolean checkScramble(String word, String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word.toCharArray()) {
            if (map.containsKey(ch)) {
                if (map.get(ch) >= 1) {
                    map.put(ch, map.get(ch) - 1);
                } else return false;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"baby", "referee", "cat", "dada", "dog", "bird", "ax"};

        System.out.println(find(words, "ctay")); // cat
        System.out.println(find(words, "bcanihjsrrrferet")); // cat
        System.out.println(find(words, "tbaykkjlga")); // _
        System.out.println(find(words, "bbbblkkjbaby")); // baby
        System.out.println(find(words, "dad")); // _
        System.out.println(find(words, "breadmaking")); // bird
    }
}
