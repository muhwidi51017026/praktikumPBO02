import java.util.Scanner;
public class Pesawat{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		int nilai;
		
	System.out.print("masukkan Tipe Pesawat= ");
	nilai = input.nextInt();
	
	if (nilai ==1){
		System.out.println ("Pesawat Garuda ");}
		
	else if (nilai ==2){
		System.out.println ("Pesawat batik ");}
	else if (nilai ==3){
		System.out.println ("Pesawat Lion ");}
		else 
		System.out.println ("maaf anda salah memasukan tipe pesawat ");
	}
	}