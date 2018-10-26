package utils;

import java.util.ArrayList;
import java.util.List;

public class V4PlusStyles {
    public String[] Format;
    public List<String[]> Styles = new ArrayList<>();

    public void setFormat(String s){
        if(s.substring(0,7).equals("Format:")){
            s = s.substring(8,s.length());
            Format = s.split(",");
        }else{
            System.out.println("错误的Format输入 #10001");
        }
    }
    public void addStyle(String s){
        if(s.substring(0,6).equals("Style:")){
            s = s.substring(7,s.length());
            Styles.add(s.split(","));
        }else{
            System.out.println("错误的Style输入 #10002");
        }
    }

    public void V4PlusStyles(String s){ setFormat(s);  }

    public void V4PlusStyles(){ }
}
