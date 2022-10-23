public class flightless extends birds{
    private String walkType;

    public String getWalkType() {
        return walkType;
    }

    public void setWalkType(String walkType) {
        if (walkType == null || walkType.isEmpty() || walkType.isBlank()) {
            this.walkType = "неизвестно";
        } else {
            this.walkType = walkType;
        }
    }

    public flightless(String name, int age) {
        super(name, age);
    }

    public flightless(String name, int age, String walkType) {
        super(name, age);
        setWalkType(walkType);
    }

    public flightless(String name, int age, String lifeZone, String walkType) {
        super(name, age, lifeZone);
        this.walkType = walkType;
    }

    @Override
    public void eat() {
        System.out.println("предпочитают рыбу");
    }

    @Override
    public void go() {
        System.out.println("любит гулять");
    }
}
