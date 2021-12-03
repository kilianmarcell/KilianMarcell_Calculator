package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    public Label vegeredmeny;
    @FXML
    public TextField elsoBeviteliMezo;
    @FXML
    public TextField masodikBeviteliMezo;

    public double elsoSzam() {
        return Double.parseDouble(elsoBeviteliMezo.getText());
    }

    public double masodikSzam() {
        return Double.parseDouble(masodikBeviteliMezo.getText());
    }

    @FXML
    public void osszeadas(ActionEvent actionEvent) {
        vegeredmeny.setText(String.format("%.2f", elsoSzam() + masodikSzam()));
    }

    @FXML
    public void kivonas(ActionEvent actionEvent) {
        vegeredmeny.setText(String.format("%.2f", elsoSzam() - masodikSzam()));
    }

    @FXML
    public void szorzas(ActionEvent actionEvent) {
        vegeredmeny.setText(String.format("%.2f", elsoSzam() * masodikSzam()));
    }

    @FXML
    public void osztas(ActionEvent actionEvent) {
        vegeredmeny.setText(String.format("%.2f", elsoSzam() / masodikSzam()));
    }

    @FXML
    public void maradekosOsztas(ActionEvent actionEvent) {
        vegeredmeny.setText(String.format("%.2f", elsoSzam() % masodikSzam()));
    }
}
