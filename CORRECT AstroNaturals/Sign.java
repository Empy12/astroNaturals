import java.io.FileNotFoundException;

public interface Sign {
	public String getSign(int month, int day); 
	public String getParagraph(String sign) throws FileNotFoundException;
	public String getStarName();
}
