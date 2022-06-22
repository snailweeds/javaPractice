package collaboration;

public class TakeTransTest {

	public static void main(String[] args) {
		Student a = new Student("anne", 15000);
		Student b = new Student("boulgy", 6000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		
		a.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		b.takeSubway(greenSubway);
		
		a.showInfo();
		b.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
		
		Student c = new Student("Edward", 20000);
		Taxi unsuTaxi = new Taxi("잘 간다 운수");
		
		c.takeTaxi(unsuTaxi);
		
		c.showInfo();
		unsuTaxi.showTaxiInfo();
	}

}
