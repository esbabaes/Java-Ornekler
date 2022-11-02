import java.util.Random;

public class anasayfa {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random veri = new Random();
		int gun=veri.nextInt(7);
		
		String[] soz= new String[7];
		soz[0]=" Savaşı zenginler çıkarır, yoksullar ölür. Sartre ";
		soz[1]="Asla vazgeçmeyin, kaybedenler yalnızca vazgeçenlerdir.";
		soz[2]="10 kilitli kapıdan daha güvenlidir babanın evde oluşu.";
		soz[3]="Her elini sikanla dost, her canini sikanla düsman olma.";
		soz[4]="Affetmek geçmişi değiştirmez ama geleceğin önünü açar. Paul Boese";
		soz[5]="Güzeli güzel yapan edeptir, edep ise güzeli sevmeye sebeptir! Hz. Mevlana";
		soz[6]="Her seven isimsiz bir kahramandır ve insan, sevebildiği kadar insandır!";
		
		
		System.out.println("gunun sonuzu: \n"+ soz[gun]);
		
		
		
	
	
	}
			
}
	
		
	
	


