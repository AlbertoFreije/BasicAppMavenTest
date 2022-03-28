package hello;

import org.joda.time.LocalTime;

public class HelloWorld {

  public static String greeting(String name) throws IllegalArgumentException{
        if(name.trim().isEmpty())  throw new IllegalArgumentException("Name cannot be empty");
        return "Hello World!, I'm "+name;
    }

  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    Calculadora calculadora = new Calculadora(4,2);
    System.out.println("Prueba de impresion");
    System.out.println(calculadora.sumar()+"");
    System.out.println(calculadora.restar()+"");
    System.out.println(greeter.sayHello());
    System.out.println(greeting("Juan Pablo"));
  }
}