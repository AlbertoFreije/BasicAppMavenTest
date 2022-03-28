package hello;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Greeter;

public class GreeterTest {
  
  private Greeter greeter = new Greeter();

  @Test
  public void greeterSaysHello() {
    assertEquals("Hello world!", greeter.sayHello());
  }

}