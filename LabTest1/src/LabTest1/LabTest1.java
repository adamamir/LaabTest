package LabTest1;
import java.util.Scanner;
public class LabTest1 {

	public static void main(String[] args){
		
		printQuestion1();
		printQuestion2();
	}
	
	//question1
	public static void printQuestion1() {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of item(s): ");
		int numitem_i = sc.nextInt();
		
		int[] numitem = new int [numitem_i];
		int[] quantityitem = new int [numitem_i];
		double price[] = new double [numitem_i];
		double discount=0, total=0, totaleachitem=0, paid=0;

		for (int i=0; i<numitem.length; i++) {
			System.out.print("Enter the price of the item: ");
			price[i] = sc.nextDouble();
			System.out.print("Enter the quantity of the item: ");
			quantityitem[i] = sc.nextInt();
			totaleachitem = price[i]*quantityitem[i];
			total = totaleachitem + total;
		}
		
		if (total>=100) {
			discount = total*0.2;
			paid = total-discount;
		}
		else {
			discount = total*0.1;
			paid = total-discount;
		}
		
		System.out.println("Total price: " +total);
		System.out.println("Discount received: " +discount);
		System.out.println("Price to be paid: " +paid);
		
		sc.close();
	}
	
	//question2
	public static void printQuestion2() {
		Scanner sc = new Scanner(System.in);
		
		double sales, commission=0, wage=0;
		int hour;
		
		System.out.print("Enter sales: RM");
		sales = sc.nextDouble();
		System.out.print("Enter hour worked: ");
		hour = sc.nextInt();
		
		if (sales>=150 && sales<=300) {
			commission = sales*0.05;
			wage = commission+(hour*5);
		}
		else if (sales>=301 && sales<=500) {
			commission = sales*0.1;
			wage = commission+(hour*5);
		}
		else if (sales>500) {
			commission = sales*0.15;
			wage = commission+(hour*5);
		}
		System.out.println("Commission: RM" + commission);
		System.out.println("Daily wages: RM" +wage);
		
		sc.close();
	}
	
}
