package api.lang.system;

public class SystemTime {

	public static void main(String[] args) {
		
		/*
		 * CurrentTimeMillis() and noTime()
		 * 1 January 1970 midnight to present time
		 * units of epoxy, expressed in milliseconds and nanoseconds, respectively
		 * Return (long type)
		 */
		
		System.out.println(System.currentTimeMillis());
		long start = System.currentTimeMillis();
		
		long sum = 0;
		for(long i=1; i<=10000000000L; i++) {
			sum += i;	
		}
		
		System.out.println("Cumulative total : " + sum);
		
		long end = System.currentTimeMillis();
		
		System.out.println("Calculation " 
				+ (end-start) * 0.001 + "It took time.");
	}

}
