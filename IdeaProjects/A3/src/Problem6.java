import java.util.ArrayList;
import java.util.HashMap;

public class Problem6 {
    /**
     * This method removes all punctuations in a string, splits it based on spaces and produces
     * a map of the words to their respective counts
     *
     * @param s is the string we are working on.
     * @return hashmap of words to respective counts.
     */
    static HashMap<String, Integer> wordCount(String s) {
        char[] delimiters = {'.', ',', '!', '?', ';', '-', '#', '&', '*', '(', ')', '/', '[', ']', '{', '}', '$', '%', '^'};
        s = s.toLowerCase();
        for (char a : delimiters) {
            ArrayList<String> result = tokenize(s, a);
            s = "";
            for (String str : result) {
                s += str;
            }
        }
        ArrayList<String> sArray = tokenize(s, ' ');

        HashMap<String, Integer> result = convertArrayListToHashMap(sArray);

        return result;
    }

    private static HashMap<String, Integer> convertArrayListToHashMap(ArrayList<String> arrayList) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String str : arrayList) {
            int count = 0;
            for (String str2 : arrayList) {
                if (str2.equals(str)) {
                    ++count;
                }
            }
            hashMap.put(str, count);
        }

        return hashMap;
    }

    static ArrayList<String> tokenize(String s, char d) {

        ArrayList<String> result = new ArrayList<>();

        int B_ind = 0;
        int E_ind = 0;
        ArrayList<Character> chars = new ArrayList<>();
        while (E_ind < s.length()) {

            if (!((E_ind + 1) < s.length())) {
                if (s.charAt(E_ind) == d) {
                    String str = "";
                    for (char c : chars) {
                        str += c;
                    }
                    result.add(str);
                    break;
                } else {
                    chars.add(s.charAt(E_ind));
                    String str = "";
                    for (char c : chars) {
                        str += c;
                    }
                    result.add(str);
                    break;
                }
            } else if (s.charAt(E_ind) == d) {
                String str = "";
                for (char c : chars) {
                    str += c;
                }
                result.add(str);
                B_ind = E_ind;
                chars = new ArrayList<>();
                ++E_ind;
                continue;
            }

            chars.add(s.charAt(E_ind));
            ++E_ind;
        }
        result.removeIf(str -> str == "");
        return result;
    }
}
