package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public Label vegeredmeny;
    @FXML
    public TextField elsoBeviteliMezo;
    @FXML
    public TextField masodikBeviteliMezo;

    @FXML
    public void osszeadas(ActionEvent actionEvent) {
        int elsoSzam = Integer.parseInt(elsoBeviteliMezo.getText());
        int masodikSzam = Integer.parseInt(masodikBeviteliMezo.getText());
        vegeredmeny.setText(elsoSzam + masodikSzam + "");
    }

    @FXML
    public void kivonas(ActionEvent actionEvent) {
    }

    @FXML
    public void szorzas(ActionEvent actionEvent) {
    }

    @FXML
    public void osztas(ActionEvent actionEvent) {
    }

    @FXML
    public void maradekosOsztas(ActionEvent actionEvent) {
    }
}
