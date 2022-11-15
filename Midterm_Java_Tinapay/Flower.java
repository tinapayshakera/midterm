class Flower {
	private String name;
	private String color;
	private String aroma;
	private int digit;

	

	public Flower(String name, String color, String aroma, int digit) {
		this.name = name;
		this.color = color;
		this.aroma = aroma;
		this.digit = digit;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public String getaroma() {
		return aroma;
	}

	public void setaroma(String aroma) {
		this.aroma = aroma;
	}

	public int getdigit() {
		return digit;
	}

	public void setdigit( int digit) {
		this.digit = digit;
	}

}