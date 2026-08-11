import java.util.*;

class Solution {
    public String frequencySort(String s) {

        // Count frequency of each character
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Sort characters by decreasing frequency
        List<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a, b) -> map.get(b) - map.get(a));

        // Build result
        StringBuilder result = new StringBuilder();

        for (char c : chars) {
            for (int i = 0; i < map.get(c); i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}

Input
s =
"tree"
Output
"eert"
