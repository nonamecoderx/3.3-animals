import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        herbivores gazel = new herbivores("Газель", 12, "степь", 32, "трава");
        herbivores giraf = new herbivores("Жираф", 3, "зоопарк", 12, "листья");
        herbivores horse = new herbivores("Лошадь", 8, "поле", 23, "трава");

        predators giena = new predators("Гиена", 3, "Африка", 15, "мясо");
        predators tiger = new predators("Тигр", 8, "Африка", 22, "мясо");
        predators bear = new predators("Медведь", 3, "леса", 13, "мясо");

        amphibians frog = new amphibians("Лягушка", 2,  "болото");
        amphibians snake = new amphibians("Ужи пресноводный", 4, "река");

        flightless pavlin = new flightless("Павлин", 3,"Африка","бегает");
        flightless pingvin = new flightless("Пингвин", 6,"Арктика","бегает");
        flightless dodo = new flightless("Додо птица", 1,"Европа","прыгает");

        flying chaika = new flying("Чайка", 3,"море","летает");
        flying albatros = new flying("Альбатрос", 7,"океан","летает");
        flying sokol = new flying("Сокол", 8,"горы","летает");

        printInfoHerbivores(gazel);
        printInfoPredators(giena);
        printInfoAmphibias(snake);
        printInfoPFlightless(dodo);
        printInfoFlyging(sokol);
    }
    private static void printInfoHerbivores (herbivores herbivores){
        System.out.println("Класс - травоядные, "+ "имя: "+ herbivores.getName()+ ", возраст: "+ herbivores.getAge()+ ", зона обитания:"+ herbivores.getLifeZone()+
                ", скорость передвижения:" + herbivores.getMovementSpeed()+", тип еды:" + herbivores.getEatType());
    }
    private static void printInfoPredators (predators predators){
        System.out.println("Класс - хищники, "+ "имя: "+ predators.getName()+ ", возраст: "+ predators.getAge()+ ", зона обитания:"+ predators.getLifeZone()+
                ", скорость передвижения:" + predators.getMovementSpeed()+", тип еды:" + predators.getEatType());
    }
    private static void printInfoAmphibias (amphibians amphibians){
        System.out.println("Класс - земноводные, "+ "имя: "+ amphibians.getName()+ ", возраст: "+ amphibians.getAge()+ ", зона обитания:"+ amphibians.getLifeZone());
    }
    private static void printInfoPFlightless (flightless flightless){
        System.out.println("Класс - хищники, "+ "имя: "+ flightless.getName()+ ", возраст: "+ flightless.getAge()+ ", зона обитания:"+ flightless.getLifeZone()+
                ", тип передвижения:" + flightless.getWalkType());
    }
    private static void printInfoFlyging (flying flying){
        System.out.println("Класс - хищники, "+ "имя: "+ flying.getName()+ ", возраст: "+ flying.getAge()+ ", зона обитания:"+ flying.getLifeZone()+
                ", тип передвижения:" + flying.getWalkType());
    }
}