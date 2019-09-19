import java.util.Scanner;
public class latihan04{

	public static void main(String[] args) { 
        Scanner input=new Scanner (System.in);
        System.out.print(" JUMLAH DATA : ");
        	int n= input.nextInt();
        	int []a= new int [n];
        
        System.out.println("INPUT");
        for(int i=0;i<n;i++){ 
        a[i]=input.nextInt();}
        
        int iMaximum = a[0];
        for(int i=1;i<n;i++){
            if(iMaximum < a[i]){
                iMaximum=a[i];}}
        int iMinimum=a[0];
        for(int i=1;i<n;i++){
            if(iMinimum>a[i]){
                iMinimum=a[i];}}
        System.out.println("Nilai Maksimum\t: "+iMaximum+" ");
        System.out.println("Nilai Minimum\t: "+iMinimum+" ");
        
    }

}