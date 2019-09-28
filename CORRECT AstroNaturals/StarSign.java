public class StarSign{
String theSign;
private Scanner readit;

String fact;
String trait;
String activism;


public String findSign(int month, int day){
//January
if(month == 1){
   if(day <= 22){
      theSign = "Capricorn";
   }
   else{
      theSign = "Aquarius";
   }
}
//February
else if(month == 2){
   if(day <= 18){
      theSign = "Aquarius";
   }
   else{
      theSign = "Pisces";
   }
}
//March
else if(month == 3){
   if(day <= 20){
      theSign = "Pisces";
   }
   else{
      theSign = "Aries";
   }
}
//April
else if(month == 4){
   if(day <= 19){
      theSign = "Aries";
   }
   else{
      theSign = "Taurus";
   }
}
//May
else if(month == 5){
   if(day <= 20){
      theSign = "Taurus";
   }
   else{
      theSign = "Gemini";
   }
}
//June
else if(month == 6){
   if(day <= 20){
      theSign = "Gemini";
   }
   else{
      theSign = "Cancer";
   }
}
//July
else if(month == 7){
   if(day <= 22){
      theSign = "Cancer";
   }
   else{
      theSign = "Leo";
   }
}
//August
else if(month == 8){
   if(day <= 22){
      theSign = "Leo";
   }
   else{
      theSign = "Virgo";   }
}
//September
else if(month == 9){
   if(day <= 22){
      theSign = "Virgo";
   }
   else{
      theSign = "Libra";
   }
}
//October
else if(month == 10){
   if(day <= 22){
      theSign = "Libra";
   }
   else{
      theSign = "Scorpio";
   }
}
//November
else if(month == 11){
   if(day <= 21){
      theSign = "Scorpio";
   }
   else{
      theSign = "Sagittarius";
   }
}
//December
else if(month == 12){
   if(day <= 21){
      theSign = "Sagittarius";
   }
   else{
      theSign = "Capricorn";
   }
}
return theSign;
}


   public void fileOpen(){
      try{
         readit = new Scanner(new File("zodiacs.txt"));
      }
      catch(Exception e){
         System.out.println("Sorry, didn't catch that");
      }
      
      
   }
   
   public void readFile(){
      while(readit.hasNext()){
         if(readit.nextLine()==theSign){
            for(i=0;i<3;i++){
               if(i==0){
               fact = scan.nextLine();
               }
               else if(i==2){
               trait = scan.nextLine();
               }
               else{
               activism = scan.nextLine();
               }
            }
         
         }
   
      }
   public void closeFile(){
   zodiacs.close();
   }





}