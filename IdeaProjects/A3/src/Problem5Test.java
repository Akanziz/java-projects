import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void tokenize() {
        String input1 = "Hello,world,how,are,you?";
        char del1 = ',';
        ArrayList<String> expected1 = new ArrayList<>(Arrays.asList("Hello", "world", "how", "are", "you?"));
        ArrayList<String> result1 = Problem5.tokenize(input1, del1);
        assertEquals(expected1, result1);

        String input2 = "The quick brown fox jumps over the lazy dog";
        char del2 = ' ';
        ArrayList<String> expected2 = new ArrayList<>(Arrays.asList("The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"));
        ArrayList<String> result2 = Problem5.tokenize(input2, del2);
        assertEquals(expected2, result2);

        String input3 = "apple|banana|cherry|date|elderberry";
        char del3 = '|';
        ArrayList<String> expected3 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
        ArrayList<String> result3 = Problem5.tokenize(input3, del3);
        assertEquals(expected3, result3);


        String input4 = "";
        char del4 = ',';
        ArrayList<String> expected4 = new ArrayList<>();
        ArrayList<String> result4 = Problem5.tokenize(input4, del4);
        assertEquals(expected4, result4);

        String input5 = "a";
        char del5 = ',';
        ArrayList<String> expected5 = new ArrayList<>(Arrays.asList("a"));
        ArrayList<String> result5 = Problem5.tokenize(input5, del5);
        assertEquals(expected5, result5);

        String input6 = "abcdefg";
        char del6 = ',';
        ArrayList<String> expected6 = new ArrayList<>(Arrays.asList("abcdefg"));
        ArrayList<String> result6 = Problem5.tokenize(input6, del6);
        assertEquals(expected6, result6);

        String input7 = "he||o wor|d";
        char del7 = '|';
        ArrayList<String> expected7 = new ArrayList<>(Arrays.asList("he", "o wor", "d"));
        ArrayList<String> result7 = Problem5.tokenize(input7, del7);
        assertEquals(expected7, result7);

        String input8 = "Intro to software systems!";
        char del8 = '!';
        ArrayList<String> expected8 = new ArrayList<>(Arrays.asList("Intro to software systems"));
        ArrayList<String> result8 = Problem5.tokenize(input8, del8);
        assertEquals(expected8, result8);

        String input9 = "hello";
        char del9 = 'o';
        ArrayList<String> expected9 = new ArrayList<>(Arrays.asList("hell"));
        ArrayList<String> result9 = Problem5.tokenize(input9, del9);
        assertEquals(expected9, result9);

        String input10 = "Hello world, the world is healthy, is it not? I certainly agree that the world is #1 and healthy.";
        char[] dels = {'.', ',', '!', '?', ';', '-', '#', '&', '*', '(', ')'};
        input10 = input10.toLowerCase();
        for (char a : dels){
            ArrayList<String> result = Problem5.tokenize(input10, a);
            input10 = "";
            for (String str : result){
                input10 += str;
            }
        }
        ArrayList<String> expected10 = new ArrayList<>(Arrays.asList("hello world","the world is healthy","is it not","i certainly agree that the world is ","1 and healthy"));
        assertEquals(expected10, input10);
    }
}