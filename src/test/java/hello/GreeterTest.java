package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {
  
  private Greeter greeter = new Greeter();

  private HelloWorld hello = new HelloWorld();

  @Test
  public void greeterSaysHello() {
    assertEquals("Hello world!", greeter.sayHello());
  }

  @Test
    public void testGreet() {
      assertThat(hello.greeting("Bart Simpson"), is("Hello World!, I'm Bart Simpson"));
  }

}