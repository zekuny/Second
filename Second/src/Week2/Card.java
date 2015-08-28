package Week2;

public class Card {
	private int number = 0;
	String face = "";

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public Card(int n){
		number = n;
	}
	
	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public Card(int n, String f){
		number = n;
		face = f;
	}
}
