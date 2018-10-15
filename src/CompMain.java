
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



public class CompMain {

	public static void main(String[] args) throws IOException {
		
		ArrayList<ATMcompetitors> complist = new ArrayList<>();
		
		BufferedReader reader = new BufferedReader(new FileReader("InputCompetitors.csv"));
		String line = null;
		Scanner scanner = null;
		while ((line = reader.readLine()) != null) {			
			ATMcompetitors competitorAll = new ATMcompetitors();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			int index = 0;
			while (scanner.hasNext()) {
				String data = scanner.next();
				if(index == 0)
					competitorAll.setComNum(data);
				else if (index == 1)
					competitorAll.setName(data);
				else if (index == 2)
					competitorAll.setCountry(data);
				else if (index == 3)
					competitorAll.setLevel(data);
				else if (index == 4)
					competitorAll.setAge(Integer.parseInt(data));
				else if (index == 5)
					competitorAll.setCompType(data);				
				else if (index == 6) 
					competitorAll.setScore(data, 0);
				else if (index == 7)
					competitorAll.setScore(data, 1);
				else if (index == 8)
					competitorAll.setScore(data, 2);
				else if (index == 9)
					competitorAll.setScore(data, 3);
				else if (index == 10)
					competitorAll.setScore(data, 4);				
	            index++;
			}
			complist.add(competitorAll);
		}
		reader.close();	
		System.out.println("1st com " + complist.get(1).getName());
		System.out.println("1st com " + complist.get(1).getName());
		
		
	}	
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	
	competitorsList sl = new competitorsList();
	sl.readFile("competitorsList.csv");
	String fullList = sl.getFullDetailsfromList();
	sl.writeToFile("competitors_Out.txt", fullList);
		FileWriter fileWriter = new FileWriter("Output.txt", true);
		PrintWriter printWriter = new PrintWriter(FileWriter);
	
		
		printWriter.close();
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	File f = new  File("InputCompetitors.csv");
			Scanner s = new Scanner(f);
			String nexLine = s.nextLine();
			
			

			
			competitorsList s = new competitorsList();
			s.readFile("InputCompetitors.csv");
		

			
			FileWriter fileWriter = new FileWriter("Output.txt", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(var);
			printWriter.close();
		}
		
		
		
		
	
	*/
	
	
		//File f = new  File("InputCompetitors.csv");
		//Scanner s = new Scanner(f);
		//String nexLine = s.nextLine();
		
		
		//String var = s.nextLine();
		//	String[] components = nextLine(",");
		//String a = components[0];
		//String b = components[1];
		//competitorsList s = new competitorsList();
		//	s.readFile("InputCompetitors.csv");
	/*	

		
		FileWriter fileWriter = new FileWriter("Output.txt", true);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		//printWriter.println(var);
		printWriter.close();
	}
}
/*competitorsList sl = new competitorsList();
sl.readFile("competitorsList.csv");
String fullList = sl.getFullDetailsfromList();
sl.writeToFile("competitors_Out.txt", fullList);*/
	//FileWriter fileWriter = new FileWriter("Output.txt", true);
	//PrintWriter printWriter = new PrintWriter(FileWriter);
	
	//printWriter.println(var);
	/*printWriter.println(var1);
	printWriter.println(var2);
	
	printWriter.close();*/






		
		
		//ATMcompetitors x = new ATMcompetitors (11, "Aibek", "Kaidarov", "KZ", 5.5, 5);
		//ATMcompetitors person = new ATMcompetitors(5, "Aibek", "Kaidarov", "Kz", 5.5, 5);
		//ATMcompetitors aft = new ATMcompetitors(5, 8.5);
		//System.out.println(aft.abcdt());
		//	Name person = new Name("Keith", "David", "Ford");
		//ATMcompetitors er = new ATMcompetitors(11, person, "KZ", 5.5, 5);
		//System.out.println(er.adse());
		
		//Name person = new Name("Keith", "David", "Ford");
		/*System.out.print("First name and last name: " );
		System.out.println(person.getFirstAndLastName());
		System.out.print("Surname, comma, firstname: ");
		System.out.println(person.getLastCommaFirst());*/
		
		/*Name person = new Name("Keith", "Ford");
		System.out.print(person.getInitPeriodFirst() + "" + person.getInitPeriodLast());
		System.out.println(person.getInitPeriodLast());*/
		
		//String fullList = f.getFullDetailsfromList();
		
		/*
		try {
			Scanner sc = new Scanner(f);
			
			String var = sc.nextLine();
			String var1 = sc.nextLine();
			String var2 = sc.nextLine();
			*/
		//competitorsList var = competitorsList;
		
		/*competitorsList sl = new competitorsList();
		sl.readFile("competitorsList.csv");
		String fullList = sl.getFullDetailsfromList();
		sl.writeToFile("competitors_Out.txt", fullList);*/
			//FileWriter fileWriter = new FileWriter("Output.txt", true);
			//PrintWriter printWriter = new PrintWriter(FileWriter);
			
			//printWriter.println(var);
			/*printWriter.println(var1);
			printWriter.println(var2);
			
			printWriter.close();
			}catch(Exception e) {
			System.out.println("Exception occured:" + e.toString());
		}*/