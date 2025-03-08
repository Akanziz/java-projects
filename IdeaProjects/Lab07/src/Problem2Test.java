import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void addYRemoveYY() {
       List<String> input = List.of("happy", "sunny", "funny", "jelly");
       List<String> expected = List.of("happyy", "sunny", "jellyy");

       List<String> result = Problem2.addYRemoveYY(input);
    }
}