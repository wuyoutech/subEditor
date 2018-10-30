package utils;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SubtitleLine {
    private StringProperty id = new SimpleStringProperty();
    private StringProperty startTime = new SimpleStringProperty();
    private StringProperty endTime = new SimpleStringProperty();
    //TODO:字/秒
    private StringProperty style = new SimpleStringProperty();
    private StringProperty text = new SimpleStringProperty();

    public SubtitleLine(String s){
        this.id.setValue(s);
    }

    public StringProperty getId(){
        return this.id;
    }

    public StringProperty getStartTime(){
        return this.startTime;
    }
    public StringProperty getEndTime(){
        return this.endTime;
    }
    public StringProperty getStyle(){
        return this.style;
    }
    public StringProperty getText(){
        return this.text;
    }

}
