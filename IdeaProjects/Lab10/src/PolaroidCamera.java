class PolaroidCamera implements Camera {
    private static final int MAX_PHOTOS = 12;
    private int photosTaken;

    PolaroidCamera() {
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
            return "Taking a picture on my polaroid camera!";
        } else {
            return "No more films left in my polaroid camera!";
        }
    }
}



