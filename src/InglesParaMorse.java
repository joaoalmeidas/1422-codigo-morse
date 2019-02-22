import java.util.Scanner;

public class InglesParaMorse {

	public static void main(String[] args) {
		
		String ingles;
		String morse;
		
		String[] palavrasMorse;
		String[][] letrasMorse;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma mensagem em código morse:");
		morse = input.nextLine();
		palavrasMorse = morse.split("   ");
		
		letrasMorse = new String[palavrasMorse.length][];
		
		for(int i = 0; i < palavrasMorse.length; i++) {
				
			letrasMorse[i] = palavrasMorse[i].split(" ");
			
		}
		
		for(int i = 0; i < letrasMorse.length; i++) {
			
			for(int j = 0; j < letrasMorse[i].length; j++) {
				
				System.out.printf(letrasMorse[i][j]);
				
			}
			
			System.out.println();
			
		}

	}

}
