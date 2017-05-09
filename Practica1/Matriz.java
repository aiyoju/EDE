import java.util.Scanner;

public class Matriz {
	
	public static void main(String [] args){
		
		Scanner e = new Scanner(System.in);
		
		int n = 0,suma1 = 0, suma2 = 0;
		
		n = e.nextInt();
		
		int matriz[][] = new int[n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]=(int) Math.round(Math.random()*10);
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
		
		/* for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i == j && j == 1){suma1+=matriz[i][j];suma2+=matriz[i][j];}
				if(i == 0 && j == 0){suma1+=matriz[i][j];}
				if(i == matriz.length && j == matriz.length){suma1+=matriz[i][j];}
				if(i == 0 && j == matriz.length){suma2+=matriz[i][j];}
				if(j == 0 && i == matriz.length){suma2+=matriz[i][j];}
			}
		}*/
		System.out.println("\nDiagonal \\ = "+suma1);
		System.out.println("\nDiagonal / = "+suma2);
		
		System.out.println("Ambas diagonales = "+(suma1+suma2));
	}

}
