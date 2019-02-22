import java.util.Scanner;

public class MorseParaIngles {

	public static void main(String[] args) {
		
		String ingles;
		String morse = "";
		
		String[] palavrasIngles;
		String[][] letrasIngles;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma frase:");
		ingles = input.nextLine();
		palavrasIngles = ingles.split(" ");
		
		letrasIngles = new String[palavrasIngles.length][];
		
		for(int i = 0; i < palavrasIngles.length; i++) {
			
			letrasIngles[i] = palavrasIngles[i].split("");
			
		}
		
		for(int i = 0; i < letrasIngles.length; i++) {
			
			for(int j = 0; j < letrasIngles[i].length; j++) {
				
				
				if(letrasIngles[i][j].equalsIgnoreCase("a")) {
					
					morse += ".-";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("b")) {
					
					morse += "-...";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("c")) {
					
					morse += "-.-.";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("d")) {
					
					morse += "-..";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("e")) {
					
					morse += ".";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("f")) {
					
					morse += "..-.";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("g")) {
					
					morse += "--.";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("h")) {
					
					morse += "....";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("i")) {
					
					morse += "..";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("j")) {
					
					morse += ".---";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("k")) {
					
					morse += "-.-";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("l")) {
					
					morse += ".-..";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("m")) {
					
					morse += "--";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("n")) {
					
					morse += "-.";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("o")) {
					
					morse += "---";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("p")) {
					
					morse += ".--.";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("q")) {
					
					morse += "--.-";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("r")) {
					
					morse += ".-.";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("s")) {
					
					morse += "...";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("t")) {
					
					morse += "-";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("u")) {
					
					morse += "..-";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("v")) {
					
					morse += "...-";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("w")) {
					
					morse += ".--";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("x")) {
					
					morse += "-..-";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("y")) {
					
					morse += "-.--";
					
				}else if(letrasIngles[i][j].equalsIgnoreCase("z")) {
					
					morse += "--..";
					
				}else if(letrasIngles[i][j].equals("1")) {
					
					morse += ".----";
					
				}else if(letrasIngles[i][j].equals("2")) {
					
					morse += "..---";
					
				}else if(letrasIngles[i][j].equals("3")) {
					
					morse += "...--";
					
				}else if(letrasIngles[i][j].equals("4")) {
					
					morse += "....-";
					
				}else if(letrasIngles[i][j].equals("5")) {
					
					morse += ".....";
					
				}else if(letrasIngles[i][j].equals("6")) {
					
					morse += "-....";
					
				}else if(letrasIngles[i][j].equals("7")) {
					
					morse += "--...";
					
				}else if(letrasIngles[i][j].equals("8")) {
					
					morse += "---..";
					
				}else if(letrasIngles[i][j].equals("9")) {
					
					morse += "----.";
					
				}else if(letrasIngles[i][j].equals("0")) {
					
					morse += "-----";
					
				}
				
				
				
				morse += " ";
				
			}
			
			
			morse += "  ";
		}
		
		morse = morse.substring(0, morse.lastIndexOf("   "));
		
		System.out.println(morse);

	}

}
