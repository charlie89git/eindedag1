package charlie;

public class blackjack {
	public static void main(String[]args) {
		Auto mijnAuto = new Auto();
		Auto zijnAuto = new Auto();
		mijnAuto.merk = "Audi";
		System.out.println(mijnAuto.merk);
		mijnAuto.rijden();
		garage Piet = new garage();
		Piet.repareren();
}
}
class garage{
	void repareren() {
		System.out.println("Ik ben in de garage.");
	}
}

class Auto{
	String merk;
	int snelheid; 
	String nummerbord;
	
	void rijden() {
		System.out.println("Ik rijd een " +merk);
	}
}