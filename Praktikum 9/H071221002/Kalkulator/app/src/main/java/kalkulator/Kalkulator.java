package kalkulator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Kalkulator extends Application {

  public static void main(String[] args) {
    System.out.println("Launching...");
    launch(args);
  }

  @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Aplikasi Ganti Nama");
        TextField input1= new TextField();
        TextField input2= new TextField();
      
        Button tambahkan= new Button("Tambah");

        Label jawaban=  new Label("Jawaban Penambahan: 0");

        tambahkan.setOnAction(a->{
          int angka1= Integer.parseInt(input1.getText());
          int angka2= Integer.parseInt(input2.getText());

          int penambahan= angka1+angka2;

          jawaban.setText("Jawaban Penambahan: "+penambahan);

        });

        
         

        VBox group1 = new VBox();
        group1.getChildren().addAll(input1, input2, tambahkan, jawaban);

        Scene scene = new Scene(group1, 400, 600);
        // scene.getStylesheets().add(getClass().getResource("/styles/styleApp.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}