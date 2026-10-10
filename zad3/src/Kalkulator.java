import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== KALKULATOR PLN -> EUR ===");
        System.out.print("Podaj kwotę w PLN: ");
        
        if (scanner.hasNextDouble()) {
            double pln = scanner.nextDouble();
            double eur = pln / 4.25;
            System.out.printf("%.2f PLN to około %.2f EUR%n", pln, eur);
        } else {
            System.out.println("Błąd: Wprowadzono niepoprawną liczbę.");
        }
        scanner.close();
    }
}
