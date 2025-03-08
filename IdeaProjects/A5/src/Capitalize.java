import java.io.*;

public class Capitalize {

    /**
     Design a method that reads  file of sentences and outputs the capitalized versions of the sentences to a file of the same name with .out extension
     * Get the output file name by replacing in with out
     * Make a new reader and writer that reads the input file and writes the new output file using a try statement
     * Define a new empty string and a new string builder to be used later
     * Use a while loop and read each line from the input file with it
     * Split each line at the periods to make each sentence separate
     * Use a for loop that iterates over each sentence
     * Create one substring that capitalizes the first letter and a second substring that is the rest of the sentence
     * Add the two new substrings together
     * Create an if statement that adds a period and a space if a sentence doesn't have it. If it does, just add new sentence
     * Outside the for loop, add new line where a new line is needed
     * Then right the new sentences to the output file
     * Make a catch that throws an exception when needed
     * @param in is the input file with the lowercase sentences
     */
    static void capitalize(String in) {

        String outputFileName = in.substring(0, in.lastIndexOf('.')) + ".out";

        try (BufferedReader readIt = new BufferedReader(new FileReader(in));
             BufferedWriter writeIt = new BufferedWriter(new FileWriter(outputFileName))) {

            String lineReader = "";
            StringBuilder finale = new StringBuilder();

            while ((lineReader = readIt.readLine()) != null) {
                String[] parts = lineReader.split("\\. ");

                for (String p : parts) {
                    String sub = p.substring(0, 1);
                    String lower = p.substring(1);

                    sub = sub.toUpperCase();

                    String f = sub + lower;

                    if (f.charAt(f.length() - 1) == '.') {
                        finale.append(f);
                    } else {
                        finale.append(f).append(". ");
                    }
                }

                finale.append("\n");
            }

            writeIt.write(finale.toString());

            readIt.close();
            writeIt.close();

        } catch (IOException e) {
            System.err.println("Error in processing a file: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
