public class DigitalCamera implements Camera {
    private static final int MAX_PHOTOS = 3600;

    private int photosTaken = 0;

    @Override
    public int numberOfPhotographs() {
        return MAX_PHOTOS - photosTaken;
    }

    @Override
    public String takePhotograph() {
        if (photosTaken < MAX_PHOTOS) {
            photosTaken++;
            return "Photo taken with my digital camera!";
        } else {
            return "Cannot take more photos. Memory full!";
        }
    }
}