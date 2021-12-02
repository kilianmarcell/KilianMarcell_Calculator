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

    public int elsoSzam() {
        return Integer.parseInt(elsoBeviteliMezo.getText());
    }

    public int masodikSzam() {
        return Integer.parseInt(masodikBeviteliMezo.getText());
    }

    @FXML
    public void osszeadas(ActionEvent actionEvent) {
        vegeredmeny.setText(elsoSzam() + masodikSzam() + "");
    }

    @FXML
    public void kivonas(ActionEvent actionEvent) {
        vegeredmeny.setText(elsoSzam() - masodikSzam() + "");
    }

    @FXML
    public void szorzas(ActionEvent actionEvent) {
        vegeredmeny.setText(elsoSzam() * masodikSzam() + "");
    }

    @FXML
    public void osztas(ActionEvent actionEvent) {
        vegeredmeny.setText(elsoSzam() / masodikSzam() + "");
    }

    @FXML
    public void maradekosOsztas(ActionEvent actionEvent) {
        vegeredmeny.setText(elsoSzam() % masodikSzam() + "");
    }
}
