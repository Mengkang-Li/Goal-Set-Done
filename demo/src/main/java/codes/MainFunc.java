package codes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

/**********
 * 此项目用于自己记录目标完成情况以及时间
 * 主要包含以下几个功能
 * 1. 记录今日有没有学习
 * 2. 查询今日学习内容
 * 3. 添加和删除目标，目标的属性有添加时间、规模、进度等等
 * 4. 记录现在的学习进度，以百分比的形式记录
 * 5. 计划学习内容
 */
public class MainFunc extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        File file = new File("demo/src/main/resources/MainPage.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(file.toURL());

        stage.setScene(new Scene(fxmlLoader.load()));
        stage.setTitle("Main Page");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
