import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class StarSignGUI extends Application {
	
	//attributes
	private StarSigns sign;
	
	Font font = new Font("American Typewriter", 50);
	GridPane grid = new GridPane();
	Label introlabel;
	Label reportLabel;
	Label paragraphLabel;
	TextField enterDate;
	TextField enterMonth;
	
	Button reportButton;
	
	
	public static void main(String[] args){
	      launch(args);
	}
	
	 @Override
	   public void start(Stage stage){
	   
	      //create new game
	      sign = new StarSigns();
	      
	      Label titleLabel = new Label(" Your Star Sign vs the Climate Crisis ");
	      //titleLabel.setFont(new Font("American Typewriter",25));
	      titleLabel.setFont(Font.font("Palatino", FontWeight.BOLD, 30));
	      titleLabel.setTextFill(Color.web("#0774ab", 0.8));
	      titleLabel.setAlignment(Pos.CENTER);
	      
	      Image img = new Image("starstars.png");
	      ImageView imgView = new ImageView(img);
	      
	      enterMonth = new TextField();
	      enterMonth.setText("Enter month you were born... (mm)");
	      enterMonth.setPadding(new Insets(20));
	      
	      enterDate = new TextField();
	      enterDate.setText("Enter day you were born... (dd)");
	      enterDate.setPadding(new Insets(20));
	      
	      reportButton = new Button("Consult the stars...");
		  reportButton.setOnAction(new SignsButtonHandler()); 
		  reportButton.setStyle("-fx-background-color: #259edb;-fx-text-fill: #ffffff");
	      
	      reportLabel = new Label (" report ");
	      reportLabel.setFont(new Font("Palatino",25));
	      reportLabel.setStyle("-fx-text-fill: #0774ab ");
	      
	      paragraphLabel = new Label (" paragraph ");
	      paragraphLabel.setFont(new Font("Palatino",15));
	      paragraphLabel.setStyle("-fx-text-fill: #0774ab ");
	      
	      VBox vbox = new VBox(imgView,titleLabel,enterMonth,enterDate,reportButton,reportLabel,paragraphLabel);
	      vbox.setBackground(Background.EMPTY); 
	      vbox.setAlignment(Pos.CENTER);      
	      vbox.setPadding(new Insets(20));
	      
	      Scene scene = new Scene(vbox, 600, 600, Color.LIGHTBLUE);
	         
	      stage.setScene(scene);  
	         
	      stage.setTitle("Astrology");
	         
	      stage.show();
	      
	 }
	 
	 class SignsButtonHandler implements EventHandler<ActionEvent>{
	      @Override
	      public void handle(ActionEvent event){
	    	  if(event.getSource().equals(reportButton)){
	    		  
	    		  String reportString = sign.getSign(Integer.parseInt(enterMonth.getText()),Integer.parseInt(enterDate.getText()));
	    		  
	    		  String paragraphString = sign.getFact(sign.getStarName()) +"\n"+sign.getActivism(sign.getStarName());
	    		  
	    		  reportLabel.setText(String.format(reportString));
	    		  paragraphLabel.setText(String.format(paragraphString));
	    		  
	    	  }
	    	  
	      }
	      
	 }
}
