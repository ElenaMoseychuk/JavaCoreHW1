package HW1;

public class Main {
    public static void main(String[] args) {

        Person[] person = new Person[4];
        person[0] = new Person("Жанна", 150);
        person[1] = new Person("Сергей", 200);
        person[2] = new Person("Миша", 450);
        person[3] = new Person("Катя", 800);
        Team team = new Team("Спортсмены", person);

        Obstruction obstruction = new Obstruction(250,350,410);
        String result = obstruction.doIt(team);
        System.out.println(result);
    }
}