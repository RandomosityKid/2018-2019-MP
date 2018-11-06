package MP;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class OOP106_GeometricFigures extends Application{
	//Create Objects
	Circle circ = new Circle(50);	
	Rectangle rect = new Rectangle();
	Ellipse ell = new Ellipse(); 
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Set properties of objects
		circ.setStroke(Color.BLACK);
		circ.setFill(Color.WHITE);
		rect.setStroke(Color.BLACK);
		rect.setFill(Color.WHITE);
			rect.setWidth(150);
			rect.setHeight(100);
		ell.setStroke(Color.BLACK);
		ell.setFill(Color.WHITE);
			ell.setRadiusX(100);
			ell.setRadiusY(50);
		// Create hbox for buttons
		HBox pane_buttons = new HBox(5);
		pane_buttons.setAlignment(Pos.CENTER);
		RadioButton rb_circ = new RadioButton("Circle"); 
		RadioButton rb_rect = new RadioButton("Rectangle"); 
		RadioButton rb_ell = new RadioButton("Ellipse"); 
		// Create checkbox
		CheckBox cb_fill = new CheckBox("Fill");
			// Create toggle group
			ToggleGroup tg = new ToggleGroup();
			rb_circ.setToggleGroup(tg);
			rb_rect.setToggleGroup(tg);
			rb_ell.setToggleGroup(tg);
		// Place nodes in hbox
		pane_buttons.getChildren().addAll(rb_circ, 
			rb_rect, rb_ell, cb_fill);
		// Create stackpane for shapes
		StackPane pane_shapeArea = new StackPane();
		pane_shapeArea.setStyle("-fx-border-color: black");
		// Create border for all panes
		BorderPane pane_Main = new BorderPane();
		pane_Main.setBottom(pane_buttons);
		pane_Main.setCenter(pane_shapeArea);
		// Functionss
		rb_circ.setOnAction(e -> {
			if (rb_circ.isSelected()) {
				pane_shapeArea.getChildren().clear();
				pane_shapeArea.getChildren().add(circ);
			}
		});
		rb_rect.setOnAction(e -> {
			if (rb_rect.isSelected()) {
				pane_shapeArea.getChildren().clear();
				pane_shapeArea.getChildren().add(rect);
			}
		});
		rb_ell.setOnAction(e -> {
			if (rb_ell.isSelected()) {
				pane_shapeArea.getChildren().clear();
				pane_shapeArea.getChildren().add(ell);
			}
		});
		cb_fill.setOnAction(e -> {
			if (cb_fill.isSelected()) {
				fill(Color.BLACK);
			} else {
				fill(Color.WHITE);
			}
		});
		// Set the stage
		Scene stage = new Scene(pane_Main, 400, 150);
		primaryStage.setTitle("Geometric Figures"); 
		primaryStage.setScene(stage); 
		primaryStage.show();
	}
	private void fill(Paint paintme) {
		circ.setFill(paintme);
		rect.setFill(paintme);
		ell.setFill(paintme);
	}
}
