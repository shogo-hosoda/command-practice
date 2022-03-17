import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  for(int i = 0; i < 2 ; i++ ){
	  System.out.print("height>");
	  double h = sc.nextDouble();
	  System.out.print("weight>");
          double w = sc.nextDouble();
          h = h / 100; 
          double bmi = w / (h * h);
          System.out.println("bmi>" + bmi);
	  }
	}
}
