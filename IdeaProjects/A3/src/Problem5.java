import java.util.ArrayList;

public class Problem5 {
    /**
     * Look for a char in a string and then split the string at the car
     * @param s string that is looked through
     * @param d is the char we are looking for
     * @return array of strings containing the split tokens.
     */
    static ArrayList<String> tokenize(String s, char d){
        ArrayList<String> result = new ArrayList<>();

        int B_index = 0;
        int E_index = 0;
        ArrayList<Character> chars = new ArrayList<>();
        while (E_index < s.length()){

            if (!((E_index + 1) < s.length())) {
                if (s.charAt(E_index) == d){
                    String str = "";
                    for (char c : chars) {
                        str += c;
                    }
                    result.add(str);
                    break;
                }
                else {
                    chars.add(s.charAt(E_index));
                    String str = "";
                    for (char c : chars) {
                        str += c;
                    }
                    result.add(str);
                    break;
                }
            }
            else if (s.charAt(E_index) == d){
                String str = "";
                for (char c : chars){
                    str += c;
                }
                result.add(str);
                B_index = E_index;
                chars = new ArrayList<>();
                ++E_index;
                continue;
            }

            chars.add(s.charAt(E_index));
            ++E_index;
        }
        result.removeIf(str -> str == "");
        return result;
    }
}
