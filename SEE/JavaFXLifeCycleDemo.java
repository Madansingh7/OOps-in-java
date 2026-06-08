/* 
main()
  |
launch(args)
  |
init()
  |
start(Stage)
  |
Application Running
  |
stop()
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXLifeCycleDemo extends Application {

    // 1. Initialization Method
    @Override
    public void init() throws Exception {
        System.out.println("init() method called");
        System.out.println("Application initialization...");
    }

    // 2. Start Method
    @Override
    public void start(Stage primaryStage) {

        System.out.println("start() method called");

        Label label = new Label("Welcome to JavaFX Lifecycle Demo");

        StackPane root = new StackPane();
        root.getChildren().add(label);

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("JavaFX Lifecycle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 3. Stop Method
    @Override
    public void stop() throws Exception {
        System.out.println("stop() method called");
        System.out.println("Application is terminating...");
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println("main() method called");
        launch(args);
    }
}

/* 
| Method             | Purpose                             | When Called              |
| ------------------ | ----------------------------------- | ------------------------ |
| main()             | Launches JavaFX application         | First                    |
| init()             | Initializes resources and variables | Before UI creation       |
| start(Stage stage) | Creates and displays GUI            | After init()             |
| stop()             | Releases resources and cleanup      | Before application exits |
The JavaFX application lifecycle consists of main() → init() → start() → stop(). These
methods help organize initialization, GUI creation, execution, and cleanup activities of
a JavaFX application.
*/
