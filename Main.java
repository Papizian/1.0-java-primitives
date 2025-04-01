import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число стоимости билета: ");
        int bilet = scanner.nextInt();
        int mile = bilet/20;
        System.out.println("За покупку билета вы получите: " + mile + "миль");
    }
}