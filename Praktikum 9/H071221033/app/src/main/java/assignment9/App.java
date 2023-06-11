package assignment9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.Button; 
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class App extends Application {
    public Stage stage;

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException{
        stage = primaryStage;
        stage.setScene(getScene1());
        stage.show();
    }

    private Scene getScene1() throws FileNotFoundException{
        Image image1 = new Image(new FileInputStream("C:\\Users\\Nurfadilah Az Zahra\\Pictures\\My project.png"));   
        ImageView logoApp = new ImageView(image1);
        logoApp.setFitHeight(200);
        logoApp.setFitWidth(200);

        Text namaApp = new Text("KALKULATOR");
        namaApp.setFont(Font.font("Arial", FontWeight.BOLD, 30));

        Button mulai = new Button("     MULAI     ");
        mulai.setStyle("-fx-background-color: #f8b238; -fx-background-radius: 10px; -fx-text-fill: white;");
        mulai.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        mulai.setCursor(Cursor.HAND);

        mulai.setOnAction(v -> {
            stage.setScene(getScene2()); 
            stage.show();
        });

        BackgroundFill bgFill = new BackgroundFill(Color.CORNSILK, null, null);
        Background background = new Background(bgFill);
        VBox vbox1 = new VBox(logoApp, namaApp, mulai);
        vbox1.setSpacing(20);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setBackground(background);

        Scene scene = new Scene(new StackPane(vbox1), 350, 620);
        return scene;
    }

    private Scene getScene2(){
        Text pilih = new Text("PILIH MENU");
        pilih.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        pilih.setFill(Color.rgb(6,57,112));

        Button kalku1 = new Button("        Kalkulator 1        ");
        kalku1.setStyle("-fx-background-color: #144c6c; -fx-background-radius: 10px; -fx-text-fill: white");
        kalku1.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        kalku1.setCursor(Cursor.HAND);

        Button kalku2 = new Button("        Kalkulator 2        ");
        kalku2.setStyle("-fx-background-color: #144c6c; -fx-background-radius: 10px; -fx-text-fill: white");
        kalku2.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        kalku2.setCursor(Cursor.HAND);

        kalku1.setOnAction(v -> {
            stage.setScene(getScene3("Konversi Kilometer ke Meter", true)); 
            stage.show();
        });
        kalku2.setOnAction(v -> {
            stage.setScene(getScene4("Konversi Meter ke Centimeter", true));
            stage.show();
        });

        VBox vb = new VBox(kalku1, kalku2);
        vb.setSpacing(15);
        vb.setAlignment(Pos.CENTER);

        VBox vbox2 = new VBox(pilih, vb);
        vbox2.setSpacing(30);
        vbox2.setAlignment(Pos.CENTER);

        BackgroundFill bgFill = new BackgroundFill(Color.CORNSILK, null, null);
        Background background = new Background(bgFill);
        vbox2.setBackground(background);

        Scene scene = new Scene(new StackPane(vbox2), 350, 620);
        return scene;
    }

    private Scene getScene3(String kalkulator, boolean KmM){
        Text kalku1 = new Text("Konversi Kilometer ke Meter");
        kalku1.setTextOrigin(VPos.TOP);
        kalku1.setFont(Font.font("Arial", FontWeight.BOLD, 22));
        kalku1.setFill(Color.rgb(6,57,112));

        Label input = new Label("Input angka dalam bentuk kilometer");
        input.setAlignment(Pos.CENTER_LEFT);
        input.setFont(Font.font("Arial", FontWeight.MEDIUM, 14));
        TextField fieldInput = new TextField();

        Label hasil = new Label("Hasil");
        hasil.setAlignment(Pos.CENTER_LEFT);
        hasil.setFont(Font.font("Arial", FontWeight.MEDIUM, 14));
        TextField fieldHasil = new TextField();
        fieldHasil.setEditable(false);

        Button calculate = new Button("Calculate");
        calculate.setStyle("-fx-background-color: #f8b238; -fx-background-radius: 10px; -fx-text-fill: white");
        calculate.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        calculate.setCursor(Cursor.HAND);

        Button clear = new Button("Clear");
        clear.setStyle("-fx-background-color: #f8b238; -fx-background-radius: 10px; -fx-text-fill: white");
        clear.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        clear.setCursor(Cursor.HAND);

        Button back = new Button("Back to Home");
        back.setStyle("-fx-background-color: #f8b238; -fx-background-radius: 10px; -fx-text-fill: white");
        back.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        back.setCursor(Cursor.HAND);

        calculate.setOnAction(v -> {
            try{
                double a = 0;
                if (!fieldInput.getText().isEmpty()) {
                    a = Double.parseDouble(fieldInput.getText());
                }
                double konversi = 0;
                if(KmM){
                    konversi = a*1000;
                }
                fieldHasil.setText("Hasil: " + konversi);

            } catch (NumberFormatException e) {
                hasil.setText("Input Tidak Valid");
            }  
        });
        clear.setOnAction(v -> {
            fieldInput.clear();
            fieldHasil.clear();
        });
        back.setOnAction(v -> {
            stage.setScene(getScene2()); 
            stage.show();
        });

        VBox vb = new VBox(input, fieldInput, hasil, fieldHasil);
        vb.setSpacing(6);
        vb.setAlignment(Pos.CENTER_LEFT);

        VBox btn = new VBox(calculate, clear, back);
        btn.setSpacing(8);

        VBox vbox3 = new VBox(kalku1, vb, btn);
        vbox3.setSpacing(20);
        vbox3.setPadding(new Insets(20, 30, 20, 30));
        
        BackgroundFill bgFill = new BackgroundFill(Color.CORNSILK, null, null);
        Background background = new Background(bgFill);
        vbox3.setBackground(background);

        Scene scene = new Scene(new StackPane(vbox3), 350, 620);
        return scene;
    }

    private Scene getScene4(String kalkulator, boolean MCm){
        Text kalku2 = new Text("Konversi Meter ke Centimeter");
        kalku2.setTextOrigin(VPos.TOP);
        kalku2.setFont(Font.font("Arial", FontWeight.BOLD, 22));
        kalku2.setFill(Color.rgb(6,57,112));

        Label input = new Label("Input angka dalam bentuk meter");
        input.setAlignment(Pos.CENTER_LEFT);
        input.setFont(Font.font("Arial", FontWeight.MEDIUM, 14));
        TextField fieldInput = new TextField();

        Label hasil = new Label("Hasil");
        hasil.setAlignment(Pos.CENTER_LEFT);
        hasil.setFont(Font.font("Arial", FontWeight.MEDIUM, 14));
        TextField fieldHasil = new TextField();
        fieldHasil.setEditable(false);

        Button calculate = new Button("Calculate");
        calculate.setStyle("-fx-background-color: #f8b238; -fx-background-radius: 10px; -fx-text-fill: white");
        calculate.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        calculate.setCursor(Cursor.HAND);

        Button clear = new Button("Clear");
        clear.setStyle("-fx-background-color: #f8b238; -fx-background-radius: 10px; -fx-text-fill: white");
        clear.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        clear.setCursor(Cursor.HAND);

        Button back = new Button("Back to Home");
        back.setStyle("-fx-background-color: #f8b238; -fx-background-radius: 10px; -fx-text-fill: white");
        back.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        back.setCursor(Cursor.HAND);

        calculate.setOnAction(v -> {
            try{
                double a = 0;
                if (!fieldInput.getText().isEmpty()) {
                    a = Double.parseDouble(fieldInput.getText());
                }
                double konversi = 0;
                if(MCm){
                    konversi = a*100;
                }
                fieldHasil.setText("Hasil: " + konversi);

            } catch (NumberFormatException e){
                hasil.setText("Input Tidak Valid");
            }  
        });
        clear.setOnAction(v -> {
            fieldInput.clear();
            fieldHasil.clear();
        });
        back.setOnAction(v -> {
            stage.setScene(getScene2()); 
            stage.show();
        });

        VBox vb = new VBox(input, fieldInput, hasil, fieldHasil);
        vb.setSpacing(6);
        vb.setAlignment(Pos.CENTER_LEFT);

        VBox btn = new VBox(calculate, clear, back);
        btn.setSpacing(8);

        VBox vbox4 = new VBox(kalku2, vb, btn);
        vbox4.setSpacing(20);
        vbox4.setPadding(new Insets(20, 30, 20, 30));

        BackgroundFill bgFill = new BackgroundFill(Color.CORNSILK, null, null);
        Background background = new Background(bgFill);
        vbox4.setBackground(background);

        Scene scene = new Scene(new StackPane(vbox4), 350, 620);
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
