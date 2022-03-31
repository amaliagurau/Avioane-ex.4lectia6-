
public class AvioaneCalatori extends FlotaAeriana {
	protected int maxNrPassengers;
	public AvioaneCalatori(String planeID, int totalEnginePower, int maxNrPassengers) {
		super(planeID, totalEnginePower);
		this.maxNrPassengers = maxNrPassengers;
	}
	public int getmaxPassengers() {
		return maxNrPassengers;
	}
}