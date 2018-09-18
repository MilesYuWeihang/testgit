import java.io.*;
import java.lang.*;
import java.util.*;

public class Structure{
  public static void main(String[] args){
    LinkedList<Integer> q = new LinkedList<>();
    q.add(1); 
    q.add(2);
    q.add(1,3);
    q.remove(1);
    for(int a:q){
    	System.out.println(a);
    }
  }
}