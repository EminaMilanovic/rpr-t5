package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    float x;
    int e;

    @FXML
    private Label display;

    private SimpleStringProperty ekran;
        public void fja1(ActionEvent actionEvent) {
            if(display.getText().equals("0")) display.setText("1");
            else
        display.setText(display.getText()+"1");
    }

    public void fja2(ActionEvent actionEvent) {
        display.setText(display.getText()+"2");
    }
    public void fja3(ActionEvent actionEvent) {
        display.setText(display.getText()+"3");
    }

    public void fja8(ActionEvent actionEvent) {
        display.setText(display.getText()+"8");
    }

    public void fja7(ActionEvent actionEvent) {
        display.setText(display.getText()+"7");
    }
    public void fja6(ActionEvent actionEvent) {
        display.setText(display.getText()+"6");
    }
    public void fja5(ActionEvent actionEvent) {
        display.setText(display.getText()+"5");
    }
    public void fja4(ActionEvent actionEvent) {
        display.setText(display.getText()+"4");
    }
    public void fja9(ActionEvent actionEvent) {
        display.setText(display.getText()+"9");
    }

    public void fjaplus(ActionEvent actionEvent) {
         x=Float.parseFloat(display.getText());
            display.setText("");
    }

    public void fjaeq(ActionEvent actionEvent) {
        x+=Float.parseFloat(display.getText());
        display.setText(Float.toString(x));
    }

    public void fja0(ActionEvent actionEvent) {
        if(display.getText().equals("0")) e=1; else{
        display.setText(display.getText()+"0");}
        }
}
