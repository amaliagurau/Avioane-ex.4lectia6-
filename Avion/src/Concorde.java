
public class Concorde extends AvioaneCalatori {

	public Concorde(String planeID, int totalEnginePower, int maxNrPassengers) {
		super(planeID, totalEnginePower, maxNrPassengers);
	}
	public void goSuperSonic() {
		System.out.println("PlaneID" + this.planeID + " - SuperSonic mode activated");
	}
	public void goSubSonic() {
		System.out.println("PlaneID" + this.planeID + " - SuperSonic mode deactivated");
	}
}
