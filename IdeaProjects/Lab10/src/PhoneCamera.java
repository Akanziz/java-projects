class PhoneCamera implements Camera {
    private static final int MAX_PHOTOS = 13400;
    private int photosTaken;

    PhoneCamera() {
        this.photosTaken = 0;
    }

    @Override
    public int numberOfPhotographs() {
        return MAX_PHOTOS;
    }

    @Override
    public String takePhotograph() {
        if (photosTaken < MAX_PHOTOS) {
            photosTaken++;
            return "Taking a photograph!";
        } else {
            return "Storage full! Cannot take more photographs.";
        }
    }
}