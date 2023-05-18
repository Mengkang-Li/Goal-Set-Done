package codes;

import common.CalendarEntry;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableView;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Date;

public class MainPage {
    @FXML
    private TableView<CalendarEntry> calendar;
    @FXML
    private ProgressBar MainProgressBar;

    @FXML
    private ListView<?> Plans;

    @FXML
    private ListView<?> Schedules;

    public void initialize() {
        // 先获取今日时间，然后获取相应的月份，然后表上写月份年份标题，格内写日期，对应周一周二周三等等

    }

    @FXML
    void AddGoals(ActionEvent event) {

    }

    @FXML
    void DeleteGoals(ActionEvent event) {

    }

    @FXML
    void LearningRecordToday(ActionEvent event) {

    }


    void loadMonthTable(TableView<CalendarEntry> tableView) {
        LocalDateTime localDateTime = LocalDateTime.now();
        int month = localDateTime.getMonthValue();
        int year = localDateTime.getYear();
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate endDay = yearMonth.atEndOfMonth();
        LocalDate startDay = yearMonth.atDay(1);
        LocalDate currentDay = startDay;
        CalendarEntry[] data = new CalendarEntry[6];
        while (!currentDay.isAfter(endDay)) {
            int dayOfWeek = currentDay.getDayOfWeek().getValue();
            // 根据周日插入相应的数字 然后之后加判断是否变色 1. 插入数字 2. 变色内容
            // 产生对应数组 然后加入到日历中
            if(dayOfWeek != 7) {
                data[dayOfWeek] = new CalendarEntry(currentDay, false);
                currentDay = currentDay.plusDays(1);
            } else {
                if(!data[6].equals(new CalendarEntry())){
                    tableView.setItems(FXCollections.observableArrayList(data));
                }
                data = new CalendarEntry[6];
                data[0] = new CalendarEntry(currentDay, false);
            }
        }
    }
}
