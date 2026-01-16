package dhruvJavaCode;
import java.util.Scanner;
public class WeightedGradeCalculator_RST {

	public static void main(String[] args) {
		
		// Variables
		
		int[] tests = new int[5];
		double testAverage = 0;
		double weightedTests = 0;
		double rstGrade = 0;
		double examGrade = 0;
		double finalGrade = 0;
		
		// Initial Launch
		
		System.out.println("Welcome to the Weighted Grade Calculator! \nEnter your test, RST, and Final exam grades for an \naccurate calculation of your final grade!");
		
		
		// Collect Test Grades
		
		System.out.println("\n\nFirstly, we will collect your 5 test grades! \nMake sure your inputting the percentage!(Positive number, between 0 - 100, no % sign!) ");
		
		for(int i = 0; i < 5; i++) {			// Test grade collection Loop
			tests[i] = (int) inputCollection(i);	
		}
		
		
		// Collect RST and Exam Grades
		
		System.out.println("\nNow, input your RST and Exam grades (RST first, then exam grade) ");
		rstGrade = inputCollection(0);
		
		examGrade = inputCollection(1);
		
		
		// Calculating Test Average
		
		testAverage = testAvgCalc(tests);
		

		// Calculating weighted grades
		
		weightedTests = weightedGradeCalc(testAverage,"TEST");		// Test
		System.out.println(weightedTests);
		rstGrade = weightedGradeCalc(rstGrade,"RST");		// RST
		System.out.println(rstGrade);

		examGrade = weightedGradeCalc(examGrade,"EXAM");		// Exam
		System.out.println(examGrade);

		
		// Outputting final grade and determining  if user is passing or failing
		finalGrade = (weightedTests + rstGrade + examGrade);
		
		// Declare pass or fail, and output 
		System.out.printf("\n\nYour final score, with these grades would be a %.2f%n", finalGrade);
		System.out.println("With this grade, that means...");
		
				
		
		if (finalGrade >= 50) 
			System.out.println("\nCongrats! you passed!");
		
		if (finalGrade < 50)
			System.out.println("\nyou Failed... But dont worry! theres always next year!");
	
	}

	
	public static double inputCollection(int n) {
		// Initial Variables
		int i = 0;
		boolean correct = false;
		Scanner sc = new Scanner (System.in);  // Can't move this, can't add sc.close(), so this is now the "Achilles heel" of this method.
				
		
		// Ask for input
		System.out.println("Input grade #" + (n + 1) + ": ");
		
		// Collect and verify INT Input
		while (correct != true) {
			
			
			try { i = sc.nextInt(); }
																		// Tiny Try block!! Big catch tho
			catch (Exception ex) { 
				
				System.out.println(ex); 
				System.out.println("Error! Please input a number!");
				
				// Clear Scanner to avoid Scanner pitfall;
				sc.next();
				continue;
				
				}
			
			// Check for error cases, if not return i
			if (i <= 100 & i >= 0) {
				correct = true;
				return i;
				
			}
			// Output error and loop for problem cases 
			else
				System.out.println("Error! Number too large! Enter a grade value between 0 - 100 !");
			i = 0;

		}
		
		// If it somehow breaks; tell myself (Please never need to work code)
		System.out.println("Logic error (Somehow!?!?) ; outputting 0");
		return 0;
	}
	
	public static double testAvgCalc(int[] a) {
		//Initialize average 
		double average = 0;
		
		// Add 5 grades together
		for(int i = 0; i < 5; i++) {
			average = average + a[i];
		}
		
		// Calculate for final average
		average = average/5;
		
		// Return
		return average;
		
	}
	
	public static double weightedGradeCalc(double g, String type) {
		
		// Initialize weights
		final double TEST_WEIGHT = 0.70;
		final double RST_WEIGHT = 0.10;
		final double EXAM_WEIGHT = 0.20;
		
		// Dictate grade type using type variable
		
		if (type == "TEST")
			return (g * TEST_WEIGHT);
		if (type == "RST")
			return (g * RST_WEIGHT);
		if (type == "EXAM")
			return (g * EXAM_WEIGHT);
			
		return 0;
	}
}
		


