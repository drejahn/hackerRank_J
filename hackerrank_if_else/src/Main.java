import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner say = new Scanner(System.in);

        int N = say.nextInt();

        if (N % 2 == 1) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && N >= 20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Wrong Answer");
        }
    }
}