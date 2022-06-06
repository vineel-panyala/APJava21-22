import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
public class Horoscope {
  Scanner keyboard = new Scanner(System.in);
    private int[] Rat;
    private int[] Ox; 
    private int[] Tiger;
    private int[] Rabbit;
    private int[] Dragon;
    private int[] Snake;
    private int[] Horse;
    private int[] Goat;
    private int[] Monkey;
    private int[] Rooster;
    private int[] Dog;
    private int[] Pig;
  
  
  public Horoscope(){
    Rat = new int[]{1948, 1960, 1972, 1984, 1996, 2008, 2020};
    Ox = new int[]{1949, 1961, 1973, 1985, 1997, 2009, 2021};
    Tiger = new int[]{1950, 1962, 1974, 1986, 1998, 2010, 2022};
    Rabbit = new int[] {1951, 1963, 1975, 1987, 1999, 2011, 2023};
    Dragon = new int[] {1952, 1964, 1976, 1988, 2000, 2012, 2024};
    Snake = new int[] {1953, 1965, 1977, 1989, 2001, 2013, 2025};
    Horse = new int[] {1954, 1966, 1978, 1990, 2002, 2014, 2026};
    Goat = new int[] {1955, 1967, 1979, 1991, 2003, 2015, 2027};
    Monkey = new int[] {1956, 1968, 1980, 1992, 2004, 2016, 2028};
    Rooster = new int[] {1957, 1969, 1981, 1993, 2005, 2017, 2029};
    Dog = new int[] {1958, 1970, 1982, 1994, 2006, 2018, 2030};
    Pig = new int[] {1959, 1971, 1983, 1995, 2007, 2019, 2031}; 
    String[] fortunes = importFile("Horoscope.txt");
    
    
  }
  
  public String ZodiacSign(int userInput) {
  String response="";
    if(contains(Rat, userInput)) {
      response += "Rat";
      
    } else if (contains(Ox, userInput)) {
      response += "Ox"; 
    } else if (contains(Tiger, userInput)) {
      response += "Tiger"; 
    }  else if (contains(Rabbit, userInput)) {
      response += "Rabbit"; 
    } else if (contains(Dragon, userInput)) {
      response += "Dragon"; 
    }  else if (contains(Snake, userInput)) {
      response += "Snake"; 
    } else if (contains(Horse, userInput)) {
      response += "Horse"; 
    } else if (contains(Goat, userInput)) {
      response += "Goat"; 
    } else if (contains(Monkey, userInput)) {
      response += "Monkey"; 
    } else if (contains(Rooster, userInput)) {
      response += "Rooster"; 
    } else if (contains(Dog, userInput)) {
      response += "Dog"; 
    } else {
      response += "Pig"; 
    }

    return response;
    
  }
  
  
  public static boolean contains(int[] arr, int x) {
    for(int i = 0; i<arr.length; i++) {
      if(arr[i] == x) {
        return true;
      }
    }
    return false;
  }
  public static String Stringcontains(String[] arr, int x) {
    for(int i = 0; i<arr.length; i++) {
      if(i== x) {
        return arr[i];
      }
      }
    return "";
    
  }
  
  public String fortune() {
    String[] fortunes = importFile("Horoscope.txt");
    String fortune = fortunes[(int) (Math.random() * fortunes.length)];
    return fortune;
  }
  
  
  



  

  // this is from Dive 
//TOUCH BELOW (That's what she said)
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
  public String horoscope() {
    System.out.println("What is your horoscope?");
    String horoscope = keyboard.nextLine();
    return horoscope;
  }
  public String birthstone(int month) {
    System.out.println("What is your birth month? (Please enter a digit)");
    String[] stones = importFile("Birthstone.txt");
    return Stringcontains(stones, month);
    
  }
}
