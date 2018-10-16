package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;


public class MainWindowController implements Initializable {
    @FXML private MenuItem exitMenuItem;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        exitMenuItem.setOnAction(t->System.exit(0));
    }
}
