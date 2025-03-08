import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class StackLanguage {

    private Map<String, Double> variables = new HashMap<>();
    private List<Double> stack = new ArrayList<>();
    private List<String> instructions = new ArrayList<>();
    /**
     * empty constructor
     */
    StackLanguage() {
    }

    /**
     * just reads a file and scans it. use scanner. reads stack commands
     * @param fileName is a string that takes to file
     */

    void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                instructions.add(scanner.nextLine().trim());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * reads the stored filename. if there are no instructions throw illegalstate exception
     * (a) DECL v X declares that v is a variable with value X.
     * (b) PUSH X pushes a number X to the stack.
     * (c) POP v pops the top number off the stack and stores it in a variable v. If b hasn't
     * been declared, throw IllegalArgumentException
     * (d) PEEK v stores the value at the top of the stack in the variable v. If v has not been
     * declared, an IllegalArgumentException is thrown.
     * (e) ADD X adds X to the top-most number on the stack.
     * (f) SUB 𝑋 subtracts 𝑋 from the top-most number on the stack.
     * (g) XCHG v swaps the value on the top of the stack with the value stored in variable v. If v
     * has not been declared as a variable, an IllegalArgumentException is thrown.
     * (h) DUP duplicates the value at the top of the stack
     */

    double interpret() {
        if (instructions.isEmpty()) {
            throw new IllegalStateException();
        }
        for (String instruction : instructions) {
            String[] parts = instruction.split("\\s+");
            String command = parts[0];
            switch (command) {
                case "DECL":
                    String var = parts[1];
                    double value = Double.parseDouble(parts[2]);
                    variables.put(var, value);
                    break;
                case "PUSH":
                    double val = Double.parseDouble(parts[1]);
                    stack.add(val);
                    break;
                case "POP":
                    var = parts[1];
                    if (!variables.containsKey(var)) {
                        throw new IllegalArgumentException(var);
                    }
                    variables.put(var, stack.remove(stack.size() - 1));
                    break;
                case "PEEK":
                    var = parts[1];
                    if (!variables.containsKey(var)) {
                        throw new IllegalArgumentException(var);
                    }
                    variables.put(var, stack.get(stack.size() - 1));
                    break;
                case "ADD":
                    val = Double.parseDouble(parts[1]);
                    stack.add(stack.remove(stack.size() - 1) + val);
                    break;
                case "SUB":
                    val = Double.parseDouble(parts[1]);
                    stack.add(stack.remove(stack.size() - 1) - val);
                    break;
                case "XCHG":
                    var = parts[1];
                    if (!variables.containsKey(var)) {
                        throw new IllegalArgumentException(var);
                    }
                    double temp = stack.remove(stack.size() - 1);
                    stack.add(variables.get(var));
                    variables.put(var, temp);
                    break;
                case "DUP":
                    stack.add(stack.get(stack.size() - 1));
                    break;
                default:
                    throw new UnsupportedOperationException(command);
            }
        }
        if (stack.isEmpty()) {
            throw new NoSuchElementException();
        }
        return stack.get(stack.size() - 1);
    }
}