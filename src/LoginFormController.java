import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane contextLogin;

    public void OnActionLogin(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(
                getClass().getResource("Dashboard.fxml")
        );

        Stage stage = (Stage) contextLogin.getScene().getWindow();
        stage.setScene(new Scene(parent));
    }

    public void OnActionRegister(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(
                getClass().getResource("RegisterForm.fxml")
        );

        Stage stage = (Stage) contextLogin.getScene().getWindow();
        stage.setScene(new Scene(parent));
    }
}
