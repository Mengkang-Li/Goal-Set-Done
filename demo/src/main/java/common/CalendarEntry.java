package common;

import java.time.LocalDate;

public class CalendarEntry {
    private LocalDate time;
    private boolean isStudy;

    public CalendarEntry(LocalDate time, boolean isStudy){
        this.time = time;
        this.isStudy = isStudy;
    }
    public CalendarEntry(){
        this.time = null;
        this.isStudy = false;
    }

}
