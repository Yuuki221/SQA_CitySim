import java.util.Scanner;

public class CityDriver {
	public static void main(String[] args){
		// iterate through the
		Scanner reader = new Scanner(System.in);
		System.out.println("Please Enter a number: ");
		int seed = reader.nextInt();
		System.out.println("Welcome to CitySim! Your seed is "+ seed);
		for(int i=1; i<=5; i++){
			int visitTime = 1;
			boolean left = false;
			Visitor newVisitor = new Visitor(i);
			while(!left){
			City city = new City();
			String cityName = city.getCity();
			left = visitTime==1? false : city.leftCity();
			newVisitor.introWord();
			city.placesInfoWord(i, cityName);
			newVisitor.judgeWord(cityName);
			city.leaveInfoWord(i, cityName, left);
			visitTime++;
			}
			System.out.println("***");
		}
	}
}
