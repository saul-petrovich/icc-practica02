public class PruebaCivilizacion {
  public static void main(String[] args) {
    Civilizacion civilizacion1 = new Civilizacion("Aurora", "II", 6, 120, 80, 45);
    Civilizacion civilizacion2 = new Civilizacion("Titanes", "I", 3, 40, 20, 10);

    System.out.println("antes");
    civilizacion1.mostrarEstado();
    System.out.println();
    civilizacion2.mostrarEstado();
    System.out.println();

    System.out.println("operacion");
    civilizacion1.recolectarAlimento(100);
    civilizacion1.crearAldeano();
    civilizacion1.recolectarMadera(30);
    civilizacion1.setOro(-5);

    civilizacion2.crearAldeano();
    civilizacion2.recolectarAlimento(20);
    civilizacion2.crearAldeano();
    System.out.println();

    System.out.println("despues");
    civilizacion1.mostrarEstado();
    System.out.println();
    civilizacion2.mostrarEstado();
  }
}
