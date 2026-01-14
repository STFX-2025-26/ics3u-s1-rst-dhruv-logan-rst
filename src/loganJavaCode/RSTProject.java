package loganJavaCode;
import java.util.Scanner;

public class RSTProject {

	public static void main(String[] args) {

		// variables 
		Scanner sc = new Scanner(System.in);
		int studentNum = 0;
		
		
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
		
		// get student names
		
		String[] studentNames = new String[studentNum];
		double[] studentAverages = new double[studentNum];
		char[] letterGrades = new char[studentNum];
		
		System.out.println("Enter the " + studentNum + " student names: ");
		
		for (int i=0; i<studentNum; i++) {
			
			studentNames[i] = sc.next();
		}
		
		// System.out.println(testAverage(studentNames));
		
		
		
		
		

	}
	// DESCRIPTION - Collects 4 test scores and determines the average grade
	// PARAMETERS - String[] a
	// RETURN TYPE - double[]
	public static double[] testAverage(String[] a) {
		
		// variables
		Scanner sc = new Scanner (System.in);
		double[] averages = new double[a.length];
		int[] testScores = new int[a.length * 4];
		int counter = 0;
		int gradeTotal = 0;
		
		for (int i=0; i<a.length; i++) {
			
			System.out.println("Enter the 4 test scores of " + a[i] + ":");
			
			for (int j=0; j<4; j++) {
				
				testScores[counter] = sc.nextInt();
				counter = counter + 1;
				
			}
		}
		
		for (int i=0; i<a.length; i++) {
			
			
		}
		
		
		
		
		return averages;
	}
	

}
