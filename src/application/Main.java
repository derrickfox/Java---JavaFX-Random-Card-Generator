/*
 * Derrick Fox
 * CS 214 - Advanced Java
 * Project 6 - Random Card Generator 
 * March 30, 2015
 * Java 1.8 JavaFX 2.2
 */

package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class Main extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	int rando1 =  (int)(Math.random() * 53);
	int rando2 =  (int)(Math.random() * 53);
	int rando3 =  (int)(Math.random() * 53);

    Image card1 = new Image("card/"+rando1+".png");
    Image card2 = new Image("card/"+rando2+".png");
    Image card3 = new Image("card/"+rando3+".png");
    
    HBox cardBox = new HBox(5);
    cardBox.getStylesheets().add("mystyle.css"); // Load the stylesheet          
    cardBox.getStyleClass().add("border");
    
    ImageView cardOne = new ImageView(card1);
    ImageView cardTwo = new ImageView(card2);
    ImageView cardThree = new ImageView(card3);
    
    cardOne.getStyleClass().add("border");
    cardTwo.getStyleClass().add("border");
    cardThree.getStyleClass().add("border");

    cardBox.getChildren().addAll(cardOne, cardTwo, cardThree);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(cardBox);
    primaryStage.setTitle("Project 6"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  public static void main(String[] args) {
    launch(args);
  }
} 
