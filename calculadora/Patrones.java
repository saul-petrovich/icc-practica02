import java.util.Scanner;

public class Patrones {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digita un numero n:");
    int n = scan.nextInt();

    if (n <= 0) {
      System.out.println("n debe ser positivo");
      return;
    }

       // Patron A
    System.out.println("Patron A");
    for (int fila = 1; fila <= n; fila++) {
      int espacios = n - fila;
      if (fila == 1) {
        espacios = n;
      }
      for (int j = 1; j <= espacios; j++) {
        System.out.print(" ");
      }
      System.out.print("1");
      if (fila > 1) {
        for (int j = 1; j < fila; j++) {
          System.out.print(" *");
        }
        System.out.print(" 1");
      }
      System.out.println();
    }

    // Patron B
    System.out.println("Patron B");
    for (int fila = 1; fila <= n; fila++) {
      for (int j = 1; j <= n - fila; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= fila; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Patron C
    System.out.println("Patron C");
    for (int fila = 1; fila <= n; fila++) {
      for (int j = 1; j <= n - fila; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= fila; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int fila = n - 1; fila >= 1; fila--) {
      for (int j = 1; j <= n - fila; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= fila; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Patron D
    System.out.println("Patron D");
    for (int fila = 1; fila <= n; fila++) {
      for (int j = 1; j <= n - fila; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= fila; j++) {
        System.out.print(j + " ");
      }
      for (int j = fila - 1; j >= 1; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
