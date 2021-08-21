package day4;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "Week2 assignment 4 removeduplicate";
		
	      char[] characters = text.toCharArray();
	      int length = characters.length;
	      System.out.println("String with duplicates : " + text);
	      for (int i = 0; i < length; i++) {
	         for (int X = i + 1; X < length; X++) {
	            if (characters[i] == characters[X]) {
	               int temp = X;
	               for (int Z = temp; Z < length - 1; Z++) 
	               {
	                  characters[Z] = characters[Z + 1];
	               }
	               X--;
	               length--;//reduce char array length
	            }
	         }
	      }
	      String stringWithOutDuplicates = new String(characters);
	      stringWithOutDuplicates = stringWithOutDuplicates.substring(0, length);
	      System.out.println("String after duplicates removed : " +
	                        stringWithOutDuplicates);

	}

}
