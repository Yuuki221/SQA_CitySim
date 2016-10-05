package Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import Program.City;

public class CityTest {

	@Test
	/*
	 * test if required place are in the PLACES array in City 
	 */
	public void testPlacesName() {
		City testCity = new City();
		Set<String> placesCollection = new HashSet<String>();
		placesCollection.add("the cathedral of learning");
		placesCollection.add("the point");
		placesCollection.add("downtown");
		placesCollection.add("squirrel hill");
		
		for(int i=0; i<testCity.PLACES.length; i++){
			assertTrue(placesCollection.contains(testCity.PLACES[i].toLowerCase()));
		}
	}
	
	@Test
	/*
	 * test if there are only 4 cities in PLACES array 
	 */
	public void testPlacesNumber(){
		City testCity = new City();
		assertTrue(testCity.PLACES.length==4);
	}
	
	@Test
	/*
	 * Test for return city, mock getRandom method in City here
	 */
	public void testgetCity1(){
		MockCity mock = new MockCity();
		assertTrue(mock.getCity(50).equals("Squirrel Hill"));
	}
	
	@Test 
	/*
	 * Test the getCity method 
	 */
	public void testgetCity2(){
		MockCity mock = new MockCity();
		assertTrue(mock.getCity(12).equals("The Cathedral of Learning"));
	}
	
	@Test 
	/*
	 * Test the getCity method 
	 */
	public void testgetCity3(){
		MockCity mock = new MockCity();
		assertTrue(mock.getCity(75).equals("Downtown"));
	}
	
	@Test 
	/*
	 * Test the getCity method 
	 */
	public void testgetCity4(){
		MockCity mock = new MockCity();
		assertTrue(mock.getCity(100).equals("The Point"));
	}
}
