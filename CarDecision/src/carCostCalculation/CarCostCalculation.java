package carCostCalculation;
import java.util.Scanner;

public class CarCostCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Enter Cost of Regular Car:");
		double costOfRegularCar = scan.nextDouble();
		System.out.println("Enter Miles per Gallon of Regular Car");
		double mpgOfRegCar = scan.nextDouble();
		System.out.println("Enter Cost of Hybrid Car:");
		double costHybridCar = scan.nextDouble();
		System.out.println("Enter Miles per Gallon of Hybrid Car");
		double mpgOfHybridCar = scan.nextDouble();
		System.out.println("Enter Miles Traveled in a Year");
		double milesTraveled = scan.nextDouble();
		System.out.println("Enter Cost per Gallon of Gas");
		double costPerGallonOfGas = scan.nextDouble();
		
		double yearGasRegular = (milesTraveled / mpgOfRegCar) * costPerGallonOfGas; 
		double year1RegularCostOfCar = costOfRegularCar + yearGasRegular; 
		double year2RegularCostOfCar = yearGasRegular + year1RegularCostOfCar;  
		double year3RegularCostOfCar = yearGasRegular + year2RegularCostOfCar;
		double year4RegularCostOfCar = yearGasRegular + year3RegularCostOfCar;
		double year5RegularCostOfCar = yearGasRegular + year4RegularCostOfCar;
		
		
		double yearGasHybrid = (milesTraveled / mpgOfHybridCar) * costPerGallonOfGas;
		double year1HybridCostOfCar = costHybridCar + yearGasHybrid; 
		double year2costHybridCar = yearGasHybrid + year1HybridCostOfCar;  
		double year3costHybridCar = yearGasHybrid + year2costHybridCar;  
		double year4costHybridCar = yearGasHybrid + year3costHybridCar;  
		double year5costHybridCar = yearGasHybrid + year4costHybridCar;  
		
		System.out.println("Cost to won after year 1 for regular car: " + year1RegularCostOfCar + " for hybrid car: " + year1HybridCostOfCar);
		System.out.println("Cost to won after year 2 for regular car: " + year2RegularCostOfCar + " for hybrid car: " + year2costHybridCar);
		System.out.println("Cost to won after year 3 for regular car: " + year3RegularCostOfCar + " for hybrid car: " + year3costHybridCar);
		System.out.println("Cost to won after year 4 for regular car: " + year4RegularCostOfCar + " for hybrid car: " + year4costHybridCar);
		System.out.println("Cost to won after year 5 for regular car: " + year5RegularCostOfCar + " for hybrid car: " + year5costHybridCar);
		
	
		if (year5costHybridCar < year5RegularCostOfCar)
			System.out.println("The hybrid car pays back after 5 years");
		
		 
		

	}

}
