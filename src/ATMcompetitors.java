
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
	
	public ATMcompetitors(int comNum, double overall) {
		this.comNum = comNum;
		this.overall = overall;
		
	}

	public String abcdt() {
		String y = (comNum +" " + overall);
		return y;
	}
	
	public ATMcompetitors(int comNum1, Name name, String country1, double overall1, int[] score1){
		this.comNum = comNum1;
		this.name = name;
		this.country = country1;
		this.overall = overall1;
		this.score = score1;
		
	}
	


	
	


	public String getFullDedails()	{
		String x = (comNum + " " + name + country + score + overall);
		return x;
	}
	
	



	public ATMcompetitors(int comNum2, Name name2, String country2, String level2, int compType2, int[] score2) {
		// TODO Auto-generated constructor stub
	}

	public int getComNum() {
		return comNum;
	}
	public Object[] getLevel() {
		return null;
		
		
		
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	
	
	public String getCompType() {
		return compType;
	}
	public void setComNum(int comNum) {
		this.comNum = comNum;
	}
	public void setLevel() {
		this.level = level;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public void setCompType(String compType) {
		this.compType = compType;
	}
	
	public double result(){
		  int[] newScores=new int[7];
		  for (int i=0;i<7;i++){newScores[i]=score[i];}
		  }

	
	
	
	
	
	//////////////////////////////////////////// создал
	public String getATMcompetitors() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//total score
	 
	
	
	public String getAllDetails() {
			String firstline=String.format("%-9s",comNum+String.format("%-20s",this.name.getFAndLName())+String.format("%-10s",country)+ String.format("%-15s",this.getLevel()) + "%-9s",age +String.format("%-18s",this.getAge()));
			return firstline; 
	  }
	
		
	}
		
			/*

	public double getAveScore() {
		int total = 0;
		for (int scoreIndex = 0; scoreIndex < score.length; scoreIndex++) {
			total += score [scoreIndex];
		}
		return (double) total/score.length;
	}
	
	
	public int getMaxScore( ) {
		int max = score [0];
		for (int scoreIndex = 1; scoreIndex < score.lenght; scoreIndex++) {
			if (score[marksIndex] > max) {
				max = score [marksIndex];
			}
		}
		return max;
		
		
	}
	
	}
	
		*/
	
	

	
	
	

