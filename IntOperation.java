import java.util.Scanner;

class IntOperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the number : ");
		int b = sc.nextInt();
		
		System.out.print("Enter the number : ");
		int c = sc.nextInt();
		
		int operation1 = (a+b)*c;
		int operation2 = (a*b)+c;
		int operation3 = (c+a)/b;
		int operation4 = (a%b)+c;
		
		System.out.print("The results of Operations are " + operation1 +", " + operation2 +", " + operation3 +", and " + operation4); 
	}
}
