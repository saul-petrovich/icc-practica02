import java.util.Scanner;
/**
 * Division entera de dos enteros de 8 bits: muestra cociente y residuo.
 */
public class Division {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Calculadora Binaria de 8 Bits");
    System.out.println("Division");
    ejecutar(scan);
  }

  public static void ejecutar(Scanner scan) {
    //aqui si se puede usar / y %
    boolean negativoX = false;
    boolean negativoY = false;
    Integer lecturaX = leerOperando(scan, "Digita el primer numero");
    if (lecturaX == null) {
      return;
    }
    int x = lecturaX;
    Integer lecturaY = leerOperando(scan, "Digita el segundo numero");
    if (lecturaY == null) {
      return;
    }
    int y = lecturaY;
    if (y == 0) {
      System.out.println("Error: no se puede dividir entre cero");
      return;
    }
    //guardo los originales
    int a = x;
    int b = y;
    if(x <= -1){ negativoX = true; x = x*-1;}
    if(y <= -1){ negativoY = true; y = y*-1;}
    //Declaracion 8 bits para primer numero
    int x1,x2,x3,x4,x5,x6,x7,x8;
    //Declaracion 8 bits para segundo numero
    int y1,y2,y3,y4,y5,y6,y7,y8;
    //Inicializacion en 0
    x1=x2=x3=x4=x5=x6=x7=x8=0;
    y1=y2=y3=y4=y5=y6=y7=y8=0;

    for(int i = 8;i >= 1;i--){
      int resX = x%2;
      x = x/2;

      int resY = y%2;
      y = y/2;

      switch (i) {
        case 1: x1 = resX; y1 = resY; break;
        case 2: x2 = resX; y2 = resY; break;
        case 3: x3 = resX; y3 = resY; break;
        case 4: x4 = resX; y4 = resY; break;
        case 5: x5 = resX; y5 = resY; break;
        case 6: x6 = resX; y6 = resY; break;
        case 7: x7 = resX; y7 = resY; break;
        case 8: x8 = resX; y8 = resY; break;
      }
    }

    // Caso x negativo
    if (negativoX) {
      if (x1 == 0) {x1 = 1;} else {x1 = 0;}
      if (x2 == 0) {x2 = 1;} else {x2 = 0;}
      if (x3 == 0) {x3 = 1;} else {x3 = 0;}
      if (x4 == 0) {x4 = 1;} else {x4 = 0;}
      if (x5 == 0) {x5 = 1;} else {x5 = 0;}
      if (x6 == 0) {x6 = 1;} else {x6 = 0;}
      if (x7 == 0) {x7 = 1;} else {x7 = 0;}
      if (x8 == 0) {x8 = 1;} else {x8 = 0;}

      int acarreo = 1;
      for (int i = 8; i >= 1 && acarreo == 1; i--) {
        switch (i) {
          case 8: if (x8 == 0) { x8 = 1; acarreo = 0; } else { x8 = 0; } break;
          case 7: if (x7 == 0) { x7 = 1; acarreo = 0; } else { x7 = 0; } break;
          case 6: if (x6 == 0) { x6 = 1; acarreo = 0; } else { x6 = 0; } break;
          case 5: if (x5 == 0) { x5 = 1; acarreo = 0; } else { x5 = 0; } break;
          case 4: if (x4 == 0) { x4 = 1; acarreo = 0; } else { x4 = 0; } break;
          case 3: if (x3 == 0) { x3 = 1; acarreo = 0; } else { x3 = 0; } break;
          case 2: if (x2 == 0) { x2 = 1; acarreo = 0; } else { x2 = 0; } break;
          case 1: if (x1 == 0) { x1 = 1; acarreo = 0; } else { x1 = 0; } break;
        }
      }
    }
    // Caso y negativo
    if (negativoY) {
      if (y1 == 0) {y1 = 1;} else {y1 = 0;}
      if (y2 == 0) {y2 = 1;} else {y2 = 0;}
      if (y3 == 0) {y3 = 1;} else {y3 = 0;}
      if (y4 == 0) {y4 = 1;} else {y4 = 0;}
      if (y5 == 0) {y5 = 1;} else {y5 = 0;}
      if (y6 == 0) {y6 = 1;} else {y6 = 0;}
      if (y7 == 0) {y7 = 1;} else {y7 = 0;}
      if (y8 == 0) {y8 = 1;} else {y8 = 0;}

      int acarreo = 1;

      for (int i = 8; i >= 1 && acarreo == 1; i--) {
        switch (i) {
          case 8: if (y8 == 0) { y8 = 1; acarreo = 0; } else { y8 = 0; } break;
          case 7: if (y7 == 0) { y7 = 1; acarreo = 0; } else { y7 = 0; } break;
          case 6: if (y6 == 0) { y6 = 1; acarreo = 0; } else { y6 = 0; } break;
          case 5: if (y5 == 0) { y5 = 1; acarreo = 0; } else { y5 = 0; } break;
          case 4: if (y4 == 0) { y4 = 1; acarreo = 0; } else { y4 = 0; } break;
          case 3: if (y3 == 0) { y3 = 1; acarreo = 0; } else { y3 = 0; } break;
          case 2: if (y2 == 0) { y2 = 1; acarreo = 0; } else { y2 = 0; } break;
          case 1: if (y1 == 0) { y1 = 1; acarreo = 0; } else { y1 = 0; } break;
        }
      }
    }

    //-128 / -1 da 128 y no cabe en 8 bits
    boolean desbordamiento = false;
    if (a == -128 && b == -1) {
      desbordamiento = true;
    }

    System.out.println("Numero 1: " +x1+x2+x3+x4+x5+x6+x7+x8);
    System.out.println("Numero 2: " +y1+y2+y3+y4+y5+y6+y7+y8);
    if (desbordamiento) {
      System.out.println("Desbordamiento: Si (el resultado no cabe en 8 bits con signo)");
    } else {
      System.out.println("Desbordamiento: No");
      System.out.println("Cociente: " + (a / b));
      System.out.println("Residuo: " + (a % b));
    }
  }

  private static Integer leerOperando(Scanner scan, String mensaje) {
    System.out.println(mensaje);
    if (!scan.hasNext()) {
      System.out.println("Error: no se recibio ningun dato");
      return null;
    }
    //lo leo como texto por si ponen un numero enorme
    String t = scan.next();
    if (!t.matches("[+-]?[0-9]+")) {
      System.out.println("Error: se esperaba un numero entero y se recibio \"" + t + "\"");
      return null;
    }
    boolean negativo = t.charAt(0) == '-';
    int i = (t.charAt(0) == '-' || t.charAt(0) == '+') ? 1 : 0;
    while (i < t.length() - 1 && t.charAt(i) == '0') {
      i++;
    }
    String digitos = t.substring(i);
    //mas de 3 digitos ya no cabe
    if (digitos.length() > 3) {
      System.out.println("Numero fuera de rango (de -128 a 127)");
      return null;
    }
    int valor = 0;
    for (int k = 0; k < digitos.length(); k++) {
      valor = valor * 10 + (digitos.charAt(k) - '0');
    }
    if (negativo) {
      valor = -valor;
    }
    if (valor < -128 || valor > 127) {
      System.out.println("Numero fuera de rango (de -128 a 127)");
      return null;
    }
    return valor;
  }
}
