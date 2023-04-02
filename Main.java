import java.util.*;

public class Main {

	public static void main(String[] args) {
			  
		Scanner sc = new Scanner(System.in);
		int nb, heure;
		char carac;
		Cinema c= new Cinema();
			
		System.out.println("Va aux Cinéma avec un(e) ami(e) ");
			
		do {
			System.out.println("Veuillez saisir un nombre de billets :");
			nb = sc.nextInt();
		} while(nb<0);
		
		do {
			System.out.println("Veuillez saisir l''heure de debut du film (entier) :");
			heure = sc.nextInt();
		} while (heure<0 || heure >24);
		
		sc.nextLine(); //On vide la ligne avant d'en lire une autre
		
		
		System.out.println("Filme 3D ? (o)ui ou (n)on : ");
		String str = sc.nextLine();      
		// recuperer un char
		carac = str.charAt(0);
		  
		System.out.println("La valeur total est : " +  c.computeTotal(nb, heure, carac));
		    
	}

}
