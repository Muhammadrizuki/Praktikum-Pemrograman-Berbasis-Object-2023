package id.pekan9.kalkulatorsederhana;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage mainStage) {
        //handling stage
        stage = mainStage;
        
        //stage
        stage.setTitle("Kalkulator Sederhana");
        stage.setScene(getScene1());
        stage.show();
    }

    private Scene getScene1() {

        // judul
        Text text = new Text("Kalkulator Sederhana");
        text.getStyleClass().add("title");
    
        
        // logo
        ImageView ivBanner1 = new ImageView("/Images/math1.png");
        ivBanner1.setFitWidth(300);
        ivBanner1.setFitHeight(300);
        ivBanner1.setPreserveRatio(true);
        
        // button
        Region space = new Region();
        space.setPrefHeight(12);
        Button bMulai = new Button("MULAI");
        bMulai.getStyleClass().add("tMulai");

        VBox vLayout = new VBox(ivBanner1, text, space, bMulai);
        vLayout.setSpacing(10);
        vLayout.setPadding(new Insets(50));
        vLayout.setAlignment(Pos.CENTER);
        vLayout.setId("background");

        Scene scene = new Scene(vLayout, 450, 500);
        scene.getStylesheets().add(getClass().getResource("/Styles/home.css").toExternalForm());

        // action untuk button
        bMulai.setOnAction(v->{
            stage.setScene(getScene2());
        });
        return scene;
    }
    
    private Scene getScene2() {
        Text text = new Text("PILIH MENU");
        text.getStyleClass().add("title");

        //space
        Region space1 = new Region();
        space1.setPrefHeight(12);

        Region space2 = new Region();
        space2.setPrefHeight(20);

        //button
        Button bKal1 = new Button("Kalkulator 1");
        bKal1.getStyleClass().add("tKal");
        Button bKal2 = new Button("Kalkulator 2");
        bKal2.getStyleClass().add("tKal");

        //button kembali
        Button bBack = new Button("Back");
        bBack.getStyleClass().add("tBack");

        VBox sectionRight1 = new VBox(text);
        sectionRight1.setSpacing(500);
        sectionRight1.setAlignment(Pos.CENTER);
        sectionRight1.setPrefWidth(30);

        VBox sectionRight2 = new VBox(bKal1);
        sectionRight2.setSpacing(200);
        sectionRight2.setAlignment(Pos.CENTER);
        sectionRight2.setPrefWidth(70);

        VBox sectionRight3 = new VBox(bKal2);
        sectionRight3.setSpacing(200);
        sectionRight3.setAlignment(Pos.CENTER);
        sectionRight3.setPrefWidth(70);

        VBox sectionRight4 = new VBox(bBack);
        sectionRight4.setAlignment(Pos.CENTER);

        //Action untuk Button
        bKal1.setOnAction(v -> {
            stage.setScene(getScene3());
        });

        bKal2.setOnAction(v -> {
            stage.setScene(getScene4());
        });

        bBack.setOnAction(v -> {
            stage.setScene(getScene1());
        });

        //rootNode
        VBox rootNode = new VBox(sectionRight1, sectionRight2, space1, sectionRight3, space2, sectionRight4);
        rootNode.setAlignment(Pos.CENTER);
        rootNode.setId("background");

        Scene scene = new Scene(rootNode, 400, 500);

        //atur css
        scene.getStylesheets().add(getClass().getResource("/Styles/main.css").toExternalForm());
        return scene;

    }

    private Scene getScene3() {
        Text text = new Text("Konversi Celcius ke Farhenheit");
        text.getStyleClass().add("title2");

        Region space = new Region();
        space.setPrefHeight(12);

        Region space1 = new Region();
        space1.setPrefHeight(12);

        Label lCelcius = new Label("Celcius");
        lCelcius.getStyleClass().add("tCelcius");
        TextField tInput1 = new TextField();
        tInput1.getStyleClass().add("Inputan");
        Label lResult = new Label("");
        lResult.getStyleClass().add("tCelcius");
        
        Text text1 = new Text("Hasil");
        text1.getStyleClass().add("title2");

        // button
        Button clear = new Button("Clear");
        clear.getStyleClass().add("tButton");
        Button convert = new Button("Convert");
        convert.getStyleClass().add("tButton");
        Button back = new Button("Kembali ke menu");
        back.getStyleClass().add("tMenu");

        clear.setOnAction(v -> {
            tInput1.clear();
            lResult.setText("");
        });

        convert.setOnAction(v -> {
            try {
                // konversi celcius ke farhenheit
                String celsiusText = tInput1.getText();
                double celsius = Double.parseDouble(celsiusText);
                double fahrenheit = celsius * 9 / 5 + 32;
                lResult.setText(String.valueOf(fahrenheit));
                lResult.setText(fahrenheit + " F");
            } catch (NumberFormatException e) {
                lResult.setText("Input tidak valid!");
            }
        });

        back.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // VBOX
        VBox sectionRight = new VBox(text);
        sectionRight.setAlignment(Pos.TOP_CENTER);

        VBox sectionRight1 = new VBox(text1);
        sectionRight1.setAlignment(Pos.CENTER_LEFT);

        VBox sectionRight2 = new VBox(tInput1);
        sectionRight2.setAlignment(Pos.CENTER);

        VBox sectionRight3 = new VBox(lResult);
        sectionRight3.setAlignment(Pos.CENTER_LEFT);

        HBox button = new HBox(clear, convert);
        button.setSpacing(10);
        button.setAlignment(Pos.CENTER);

        //rootNode 
        VBox rootNode = new VBox(sectionRight, space, lCelcius, sectionRight2, space1, sectionRight1, sectionRight3, button, back);
        rootNode.setSpacing(10);
        rootNode.setPadding(new Insets(50));
        rootNode.setAlignment(Pos.TOP_CENTER);
        rootNode.setId("background");

        Scene scene = new Scene(rootNode, 400, 500);

        //atur css
        scene.getStylesheets().add(getClass().getResource("/Styles/main.css").toExternalForm());
        return scene;

    }

    private Scene getScene4() {
        Text text = new Text("Kalkulator Trigonometri");
        text.getStyleClass().add("title2");

        Region space = new Region();
        space.setPrefHeight(12);

        Region space1 = new Region();
        space1.setPrefHeight(12);

        Label lCelcius = new Label("Derajat");
        lCelcius.getStyleClass().add("tCelcius");
        TextField tInput1 = new TextField();
        tInput1.getStyleClass().add("Inputan");
        Label lsin = new Label("");
        lsin.getStyleClass().add("tCelcius");
        Label lcos = new Label("");
        lcos.getStyleClass().add("tCelcius");
        Label ltan = new Label("");
        ltan.getStyleClass().add("tCelcius");
        
        Text text1 = new Text("Hasil");
        text1.getStyleClass().add("title2");

        // button
        Button clear = new Button("Clear");
        clear.getStyleClass().add("tButton");
        Button calculate = new Button("Calculate");
        calculate.getStyleClass().add("tButton");
        Button back = new Button("Kembali ke menu");
        back.getStyleClass().add("tMenu");

        VBox sectionRight3 = new VBox(lsin, lcos, ltan);
        sectionRight3.setAlignment(Pos.CENTER_LEFT);

        clear.setOnAction(v -> {
            tInput1.clear();
            lsin.setText("");
            lcos.setText("");
            ltan.setText("");
        });


        calculate.setOnAction(v -> {
            try {
                String angleText = tInput1.getText();
                double angle = Double.parseDouble(angleText);
    
                // Menghitung sin, cos, dan tan menggunakan Math class
                double sinValue = Math.sin(Math.toRadians(angle));
                double cosValue = Math.cos(Math.toRadians(angle));
                double tanValue = Math.tan(Math.toRadians(angle));
    
                lsin.setText(String.valueOf(sinValue));
                lcos.setText(String.valueOf(cosValue));
                ltan.setText(String.valueOf(tanValue));

                lsin.setText("sin " + angle + " derajat = " + sinValue);
                lcos.setText("cos " + angle + " derajat = " + cosValue);
                ltan.setText("tan " + angle + " derajat = " + tanValue);

            } catch (NumberFormatException e) {
                lsin.setText("Input tidak valid!");
                lcos.setText("Input tidak valid!");
                ltan.setText("Input tidak valid!");
            }
        });

        back.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // VBOX
        VBox sectionRight = new VBox(text);
        sectionRight.setAlignment(Pos.TOP_CENTER);

        VBox sectionRight1 = new VBox(text1);
        sectionRight1.setAlignment(Pos.CENTER_LEFT);

        VBox sectionRight2 = new VBox(tInput1);
        sectionRight2.setAlignment(Pos.CENTER);

        // VBox sectionRight3 = new VBox(lsin, lcos, ltan);
        // sectionRight3.setAlignment(Pos.CENTER_LEFT);

        HBox button = new HBox(clear, calculate);
        button.setSpacing(10);
        button.setAlignment(Pos.CENTER);

        //rootNode 
        VBox rootNode = new VBox(sectionRight, space, lCelcius, sectionRight2, space1, sectionRight1, sectionRight3, button, back);
        rootNode.setSpacing(10);
        rootNode.setPadding(new Insets(50));
        rootNode.setAlignment(Pos.TOP_CENTER);
        rootNode.setId("background");

        Scene scene = new Scene(rootNode, 400, 500);

        //atur css
        scene.getStylesheets().add(getClass().getResource("/Styles/main.css").toExternalForm());
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}




