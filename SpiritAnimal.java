import java.util.ArrayList;

public class SpiritAnimal {
	
	ArrayList<String> braveAnimals;
	ArrayList<String> independentAnimals;
	ArrayList<String> spiritualAnimals;
	ArrayList<String> socialAnimals;
	
	public SpiritAnimal() {
		braveAnimals = new ArrayList<>();
		independentAnimals = new ArrayList<>();
		spiritualAnimals = new ArrayList<>();
		socialAnimals = new ArrayList<>();
		
		braveAnimals.add("Bear");
		braveAnimals.add("Eagle");
		braveAnimals.add("Lion");
		braveAnimals.add("Tiger");
		
		independentAnimals.add("Wolf");// work in groups
		independentAnimals.add("Wolverine");//work alone
		independentAnimals.add("Cat");//Pessimistic
		independentAnimals.add("Whale");//Optimistic
		
		spiritualAnimals.add("Turtle");//Stay like this or improve yourself? stay
		spiritualAnimals.add("Snake");// improve
		//Prefer driving or flying
		spiritualAnimals.add("Owl");//rather be Wise
		spiritualAnimals.add("Swan");//rather be Good-looking
		
		socialAnimals.add("Dolphin");// Feeler
		socialAnimals.add("Beluga");//Thinker
		//Swimming or running
		socialAnimals.add("Bee");//fly
		socialAnimals.add("Ant");//be twice as strong
		
	}
	public String returnBraveAnimal() {
		return braveAnimals.get(0);
	}
	public String returnIndependentAnimal() {
		return independentAnimals.get(0);
	}
	public String returnSpiritualAnimal() {
		return spiritualAnimals.get(0);
	}
	public String returnSocialAnimal() {
		return socialAnimals.get(0);
	}
	
	
	public void braveRemoveTopHalf(){
		for (int i =0; i<braveAnimals.size()/2;i++) {
			braveAnimals.remove(i);
		}
	}
	public void braveRemoveBottomHalf(){
		for (int i =braveAnimals.size()/2; i<braveAnimals.size();i++) {
			braveAnimals.remove(i);
		}
	}
	

	public void independentRemoveTopHalf(){
		for (int i =0; i<independentAnimals.size()/2;i++) {
			independentAnimals.remove(i);
		}
	}
	public void independentRemoveBottomHalf(){
		for (int i =independentAnimals.size()/2; i<independentAnimals.size();i++) {
			independentAnimals.remove(i);
		}
	}
	
	
	public void spiritualRemoveTopHalf(){
		for (int i =0; i<spiritualAnimals.size()/2;i++) {
			spiritualAnimals.remove(i);
		}
	}
	public void spiritualRemoveBottomHalf(){
		for (int i =spiritualAnimals.size()/2; i<spiritualAnimals.size();i++) {
			spiritualAnimals.remove(i);
		}
	}
	
	
	public void socialRemoveTopHalf(){
		for (int i =0; i<socialAnimals.size()/2;i++) {
			socialAnimals.remove(i);
		}
	}
	public void socialRemoveBottomHalf(){
		for (int i =socialAnimals.size()/2; i<socialAnimals.size();i++) {
			socialAnimals.remove(i);
		}
	}
	
	
	

	

}
