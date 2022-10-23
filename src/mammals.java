public abstract class mammals extends animals {
    protected String lifeZone;
    protected int movementSpeed;

    public mammals(String name, int age) {
        super(name, age);
    }

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
    public mammals(String name, int age, String lifeZone, int movementSpeed) {
        super(name, age);
        if (lifeZone == null||lifeZone.isEmpty()||lifeZone.isBlank()) {
            this.lifeZone = "неизвестно";
        } else {
            this.lifeZone = lifeZone;
        }
        if (movementSpeed < 0) {
            this.movementSpeed = 0;
        } else {
            this.movementSpeed = movementSpeed;
        }
    }
    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed < 0) {
            this.movementSpeed = 0;
        } else {
            this.movementSpeed = movementSpeed;
        }
    }



    public void walk() {
        System.out.println("любят гулять");
    }

    @Override
    public abstract void eat();


    public abstract void go();
}
