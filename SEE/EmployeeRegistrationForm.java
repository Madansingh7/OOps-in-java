import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class EmployeeRegistrationForm extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label title = new Label("Employee Registration Form");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 24));

        // Name
        Label nameLabel = new Label("Enter Your Name:");
        TextField nameField = new TextField();
        nameField.setPrefWidth(300);

        // Gender
        Label genderLabel = new Label("Select Your Gender:");
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");

        ToggleGroup genderGroup = new ToggleGroup();
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);

        HBox genderBox = new HBox(15, male, female);

        // Date of Birth
        Label dobLabel = new Label("Enter Date of Birth:");
        DatePicker datePicker = new DatePicker();

        // State
        Label stateLabel = new Label("Select Your State:");
        ComboBox<String> stateCombo = new ComboBox<>();

        stateCombo.getItems().addAll(
                "Karnataka",
                "Tamil Nadu",
                "Kerala",
                "Andhra Pradesh",
                "Telangana",
                "Maharashtra"
        );

        stateCombo.setValue("Karnataka");

        // Qualification
        Label qualificationLabel = new Label("Select Your Qualification:");

        CheckBox ug = new CheckBox("UG");
        CheckBox pg = new CheckBox("PG");
        CheckBox phd = new CheckBox("PhD");

        HBox qualificationBox = new HBox(20, ug, pg, phd);

        // Register Button
        Button registerBtn = new Button("Register");

        registerBtn.setOnAction(e -> {

            String name = nameField.getText();

            String gender = "";

            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            }

            String state = stateCombo.getValue();

            StringBuilder qualification = new StringBuilder();

            if (ug.isSelected())
                qualification.append("UG ");

            if (pg.isSelected())
                qualification.append("PG ");

            if (phd.isSelected())
                qualification.append("PhD");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Registration Details");
            alert.setHeaderText("Employee Registered Successfully");

            alert.setContentText(
                    "Name: " + name +
                    "\nGender: " + gender +
                    "\nDOB: " + datePicker.getValue() +
                    "\nState: " + state +
                    "\nQualification: " + qualification
            );

            alert.showAndWait();
        });

        // Grid Layout
        GridPane grid = new GridPane();

        grid.setHgap(15);
        grid.setVgap(20);
        grid.setAlignment(Pos.CENTER);

        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);

        grid.add(genderLabel, 0, 1);
        grid.add(genderBox, 1, 1);

        grid.add(dobLabel, 0, 2);
        grid.add(datePicker, 1, 2);

        grid.add(stateLabel, 0, 3);
        grid.add(stateCombo, 1, 3);

        grid.add(qualificationLabel, 0, 4);
        grid.add(qualificationBox, 1, 4);

        // Root Layout
        VBox root = new VBox(30);

        root.setPadding(new Insets(25));
        root.setAlignment(Pos.TOP_CENTER);

        HBox buttonBox = new HBox(registerBtn);
        buttonBox.setAlignment(Pos.CENTER);

        root.getChildren().addAll(title, grid, buttonBox);

        // Scene
        Scene scene = new Scene(root, 800, 500);

        primaryStage.setTitle("JavaFX Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
