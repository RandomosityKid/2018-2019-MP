package MP;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OOP106_RadioButtons extends Application{

	@Override
	public void start(Stage primaryStage) {
		
		Text text = new Text(10, 140, "Programming is fun");
		text.setFont(Font.font ("Verdana", 30));
		
		//Pane for text
		Pane pane_text = new Pane();
		pane_text.setStyle("-fx-border-color: black");
		pane_text.getChildren().add(text);
		
		//Create Buttons
		Button button_left = new Button("<--");
		Button button_right = new Button("-->");
		
		//Pane for buttons
		HBox pane_buttons = new HBox(20);
		pane_buttons.setAlignment(Pos.CENTER);
		pane_buttons.getChildren().addAll(button_left, button_right);
		
		
		//Create RadioButtons
		RadioButton rb_black = new RadioButton("Black");
			rb_black.setSelected(true);
		RadioButton rb_red = new RadioButton("Red");
		RadioButton rb_green = new RadioButton("Green");
		RadioButton rb_blue = new RadioButton("Blue");

			ToggleGroup group = new ToggleGroup();
			rb_black.setToggleGroup(group);
			rb_red.setToggleGroup(group);
			rb_green.setToggleGroup(group);
			rb_blue.setToggleGroup(group);
			
		//Pane for radiobuttons
		HBox pane_rb = new HBox(20);
		pane_rb.getChildren().addAll(rb_black, rb_red, rb_green, rb_blue);
			
		
		//Create border for all panes
		BorderPane pane_Main = new BorderPane();
		pane_Main.setTop(pane_rb);
		pane_Main.setCenter(pane_text);
		pane_Main.setBottom(pane_buttons);

		//Functionss
		button_left.setOnAction(e -> {
			if (text.getX() == 10) {
				text.setX(310);
			} else {
				text.setX(text.getX() - 150);
			}
		});
		button_right.setOnAction(e -> {
			if (text.getX() == 310) {
				text.setX(10);
			} else {
				text.setX(text.getX() + 150);
			}
		});

		//Functionss Color
		rb_black.setOnAction(e -> {
			if (rb_black.isSelected()) {
				text.setFill(Color.BLACK);
			}
		});
		
		rb_red.setOnAction(e -> {
			if (rb_red.isSelected()) {
				text.setFill(Color.RED);
			}
		});

		rb_green.setOnAction(e -> {
			if (rb_green.isSelected()) {
				text.setFill(Color.GREEN);
			}
		});

		rb_blue.setOnAction(e -> {
			if (rb_blue.isSelected()) {
				text.setFill(Color.BLUE);
			}
		});

		// Set the stage
		Scene stage = new Scene(pane_Main, 610, 300);
		primaryStage.setTitle("Radio Buttons");
		primaryStage.setScene(stage);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	public static void main(String[] args) {
        Application.launch(args);
    }
}
