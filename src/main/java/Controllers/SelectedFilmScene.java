package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Models.GlobalUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SelectedFilmScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private ImageView selectedFilmPoster;

    @FXML
    private Text title;

    @FXML
    private Text description;

    @FXML
    private Text startDate;

    @FXML
    private Text duration;

    @FXML
    private Button bookButton;

    @FXML
    void backToPrevScene(ActionEvent event) {
        backButton.getScene().getWindow().hide();
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
    }


    @FXML
    void goToBookingScene(ActionEvent event) {
        bookButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/scenes/BookingHistoryScene.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        Parent root = loader.getRoot();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public ImageView getSelectedFilmPoster() {
        return selectedFilmPoster;
    }

    @FXML
    void initialize() {
        selectedFilmPoster.setImage(GlobalUser.user.getCinema().getPoster());
        title.setText(GlobalUser.user.getCinema().getTitle());
        description.setText(GlobalUser.user.getCinema().getDescription());
        startDate.setText(GlobalUser.user.getCinema().getTime());
        duration.setText(String.valueOf(GlobalUser.user.getCinema().getDuration()));
    }
}
