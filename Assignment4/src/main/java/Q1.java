
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Sandy likes...";
		String str2 = "Sandy is 10 years old.";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.contains("Sandy"));
		System.out.println();
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(8));
		System.out.println(str2.concat(str1).concat(" strawberries."));
		System.out.println(str2.substring(9,17));

		System.out.println();
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println();
		
		String strArr[] = str2.split(" ");
		for (String str : strArr) {
			System.out.println(str);
		}
		System.out.println();
		
		char letters[] = str1.toCharArray();
		for(char c : letters ) {
			System.out.println(c);	
		}
		System.out.println();
				
	}

}
