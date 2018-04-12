//WJP to check whether one string is a rotation of another
public class RotationString {

	public static void main(String[] args) {
		isRotation("SaraKianPour", "PourSaraKian");

	}
	
	static void isRotation(String input1 , String input2) {
		
		if(input1.length()!=input2.length())
			System.out.println(input2 + " is not rotation of: "+ input1+ " ");
		
		else {
			String suminput1= input1+input1;
			if(suminput1.contains(input2))
				System.out.println(input2+ " is rotation of "+ input1);
			else
				System.out.println(input2 + " is not rotation of: "+ input1);			
		}		
	}
}
