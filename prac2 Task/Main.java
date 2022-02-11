package prac2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Human(int age, String firstName, String lastName, LocalDate birthDate, int weight)
        List<Human> input = new ArrayList<>();
        Human human1=new Human(51, "Ali","Mohd Nabi", LocalDate.of(2003, Month.MARCH, 22), 67);
        Human human2=new Human(23,"Den","Li", LocalDate.of(2002, Month.FEBRUARY, 15), 65);
        Human human3=new Human(21,"Stas","Vlasenko", LocalDate.of(2002, Month.JANUARY, 19), 70);
        Human human4=new Human(40,"Arsenii","Rubtsov", LocalDate.of(2002, Month.APRIL, 22), 72);
        input.add(human1);
        input.add(human2);
        input.add(human3);
        input.add(human4);
        Stream<Human> stream = input.stream();
        Stream<Human> stream1 = input.stream();
        Stream<Human> stream2 = input.stream();

        //ПО ДАТЕ РОЖДЕНИЯ
        System.out.println("ПО ДАТЕ РОЖДЕНИЯ:");
        stream.sorted(Comparator.comparing(Human::getBirthDate)).forEach(hum-> System.out.println(hum.getBirthDate()));
        //stream1.sorted(Comparator.comparingInt(Human::getAge)).forEach(h-> System.out.println(h.getAge()));
        //ПО ВОЗРАСТУ МЕНЬШЕ 50
        System.out.println("ПО ВОЗРАСТУ МЕНЬШЕ 50:");
        stream1.filter(str -> str.getAge() <50)
                .sorted(Comparator.comparingInt(Human::getAge))
                .forEach(hum-> System.out.println(hum.getFirstName()));

        System.out.println("ПО ВЕСУ:");
        stream2.sorted(Comparator.comparing(Human::getWeight)).forEach(hum-> System.out.println(hum.getWeight()));

        String concat = input.stream().map(Human::getFirstName).collect(Collectors.joining(" "));
System.out.println("ВСЕ ИМЕНА ЧЕРЕЗ ПРОБЕЛ:");
System.out.println(concat);


    }
}
