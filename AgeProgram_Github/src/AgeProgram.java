import java.util.Scanner;

public class AgeProgram {

	public static void main(String[] args) {

//Syötä nimesi, ohjelma kertoo saatko mm. olla kuljettaja millä ajoneuvoilla ja onnittelee mm. syntymäpäivistä
		
		Scanner in = new Scanner(System.in);
		
		int ika = 14;
		String ikasana;
		

		System.out.println("Kirjoita ikäsi");
		ikasana = in.nextLine();
		ika = Integer.parseInt(ikasana);

		
		//Ikä-luokat
		
		
		if (ika >= 0 && ika < 18)
		{

			System.out.println("Olet alaikäinen" + "\n");
			if (ika >= 15)
			{
					System.out.println("Saat ajaa ikäsi puolesta seuraavia ajoneuvoja" + "\n");
					System.out.println("-Mopo");
					
			}
				if (ika >= 16)
				{
						System.out.println("-Kevari");
				}
		}
		
		
		else if (ika >= 18 && ika < 65)
		{
			System.out.println("Olet aikuinen" + "\n");
			if (ika >= 18)
			{
				System.out.println("Saat ajaa ikäsi puolesta seuraavia ajoneuvoja" + "\n");
				System.out.println("-Mopo");
				System.out.println("-Kevari");
				System.out.println("-Auto");
			}
				if (ika >= 40 && ika <= 50)
				{
					System.out.println("\n" + "Hyvää keski-ikää!");
				}
					if (ika >= 58 && ika <65)
					{	
							System.out.println("\n" + "Voit mennä varhaiseläkkeelle.");
					}
			
		}
		else 
		{
			System.out.println("Olet eläkeläinen" + "\n");
			if (ika >= 65)
			{	
				System.out.println("Saat ajaa ikäsi puolesta seuraavia ajoneuvoja" + "\n");
				System.out.println("-Mopo");
				System.out.println("-Kevari");
				System.out.println("-Auto");
				System.out.println("\n" + "Hyviä eläkepäiviä!");
				
			}
			
		}
		
		
		//Syntymäpäivä onnittelut
		
				switch (ika) {
				case 10:
					System.out.println ("Onneksi olkoon,täytit " + ika + "v!");
					break;
				case 20:
					System.out.println ("Onneksi olkoon,täytit " + ika + "v!");
					break;
				case 30:
					System.out.println ("Onneksi olkoon,täytit " + ika + "v!");
					break;
				case 40:
					System.out.println ("Onneksi olkoon,täytit " + ika + "v!");
					break;
				case 50:
					System.out.println ("Onneksi olkoon,täytit " + ika + "v!");
					break;
				case 60:
					System.out.println ("Onneksi olkoon,täytit " + ika + "v!");
					break;
				case 70:
					System.out.println ("Onneksi olkoon,täytit " + ika + "v!");
					break;
				case 80:
					System.out.println ("Onneksi olkoon,täytit " + ika + "v!");
					break;
				case 90:
					System.out.println ("Onneksi olkoon,täytit " + ika + "v!");
					break;
				case 100:
					System.out.println ("		ONNEKSI OLKOON");
					System.out.println ("		    TÄYTIT");
					System.out.println ("	             "+ ika + "V!");
					break;
				}
		
		

	}

}


