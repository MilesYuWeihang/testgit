import java.io.*;
import java.lang.*;

public class Life{
  public int age;
   public void eat(){
      System.out.println("life eat");
   }
	public void breath(){
		System.out.println("breath");
	}

   public Life(){
    System.out.println("life created");
    this.age = 5;
   }

  public void getAge(){
    System.out.println(age);
   }
}
