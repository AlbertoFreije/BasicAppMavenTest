package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
  
  private Calculadora calculadora = new Calculadora(4,2);

  @Test
  public void calculadoraSumarTest2() {
    assertTrue(calculadora.sumar() == 6);
  }

}
