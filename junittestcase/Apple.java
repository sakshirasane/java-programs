package junittestcase;

public class Apple {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public boolean checkcolor() {
		if(color.equalsIgnoreCase("green")|| color.equalsIgnoreCase("red"))
			return true;
		else
			return false;
	}
	
}
