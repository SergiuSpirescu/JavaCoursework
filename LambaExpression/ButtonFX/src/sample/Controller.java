package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button clickMe;

    public void initialize() {

        clickMe.setOnAction(event -> System.out.println("You clicked the button."));
    }

}
