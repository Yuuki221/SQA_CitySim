import java.util.Random;

public class City {
	static String[] PLACES = {"The Cathedral of Learning", "Squirrel Hill", "Downtown", "The Point"};
	int seed;
	public City(){
		// this.seed = seed;
	}
	// method for generate a random number between 1 and 100
	private int getRandom(){
		Random r = new Random();
		int Low = 1;
		int High = 100;
		int Result = r.nextInt(High - Low) + Low;
		return Result;
	}
	// method for random direction
	public String getCity(){
		int randRes = getRandom();
		if(randRes<=25){
			return PLACES[0];
		}else if(randRes<=50){
			return PLACES[1];
		}else if(randRes<=75){
			return PLACES[2];
		}else{
			return PLACES[3];
		}
	}
	
	// method for leave or stay for one city
	public boolean leftCity(){
		int randRes = getRandom();
		if(randRes<=50){
			return true;
		}else{
			return false;
		}
	}
	
	// message for places information
	public void placesInfoWord(int visitorIdx, String city){
		System.out.println("Visitor " + visitorIdx + " is going to " + city);
	}
	
	// message for leave/stay information 
	public void leaveInfoWord(int visitorIdx, String city, Boolean left){
		if(left) System.out.println("Visitor " + visitorIdx + " left the city.");
	}
	
}
