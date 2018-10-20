package main;

import javafx.stage.FileChooser;

import java.io.File;

class Global {
    private static boolean isChanged = false;
    static void New(){
        if(isChanged){
             //TODO：提示是否保存
        }else{
            //TODO:初始化Global
        }
    }
    static void Open(){
        //TODO:先询问保存
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open");
        /* 设置扩展名 */
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("ass字幕文件","*.ass"));
        File file = fileChooser.showOpenDialog(Main.main);
        if(file != null) {
            //读取ASS文件

            System.out.println(file.getAbsolutePath());
        }else return;
    }
}
