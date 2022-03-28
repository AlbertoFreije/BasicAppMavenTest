package hello;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculadoraTest {
  
  private Calculadora calculadora = new Calculadora(4,2);

  @Test
  public void calculadoraSumarTest() {
    assertTrue(calculadora.sumar() == 6);
  }
  
  @Test
  public void calculadoraRestaTest() {
    assertTrue(calculadora.restar() == 2);
  }
  
  @Test
  public void calculadoraMultiplicarTest() {
    assertTrue(calculadora.multiplicar() == 8);
  }
  
  @Test
  public void calculadoraDividirTest() {
    assertTrue(calculadora.dividir() == 2);
  }

}
