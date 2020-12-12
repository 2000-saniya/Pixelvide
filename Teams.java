import java.util.*;

public class Teams {
	

	public static void main(String[] args) {
		
		final String string1[] = {"Barcelona(ESP)", "Bayern(GER)", "Benfica(POR)", "Chelsea(ENG)", "Juventus(ITA)", "Paris(FRA)", "PSV(NED)", "Zenit(RUS)"};
		final String string2[] = {"Arsenal (ENG)", "Astana (KAZ)", "Atlético (ESP)", "BATE (BLR)", "CSKA Moskva (RUS)", "Dinamo Zagreb (CRO)", "Dynamo Kyiv (UKR)", "Galatasaray (TUR)", "Gent (BEL)",
				"Leverkusen (GER)", "Lyon (FRA)", "M. Tel-Aviv (ISR)", "Malmö (SWE)", "Man. City (ENG)", "Man. United (ENG)", "Mönchengladbach (GER)", "Olympiacos (GRE)", "Porto (POR)",
				"Real Madrid (ESP)", "Roma (ITA)", "Sevilla (ESP)", "Shakhtar Donetsk (UKR)", "Valencia (ESP)", "Wolfsburg (GER)"};
		
		
		//List al1 = Arrays.asList(string1);
		//List al2 = Arrays.asList(string2);
		
		int j = 1;
		
		Random random = new Random();
		
		
		
		while(j<=8) {
			
			int index1 = random.nextInt(string1.length);
			System.out.println("Group " +j+ ":");
			System.out.println(string1[index1]);
			
			//al1.remove(index1);
			
			
			for(int i = 0; i<3; i++) {
				int index2 = random.nextInt(string2.length);
				System.out.println(string2[index2]);
				
				//al1.remove(index2);
				
			}
			j++;
			
			System.out.println(" ");
		}

	}

}
