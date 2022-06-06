import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class Magic8Ball{

private String question;
private String[] fortunes;
private String[] riddles;
private String[] answers;

  
public Magic8Ball(){
  question="";
  fortunes=importFile("Magic8Ball.txt");
  riddles = importFile("Riddle.txt");
  answers = importFile("Answers.txt");
}

public String UserQuestionRun(){
  
  
  return fortunes[(int)(Math.random()*fortunes.length)];
}

public String[] getFortunes() {
	return fortunes;
}

public String[] getRiddles() {
	return riddles;
}

public String[] getAnswers() {
	return answers;
}

  public boolean riddle() {
  Scanner input= new Scanner(System.in);
  String[] riddle = importFile("Riddle.txt");
  String[] answer = importFile("Answers.txt");
  int x = (int) (Math.random() * riddle.length-1);
  System.out.println(riddle[x]);
  String response = input.nextLine();
  response = response.toUpperCase();
  if(response .equals (answer[x]) || response .indexOf(answer[x])>=0) {
    
    System.out.println("You are correct");
    return true;
  } else {
    System.out.println("Try again");
    riddle();
    
  }
  return false;
  
}
  








  
// this is from Dive 
//DONT TOUCH BELOW 
public static String[] importFile(String fileName){
  ArrayList<String> words = new ArrayList<>();
  try {
    File myObj = new File(fileName);
    Scanner myReader = new Scanner(myObj);
    while (myReader.hasNextLine()) {
      String data = myReader.nextLine();
      words.add(data);
    }
    myReader.close();
  } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    String[] wordArray = toArray(words);
    return wordArray;
  }
  

  
  public static String[] toArray(ArrayList<String> s){
    String[] words = new String[s.size()];
    for(int i = 0; i < words.length; i++){
      words[i] = s.get(i);
    }
    return words;
  }
}