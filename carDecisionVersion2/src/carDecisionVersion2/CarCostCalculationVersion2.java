package carDecisionVersion2;

import java.util.Scanner;

public class CarCostCalculationVersion2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub

		System.out.println("Enter the information for the regular car (format make and model, cost, mpg): ");
		String RegularInfo = scan.nextLine();

		System.out.println("Enter the information for the hybrid car (format make and model, cost, mpg): ");
		String HybridInfo = scan.nextLine();

		System.out.println("Enter miles traveled in a year: ");
		double milesTrav = scan.nextDouble();

		System.out.println("Enter cost per gallon of gas: ");
		double costPerGallon = scan.nextDouble();

		String carModRegular = RegularInfo.substring(0,14);
		String costToPurReg = RegularInfo.substring(15,20);
		String MpgReg = RegularInfo.substring(21,23);
		
		int regCostCar = Integer.parseInt(costToPurReg);
		int MpgOfRegularCar = Integer.parseInt(MpgReg);
		
		String carModHybrid = HybridInfo.substring(0,12);
		String costToPurHyb = HybridInfo.substring(13,18);
		String MpgHyb = HybridInfo.substring(19,21);
		
		int hybCostCar = Integer.parseInt(costToPurHyb);
		int MpgHybridCar = Integer.parseInt(MpgHyb);

		double yearGasRegular = costPerGallon * (milesTrav / MpgOfRegularCar);
		double year1RegularCostOfCar = regCostCar + yearGasRegular;
		double year2RegularCostOfCar = yearGasRegular + year1RegularCostOfCar;
		double year3RegularCostOfCar = yearGasRegular + year2RegularCostOfCar;
		double year4RegularCostOfCar = yearGasRegular + year3RegularCostOfCar;
		double year5RegularCostOfCar = yearGasRegular + year4RegularCostOfCar;

		double yearGasHybrid = costPerGallon * (milesTrav / MpgHybridCar);
		double year1HybridCostOfCar = hybCostCar + yearGasHybrid;
		double year2HybridCostOfCar = yearGasHybrid + year1HybridCostOfCar;
		double year3HybridCostOfCar = yearGasHybrid + year2HybridCostOfCar;
		double year4HybridCostOfCar = yearGasHybrid + year3HybridCostOfCar;
		double year5HybridCostOfCar = yearGasHybrid + year4HybridCostOfCar;

		System.out.println("Cost to own " + carModRegular + " After Year 1: " + year1RegularCostOfCar + " for "
				+ carModHybrid + " : " + year1HybridCostOfCar);
		System.out.println("Cost to own " + carModRegular + " After Year 2: " + year2RegularCostOfCar + " for "
				+ carModHybrid + " : " + year2HybridCostOfCar);
		System.out.println("Cost to own " + carModRegular + " After Year 3: " + year3RegularCostOfCar + " for "
				+ carModHybrid + " : " + year3HybridCostOfCar);
		System.out.println("Cost to own " + carModRegular + " After Year 4: " + year4RegularCostOfCar + " for "
				+ carModHybrid + " : " + year4HybridCostOfCar);
		System.out.println("Cost to own " + carModRegular + " After Year 5: " + year5RegularCostOfCar + " for "
				+ carModHybrid + " : " + year5HybridCostOfCar);
		
		if (year5HybridCostOfCar < year5RegularCostOfCar)
			System.out.println("The Toyota Prius pays back after 5 years");
		else 
			System.out.println("The Toyota Prius does not pay back after 5 years");
	}

}
