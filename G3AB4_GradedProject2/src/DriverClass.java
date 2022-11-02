
public class DriverClass {
	
	public static void main(String[] args) {
		final  int FAILURE = 1;
		final int SUCCESS = 0;
		SkyScrapper ssc = new SkyScrapper();
		int result;
		ssc.getInformation();
		ssc.assembleFloors();
	}

}
