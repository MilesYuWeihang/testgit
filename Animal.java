import java.io.*;
import java.lang.*;

public class Animal extends Life{
   public void eat(){
      System.out.println("animal eat");
   }
	public void breath(){
		System.out.println("animal breath");
	}

   public Animal(){
    System.out.println("Animal created");
    this.age = 6;
    System.out.println("this age: "+this.age);
   }


}
