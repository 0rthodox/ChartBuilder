

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Line Chart Sample");
        Scene scene = new Scene(new LineChartView(stage), 800, 600);

        stage.setScene(scene);
        stage.show();
    }
}
