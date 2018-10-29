package org.sla;

import javafx.application.Application;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MyFirstJavaGUI extends Application {

    private ComboBox comboBox;
    private ImageView imageDisplayed;
    private Image eagleslogo;
    private Image phillieslogo;
    private Image flyerslogo;
    private Image wingslogo;
    private Image unionlogo;

    private void MyComboBox() {

        String value = (String) comboBox.getValue();

        //System.out.println("MyComboBox action happened.");

        if (value == "Flyers") {
            imageDisplayed.setImage(flyerslogo);
        }

        if (value == "Eagles") {
            imageDisplayed.setImage(eagleslogo);
        }

        if (value == "Phillies") {
            imageDisplayed.setImage(phillieslogo);
        }

        if (value == "Wings") {
            imageDisplayed.setImage(wingslogo);
        }

        if (value == "Union") {
            imageDisplayed.setImage(unionlogo);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        comboBox = new ComboBox();

        comboBox.setOnAction(e->MyComboBox());

        comboBox.getItems().add("Eagles");
        comboBox.getItems().add("Phillies");
        comboBox.getItems().add("Flyers");
        comboBox.getItems().add("Wings");
        comboBox.getItems().add("Union");

        primaryStage.setTitle("Philly Sports Logos");

        eagleslogo = new Image("eagleslogo.png");
        phillieslogo = new Image("phillieslogo.jpg");
        flyerslogo = new Image("flyerslogo.png");
        wingslogo = new Image("wingslogo.jpg");
        unionlogo = new Image("unionlogo.png");

        imageDisplayed = new ImageView(eagleslogo);

        HBox hBox = new HBox();
        hBox.getChildren().add(comboBox);
        hBox.getChildren().add(imageDisplayed);

        Scene scene = new Scene(hBox, 900, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


        static void main(String[] args) { Application.launch(args); }
}
