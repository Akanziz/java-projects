import java.util.List;
import java.util.Optional;

class Photography {
    /**
     * Calculates the average number of photographs that can be taken by the given list of cameras.
     *
     * @param cameras The list of cameras.
     * @return An Optional containing the average number of photographs, or an empty Optional if the list is empty.
     */
    static Optional<Integer> averagePhotos(List<Camera> cameras) {
        if (cameras.isEmpty()) {
            return Optional.empty();
        }

        int totalPhotos = cameras.stream()
                .mapToInt(Camera::numberOfPhotographs)
                .sum();

        return Optional.of(totalPhotos / cameras.size());
    }

    /**
     * Takes a photograph using each camera in the given list of cameras.
     *
     * @param cameras The list of cameras.
     */
    static void takePhotos(List<Camera> cameras) {
        cameras.forEach(Camera::takePhotograph);
    }
}
