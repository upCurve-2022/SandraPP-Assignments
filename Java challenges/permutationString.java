
public class permutationString {

	public static void main(String[] args) {
		permutation(" ","GOD");
		
		
	}
	private static void permutation(String string, String string2) {
		if(string2.isEmpty())
		{
			System.out.println(string+string2);
		}
		else
		{
			for(int i=0;i<string2.length();i++)
			{
				permutation(string+string2.charAt(i),string2.substring(0, i)+string2.substring(i+1, string2.length()));
			}
		}
	}

}
