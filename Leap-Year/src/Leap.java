
public class Leap {
	int divFour;
	int divHundred;
	int divFourHundred;
	String result;
	
// Method to evaluate leap year	
	public void Year() {
		for (int i=1900; i<=2030; i++) {
			divFour = i%4;
			divHundred = i%100;
			divFourHundred = i%400;
			if (divFourHundred==0) {
				System.out.println(i);
			} else if (divFour==0 && divHundred!=0) {
				System.out.println(i);
			}
		}
	}	
	
// Method to evaluate leap year with ternary operator	
	public void Ternary() {
		for (int i=1900; i<=2030; i++) {
			divFour = i%4;
			divHundred = i%100;
			divFourHundred = i%400;
			result = divFourHundred==0 ? String.valueOf(i) : divFour==0 && divHundred!=0 ? String.valueOf(i) : "";
			if (result!="") {
				System.out.println(result);
			}
		}
	}
}
