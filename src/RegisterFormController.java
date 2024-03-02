import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterFormController {
    public AnchorPane contextRegister;

    public void OnActionRegister(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(
                getClass().getResource("LoginForm.fxml")
        );

        Stage stage = (Stage) contextRegister.getScene().getWindow();
        stage.setScene(new Scene(parent));
    }

    public void OnActionLogin(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(
                getClass().getResource("LoginForm.fxml")
        );

        Stage stage = (Stage) contextRegister.getScene().getWindow();
        stage.setScene(new Scene(parent));
    }
}
