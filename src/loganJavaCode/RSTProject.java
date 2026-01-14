package loganJavaCode;
import java.util.Scanner;

public class RSTProject {

	public static void main(String[] args) {

		// variables 
		Scanner sc = new Scanner(System.in);
		int studentNum = 0;
		String[] studentNames = new String[studentNum];
		double[] studentAverages = new double[studentNum];
		char[] letterGrades = new char[studentNum];
		
		// get number of students
		do {
			
			System.out.println("Enter the number of students: ");
			
			try {
				
				studentNum = sc.nextInt();
					
				}
			
			
			catch (Exception e) {
				
				System.out.println("Error! Please input a Positive number!");
				sc.next();
				studentNum = 0;
				
			}
			
			} while (studentNum < 1);
		
		System.out.println("Enter the " + studentNum + " student names: ");
		
	
		
		
		
		
		

	}
	// DESCRIPTION - Collects 4 test scores and determines the average grade
	// PARAMETERS - int[] x, String[] y
	// RETURN TYPE - double[]
	public static double[] testAverage(int[] x, String[] y) {
		double[] averages = new double[y.length];
		
		
		
		
	double[] average = {0};
	return average;
	}
	

}
