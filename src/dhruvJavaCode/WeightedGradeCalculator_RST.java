package dhruvJavaCode;
import java.util.Scanner;
public class WeightedGradeCalculator_RST {

	public static void main(String[] args) {
		
		// Variables
		
		int[] tests = new int[5];
		int testAverage = 0;
		int weightedTests = 0;
		int rstGrade = 0;
		int examGrade = 0;
		int finalGrade = 0;
		
		// Initial Launch
		
		System.out.println("Welcome to the Weighted Grade Calculator! \nEnter your test, RST, and Final exam grades for an \naccurate calculation of your final grade!");
		
		
		// Collect Test Grades
		
		System.out.println("\n\nFirstly, we will collect your 5 test grades! \nMake sure your inputting the percentage!(Positive number, between 0 - 100, no % sign!) ");
		
		for(int i = 0; i < 5; i++) {	
			tests[i] = inputCollection(i);	
		}
		
		// Collect RST and Exam Grades
		
		System.out.println("Now, input your RST and Exam grades (RST first, then exam grade) ");
		rstGrade = inputCollection(0);
		
		examGrade = inputCollection(1);
		
		
		// Calculating Test Average
		testAverage = testAvgCalc(tests);
		System.out.println(testAverage);
		
		
		// Calculating weighted grades
		weightedTests = weightedGradeCalc(testAverage,"TEST");		// Test
		
		rstGrade = weightedGradeCalc(rstGrade,"RST");		// RST
		
		examGrade = weightedGradeCalc(examGrade,"EXAM");		// Exam
		
		// Outputting final grade and determining  if user is passing or failing
		
	}

	
	
	
	
	public static int inputCollection(int n) {
		// Initial Variables
		int i = 0;
		boolean correct = false;
		Scanner sc = new Scanner (System.in);		// Closing this scanner blows the code up; so goodbye memory!
		
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
	
	public static int testAvgCalc(int[] a) {
		//Initialize average 
		int average = 0;
		
		// Add 5 grades together
		for(int i = 0; i < 5; i++) {
			average = average + a[i];
		}
		
		// Calculate for final average
		average = (int) Math.floor(average/5);
		
		// Return
		return average;
		
	}
	
	public static int weightedGradeCalc(int g, String type) {
		
		// Initialize weights
		final double TEST_WEIGHT = 0.70;
		final double RST_WEIGHT = 0.20;
		final double EXAM_WEIGHT = 0.10;
		int f = 0;
		
		// Dictate grade type using type variable
		
		if (type == "TEST")
			return (int) (g * TEST_WEIGHT);
		if (type == "RST")
			return (int) (g * RST_WEIGHT);
		if (type == "EXAM")
			return (int) (g * EXAM_WEIGHT);
			
		return 0;
	}
}
		


