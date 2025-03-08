
import java.io.*;
import java.util.ArrayList;

class SpellChecker {

    /**
     * Design a method that reads two files
     * One file contains content of a single sentence that may or may not have misspelled words
     * The other file has a dictionary
     * Write a method that checks each word in the file to determine whether they are spelled correctly and wrap the misspelled ones in brackets
     * Define an array list that stores the content in the input file
     * Use a while loop to read each line of the input file and add it to the array list. Do this in a try and catch statement that utilizes a Buffered Reader
     * Define another new array list that stores the individual words from the first arraylist
     * Use a for loop to go through the first arraylist and split the sentences at each space then add each word to the second arraylist
     * Then define a third array list that stores the words of the dictionary
     * Define an empty string and use a while loop inside a try and catch statement that adds each word from the dictionary to the third array list in lowercase
     * Check each word in second array list against dictionary and if a word is not in the dictionary, put [] around it
     * Use a string builder to make corrected text and append the words in arraylist words to it and append a space between each word and append a new line when needed
     * Then determine the output file and use a BufferedWriter to write the new output file utilizing a try and catch statement
     * @param dict is a path to a file that contains a dictionary
     * @param in is a path to an input file that has the sentence with possibly misspelled words
     */
    static void spellCheck(String dict, String in) {

        ArrayList<String> badWords = new ArrayList<>();

        try(BufferedReader readIt = new BufferedReader(new FileReader(in))) {
            String line = "";
            while ((line = readIt.readLine()) != null) {
                badWords.add(line);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }


        ArrayList<String> word = new ArrayList<>();

        for (String w : badWords) {
            String[] wordsDict = w.split("\\ ");

            for (String d : wordsDict) {
                word.add(d);
            }
        }

        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dict))) {
            String line2 = "";

            while ((line2 = br.readLine()) != null) {
                list.add(line2.toLowerCase());
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }



        for (int i = 0; i < word.size(); i++) {
            if (!list.contains(word.get(i).toLowerCase())) {
                word.set(i, "[" + word.get(i) + "]");
            }
        }


        StringBuilder newSB = new StringBuilder();

        for (int i = 0; i < word.size(); i++) {
            newSB.append(word.get(i));
            if (i < word.size() - 1) {
                newSB.append(" ");
            }
        }

        newSB.append("\n");

        String finale = newSB.toString();

        String[] ex = in.split("\\.");
        String outputFile = ex[0] + ".out";

        try(BufferedWriter writeIt = new BufferedWriter(new FileWriter(outputFile))) {
            writeIt.write(finale);
        } catch (IOException e) {
            System.out.println("Error writing output file:" + e.getMessage());
        }
    }
}
