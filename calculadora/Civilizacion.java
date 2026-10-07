public class Civilizacion {
  // Atributos privados
  private String nombre;
  private String era;
  private int poblacion;
  private int alimento;
  private int madera;
  private int oro;

  // Constructor
  public Civilizacion(String nombre, String era, int poblacion, int alimento, int madera, int oro) {
    this.nombre = nombre;
    this.era = era;
    this.poblacion = poblacion;
    setAlimento(alimento);
    setMadera(madera);
    setOro(oro);
  }

  // Getters
  public int getAlimento() {
    return alimento;
  }

  public int getMadera() {
    return madera;
  }

  public int getOro() {
    return oro;
  }

  // Setters (no aceptan negativos)
  public void setAlimento(int alimento) {
    if (alimento >= 0) {
      this.alimento = alimento;
    } else {
      System.out.println("Error: no se aceptan valores negativos");
    }
  }

  public void setMadera(int madera) {
    if (madera >= 0) {
      this.madera = madera;
    } else {
      System.out.println("Error: no se aceptan valores negativos");
    }
  }

  public void setOro(int oro) {
    if (oro >= 0) {
      this.oro = oro;
    } else {
      System.out.println("Error: no se aceptan valores negativos");
    }
  }

  // Obtener recursos: se suman a los que ya tiene
  public void recolectarAlimento(int cantidad) {
    if (cantidad > 0) {
      setAlimento(getAlimento() + cantidad);
    } else {
      System.out.println("Error: la cantidad debe ser positiva");
    }
  }

  public void recolectarMadera(int cantidad) {
    if (cantidad > 0) {
      setMadera(getMadera() + cantidad);
    } else {
      System.out.println("Error: la cantidad debe ser positiva");
    }
  }

  public void recolectarOro(int cantidad) {
    if (cantidad > 0) {
      setOro(getOro() + cantidad);
    } else {
      System.out.println("Error: la cantidad debe ser positiva");
    }
  }

  // Crear un aldeano cuesta 50 de alimento
  public void crearAldeano() {
    if (getAlimento() >= 50) {
      setAlimento(getAlimento() - 50);
      poblacion = poblacion + 1;
      System.out.println(nombre + " creo un aldeano");
    } else {
      System.out.println(nombre + " no tiene alimento suficiente para crear un aldeano");
    }
  }

  // Muestra el estado
  public void mostrarEstado() {
    System.out.println("Civilizacion: " + nombre);
    System.out.println("Era: " + era);
    System.out.println("Poblacion: " + poblacion);
    System.out.println("Alimento: " + alimento);
    System.out.println("Madera: " + madera);
    System.out.println("Oro: " + oro);
  }
}
