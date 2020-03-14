package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Models.GlobalUser;
import Models.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginSceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField usernameBox;

    @FXML
    private Button logInButton;

    @FXML
    void initialize() {
        logInButton.setOnMouseClicked(event -> {
            GlobalUser.user = new User(usernameBox.getText());
            logInButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/scenes/FilmScene.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            Parent root = loader.getRoot();
            stage.setScene(new Scene(root));
            stage.show();
        });
    }
}
