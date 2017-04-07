import java.io.*;
	import java.util.Scanner;
public class no1 {
	
    public static void main(String[]args) {
        Scanner gampang = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        int masukan= gampang.nextInt();
        long fib[] = new long[masukan];
	    int jumlah;
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < masukan; i++) {
            fib[i] = fib[i-1] + fib[i-2];
		jumlah+=fib[i];
        }
         
   
            System.out.print(jumlah +  " ");

    }
 
}
