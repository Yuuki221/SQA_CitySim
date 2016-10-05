package Test;

import Program.City;

public class MockCity extends City {
	public String getCity(int seed){
		if(seed<=25){
			return PLACES[0];
		}else if(seed<=50 && seed>25){
			return PLACES[1];
		}else if(seed<=75 && seed>50){
			return PLACES[2];
		}else{
			return PLACES[3];
		}
	}
}
