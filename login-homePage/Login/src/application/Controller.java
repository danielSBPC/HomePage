package application;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller {
	@FXML
    private AnchorPane root2;
    
    @FXML
    private void reportButtonHandler() {
    	try {
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
    	        root2 = (AnchorPane) fxmlLoader.load();
    	        Stage stage = new Stage();
    	        stage.initModality(Modality.APPLICATION_MODAL);
    	        stage.setTitle("Report Page");
    	        stage.setScene(new Scene(root2));
    	        stage.setResizable(false);
    	        stage.show();
    	
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
        
    }

}