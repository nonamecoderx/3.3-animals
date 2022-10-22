public class flying extends birds{
    private String walkType;

    public String getWalkType() {
        return walkType;
    }

    public void setWalkType(String walkType) {
        this.walkType = walkType;
    }
    public flying(String name, int age) {
        super(name, age);
    }

    public flying(String name, int age, String walkType) {
        super(name, age);
        this.walkType = walkType;
    }

    public flying(String name, int age, String lifeZone, String walkType) {
        super(name, age, lifeZone);
        if (walkType == null || walkType.isEmpty() || walkType.isBlank()) {
            this.walkType = "неизвестно";
        } else {
            this.walkType = walkType;
        }
    }
    @Override
    public void eat() {
        System.out.println("предпочитают насекомых");
    }

    @Override
    public void go() {
        System.out.println("ллетает");
    }
}
