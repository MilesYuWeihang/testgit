import java.io.*;
import java.lang.*;

public class TT{
  public static void main(String[] args){
    Life an = new Animal();
    System.out.println(an.age);
    an.getAge();
    an = (Animal)an;
    System.out.println(an.age);
    an.getAge();
  }
}