package hello;

public class Calculadora {

  private int numero1;
  private int numero2;

  public Calculadora(int num1, int num2){
    this.numero1 = num1;
    this.numero2 = num2;
  }

  public int sumar() {
    return numero1 + numero2;
  }

  public int restar() {
    return numero1 - numero2;
  }

  public int multiplicar() {
    return numero1 * numero2;
  }

  public int dividir() {
    return numero1 / numero2;
  }

}