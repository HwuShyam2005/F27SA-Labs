import java.util.Scanner;

public class examplearray2 {

	public static void main(String[] args) {
	double[] scores; // lab scores
    int students; // number of students
    double lowest; // lowest score
	double highest; // highest score
	double mean; // mean score
			
	// first, find out how many students there are
	System.out.println("How many students?");
	Scanner scan = new Scanner(System.in);
	students = scan.nextInt();
	
	// make the scores array the correct size
	scores = new double[students];
	
	// read scores from user
	System.out.println("Please input scores:");
	for(int i=0; i<scores.length; i++)
	scores[i] = scan.nextDouble();
	
	// find lowest score
	lowest = Double.POSITIVE_INFINITY;
	for(double score : scores)
	if(score<lowest)
	lowest = score;
	
	// find highest score
	highest = Double.NEGATIVE_INFINITY;
	for(double score : scores)
	if(score>highest)
	highest = score;
	
	// find mean score
	mean = 0;
	for(double score : scores)
	mean += score;
	mean /= students;
	
	// output info
	System.out.println("The scores were between"
	+ lowest + " and " + highest
	+ " with a mean of " + mean);

	}

}
