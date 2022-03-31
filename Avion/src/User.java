
public class User {

	public static void main(String[] args) {
		
		FlotaAeriana avioane = new FlotaAeriana("60AG", 1000);
		AvioaneCalatori comercial = new AvioaneCalatori("45JH", 1070, 150);
		Concorde con = new Concorde("78JK", 1090, 200);
		Boeing boe = new Boeing("99QW", 1600, 400);
		AvioaneLupta lupta = new AvioaneLupta("88UU", 1300);
		Mig MIG = new Mig("45FT", 2000);
		TomCat tc = new TomCat("65GH", 1700);
		
	    lupta.launchMissile();
		System.out.println(avioane.getPlaneID());
	}

}
