//Maurice Hanns CSC 242 02/01/2018

import java.util.Scanner;

public class Humain {
// TODO Auto-generated constructor stub

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);


			System.out.println("Please enter the clients First name: ");
			String FstNm = input.nextLine();
	        
			System.out.println("Please enter the clients Middle Intitial: ");
			char MdIn = input.nextLine().charAt(0);
	            
			System.out.println("Please enter the clients Last name: ");
			String LtNm = input.nextLine();
	            
			System.out.println("Please enter the clients career: ");
			String Occ = input.nextLine();
	            
			System.out.println("Please enter the clients age: ");
			int CAg = input.nextInt();

			Human person = new Human(FstNm, LtNm, MdIn, Occ, CAg);

			System.out.println(person.FirstName + " "+ person.MiddleInit + ". "+ person.LastName + ", "+ person.Career + ", "+ person.ClientAge);
	}

}

