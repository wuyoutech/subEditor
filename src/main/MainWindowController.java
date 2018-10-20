package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;


public class MainWindowController implements Initializable {
    @FXML public BorderPane mainBorderPane;

    @FXML public MenuItem exitMenuItem;
    @FXML private MenuItem newMenuItem;
    @FXML private MenuItem openMenuItem;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        newMenuItem.setOnAction(t -> Global.New());
        exitMenuItem.setOnAction(t -> System.exit(0));
        openMenuItem.setOnAction(t->Global.Open());
    }
}
