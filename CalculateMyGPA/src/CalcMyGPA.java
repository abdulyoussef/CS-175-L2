import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcMyGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		String courseInfo;

		System.out.println("Enter the number of courses you took: ");
		double numberOfCourses = sc.nextDouble();

		double totalHours = 0;
		double totalPoints = 0;

		for (int c = 1; c <= numberOfCourses; c++) {

			double gradePoints = 0;

			System.out.println(
					"Enter course information seperated by commas (title, credit hours, letter grade) or type Q to quit:");
			courseInfo = sc.next();

			if (courseInfo.equals("Q")) {
				System.out.println("You Quit");
				break;
			}

			String array1[] = courseInfo.split(",");
			String className = array1[0].trim();
			String credWorth = array1[1].trim();
			double numberOfCredWorth = Integer.parseInt(credWorth);
			String letter = array1[2].trim();
			totalHours += numberOfCredWorth;

			System.out.println("Course Title: " + className);
			System.out.println("Credit Hours: " + numberOfCredWorth);
			System.out.println("Letter Grade: " + letter);

			if (letter.equals("A")) {
				gradePoints = numberOfCredWorth * 4.00;
				totalPoints += gradePoints;
			} else if (letter.equals("A-")) {
				gradePoints = numberOfCredWorth * 3.70;
				totalPoints += gradePoints;
			} else if (letter.equals("B+")) {
				gradePoints = numberOfCredWorth * 3.33;
				totalPoints += gradePoints;
			} else if (letter.equals("B")) {
				gradePoints = numberOfCredWorth * 3.00;
				totalPoints += gradePoints;
			} else if (letter.equals("B-")) {
				gradePoints = numberOfCredWorth * 2.70;
				totalPoints += gradePoints;
			} else if (letter.equals("C+")) {
				gradePoints = numberOfCredWorth * 2.30;
				totalPoints += gradePoints;
			} else if (letter.equals("C")) {
				gradePoints = numberOfCredWorth * 2.00;
				totalPoints += gradePoints;
			} else if (letter.equals("C-")) {
				gradePoints = numberOfCredWorth * 1.70;
				totalPoints += gradePoints;
			} else if (letter.equals("D+")) {
				gradePoints = numberOfCredWorth * 1.30;
				totalPoints += gradePoints;
			} else if (letter.equals("D")) {
				gradePoints = numberOfCredWorth * 1.00;
				totalPoints += gradePoints;
			} else if (letter.equals("D-")) {
				gradePoints = numberOfCredWorth * .70;
				totalPoints += gradePoints;
			} else if (letter.equals("WF") || letter.equals("F")) {
				gradePoints = numberOfCredWorth * 0;
				totalPoints += gradePoints;
			} else {
				gradePoints = 0;
			}
			System.out.println(" ");
			System.out.println("Total Grade Points: " + totalPoints);
			System.out.println("Total Credit Hours: " + totalHours);
			System.out.println("");
		}
		double gpa = (totalPoints / totalHours);
		System.out.println("Your GPA is " + df.format(gpa));

	}

}
