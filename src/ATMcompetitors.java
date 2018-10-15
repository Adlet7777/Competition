
public class ATMcompetitors {

	private int comNum;
	private Name name;
	private String level;
	private int age;
	private String country;
	private int[] score;
	private String compType;
	private double overall;
	
	
	public ATMcompetitors(int comNum, Name name, String level, int age, String country, int[] score, String compType, double overall) {
		this.comNum=comNum;
		this.name=name;
		this.level=level;
		this.age=age;
		this.country=country;
		this.score=score;
		this.compType=compType;
		this.overall = overall;
	}
	
	public ATMcompetitors() {
		// TODO Auto-generated constructor stub
		this.name = new Name();
		this.score = new int[5];
	}

	public String getLevel() {
		return level;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	public int[] getScore() {
		return score;
	}

	public String getCompType() {
		return compType;
	}

	public double getOverall() {
		return overall;
	}	
		//0
	public void setComNum(String data) {
		this.comNum = Integer.parseInt(data);
	}
	//1
	public void setName(String data) {
		// jazu
		this.name.setNameSurname(data);
	}
	//2
	public void setCountry(String data) {
		this.country = data;
	}	
	//3
	public void setLevel(String data) {
		this.level = data;
	}
	//4
	public void setAge(int data) {
		this.age = data;
	}
	//5
	public void setCompType(String data) {
		this.compType = data;
	}
	//6
	public void setScore(String data, int index) {
		this.score[index] = Integer.parseInt(data);
	}
	public void setOverall(double overall) {
		this.overall = overall;
	}

	public String getName() {
		
		return this.name.getFAndLName();
	}
	public int getComNum() {
		
		return this.comNum;
	}
}
		

	
	

	
	
	

