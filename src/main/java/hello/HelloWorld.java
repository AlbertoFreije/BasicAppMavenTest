package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    Calculadora calculadora = new Calculadora(4,2);
    System.out.println(calculadora.sumar());
    System.out.println(calculadora.restar());
    System.out.println(greeter.sayHello());
  }
}