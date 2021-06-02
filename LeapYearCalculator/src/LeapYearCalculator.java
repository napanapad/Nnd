package controlStatementProject;

	import java.util.Scanner;
	public class LeapYearCalculator {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int tahun;
			int bulan, hari = 0;
	        String ket=null;
	        System.out.println("1. Januari	| 7. Juli");
			System.out.println("2. Februari	| 8. Agustus");
			System.out.println("3. Maret	| 9. September");
			System.out.println("4. April	| 10. Oktober");
			System.out.println("5. Mei		| 11. November");
			System.out.println("6. Juni		| 12. Desember");
	        System.out.print("Masukan Tahun : ");
	        tahun = input.nextInt();
	        System.out.print("Masukan Bulan (1-12) : ");
	        bulan = input.nextInt();
	        
	        String ganjilGenap = bulan % 2 == 1 ? "Ganjil" : "Genap";
			boolean tahunkabisat = tahun % 4 == 0 || tahun % 400 == 0;
	        switch (bulan){
	            case 1:
	            	hari = 31;
	            	break;
	            case 2:
	            	if(tahunkabisat){
	            		hari = 29;
	            	}
	            	else{
	            		hari = 28;
	            	}
	            case 3:
	            	hari = 31;
	            	break;
	            case 4:
	            	hari = 30;
	            	break;
	            case 5:
	            	hari = 31;
	            	break;
	            case 6:
	            	hari = 30;
	            	break;
	            case 7:
	            	hari = 31;
	            	break;
	            case 8:
	            	hari = 31;
	            	break;
	            case 9:
	            	hari = 30;
	            	break;
	            case 10:
	            	hari = 31;
	            	break;
	            case 11:
	            	hari = 30;
	            	break;
	            case 12:
	                hari = 31;
	                break;
	                }
	        input.close();
	        if(hari == -1){
	        	  System.out.println("Invalid input");
	        	  }
	        else{
	        	System.out.println("Pada Bulan " + bulan +" Tahnun "+ tahun);
	            System.out.println("Memiliki jumlah hari : " + hari + " ("+tahunkabisat+") ");
	        	
    input.close();
	        }
	    }
	}