package application;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


public class Main extends Application
{
  @Override
  public void start(Stage primaryStage)
  {
    try
    {
      ObservableList<String> options =
          FXCollections.observableArrayList("Option 1", "Option 2", "Option 3");
      final ComboBox<String> comboBox = new ComboBox<String>(options);
      // https://docs.oracle.com/javafx/2/ui_controls/combo-box.htm

      Image image = new Image(new FileInputStream("application/me.jpg"));
      ImageView pic = new ImageView(image);

      Button button = new Button("Done");
      CheckBox box = new CheckBox("Here is a box");
      BorderPane root = new BorderPane();
      root.setTop(new Label("\t\t\t\t\t\t\tCS400 MyFirstJavaFX"));
      root.setLeft(comboBox);
      root.setCenter(pic);
      root.setBottom(button);
      root.setRight(box);
      Scene scene = new Scene(root, 500, 500);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setTitle("Travis' First JavaFx Program");
      primaryStage.setScene(scene);
      primaryStage.show();
    } catch (Exception e)
    {
      e.printStackTrace();
    }
  }

  public static void main(String[] args)
  {
    launch(args);
  }
}
