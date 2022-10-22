public abstract class animals {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (this.name == null || this.name.isBlank() || this.name.isEmpty()) {
            this.name = "введите имя";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    //метод перемещаться
    public abstract void go();
    //метод кушать
    public abstract void eat();
    //метод спать
    public void sleep(){
        System.out.println("любит спать");
    }
}

