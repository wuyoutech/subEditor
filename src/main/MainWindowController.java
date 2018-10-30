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
    @FXML private TableView<SubtitleLine> mainTableView;

    @FXML private TableColumn<SubtitleLine,String> tableColumnID;
    @FXML private TableColumn<SubtitleLine,String> tableColumnStartTime;
    @FXML private TableColumn<SubtitleLine,String> tableColumnEndTime;
    @FXML private TableColumn<SubtitleLine,String> tableColumnStyle;
    @FXML private TableColumn<SubtitleLine,String> tableColumnText;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //newMenuItem.setOnAction(t ->GlobalInfo);
        exitMenuItem.setOnAction(t -> System.exit(0));
        openMenuItem.setOnAction(t->GlobalInfo.open());

        /*------------------------Property Window--------------------------*/
        ObservableList<String> fonts = FXCollections.observableArrayList();
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontName = e.getAvailableFontFamilyNames();
        fonts.addAll(Arrays.asList(fontName));
        fontComboBox.setItems(fonts);

        /*------------------------main table------------------------------------*/
        tableColumnID.setCellValueFactory(cellData->cellData.getValue().getId());
        tableColumnStartTime.setCellValueFactory(cellData->cellData.getValue().getStartTime());
        tableColumnEndTime.setCellValueFactory(cellData->cellData.getValue().getEndTime());
        tableColumnStyle.setCellValueFactory(cellData->cellData.getValue().getStyle());
        tableColumnText.setCellValueFactory(cellData->cellData.getValue().getText());

        mainTableView.setItems(GlobalInfo.SubtitleLines);
    }
}
