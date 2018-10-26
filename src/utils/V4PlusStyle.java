package utils;

public class V4PlusStyle {
    public String[] format;
    public String[] style;

    public void setFormat(String s){
        if (s.substring(0, 7).equals("Format:")) {
            s = s.substring(8);
            format = s.split(",");
        } else {
            System.out.println("错误的Format输入");
        }
    }

    public void setStyle(String s){
        if (s.substring(0, 6).equals("Style:")) {
            s.substring(7);
            style = s.split(",");
        } else {
            System.out.println("错误的Style输入");
        }
    }
}
