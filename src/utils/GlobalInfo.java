package utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.FileChooser;
import main.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GlobalInfo {
    private static boolean isChanged  = false;  //文件被修改标志

    public static ScriptInfo scriptInfo = new ScriptInfo();

    public static V4PlusStyles styles = new V4PlusStyles();

    public static ObservableList<SubtitleLine> SubtitleLines = FXCollections.observableArrayList();


    public static void open(){
        //TODO:提示是否保存文件
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open");
        //设置扩展名
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("ass字幕文件","*.ass")
        );
        File file = fileChooser.showOpenDialog(Main.main);
        if(file != null){
            //TODO:读取ASS文件
            try {
                FileReader reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader);
                String str;
                //TODO：读取文件头
                Boolean isHead = false;
                while((str = br.readLine())!=null){
                    if(isHead){
                        if(str.length()>0 && str.substring(0,1).equals("[")){
                            isHead = false;
                            break;
                        }else{
                            if(str.length()>10 && str.substring(0,7).equals("Format:"))
                                styles.setFormat(str);
                            else if(str.length()>10 && str.substring(0,6).equals("Style:"))
                                styles.addStyle(str);
                            else if(str.length() > 0)
                                System.out.println("有不能识别的样式行 #20001");
                        }
                    }else{
                        if(str.equals("[V4+ Styles]")){
                            isHead = true;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(file.getAbsolutePath());
        }
    }
}
