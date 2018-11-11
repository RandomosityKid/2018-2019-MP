package MP;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class OOP106_ConvertNumbers extends Application{
	
	

	@Override
	public void start(Stage primaryStage) {
		
		//Create TextFields
		TextField tf_decimal = new TextField();
		TextField tf_hex = new TextField();
		TextField tf_binary = new TextField();
		
		//TF_Properties
		tf_decimal.setAlignment(Pos.BOTTOM_RIGHT);
		tf_hex.setAlignment(Pos.BOTTOM_RIGHT);
		tf_binary.setAlignment(Pos.BOTTOM_RIGHT);

		//Pane for everything
		GridPane pane_Main = new GridPane();
		pane_Main.setAlignment(Pos.CENTER);
		pane_Main.setHgap(10);
		pane_Main.setVgap(2);
		
		//Add nodes to pane
		pane_Main.add(new Label("Decimal"), 0, 0);
		pane_Main.add(new Label("Hex"), 0, 1);
		pane_Main.add(new Label("Binary"), 0, 2);
			pane_Main.add(tf_decimal, 1, 0);
			pane_Main.add(tf_hex, 1, 1);
			pane_Main.add(tf_binary, 1, 2);

			
		//Functionss
		tf_decimal.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				tf_hex.setText(Integer.toHexString(Integer.parseInt(tf_decimal.getText())));
				tf_binary.setText(Integer.toBinaryString(Integer.parseInt(tf_decimal.getText())));
			}
		});

		tf_hex.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				tf_decimal.setText(String.valueOf(Integer.parseInt(tf_hex.getText(), 16)));
				tf_binary.setText(Integer.toBinaryString(Integer.parseInt(tf_hex.getText(), 16)));
			}
		});

		tf_binary.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				tf_decimal.setText(String.valueOf(Integer.parseInt(tf_binary.getText(), 2)));
				tf_hex.setText(Integer.toHexString(Integer.parseInt(tf_binary.getText(), 2)));
			}
		});

		//Set the stage
		Scene stage = new Scene(pane_Main, 320, 150);
		primaryStage.setTitle("Convert Numbers");
		primaryStage.setScene(stage);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
        Application.launch(args);
    }
}
