package prac5;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 реализация выдает один и тот же объект");
        System.out.println(First.getInstance().toString());
        System.out.println(First.getInstance().toString());
        System.out.println(First.getInstance().toString());
        System.out.println(First.getInstance().toString());

        System.out.println("2 реализация выдает один и тот же объект");
        System.out.println(Second.getInstance().toString());
        System.out.println(Second.getInstance().toString());
        System.out.println(Second.getInstance().toString());
        System.out.println(Second.getInstance().toString());

        System.out.println("3 реализация выдает один и тот же объект");
        System.out.println(three.getInstance().toString());
        System.out.println(three.getInstance().toString());
        System.out.println(three.getInstance().toString());
        System.out.println(three.getInstance().toString());
    }
}
