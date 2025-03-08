import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;

class EchoOdds {

    /**
     *
     *
     * @param fileName
     */
    static void echoOdds(String fileName) {
        try (BufferedReader r = new BufferedReader(new FileReader(fileName))) {
            String lin;
            FileWriter writer = new FileWriter(fileName.substring(0, fileName.lastIndexOf('.')) + ".out");
            while ((lin = r.readLine()) != null && !lin.isEmpty()) {
                try {
                    int n = Integer.parseInt(lin);
                    if (n % 2 != 0) {
                        writer.write(lin + "\n");
                    }
                } catch (NumberFormatException e) {
                    Files.delete(Path.of(fileName.substring(0, fileName.lastIndexOf('.')) + ".out"));
                    throw new InputMismatchException();
                }
            }
            writer.close();

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}


