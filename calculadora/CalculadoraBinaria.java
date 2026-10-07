import java.util.Scanner;
/**
 * Este programa se encarga de realizar operaciones basicas
 * con enteros de 8 bits, y operando en binario.
 * Muestra el menu y llama a la clase de la operacion elegida.
 * @author Cristopher Escamilla Soto
 * @version 1.0
 * @since 25/09/2026
 */
public class CalculadoraBinaria {
  public static void main(String[] args) {
    //Creacion instancia de escaner para
    //lectura de la entrada del sistema
    Scanner scan = new Scanner(System.in);

    //Menu//
    System.out.println("""
        Calculadora Binaria de 8 Bits
        1.Suma
        2.Resta
        3.Multiplicacion
        4.Division

        Digita una opcion valida:
        """);

    int resp = leerOpcion(scan);

    if (resp == 1) {
      Suma.ejecutar(scan);
    } else if (resp == 2) {
      Resta.ejecutar(scan);
    } else if (resp == 3) {
      Multiplicacion.ejecutar(scan);
    } else if (resp == 4) {
      Division.ejecutar(scan);
    } else {
      System.out.println("Opcion no valida");
    }
  }

  private static int leerOpcion(Scanner scan) {
    if (!scan.hasNext()) {
      return -1;
    }
    if (scan.hasNextInt()) {
      return scan.nextInt();
    }
    scan.next();
    return -1;
  }
}
