package com.example.praktikum_9;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;

public class ShopCalc extends Application {

    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;

        stage.setScene(getScene1());
        stage.setTitle("SHOPPING CALCULATOR");
        stage.setResizable(false);
        stage.show();

    }

    private Scene getScene1(){

        Text appName = new Text("SHOPPING CALCULATOR");
        appName.setId("appName");

        ImageView appIcon = new ImageView("com/example/praktikum_9/images/logo.png");
        appIcon.setFitWidth(180);
        appIcon.setFitHeight(180);

        VBox root_home = new VBox(appIcon, appName);
        root_home.setAlignment(Pos.CENTER);
        root_home.setSpacing(20);
        root_home.setId("root_home");

        Scene scene = new Scene(root_home, 360, 640);
        scene.getStylesheets().add(getClass().getResource("/com/example/praktikum_9/styles/styles.css").toExternalForm());

        PauseTransition delay = new PauseTransition(Duration.seconds(5));
        delay.setOnFinished(event -> {
            stage.setScene(getScene2());
        });
        delay.play();

        return scene;

    }

    private Scene getScene2(){

        Text calc_opt_title = new Text("Choose Calculator");
        calc_opt_title.setId("calc_opt_title");

        VBox calc_opt_title_box = new VBox(calc_opt_title);
        calc_opt_title_box.setAlignment(Pos.CENTER);
        calc_opt_title_box.setId("calc_opt_title_box");

        Button calc_opt_1 = new Button(String.format("Shopping List Calcolator"));
        calc_opt_1.setId("calc_opt_1");
        calc_opt_1.setTextAlignment(TextAlignment.CENTER);
        calc_opt_1.setWrapText(true);

        calc_opt_1.setOnAction(event -> {
            stage.setScene(getScene3());
        });

        Button calc_opt_2 = new Button(String.format("gatau"));
        calc_opt_2.setId("calc_opt_2");

        calc_opt_2.setOnAction(event -> {
            stage.setScene(getScene4());
        });

        VBox calc_opt_button_box = new VBox(calc_opt_1, calc_opt_2);
        calc_opt_button_box.setAlignment(Pos.CENTER);
        calc_opt_button_box.setId("calc_opt_button_box");
        calc_opt_button_box.setSpacing(40);

        VBox root_choice = new VBox(calc_opt_title_box, calc_opt_button_box);
        root_choice.setId("root_choice");

        Scene scene = new Scene(root_choice, 360, 640);
        scene.getStylesheets().add(getClass().getResource("/com/example/praktikum_9/styles/styles.css").toExternalForm());

        return scene;

    }

    private Scene getScene3(){

        Text calc_title = new Text("SHOPPING LIST CALCULATOR");
        calc_title.setId("calc_title");

        StackPane calc_title_box = new StackPane(calc_title);
        calc_title_box.setId("calc_title_box");

        Text cat_fil = new Text("Filter:   ");
        cat_fil.setId("cat_fil");

        ArrayList<Product> products = new ArrayList<>();

        Product.cat_choice.add("All");

        ComboBox<String> cat_list = new ComboBox<>(FXCollections.observableArrayList(Product.cat_choice));
        cat_list.setId("cat_list");

        HBox fil = new HBox(cat_fil, cat_list);
        fil.setId("fil");
        fil.setAlignment(Pos.CENTER_LEFT);

//        ObservableList<String> products_list = FXCollections.observableArrayList(products);

        ScrollPane prod_list = new ScrollPane();
        prod_list.setId("prod_list");
        prod_list.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        prod_list.setPrefSize(280, 100);

        VBox name = new VBox();
        name.setPrefWidth(100);
        name.setId("name");

        VBox price = new VBox();
        price.setPrefWidth(100);
        price.setId("price");

        HBox merge = new HBox(name, price);

        prod_list.setContent(merge);

        VBox list = new VBox(fil, prod_list);
        list.setId("list");

        Text add_name_lable = new Text("Product Name:");
        TextField add_name_tf = new TextField();

        Text add_price_lable = new Text("Product price (Rp):");
        TextField add_price_tf = new TextField();

        Text add_cat_lable = new Text("Product Category:   ");

        ComboBox<String> add_cat_box = new ComboBox<>(FXCollections.observableArrayList(Product.cat_choice));
        add_cat_box.setId("add_cat_box");

        HBox add_cat = new HBox(add_cat_lable, add_cat_box);

        VBox add_prod_input = new VBox(add_name_lable, add_name_tf, add_price_lable, add_price_tf, add_cat);
        add_prod_input.setId("add_prod_input");

        Button save = new Button("Save");
        Button clear = new Button("Clear");

        HBox but = new HBox(save, clear);

        Text total_label = new Text("TOTAL HARGA:");
        Label total_price = new Label();

        VBox total = new VBox(total_label, total_price);

        save.setOnAction(event -> {
            try {
                String nametf = add_name_tf.getText();
                String pricetf = add_price_tf.getText();
                String cattf = add_cat_box.getValue();

                if (cattf!=null) {
                    Product prod = new Product(nametf, Integer.parseInt(pricetf), cattf);
                    products.add(prod);

                    Label l = new Label(nametf);
                    l.setId("li");
                    name.getChildren().add(l);

                    Label m = new Label(String.valueOf(pricetf));
                    m.setId("lj");
                    price.getChildren().add(m);

                    add_name_tf.clear();
                    add_price_tf.clear();
                    add_cat_box.valueProperty().set(null);

                    total_price.setText(String.valueOf(Utils.total(products)));
                } else {
                    System.out.println("kosong");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        clear.setOnAction(event -> {
            name.getChildren().clear();
            price.getChildren().clear();
        });


        VBox root_shop = new VBox(calc_title_box, list, add_prod_input, but, total);

        Scene scene = new Scene(root_shop, 360, 640);

        scene.getStylesheets().add(getClass().getResource("/com/example/praktikum_9/styles/styles.css").toExternalForm());

        return scene;

    }

    private Scene getScene4(){

        Text speed_title = new Text("SPEED CALCULATOR");
        speed_title.setId("speed_title");

        StackPane speed_title_box = new StackPane(speed_title);
        speed_title_box.setId("speed_title_box");

        Text dis_lable = new Text("Distance:");
        TextField dis_tf = new TextField();

        VBox disv = new VBox(dis_lable, dis_tf);

        Text time_lable = new Text("Time:");
        TextField time_tf = new TextField();

        VBox timev = new VBox(time_lable, time_tf);

        Button cal = new Button("Calculate");

        Button clear = new Button("Clear");

        HBox buth = new HBox(cal, clear);
        buth.setAlignment(Pos.CENTER);
        buth.setSpacing(20);

        Text speedt = new Text("SPEED:");
        Label speedl = new Label();

        cal.setOnAction(event -> {
            double d = Double.parseDouble(dis_tf.getText());
            double t = Double.parseDouble(time_tf.getText());
            double s = d/t;
            speedl.setText(String.valueOf(s+ " KM/H"));
        });

        VBox speed = new VBox(speedt, speedl);
        speed.setAlignment(Pos.CENTER);

        VBox root_shop = new VBox(speed_title_box, disv, timev, buth, speed);
        root_shop.setSpacing(30);

        Scene scene = new Scene(root_shop, 360, 640);

        scene.getStylesheets().add(getClass().getResource("/com/example/praktikum_9/styles/styles.css").toExternalForm());

        return scene;

    }

    public static void main(String[] args) {
        launch();
    }

}

class Product{

    private String name;
    private int price;
    private String cat;

    static ArrayList<String> cat_choice = new ArrayList<>();

    public Product(String name, int price, String cat) {
        this.name = name;
        this.price = price;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}

class Utils{

    static int total(ArrayList<Product> p){
        int sum=0;
        for (Product product : p) {
            sum += product.getPrice();
        }
        return sum;
    }

//    static ArrayList<String> getAllElm(ArrayList<Product> p) {
//        ArrayList<String> newarr = new ArrayList<>();
//        for (Product a:p) {
//            newarr.add(a.getName());
//        }
//        return newarr;
//    }

}