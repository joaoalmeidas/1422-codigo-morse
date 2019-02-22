import java.util.Scanner;

public class InglesParaMorse {

	public static void main(String[] args) {
		
		String ingles = "";
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
				
				if(letrasMorse[i][j].equals(".-")) {
					
					ingles += "A";
					
				}else if(letrasMorse[i][j].equals("-...")) {
					
					ingles += "B";
					
				}else if(letrasMorse[i][j].equals("-.-.")) {
					
					ingles += "C";
					
				}else if(letrasMorse[i][j].equals("-..")) {
					
					ingles += "D";
					
				}else if(letrasMorse[i][j].equals(".")) {
					
					ingles += "E";
					
				}else if(letrasMorse[i][j].equals("..-.")) {
					
					ingles += "F";
					
				}else if(letrasMorse[i][j].equals("--.")) {
					
					ingles += "G";
					
				}else if(letrasMorse[i][j].equals("....")) {
					
					ingles += "H";
					
				}else if(letrasMorse[i][j].equals("..")) {
					
					ingles += "I";
					
				}else if(letrasMorse[i][j].equals(".---")) {
					
					ingles += "J";
					
				}else if(letrasMorse[i][j].equals("-.-")) {
					
					ingles += "K";
					
				}else if(letrasMorse[i][j].equals(".-..")) {
					
					ingles += "L";
					
				}else if(letrasMorse[i][j].equals("--")) {
					
					ingles += "M";
					
				}else if(letrasMorse[i][j].equals("-.")) {
					
					ingles += "N";
					
				}else if(letrasMorse[i][j].equals("---")) {
					
					ingles += "O";
					
				}else if(letrasMorse[i][j].equals(".--.")) {
					
					ingles += "P";
					
				}else if(letrasMorse[i][j].equals("--.-")) {
					
					ingles += "Q";
					
				}else if(letrasMorse[i][j].equals(".-.")) {
					
					ingles += "R";
					
				}else if(letrasMorse[i][j].equals("...")) {
					
					ingles += "S";
					
				}else if(letrasMorse[i][j].equals("-")) {
					
					ingles += "T";
					
				}else if(letrasMorse[i][j].equals("..-")) {
					
					ingles += "U";
					
				}else if(letrasMorse[i][j].equals("...-")) {
					
					ingles += "V";
					
				}else if(letrasMorse[i][j].equals(".--")) {
					
					ingles += "W";
					
				}else if(letrasMorse[i][j].equals("-..-")) {
					
					ingles += "X";
					
				}else if(letrasMorse[i][j].equals("-.--")) {
					
					ingles += "Y";
					
				}else if(letrasMorse[i][j].equals("--..")) {
					
					ingles += "Z";
					
				}else if(letrasMorse[i][j].equals(".----")) {
					
					ingles += "1";
					
				}else if(letrasMorse[i][j].equals("..---")) {
					
					ingles += "2";
					
				}else if(letrasMorse[i][j].equals("...--")) {
					
					ingles += "3";
					
				}else if(letrasMorse[i][j].equals("....-")) {
					
					ingles += "4";
					
				}else if(letrasMorse[i][j].equals(".....")) {
					
					ingles += "5";
					
				}else if(letrasMorse[i][j].equals("-....")) {
					
					ingles += "6";
					
				}else if(letrasMorse[i][j].equals("--...")) {
					
					ingles += "7";
					
				}else if(letrasMorse[i][j].equals("---..")) {
					
					ingles += "8";
					
				}else if(letrasMorse[i][j].equals("----.")) {
					
					ingles += "9";
					
				}else if(letrasMorse[i][j].equals("-----")) {
					
					ingles += "0";
					
				}
				
			}
			
			ingles += " ";
			
		}
		
		System.out.println(ingles);
		

	}

}
