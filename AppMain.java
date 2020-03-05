import java.util.Scanner;

	class AppMain {
	   public static void main (String[] args)
	   {
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter the length of the room in feet:");
		   double length = scanner.nextDouble();
		   System.out.println("Enter the width of the room in feet:");
		   double width = scanner.nextDouble();
		   
		   double area = length*width;
		   System.out.println("Area of the room in feet is:"+area);
		   
		   double areainmeters = area*0.09290304;
		   System.out.println("Area of the room in meters is:"+areainmeters);
	   }
	}


