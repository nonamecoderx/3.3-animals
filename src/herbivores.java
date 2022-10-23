public class herbivores extends mammals {
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

    public herbivores(String name, int age) {
        super(name, age);
    }

    public herbivores(String name, int age, String lifeZone, int movementSpeed) {
        super(name, age, lifeZone, movementSpeed);
    }

    public herbivores(String name, int age, String eatType) {
        super(name, age);
        if (eatType == null || eatType.isEmpty() || eatType.isBlank()) {
            this.eatType = "неизвестно";
        } else {
            this.eatType = eatType;
        }
    }

    public herbivores(String name, int age, String lifeZone, int movementSpeed, String eatType) {
        super(name, age, lifeZone, movementSpeed);
        if (eatType == null || eatType.isEmpty() || eatType.isBlank()) {
            this.eatType = "неизвестно";
        } else {
            this.eatType = eatType;
        }
    }

    @Override
    public void eat() {
        System.out.println("кушает растения");
    }

    @Override
    public void go() {
        System.out.println("любит пастись");
    }
}
