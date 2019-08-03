package estructurajavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author JorgeLPR
 */
public class EstructuraJavaFX extends Application{

    @Override
    public void start(Stage primaryStage){
        
        Label label = new Label("HOLA MUNDO");
        StackPane root = new StackPane();
        root.getChildren().add(label);
                
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("JAVAFX 1");
        
        primaryStage.show();
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
