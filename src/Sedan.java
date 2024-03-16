
public class Sedan extends Car{
	
	private int length;

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	public double getSalePrice() {
		
		if (length > 20) {
			
			return getRegularPrice() - (getRegularPrice() / 20);
		}
		else {
			return getRegularPrice() - (getRegularPrice() / 10);
		}
		
	}

	public int getLenght() {
		return length;
	}

	public void setLenght(int lenght) {
		this.length = lenght;
	}
	
	

}
