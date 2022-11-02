import java.util.Random;
import java.util.Scanner;

public class anasayfa {
	static Scanner sec = new Scanner(System.in);
	static Random sayi = new Random();
	static int k_secim,b_secim;
	static int k_skor=0,b_skor=0,oyunskor=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		oyun();
		
	}
		
	
	public static void oyun() {
		System.out.println("oyun skor = "+oyunskor);
		System.out.println("bir secim yapiniz \n 1- tas \n 2- kagit \n 3- makas");
		 k_secim=sec.nextInt();
		 b_secim=sayi.nextInt(3)+1;
		oyunskor=oyunskor+1;
		
		
		
		switch (k_secim) {
		case 1: {
			System.out.println("kullanicinin secimi tas");
			if (b_secim==1) {
				System.out.println("bilgisayarin secimi tas");
				System.out.println("skor berabere");
				System.out.println("kullanici skor = "+k_skor+ " bilgisayar skor = "+b_skor );
				
			}else if (b_secim==2) {
				System.out.println("bilgisayarin secimi kagit");
				System.out.println("bilgisayar kazandi");
				b_skor=b_skor+1;
				System.out.println("kullanici skor = "+k_skor+ " bilgisayar skor = "+b_skor );
				
				
			}else if (b_secim==3) {
				System.out.println("bilgisayarin secimi makas");
				System.out.println("kullanici kazandi");
				k_skor=k_skor+1;
				System.out.println("kullanici skor = "+k_skor+ " bilgisayar skor = "+b_skor );
			} 
				
			if (oyunskor<6) {
				oyun();
			}else {
				System.out.println("oyun bitti");
			}
			
			break;
		}
		
		case 2: {
			System.out.println("kullanicinin secimi kagit");
			if (b_secim==1) {
				System.out.println("bilgisayarin secimi tas");
				System.out.println("kullanici kazandi");
				k_skor=k_skor+1;
				System.out.println("kullanici skor = "+k_skor+ " bilgisayar skor = "+b_skor );
				
			}else if (b_secim==2) {
				System.out.println("bilgisayarin secimi kagit");
				System.out.println("skor berabere");
				
				
				System.out.println("kullanici skor = "+k_skor+ " bilgisayar skor = "+b_skor );
				
				
			}else if (b_secim==3) {
				System.out.println("bilgisayarin secimi makas");
				System.out.println("bilgisayar kazandi");
				b_skor=b_skor+1;
				System.out.println("kullanici skor = "+k_skor+ " bilgisayar skor = "+b_skor );
			} 
				
			if (oyunskor<6) {
				oyun();
			}else {
				System.out.println("oyun bitti");
			}
			break;
		}
		
		case 3: {
			System.out.println("kullanicinin secimi makas");
			if (b_secim==1) {
				System.out.println("bilgisayarin secimi tas");
				System.out.println("bilgisayar kazandi");
				
				b_skor=b_skor+1;
				System.out.println("kullanici skor = "+k_skor+ " bilgisayar skor = "+b_skor );
				
			}else if (b_secim==2) {
				System.out.println("bilgisayarin secimi kagit");
				System.out.println("kullanici kazandi");
				k_skor=k_skor+1;
				
				
				System.out.println("kullanici skor = "+k_skor+ " bilgisayar skor = "+b_skor );
				
				
			}else if (b_secim==3) {
				System.out.println("bilgisayarin secimi makas");
				System.out.println("skor berabere");
				
				
				System.out.println("kullanici skor = "+k_skor+ " bilgisayar skor = "+b_skor );
			} 
				
			if (oyunskor<6) {
				oyun();
			}else {
				System.out.println("oyun bitti");
			}
			break;
		}
		default:
			System.out.println("hatali bir secim yaptiniz..");
			oyun();
			
		}
		
		
	
	}
			
}
	
		
	
	


