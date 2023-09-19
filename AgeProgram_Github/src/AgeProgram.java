

public class AgeProgram {

	public static void main(String[] args) {

		// Tulostusehdot
//		Tehtävä 1: Laajenna ohjelmaa siten, että ohjelma osaa kertoa 16-17-vuotiaille, että he voivat ajaa kevaria.
//		Tehtävä 2: Laajenna ohjelmaa niin, että se kertoo 18-vuotiaalle, että hän on juuri tullut täysi-ikäiseksi ja saa ajaa autoa.
//		Tehtävä 3: Laajenna tehtävää niin, että aikuisille ilmoitetaan tasavuosikymmenistä onnentoivotus.
//		Tehtävä 4: jos ikä on 100, tulosta 3-rivinen onnentoivotus.
//		Tehtävä 5: Tarkenna eläkeasioita siten, että yli 58-vuotiaille kerro, että he voivat mennä varhaiseläkkeelle.
//		Tehtävä 6: Toivota 65-vuotiaille hyviä eläkepäiviä.
//		Tehtävä 7: 40–50 -vuotiaille toivota parasta keski-ikää.
		
		
		int ika = 14;
		
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


