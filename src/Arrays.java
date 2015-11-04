import java.util.Scanner;


public class Arrays {
	public static void main(String[] args){
		
		double sum = 0, average = 0;
		double[] tempurature = new double[5];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < tempurature.length; i++){
			
			System.out.print("Insert tempurature for day " + (i+1)+": ");
			tempurature[i] = input.nextDouble();
			sum += tempurature[i];
		}
		
		average = sum/tempurature.length;
		
		System.out.println("Average: " + average);
		input.close();
	}
}