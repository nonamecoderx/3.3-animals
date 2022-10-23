public class predators extends mammals{

    private String eatType;

    public String getEatType() {
        return eatType;
    }

    public void setEatType(String eatType) {
        if (eatType == null || eatType.isEmpty() || eatType.isBlank()) {
            this.eatType = "неизвестно";
        } else {
            this.eatType = eatType;
        }
    }

    public predators(String name, int age) {
        super(name, age);
    }

    public predators(String name, int age, String lifeZone, int movementSpeed) {
        super(name, age, lifeZone, movementSpeed);
    }

    public predators(String name, int age, String eatType) {
        super(name, age);
        this.eatType = eatType;
    }

    public predators(String name, int age, String lifeZone, int movementSpeed, String eatType) {
        super(name, age, lifeZone, movementSpeed);
        setEatType(eatType);
    }

    @Override
    public void eat() {
        System.out.println("кушает животных");
    }

    @Override
    public void go() {
        System.out.println("любит охотиться");
    }


}
