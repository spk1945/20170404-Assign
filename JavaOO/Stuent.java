
public class Stuent {
	
	private static String hackgwa;
	private static int number;

	public void setHackgwa(String hackgwa) {
		Stuent.hackgwa = hackgwa;
	}
	
	public static String getHackgwa() {
		return hackgwa;
	}
	
	public void setNumber(int number) {
		Stuent.number = number;
	}
	
	public static int getNumber() {
		return number;
	}
	
	public static void main(String[] args) {
			Stuent s1 = new Stuent();
			s1.setHackgwa("컴퓨터정보공학");
			s1.setNumber(20140000);

			System.out.println("학과 : "+getHackgwa());
			System.out.println("학번 : "+getNumber());
			
	}

}
