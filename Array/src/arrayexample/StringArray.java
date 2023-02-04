package arrayexample;

public class StringArray {
	public static void main(String[] args) {

		String str[] = new String[5];
		str[0] = "Priya";
		str[1] = "Jadhav";
		str[2] = "Anved";
		str[3] = "Ananya";
		str[4] = "Anirudh";

		for (int i = 0; i < 5; i++) {
			System.out.println(str[i]);
		}

		for(String s:str) {
			System.out.println(s);
		}
	}

	
}
