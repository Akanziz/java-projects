interface Camera {
    /**
     * Returns the number of photographs that this camera can take.
     */
    int numberOfPhotographs();

    /**
     * Returns a string representing that the Camera took a photo.
     */
    default String takePhotograph() {
        return "Taking a photograph!";
    }
}
