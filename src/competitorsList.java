import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class competitorsList{
	
	private ArrayList<ATMcompetitors> competitorsList;
	
	public competitorsList() {
		competitorsList = new ArrayList<ATMcompetitors> ();
	}
	
	public void add(ATMcompetitors ATMcomp) {
		competitorsList.add(ATMcomp);
	}
	
	public String getAllcomp() {
		String report = "";
		for (ATMcompetitors ATMcomp : competitorsList) {
			report += ATMcomp.getATMcompetitors();
		}
		return report;
	}
	
	/////////////???????????????????/
	public int getSize() 
	{
		return competitorsList.size();
	}
	public ATMcompetitors getAtIndex(int index) {
		return competitorsList.get(index);
	}	
	public String getAllDetailsCompList() {
		String report ="";
		for(ATMcompetitors ATMcomp : competitorsList) {
			report +=String.format("%-6s", ATMcomp.getAllDetails());
		//	report += String.format("%7.2f",ATMcomp.result());
			report+="\n";
		}
		int compID;
		compID= Integer.valueOf(JOptionPane.showInputDialog("Please, enter ID of competitor you want to see full details: "));
		boolean compIDexists=false;
		for (ATMcompetitors ATMcomp  : competitorsList)
		{
			if (compID==ATMcomp.getComNum())
			{
				compIDexists=true;
			}
		}
		/*if (compIDexists)
		{
			report+="The details of CHOSEN competitor:\n"+getFullDetailsofExactComp(compID);
			}
		else
		{
			JOptionPane.showMessageDialog(null, "The number you entered does not match to competitors' numbers.");
		}
		report += "\n\n\n\n\nSTATISTICAL REPORT\n\n";
		//report+=getStatisticalReport();*/
		return report;
  }
	
	
	
	
	
	
	
	
	
	public void writeToFile(String outputfile, String report) throws FileNotFoundException {
		FileWriter fw;
		try {
			fw = new FileWriter(outputfile);
			fw.write("The report contains full details of all competitors");
			fw.write(report+"\n");
			fw.close();
		} catch (IOException fn) {
			System.out.println(outputfile + "not found");
			System.exit(0);
		}
	}
	
	
	
	
	public void readFile(String filename) throws FileNotFoundException {
		File f = new File(filename);
		Scanner scanner = new Scanner(f);
		while (scanner.hasNextLine()) {
			String inputLine = scanner.nextLine();
			if (inputLine.length() !=0) {
				processLine(inputLine);
			}
		} scanner.close();
	}
	
	
	
	
	private static void processLine(String line)
	{
		
		
		try {
	
			
		String parts [] = line.split(",");
		int comNum = Integer.valueOf(parts[0]);
		Name Name = new Name(parts[1], line);
		String country = parts[2];
		String level = parts[3];
		int age = Integer.valueOf(parts[4]);
		int compType = Integer.valueOf(parts[5]);
		
		// score is array
		String scoreLong[] = new String[5];
		int score[] = new int [5];
		System.arraycopy(parts,  6, scoreLong, 0,5);
		for(int i=0; i<5; i++) {
			score[i]=Integer.valueOf(scoreLong[i]);
		}
		
		ATMcompetitors c = new ATMcompetitors(comNum, Name, country, compType, score);
		
		}catch(Exception b) {
		System.out.println("Exception occured:" + b.toString());
		}	
	}
	
	
	
	
	
	 public String getFullDetailsfromCompetitorsList() {
		 String report = "";
		 report+="\n";
		 report+="\n";
		 report+="Com. Number   Name               Country     Level     Age     Scores              Total";
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 report+="\n";
		 report+="\n";
		 report+="There are divers to dive from platform2\n";
		 report+="\n";
		 report+="\n";
		 report+= "sdfds784dsf455";
		 
		 
		 
		return report;
	 }
	 
	 
	 
	 
	 
	 


	





	
}
