package prac1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static List<Student> studentList = Arrays.asList(
            new Student("Ali", 19, Group.IKBO1620),
            new Student("Den", 20, Group.IKBO1620),
            new Student("Stas", 18, Group.IKBO1720),
            new Student("Arsenii", 19, Group.IKBO1920),
            new Student("Danya", 18, Group.IKBO2120),
            new Student("Artem", 18, Group.IKBO1920),
            new Student("Vlad", 19, Group.IKBO2120),
            new Student("Nikita", 18, Group.IKBO1720),
            new Student("Vlad", 19, Group.IKBO2520),
            new Student("Nikita", 18, Group.IKBO2620));
    public static void main(String args[]){
        Map<Group,List<Student>> studentsMap
                = studentList.stream().collect(Collectors.groupingBy(Student::getGroup));

        System.out.println("Студенты сгруппированы по группам:");
        studentsMap.forEach((Group key, List<Student> sList) -> System.out.println(key +" -> "+sList));
        System.out.println("__________");



        Function<List<Student>, Map<Group,List<Student>>> valueConverter = studentList -> (studentsMap);
        System.out.println(studentsMap);
    }

    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }
}


