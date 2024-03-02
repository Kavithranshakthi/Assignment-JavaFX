import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {
    public AnchorPane context;
    public AnchorPane contextDashboard;

    public void OnActionOne(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(
                getClass().getResource("WindowOne.fxml")
        ));
    }

    public void OnActionTwo(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(
                getClass().getResource("WindowTwo.fxml")
        ));
    }

    public void OnActionBack(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(
                getClass().getResource("LoginForm.fxml")
        );

        Stage stage = (Stage) contextDashboard.getScene().getWindow();
        stage.setScene(new Scene(parent));
    }
}
