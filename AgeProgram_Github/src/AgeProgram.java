import java.util.Scanner;

public class AgeProgram {

	public static void main(String[] args) {

//Syötä nimesi, ohjelma kertoo saatko mm. olla kuljettaja millä ajoneuvoilla ja onnittelee mm. syntymäpäivistä
		
		Scanner in = new Scanner(System.in);
		
		int ika;
		String ikasana;
		

		System.out.println("Type your age");
		ikasana = in.nextLine();
		ika = Integer.parseInt(ikasana);

		
		//Ikä-luokat
		
		
		if (ika >= 0 && ika < 18)
		{

			System.out.println("You are a minor" + "\n");
			if (ika >= 15)
			{
					System.out.println("You are qualified by your age to drive these vehicles " + "\n");
					System.out.println("-Moped");
					
			}
				if (ika >= 16)
				{
						System.out.println("-Lightmotorcycle");
				}
		}
		
		
		else if (ika >= 18 && ika < 65)
		{
			System.out.println("You are a adult" + "\n");
			if (ika >= 18)
			{
				System.out.println("You are qualified by your age to drive these vehicles " + "\n");
				System.out.println("-Moped");
				System.out.println("-Lightmotorcycle");
				System.out.println("-Car");
			}
				if (ika >= 40 && ika <= 50)
				{
					System.out.println("\n" + "Happy middle age!");
				}
					if (ika >= 58 && ika <65)
					{	
							System.out.println("\n" + "You can take early retirement.");
					}
			
		}
		else 
		{
			System.out.println("You are pensioner" + "\n");
			if (ika >= 65)
			{	
				System.out.println("You are qualified by your age to drive these vehicles " + "\n");
				System.out.println("-Moped");
				System.out.println("-Lightmotorcycle");
				System.out.println("-Car");
				System.out.println("\n" + "Happy retiremnt!");
				
			}
			
		}
		
		
		//Syntymäpäivä onnittelut
		
				switch (ika)
				{
				case 10:
					System.out.println ("Congratulations on your " + ika + "rd birthday");
					break;
				case 20:
					System.out.println ("Congratulations on your " + ika + "rd birthday");
					break;
				case 30:
					System.out.println ("Congratulations on your " + ika + "rd birthday");
					break;
				case 40:
					System.out.println ("Congratulations on your " + ika + "rd birthday");
					break;
				case 50:
					System.out.println ("Congratulations on your " + ika + "rd birthday");
					break;
				case 60:
					System.out.println ("Congratulations on your " + ika + "rd birthday");
					break;
				case 70:
					System.out.println ("Congratulations on your " + ika + "rd birthday");
					break;
				case 80:
					System.out.println ("Congratulations on your " + ika + "rd birthday");
					break;
				case 90:
					System.out.println ("Congratulations on your " + ika + "rd birthday");
					break;
				case 100:
					System.out.println ("	GONGRATULATIONS ON YOUR");
					System.out.println ("                 " + ika);
					System.out.println ("	      RD BIRTHDAY!");
					break;
				}
		
		

	}

}


