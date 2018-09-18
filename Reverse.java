import java.io.*;
import java.lang.*;

public class Reverse{
  public static void main(String[] args){
    String a = "a b c d";
    StringBuilder sb = new StringBuilder(a);
    System.out.println(sb.reverse());
    System.out.println(sb.toString().replace(" ",""));
  }
}