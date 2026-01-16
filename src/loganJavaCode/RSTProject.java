package loganJavaCode;
import java.util.Scanner;

public class RSTProject {

	public static void main(String[] args) {

		// variables 
		Scanner sc = new Scanner(System.in);
		int studentNum = 0;
		
		System.out.println("Grade Average Calculator");
		System.out.println("Calculates the average number and letter grade of students. \n");
		
		
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
		
		System.out.println("Enter the " + studentNum + " student names: ");
		
		for (int i=0; i<studentNum; i++) {
			
			studentNames[i] = sc.next();
		}
		
		// calculate student averages
		double[] studentAverages = new double[studentNum];
		
		studentAverages = testAverage(studentNames);
		
		// calculate letter grade
		char[] letterGrades = new char[studentNum];
		
		letterGrades = letterGrade(studentAverages);
		
		// print out final information
		
		for (int i=0; i<letterGrades.length; i++) {
			
			System.out.println(studentNames[i] + " has an average of " + studentAverages[i] + " (" + letterGrades[i] + ")");
		}

	}
	// DESCRIPTION - Collects 4 test scores for n number of students and returns the average grades 
	// PARAMETERS - String[] a
	// RETURN TYPE - double[]
	public static double[] testAverage(String[] a) {
		
		// variables
		Scanner sc = new Scanner (System.in);
		double[] averages = new double[a.length];
		int[] testScores = new int[a.length * 4];
		int counter = 0;
		int sum = 0;
		
		for (int i=0; i<a.length; i++) {
			
			System.out.println("Enter the 4 test scores of " + a[i] + " (0-100):");
			
			for (int j=0; j<4; j++) {
				
				testScores[counter] = sc.nextInt();
				counter = counter + 1;
			}
		}
		
		counter = 0;
		
		for (int i=0; i<a.length; i++) {
			sum = 0;
			
			for (int j=0; j<4; j++) {
				
				sum += testScores[counter];
				counter++;
			}
			
			averages[i] = sum / 4;
		}
		
		return averages;
		
	}
	
	// DESCRIPTION - Determines the letter grade that corresponds to a number grade
	// PARAMETERS - double[] a
	// RETURN TYPE - char[]
	public static char[] letterGrade(double[] a) {
		
	// variables
	char[] letterGrades = new char[a.length];
	
	for (int i=0; i<a.length; i++) {
		
		if (a[i] > 89) {
			
			letterGrades[i] = 'A';
		}
		
		else if ((a[i] < 90) && (a[i] > 79)) {
			
			letterGrades[i] = 'B';
		}
		
		else if ((a[i] < 80) && (a[i] > 69)) {
			
			letterGrades[i] = 'C';
		}
		
		else if ((a[i] < 70) && (a[i] > 59)) {
			
			letterGrades[i] = 'D';
		}
		
		else {
			
			letterGrades[i] = 'F';
		}
		
	}
	
	return letterGrades;
	
	}

}
