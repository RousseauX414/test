package FerryGame;

import java.util.ArrayList;
import java.util.Scanner;

public class GuteFee {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Die gute Fee ist heute wohlgestimmt \n "
				+ "Sie haben drei Wünsche frei");
		final int MAX_WISHES = 3;
		int wishCount = 0;
		ArrayList<String> wishList = new ArrayList<String>();
		
		do {
			System.out.println("Ihr " + (wishCount + 1) + " Wunsch lautet? ");
			wishList.add(scan.nextLine());
			wishCount++;
			
			if (MAX_WISHES - wishCount == 0) {
				System.out.println("Sie haben keine Wünsche mehr frei");
			} else {
				if (MAX_WISHES - wishCount == 1) 
					System.out.println("Sie haben noch " + (MAX_WISHES - wishCount) + " Wunsch frei");
				 else 
				System.out.println("sie haben noch " + (MAX_WISHES - wishCount) + 
						" Wünsche frei");
			}
			
			System.out.println(wishCount == 1 ? "Ihr Wunsch lautet also "  :
					"Ihre Wünsche lauten ");
			for (String wish1 : wishList)
				System.out.println(wish1);
			
			
				
			
		} while (wishCount < MAX_WISHES); // muss kleiner sein, da es oben nochmal 3tes Mal läuft
		
		System.out.println("Die gute Fee muss los, kommt aber bald wieder mal vorbei ;)");
	}
	
}
