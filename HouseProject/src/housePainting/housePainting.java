package housePainting;
import java.util.Scanner;

public class housePainting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Accept all dimensions
		System.out.print("Enter the width of the House:");
		int houseWidth = scan.nextInt();
		System.out.println("Enter the length of the House:");
		int houseLength = scan.nextInt();
		System.out.println("Enter the height of the House:");
		int houseHeight = scan.nextInt();
		System.out.print("Enter the number of Windows:");
		int numberOfWindows = scan.nextInt();
		System.out.print("Enter the length of the Window:");
		int lengthOfWindows = scan.nextInt();
		System.out.print("Enter the width of the Window:");
		int widthOfWindows = scan.nextInt();
		System.out.print("Enter the number of Doors:");
		int numberOfDoors = scan.nextInt();
		System.out.print("Enter the length of Doors:");
		int lengthOfDoors = scan.nextInt();
		System.out.print("Enter the width of Doors:");
		int widthOfDoors = scan.nextInt();
		int windowSquareFeet = (numberOfWindows * lengthOfWindows * widthOfWindows);
		int doorSquareFeet = (numberOfDoors * lengthOfDoors * widthOfDoors); 
		
		

	
		//Print the SqFT
		double houseSqFt = 2*(houseLength * houseWidth) + 2*(houseLength*houseWidth + .5*(houseLength*(houseHeight-houseWidth)));
		System.out.println(houseSqFt);
  	    double SqftToPaint = (houseSqFt - (windowSquareFeet + doorSquareFeet));
  	    System.out.println(SqftToPaint);
		//System.out.println("The square footage is:"+ houseSqFt);
  	    
	}

}
