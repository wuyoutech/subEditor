package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.MenuItem;
import utils.*;

import java.awt.*;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;


public class MainWindowController implements Initializable {
    @FXML private MenuItem exitMenuItem;
    @FXML private MenuItem newMenuItem;
    @FXML private MenuItem openMenuItem;
    @FXML private ComboBox<String> fontComboBox;
    @FXML private TableView mainTableView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //newMenuItem.setOnAction(t ->GlobalInfo);
        exitMenuItem.setOnAction(t -> System.exit(0));
        openMenuItem.setOnAction(t->GlobalInfo.open());

        ObservableList<String> fonts = FXCollections.observableArrayList();
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontName = e.getAvailableFontFamilyNames();
        fonts.addAll(Arrays.asList(fontName));
        fontComboBox.setItems(fonts);

        TableColumn lineNo = new TableColumn("#");
        TableColumn startTime = new TableColumn("开始时间");
        TableColumn endTime = new TableColumn("结束时间");
        TableColumn speed =new TableColumn("字/秒");
        TableColumn style = new TableColumn("样式");
        TableColumn text = new TableColumn("文本");
        mainTableView.getColumns().addAll(lineNo,startTime,endTime,speed,style,text);


    }
}
