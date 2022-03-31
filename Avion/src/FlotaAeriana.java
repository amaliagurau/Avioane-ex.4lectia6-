
public class FlotaAeriana {

	protected String planeID;
	protected int totalEnginePower;
	
	public FlotaAeriana(String planeID, int totalEnginePower) {
		this.planeID = planeID;
		this.totalEnginePower = totalEnginePower;
	}
	
	public String getPlaneID() {
		return planeID;
	}
	public int getTotalEnginePower() {
		return totalEnginePower;
	}
	
	public String takeOff() {
		return "PlaneID: " +  planeID + " " + "Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - retracting gear -Takeoff complet";
		
	}
	
	public String fly() {
		return "PlaneID + " + planeID+ " Flying. ";
	}
	
	public String land() {
		return "PlaneID " + planeID + "Initiating landing procedure - Enabling airbrakes -\r\n"
				+ "Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing\r\n"
				+ "complete";
	}
	
	}
