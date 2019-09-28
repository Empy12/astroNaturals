
public class StarSigns implements Sign {

	String signName;

	public StarSigns() {
	}

	@Override
	public String getSign(int month, int day) {
		signName = "STAR NAME";
		return ("You were born " + month + "/" + day + " so, your sign is...");
	}

	@Override
	public String getFact(String sign) {
		return (sign + ", your fact is...");
	}

	@Override
	public String getActivism(String sign) {
		return (sign + ", your activism idea is...");
	}
	
	public String getStarName() {
		return (signName);
	}

}
