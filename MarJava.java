import java.util.Scanner;

public class MarJava {
    public static float a, b;
    static char ch;

    public void calculate() {
        if (ch == '*') {
            System.out.println(a * b);
        } else if (ch == '+') {
            System.out.println(a + b);
        } else if (ch == '/') {
            System.out.println(a / b);
        } else if (ch == '-') {
            System.out.println(a - b);
        } else {
            System.out.println("Enter a valid Operator");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the First value :");
            a = sc.nextInt();

            System.out.println("Enter the second value :");
            b = sc.nextInt();

            System.out.println("Enter the operatio :'+','-','*','/'");
            ch = sc.next().charAt(0);
        }

        MarJava m = new MarJava();
        m.calculate();

    }
}