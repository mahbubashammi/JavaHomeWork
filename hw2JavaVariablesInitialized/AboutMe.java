package hw2JavaVariablesInitialized;

public class AboutMe {
	public String myName = "Shammi";
	public double myHeight = 5.4;
	public Integer myAge = 24;
	public char myGender = 'F';
	public boolean fullTimestudent = false;

	public AboutMe() {
		System.out.println("---this is all about me");

	}

	public void aboutMe() {
		System.out.println("\nmy Name" + myName + "\nmyAge" + myAge + "\nMy Gemder" + myGender + "\nfullTimestudent"
				+ fullTimestudent + "\nmy height" + myHeight);

	}

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		aboutMe.aboutMe();
	}
}
