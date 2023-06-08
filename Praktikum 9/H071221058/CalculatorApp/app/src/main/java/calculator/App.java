package calculator;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {
    private Stage stage;
    private TextField sisi;
    private TextField tinggi;
    private TextField jarijari;
    private Label hasilVolume;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        stage.getIcons().add(new Image("/logoo.png"));
        scene1();
        stage.show();
    }

    private void scene1() {
        Image backgroundImage = new Image("/BG.jpg");
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        
        Image logoImage = new Image("/logoo.png");
        ImageView imageView = new ImageView(logoImage);
        imageView.setFitWidth(260);
        imageView.setPreserveRatio(true);
        HBox hBox2 = new HBox(imageView);
        hBox2.setAlignment(Pos.CENTER);
    
        Label label = new Label("Kalkulator Geometri");
        label.setStyle("-fx-font-family: 'Sans-Serif'; -fx-font-size: 30px; -fx-font-weight: bold;");
        label.setTextFill(Color.WHITE);
        HBox hBox1 = new HBox(label);
        hBox1.setAlignment(Pos.CENTER);
    
        Button button = new Button("MENU");
        button.setStyle("-fx-background-color: #008000;-fx-font-family: 'Sans-Serif'; -fx-font-weight: bold; -fx-padding: 10px 110px;-fx-font-size: 16px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-border-radius: 3;");
        button.setTextFill(Color.WHITE);
        button.setOnAction(v -> {
            scene2();
        });
        HBox hBox3 = new HBox(button);
        hBox3.setAlignment(Pos.CENTER);
    
        VBox vBox = new VBox(20, hBox1, hBox2, hBox3);
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(new Background(background));
    
        Scene scene1 = new Scene(vBox, 620, 400);
        stage.setTitle("Kalkulator Geometri");
        stage.setScene(scene1);
    }
    

    private void scene2() {
        Image backgroundImage = new Image("/BG.jpg");
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);

        Label labelMenu = new Label("PILIH MENU");
        labelMenu.setStyle("-fx-font-family: 'Sans-Serif'; -fx-font-size: 35px; -fx-font-weight: bold;");
        labelMenu.setTextFill(Color.WHITE);
        HBox hBox1 = new HBox(labelMenu);
        hBox1.setAlignment(Pos.CENTER);

        Button btnKubus = new Button("KUBUS");
        btnKubus.setStyle("-fx-background-color: #008000;-fx-font-family: 'Sans-Serif'; -fx-font-weight: bold; -fx-padding: 10px 80px;-fx-font-size: 20px; -fx-border-color: #000000; -fx-border-width: 1px; -fx-border-radius: 3;");
        btnKubus.setTextFill(Color.WHITE);
        btnKubus.setMaxWidth(300);
        btnKubus.setMinHeight(50);
        btnKubus.setOnAction(v -> {
            sceneKubus();
        });

        Button btnTabung = new Button("TABUNG");
        btnTabung.setStyle("-fx-background-color: #008000;-fx-font-family: 'Sanas-Serif'; -fx-font-weight: bold; -fx-padding: 10px 80px;-fx-font-size: 20px; -fx-border-color: #000000; -fx-border-width: 1px; -fx-border-radius: 3;");
        btnTabung.setTextFill(Color.WHITE);
        btnTabung.setMaxWidth(300);
        btnKubus.setMinHeight(50);

        btnTabung.setOnAction(v -> {
            sceneTabung();
        });
        VBox vBox1 = new VBox(btnKubus,btnTabung);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.setSpacing(10);
        vBox1.setMaxWidth(250);

        VBox vBox = new VBox(10, hBox1, vBox1);
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(new Background(background));

        Scene scene2 = new Scene(vBox, 620, 400);
        stage.setTitle("Kalkulator Geometri");
        stage.setScene(scene2);
    }

    private void sceneKubus() {
        Image backgroundImage = new Image("/BG.jpg");
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);

        Label label = new Label("VOLUME KUBUS");
        label.setStyle("-fx-font-family: 'Sans-Serif'; -fx-font-size: 35px; -fx-font-weight: bold;");
        label.setTextFill(Color.WHITE);
        HBox hBox1 = new HBox(label);
        hBox1.setAlignment(Pos.CENTER);

        Label sisiLabel = new Label("Panjang Sisi");
        sisiLabel.setStyle("-fx-font-family: 'Sans-Serif'; -fx-font-size: 20px; -fx-font-weight : bold");
        sisiLabel.setTextFill(Color.WHITE);
        sisi = new TextField();
        sisi.setStyle("-fx-font-family : 'Sans-Serif'; -fx-font-size: 14px; -fx-border-color : #000000");
        sisi.setAlignment(Pos.CENTER);
        sisi.setMaxWidth(200);
        sisi.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                hitungVolumeKubus();
            }
        });
        

        VBox vBox1 = new VBox(sisiLabel, sisi);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.setSpacing(10);

        Button button = new Button("HITUNG");
        button.setStyle("-fx-background-color: #008000;-fx-font-family: 'Sans-Serif'; -fx-font-weight: bold; -fx-padding: 10px 80px;-fx-font-size: 16px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-border-radius: 3;");
        button.setTextFill(Color.WHITE);
        button.setMaxWidth(300);
        button.setOnAction(event -> {
            hitungVolumeKubus();
        });
        

        hasilVolume = new Label();
        hasilVolume.setStyle("-fx-font-family: 'Sans-Serif'; -fx-font-size: 16px;");
        hasilVolume.setTextFill(Color.WHITE);
        HBox hBox4 = new HBox(hasilVolume);
        hBox4.setAlignment(Pos.CENTER);

        Button backButton = new Button("BACK");
        backButton.setStyle("-fx-background-color: RED; -fx-font-family: 'Sans-Serif'; -fx-font-weight: bold; -fx-padding: 10px 100px;-fx-font-size: 16px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-border-radius: 3;");
        backButton.setTextFill(Color.WHITE);
        backButton.setMaxWidth(300);
        backButton.setOnAction(v -> {
            scene2();
        });

        VBox vBox2 = new VBox(button,backButton);
        vBox2.setAlignment(Pos.CENTER);
        vBox2.setSpacing(10);
        vBox2.setMaxWidth(250);

        VBox vBox = new VBox(20, hBox1, vBox1, vBox2, hBox4);
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(new Background(background));

        Scene sceneKubus = new Scene(vBox, 620, 400);
        stage.setTitle("Kalkulator Geometri");
        stage.setScene(sceneKubus);
    }

    private void sceneTabung() {
        Image backgroundImage = new Image("/BG.jpg");
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);

        Label label = new Label("VOLUME TABUNG");
        label.setStyle("-fx-font-family: 'Sans-Serif'; -fx-font-size: 35px; -fx-font-weight: bold;");
        label.setTextFill(Color.WHITE);
        HBox hBox1 = new HBox(label);
        hBox1.setAlignment(Pos.CENTER);

        Label tinggiLabel = new Label("Tinggi");
        tinggiLabel.setStyle("-fx-font-family: 'Sans-Serif'; -fx-font-size: 20px; -fx-font-weight: bold ");
        tinggiLabel.setTextFill(Color.WHITE);
        tinggi = new TextField();
        tinggi.setStyle("-fx-font-family : 'Sans-Serif'; -fx-font-size: 14px; -fx-border-color : #000000");
        tinggi.setAlignment(Pos.CENTER);
        tinggi.setMaxWidth(200);
        tinggi.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                hitungVolumeTabung();
            }
        });
        

        Label jarijariLabel = new Label("Jari - Jari");
        jarijariLabel.setStyle("-fx-font-family: 'Sans-Serif'; -fx-font-size: 20px; -fx-font-weight: bold");
        jarijariLabel.setTextFill(Color.WHITE);
        jarijari = new TextField();
        jarijari.setStyle("-fx-font-family : 'Sans-Serif'; -fx-font-size: 14px; -fx-border-color : #000000");
        jarijari.setAlignment(Pos.CENTER);
        jarijari.setMaxWidth(200);
        jarijari.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                hitungVolumeTabung();
            }
        });

        VBox vBox1 = new VBox(tinggiLabel, tinggi, jarijariLabel, jarijari);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.setSpacing(10);

        Button button = new Button("HITUNG");
        button.setStyle("-fx-background-color: #008000;-fx-font-family: 'Sans-Serif';  -fx-font-weight: bold; -fx-padding: 10px 80px;-fx-font-size: 16px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-border-radius: 3;");
        button.setTextFill(Color.WHITE);
        button.setMaxWidth(300);
        button.setOnAction(event -> {
            hitungVolumeTabung();
        });

        hasilVolume = new Label();
        hasilVolume.setStyle("-fx-font-family: 'Sans-Serif'; -fx-font-size: 16px;");
        hasilVolume.setTextFill(Color.WHITE);
        HBox hBox2 = new HBox(hasilVolume);
        hBox2.setAlignment(Pos.CENTER);

        Button backButton = new Button("BACK");
        backButton.setStyle("-fx-background-color: RED;-fx-font-family: 'Sans-Serif';  -fx-font-weight: bold; -fx-padding: 10px 100px;-fx-font-size: 16px; -fx-border-color: BLACK; -fx-border-width: 1px; -fx-border-radius: 3;");
        backButton.setTextFill(Color.WHITE);
        backButton.setMaxWidth(300);
        backButton.setOnAction(v -> {
            scene2();
        });

        VBox vBox2 = new VBox(button, backButton);
        vBox2.setAlignment(Pos.CENTER);
        vBox2.setMaxWidth(250);
        vBox2.setSpacing(10);

        VBox vBox = new VBox(20, hBox1, vBox1, vBox2, hBox2);
        vBox.setAlignment(Pos.CENTER);
        vBox.setBackground(new Background(background));

        Scene sceneTabung = new Scene(vBox, 620, 400);
        stage.setTitle("Kalkulator Geometri");
        stage.setScene(sceneTabung);
    }

    private void hitungVolumeKubus() {
        try {
            double s = Double.parseDouble(sisi.getText());
            double volume = s * s * s;
            String formattedVolume = String.format("%.2f", volume);
            hasilVolume.setText("Volume : " + formattedVolume);
    
            // Mengatur durasi 3 detik
            PauseTransition delay = new PauseTransition(Duration.seconds(3));
            delay.setOnFinished(event -> {
                hasilVolume.setText("");
            });
            delay.play();
        } catch (NumberFormatException e) {
            hasilVolume.setText("Masukkan angka yang valid");

            PauseTransition delay = new PauseTransition(Duration.seconds(3));
            delay.setOnFinished(event -> {
                hasilVolume.setText("");
            });
            delay.play();
        }
    }
    
    private void hitungVolumeTabung() {
        try {
            double h = Double.parseDouble(tinggi.getText());
            double r = Double.parseDouble(jarijari.getText());
            double volume = Math.PI * r * r * h;
            String formattedVolume = String.format("%.2f", volume);
            hasilVolume.setText("Volume : " + formattedVolume);
    
            // Mengatur durasi 3 detik
            PauseTransition delay = new PauseTransition(Duration.seconds(3));
            delay.setOnFinished(event -> {
                hasilVolume.setText("");
            });
            delay.play();
        } catch (NumberFormatException e) {
            hasilVolume.setText("Masukkan angka yang valid");

            PauseTransition delay = new PauseTransition(Duration.seconds(3));
            delay.setOnFinished(event -> {
                hasilVolume.setText("");
            });
            delay.play();
        }
    
    }
}
