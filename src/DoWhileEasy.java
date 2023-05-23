import java.util.Scanner;

public class DoWhileEasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {  // сначала делает потом проверяет усл
            System.out.println("Введи 5");
            value = scanner.nextInt();
        } while (value!=5);

        System.out.println("вы ввели 5");
    }
    }