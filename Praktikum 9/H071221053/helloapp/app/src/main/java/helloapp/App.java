package helloapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class App extends Application{

    
        public static void main(String[] args){
            Application.launch(args);
        }
    
    @Override
    public void start(Stage stage) { //untuk tampilan pertama
        VBox vbox = new VBox();
        Label tittle = new Label ("Kalkulator Diva");
        tittle.setFont(Font.font("Times new roman",25));
        vbox.setStyle("-fx-background-color: #D3D3D3;");
        vbox.getChildren().add(tittle);  //untuk tampilkan dia di awal 
        vbox.setSpacing(12.0);

        ImageView logoCal = new ImageView("/image/gadip.png"); //untuk gambar 
        logoCal.setFitWidth(254);
        logoCal.setFitHeight(262);
        logoCal.setPreserveRatio(true);
        logoCal.setId("logo");
        VBox.setMargin(logoCal,new Insets(90,185, 10, 185));

        Button startButton = new Button("Mulai");
        vbox.getChildren().addAll(logoCal,startButton);
        vbox.setAlignment(Pos.CENTER); //untuk tengah
        startButton.setOnAction(action -> {  //set on action untuk ke slide selanjutnya yaitu tampilan scane 1 
            // Seluruh kode diantara {} disini akan dijalankan / dieksekusi ketika button sedang di click.
                tampilkanScen1(stage);  
        });
        
        Scene scene = new Scene(vbox,320, 512);  //scane harus ada di setiap perubahan untuk memunculkan 
        stage.setScene(scene);
        stage.setTitle("");
        stage.show();
    }


    public void tampilkanScen1(Stage stage){
        VBox vbox = new VBox();
        Label judul = new Label ("Pilih Kalkulator");
        judul.setFont(Font.font("Arial",20));
        vbox.getChildren().add(judul);
        vbox.setSpacing(12.0);

        Button kalkulator1 = new Button("Kalkulator BMI");
        vbox.getChildren().add(kalkulator1);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color:#FFFAF0;");
        vbox.setSpacing(12.0);
        kalkulator1.setOnAction(action -> {
            // Seluruh kode diantara {} disini akan dijalankan / dieksekusi ketika button sedang di click.
                kalkulatorBMI(stage);
        });

        Button kalkulator2 = new Button("Kalkulator kalori");
        vbox.getChildren().add(kalkulator2);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);
        kalkulator2.setOnAction(action -> {
            // Seluruh kode diantara {} disini akan dijalankan / dieksekusi ketika button sedang di click.
                gender(stage);
        });

        
        vbox.setStyle("-fx-background-color: #E0FFFF;");
        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }

    public void kalkulatorBMI(Stage stage){
        Label judul1 = new Label("KALKULATOR BMI");
        judul1.setFont(Font.font("Arial",20));

        TextField tfBerat = new TextField(); //untuk memberikan isi text
        tfBerat.setPromptText("Berat badan"); //untuk huruf bayangan 
        TextField tfTinggi = new TextField();
        tfTinggi.setPromptText("Tinggi badan");
        Button buttonCalculate = new Button("Calculate");

        Label labelHasil = new Label();
        Button buttonBack = new Button("Kembali");
        buttonBack.setOnAction(v->{
            tampilkanScen1(stage);
        });
        buttonCalculate.setOnAction(v->{
            double tinggi= Double.parseDouble(tfTinggi.getText());
            tinggi = tinggi / 100;
            double berat = Double.parseDouble(tfBerat.getText());
            double hasil =  berat / (tinggi*tinggi);
            
        String result;
        if (hasil < 18.5) {
            result = "Berat badan kurang proporsional";
        } else if (hasil < 25) {
            result = "Berat badan normal ";
        } else if (hasil < 30) {
            result = " Berat badan berlebih (berpotensi obesitas)";
        } else {
            result = "Obesitas";
        }
            labelHasil.setText("BMI: " + String.format("%.1f", hasil) + " - " + result);
        });



        VBox vbox = new VBox(judul1, tfBerat,tfTinggi,buttonCalculate, labelHasil,buttonBack);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);

        vbox.setStyle("-fx-background-color: #D8BFD8;");
        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }

    public void gender(Stage stage){

        Button perempuan = new Button("Perempuan");
        perempuan.setOnAction(v->{
            kalkulatorKaloriPerempuan(stage);
        });

        Button laki = new Button("Laki-Laki");
        laki.setOnAction(v->{
            kalkulatorKaloriLaki(stage);
        });

        Button back = new Button("Kembali");
        back.setOnAction(v->{
            tampilkanScen1(stage);
        });

        VBox vbox = new VBox(perempuan, laki,back);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);

        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }

    public void kalkulatorKaloriPerempuan(Stage stage){

        Label judul2 = new Label("KALKULATOR KALORI");
        judul2.setFont(Font.font("Arial",20));

        TextField tfBeratK = new TextField();
        tfBeratK.setPromptText("Berat badan dalam kg");
        TextField tfTinggiK = new TextField();
        tfTinggiK.setPromptText("Tinggi dalam cm");
        TextField tfUmurK = new TextField();
        tfUmurK.setPromptText("Umur dalam tahun");

        Button calculate1 = new Button("calculate");
        Label labelHasil1Label = new Label();
        
        
        calculate1.setOnAction(v->{
            double result = 447.6 + 9.25 * Double.parseDouble(tfBeratK.getText()) + 
            3.1 * Double.parseDouble(tfTinggiK.getText()) - 44.3 * Double.parseDouble(tfUmurK.getText()) * 1.375;
            labelHasil1Label.setText(String.valueOf(result));
        });
        Button buttonBack1 = new Button("Kembali");
        buttonBack1.setOnAction(v->{
            gender(stage);
        });
        


        VBox vbox = new VBox(judul2, tfBeratK, tfTinggiK, tfUmurK,calculate1, labelHasil1Label, buttonBack1);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);

        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }

    public void kalkulatorKaloriLaki(Stage stage){

        Label judul2 = new Label("KALKULATOR KALORI");
        judul2.setFont(Font.font("Arial",20));

        TextField tfBeratK = new TextField();
        tfBeratK.setPromptText("Berat badan dalam kg");
        TextField tfTinggiK = new TextField();
        tfTinggiK.setPromptText("Tinggi dalam cm");
        TextField tfUmurK = new TextField();
        tfUmurK.setPromptText("Umur dalam tahun");


        Button calculate1 = new Button("calculate");
        Label labelHasil1Label = new Label();
        calculate1.setOnAction(action -> {
            double result = 88.4 + 13.4 * Double.parseDouble(tfBeratK.getText()) +
                4.8 * Double.parseDouble(tfTinggiK.getText()) - 5.68 * Double.parseDouble(tfUmurK.getText()) * 1.55;
            
            labelHasil1Label.setText(String.valueOf(result));
        });

        Button buttonBack1 = new Button("Kembali");
        buttonBack1.setOnAction(v->{
            gender(stage);
        });



        VBox vbox = new VBox(judul2, tfBeratK, tfTinggiK, tfUmurK,calculate1, labelHasil1Label, buttonBack1);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);

        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }
}