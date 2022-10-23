public class birds extends animals{
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

    public birds(String name, int age) {
        super(name, age);
    }

    public birds(String name, int age, String lifeZone) {
        super(name, age);
        setLifeZone(lifeZone);
    }

    @Override
    public void go() {

    }

    @Override
    public void eat() {

    }
}
