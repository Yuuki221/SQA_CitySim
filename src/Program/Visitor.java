package Program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/*
	abstract class for all visitors
*/

public class Visitor {
	public Map<String, String[]> likeMap;
	String cate;
	int visitorIdx;
	public Visitor(int visitorIdx){
		this.visitorIdx = visitorIdx;
		
		if(getRandom()<=25){
			this.cate = "Student";
		}else if(getRandom()<=50){
			this.cate = "Professor";
		}else if(getRandom()<=75){
			this.cate = "Blogger";
		}else{
			this.cate = "Business Person";
		}
		likeMap = new HashMap<String, String[]>();
		
		likeMap.put("Student", new String[]{"squirrel hill", "downtown", "the point"});
		likeMap.put("Professor", new String[]{"squirrel hill","the cathedral of learning", "the point", "downtown"});
		likeMap.put("Blogger", new String[]{});
		likeMap.put("Business Person", new String[]{"squirrel hill", "downtown"});
	}
	
	// method for judge if the visitor like the one city
	private boolean likeCity(String cityName){
		return Arrays.asList(likeMap.get(this.cate)).contains(cityName.toLowerCase())? true : false;
	}
	
	// method for determine the cate of the visitor
	private int getRandom(){
		Random r = new Random();
		int Low = 1;
		int High = 100;
		int Result = r.nextInt(High - Low) + Low;
		return Result;
	}
	
	// method for print out like information 
	public void judgeWord(String cityName){
		if(likeCity(cityName)){
			System.out.println("Visitor " + visitorIdx + " like " + cityName);
		}else{
			System.out.println("Visitor " + visitorIdx + " do not like " + cityName);
		}
	}
	
	public void introWord(){
		System.out.println("Visitor " + visitorIdx + " is a " + cate );
	}
}
