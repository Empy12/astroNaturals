import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StarSigns implements Sign {

	String signName;

	public StarSigns() {
	}

	@Override
	public String getSign(int month, int day) {
		
		//January
		if(month == 1){
		   if(day <= 22){
			   signName = "Capricorn";
		   }
		   else{
			   signName = "Aquarius";
		   }
		}
		//February
		else if(month == 2){
		   if(day <= 18){
			   signName = "Aquarius";
		   }
		   else{
			   signName = "Pisces";
		   }
		}
		//March
		else if(month == 3){
		   if(day <= 20){
			   signName = "Pisces";
		   }
		   else{
			   signName = "Aries";
		   }
		}
		//April
		else if(month == 4){
		   if(day <= 19){
			   signName = "Aries";
		   }
		   else{
			   signName = "Taurus";
		   }
		}
		//May
		else if(month == 5){
		   if(day <= 20){
			   signName = "Taurus";
		   }
		   else{
			   signName = "Gemini";
		   }
		}
		//June
		else if(month == 6){
		   if(day <= 20){
			   signName = "Gemini";
		   }
		   else{
			   signName = "Cancer";
		   }
		}
		//July
		else if(month == 7){
		   if(day <= 22){
			   signName = "Cancer";
		   }
		   else{
			   signName = "Leo";
		   }
		}
		//August
		else if(month == 8){
		   if(day <= 22){
			   signName = "Leo";
		   }
		   else{
			   signName = "Virgo";   }
		}
		//September
		else if(month == 9){
		   if(day <= 22){
			   signName = "Virgo";
		   }
		   else{
			   signName = "Libra";
		   }
		}
		//October
		else if(month == 10){
		   if(day <= 22){
			   signName = "Libra";
		   }
		   else{
			   signName = "Scorpio";
		   }
		}
		//November
		else if(month == 11){
		   if(day <= 21){
			   signName = "Scorpio";
		   }
		   else{
			   signName = "Sagittarius";
		   }
		}
		//December
		else if(month == 12){
		   if(day <= 21){
			   signName = "Sagittarius";
		   }
		   else{
			   signName = "Capricorn";
		   }
		}
		
		return ("You were born " + month + "/" + day + " so, your sign is " + signName +"!");
	}

	@Override
	public String getParagraph(String sign) throws FileNotFoundException {
		String fact = " ";
		String trait = " ";
		String activism = " ";
		
		//File file = new File("zodiacs.txt");
		File file = new File("/Users/nataliestarczewski/eclipse-workspace/StarSignAppProject/bin/zodiacs.txt");
		
		Scanner scan = new Scanner(file);
		  
		  while(scan.hasNext()){
		         if(scan.nextLine() == sign){
		            for(int i=0;i<3;i++){
		               if(i==0){
		            	   fact = scan.nextLine();
		               }
		               else if(i==1){
		            	   trait = scan.nextLine();
		               }
		               else{
		            	   activism = scan.nextLine();
		               }
		            }
		         
		         } 
		  }
		  scan.close();
		  return ("Fact: " + fact + "\nTrait: " + trait + "\nActivism: " + activism);
	}
	
	public String getStarName() {
		return (signName);
	}

}
