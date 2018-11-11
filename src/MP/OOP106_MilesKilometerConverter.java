package MP;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class OOP106_MilesKilometerConverter extends Application{
	
	@Override
    public void start(Stage primaryStage) throws Exception {

		//Create Label
		Label lbl_miles = new Label("Miles:");
        Label lbl_kilo = new Label("Kilometers:");

		//Create TextField
        TextField tf_miles = new TextField();
        TextField tf_kilometers = new TextField();
		
		//Add properties to TextFields
		tf_miles.setText("0");
		tf_miles.setAlignment(Pos.CENTER_LEFT);
		tf_kilometers.setText("0");
		tf_kilometers.setAlignment(Pos.CENTER_LEFT);
		
		//Create Pane for nodes?
		GridPane paneTest = new GridPane();
		paneTest.setHgap(10);
		paneTest.setVgap(10);
		paneTest.setPadding(new Insets(10, 10, 10, 10));
		
		//Add nodes to pane
		paneTest.add(lbl_miles, 0, 0);
		paneTest.add(tf_miles, 1, 0);
		paneTest.add(lbl_kilo, 0, 1);
		paneTest.add(tf_kilometers, 1, 1);
		
		//Functionss
		tf_kilometers.setOnAction(e->{
			tf_miles.setText(Double.toString(new Double(tf_kilometers.getText()) * 0.621371));
		});

		tf_miles.setOnAction(e->{
			tf_kilometers.setText(Double.toString(new Double(tf_miles.getText()) / 0.621371));
		});
		
		//Set the stage
        primaryStage.setTitle("Convert Numbers");
        primaryStage.setScene(new Scene(paneTest));
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
