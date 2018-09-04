package final_.constant;

public class Earth {
	
	public static final double EARTH_RADIUS = 6400;
	public static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA 
		= 4 * EARTH_RADIUS * EARTH_RADIUS * Math.PI;
	}
}
