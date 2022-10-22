public class amphibians extends animals{

    private String lifeZone;

    public String getLifeZone() {
        return lifeZone;
    }

    public void setLifeZone(String lifeZone) {
        if (lifeZone == null||lifeZone.isEmpty()||lifeZone.isBlank()) {
            this.lifeZone = "неизвестно";
        } else {
            this.lifeZone = lifeZone;
        }
    }

    public amphibians(String name, int age) {
        super(name, age);
    }

    public amphibians(String name, int age, String lifeZone) {
        super(name, age);
        this.lifeZone = lifeZone;
    }

    @Override
    public void go() {
        System.out.println("любят охотиться");
    }

    @Override
    public void eat() {
        System.out.println("любит насекомых");
    }
}
