import java.util.Scanner;

public class MorseParaIngles {

	public static void main(String[] args) {
		
		String ingles;
		String morse = "";
		
		String[] palavrasIngles;
		String[][] letrasIngles;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma mensagem em código morse:");
		ingles = input.nextLine();
		palavrasIngles = ingles.split(" ");
		
		letrasIngles = new String[palavrasIngles.length][];
		
		for(int i = 0; i < palavrasIngles.length; i++) {
			
			letrasIngles[i] = palavrasIngles[i].split("");
			
		}

	}

}
