import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
class PhotographyTest {

    @Test
    void averagePhotos() {
        List<Camera> cameras = Arrays.asList(new DigitalCamera(), new PolaroidCamera(), new PhoneCamera());
        Optional<Integer> average = Photography.averagePhotos(cameras);
        assertEquals(5097, average.get());
    }

    @Test
    void takePhotos() {
        List<Camera> cameras = Arrays.asList();
        Optional<Integer> average = Photography.averagePhotos(cameras);
        assertFalse(average.isPresent());
    }
}