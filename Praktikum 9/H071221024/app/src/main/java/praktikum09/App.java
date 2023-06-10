package praktikum09;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage mainStage) throws Exception
    {
        stage = mainStage;

        stage.setTitle("OOP 09");
        stage.setScene(getScene1());
        stage.setResizable(true);
        stage.show();

    }

    private Scene getScene1() {
        Text title = new Text("KALKULATOR SEDERHANA");

        Button submit = new Button("MULAI");

        VBox text = new VBox(title, submit);
        text.setSpacing(16);
        text.setAlignment(Pos.CENTER);
        text.setPrefWidth(320);
            
        submit.setOnAction(v -> {
            stage.setScene(getScene2());
        });
      
        Image ibanner = new Image(getClass().getClassLoader().getResourceAsStream("image/calculator.jpg"));
        ImageView ivBanner = new ImageView(ibanner);

        VBox content = new VBox(ivBanner,text);
        content.setAlignment(Pos.CENTER);
        ivBanner.setFitWidth(250);
        ivBanner.setFitHeight(150);
        content.getStyleClass().add("rootNode");

        Scene scene = new Scene(new StackPane(content), 500, 400);

        scene.getStylesheets().add(getClass().getResource("/styles/styles1.css").toExternalForm());
        return scene;
    }

    private Scene getScene2() {
        Text title = new Text("PILIH MENU");
      
        Button button1 = new Button("Konversi jam ke detik");
        Button button2 = new Button("Konversi suhu celcius ke fahrenheit");


        VBox content = new VBox(title, button1, button2);
        content.setSpacing(16);
        content.setAlignment(Pos.CENTER);
        content.setPrefWidth(320);
        content.getStyleClass().add("rootNode");

            
        // BUTTON
        button1.setOnAction(v -> {
           stage.setScene(getScene3());
        });
        button2.setOnAction(v -> {
            stage.setScene(getScene4());
        });

        Scene scene = new Scene(new StackPane(content), 500, 400);

        scene.getStylesheets().add(getClass().getResource("/styles/styles1.css").toExternalForm());
        return scene;
    }

    private Scene getScene3() {
        Text title = new Text("Konversi Jam ke Detik");
        Label lInput = new Label("Input dalam satuan jam");
        TextField tfInput = new TextField();
        Label lOutput = new Label("Output dalam satuan detik");
        TextField tfOutput = new TextField();
        tfOutput.setEditable(false);

        lInput.getStyleClass().add("input");
        lOutput.getStyleClass().add("input");

        Button button1 = new Button("Clear");
        Button button2 = new Button("Calculate");
        Button button3 = new Button("Back to Home");

        VBox input = new VBox(lInput, tfInput, lOutput, tfOutput);
        input.setSpacing(16);
        input.setAlignment(Pos.CENTER);

        HBox operateButton = new HBox(button1, button2);
        operateButton.setAlignment(Pos.CENTER);
        operateButton.setSpacing(16);

        VBox content = new VBox(title, input, operateButton, button3);
        content.setSpacing(16);
        content.setAlignment(Pos.TOP_CENTER);
        content.setPrefWidth(320);
        content.getStyleClass().add("rootNode");
            
        button1.setOnAction(v -> {
            tfInput.clear();
            tfOutput.clear();
        });
        button2.setOnAction(v -> {
            Double hour = Double.parseDouble(tfInput.getText());
            Time time = new Time();
            double second = time.convertToSecond(hour);
            tfOutput.setText(String.valueOf(second));
        });
        button3.setOnAction(v -> {
           stage.setScene(getScene1());
        });

        Scene scene = new Scene(new StackPane(content), 500, 400);

        scene.getStylesheets().add(getClass().getResource("/styles/styles1.css").toExternalForm());
        return scene;
    }

    private Scene getScene4() {
        Text title = new Text("Konversi suhu celcius ke fahrenheit");
        Label lInput = new Label("Input dalam satuan celcius");
        TextField tfInput = new TextField();
        Label lOutput = new Label("Output dalam satuan fahrenheit");
        TextField tfOutput = new TextField();
        tfOutput.setEditable(false);

        lInput.getStyleClass().add("input");
        lOutput.getStyleClass().add("input");
      
        Button button1 = new Button("Clear");
        Button button2 = new Button("Calculate");
        Button button3 = new Button("Back to Home");

        VBox input = new VBox(lInput, tfInput, lOutput, tfOutput);
        input.setSpacing(16);
        input.setAlignment(Pos.CENTER);

        HBox operateButton = new HBox(button1, button2);
        operateButton.setAlignment(Pos.CENTER);
        operateButton.setSpacing(16);

        VBox content = new VBox(title, input, operateButton,button3);
        content.setSpacing(16);
        content.setAlignment(Pos.TOP_CENTER);
        content.setPrefWidth(320);
        content.getStyleClass().add("rootNode");
            
        button1.setOnAction(v -> {
            tfInput.clear();
            tfOutput.clear();
        });
        button2.setOnAction(v -> {
            Double celcius = Double.parseDouble(tfInput.getText());
            Temperature temp = new Temperature();
            double fahrenheit = temp.convertToFahrenheit(celcius);
            tfOutput.setText(String.valueOf(fahrenheit));
        });
        button3.setOnAction(v -> {
           stage.setScene(getScene1());
        });

        Scene scene = new Scene(new StackPane(content), 500, 400);

        scene.getStylesheets().add(getClass().getResource("/styles/styles1.css").toExternalForm());
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class Temperature {
    private double celcius;
    private double fahrenheit;
    public double getCelcius() {
        return celcius;
    }
    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }
    public double getFahrenheit() {
        return fahrenheit;
    }
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    double convertToFahrenheit(double celcius){
        fahrenheit = (9*celcius/5) + 32;
        return fahrenheit;
    }

}

class Time {
    private double second;
    private double hour;
    public double getSecond() {
        return second;
    }
    public void setSecond(double second) {
        this.second = second;
    }
    public double gethour() {
        return hour;
    }
    public void sethour(double hour) {
        this.hour = hour;
    }
    double convertToSecond(double hour){
        second = hour * 3600;
        return second;
    }
    

}