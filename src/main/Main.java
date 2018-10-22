package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main extends Application {
    public static Stage main;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(MessageFormat.format("{0}:{1} has exception:{2}",
                        new SimpleDateFormat(("yyyy-MM-dd HH:mm:ss")).format(new Date()),t.getName(),e.toString()));
            }
        });


        main = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
        primaryStage.setTitle("subEditor");
        primaryStage.setScene(new Scene(root, 1024, 768));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
