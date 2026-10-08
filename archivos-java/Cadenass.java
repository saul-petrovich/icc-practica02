import java.util.Scanner;

public class Cadenass {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digita una palabra o cadena:");
    String cadena = scan.nextLine();

    System.out.println("1. Mostrar longitud");
    System.out.println("2. Mostrar caracteres");
    System.out.println("3. Mostrar cadena invertida");
    System.out.println("4. Contar apariciones de un caracter");
    System.out.println("5. Buscar una subcadena");
    System.out.println("6. Checar anagrama");
    System.out.println("Elige una opcion:");
    String opcion = scan.nextLine().trim();

    if (opcion.equals("1")) {
      System.out.println("Longitud: " + cadena.length());

    } else if (opcion.equals("2")) {
      for (int i = 0; i < cadena.length(); i++) {
        System.out.println(cadena.charAt(i));
      }

    } else if (opcion.equals("3")) {
      String invertida = "";
      for (int i = cadena.length() - 1; i >= 0; i--) {
        invertida = invertida + cadena.charAt(i);
      }
      System.out.println("Invertida: " + invertida);

    } else if (opcion.equals("4")) {
      System.out.println("Digita un caracter:");
      String letra = scan.nextLine();
      if (letra.length() != 1) {
        System.out.println("Error: escribe un solo caracter");
      } else {
        int veces = 0;
        for (int i = 0; i < cadena.length(); i++) {
          if (cadena.charAt(i) == letra.charAt(0)) {
            veces++;
          }
        }
        System.out.println("Aparece " + veces + " veces");
      }

    } else if (opcion.equals("5")) {
      System.out.println("Digita la subcadena:");
      String sub = scan.nextLine();
      if (cadena.indexOf(sub) != -1) {
        System.out.println("Si esta contenida");
      } else {
        System.out.println("No esta contenida");
      }

    } else if (opcion.equals("6")) {
      System.out.println("Digita la segunda cadena:");
      String otra = scan.nextLine();
      String a = cadena.toLowerCase();
      String b = otra.toLowerCase();
      boolean anagrama = true;
      if (a.length() != b.length()) {
        anagrama = false;
      } else {
        for (int i = 0; i < a.length(); i++) {
          int vecesEnA = 0;
          int vecesEnB = 0;
          for (int j = 0; j < a.length(); j++) {
            if (a.charAt(j) == a.charAt(i)) {
              vecesEnA++;
            }
            if (b.charAt(j) == a.charAt(i)) {
              vecesEnB++;
            }
          }
          if (vecesEnA != vecesEnB) {
            anagrama = false;
          }
        }
      }
      if (anagrama) {
        System.out.println("Si son anagramas");
      } else {
        System.out.println("No son anagramas");
      }

    } else {
      System.out.println("Opcion no valida");
    }
  }
}
