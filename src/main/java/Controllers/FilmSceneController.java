package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import BusinessLogic.Comedy;
import BusinessLogic.Drama;
import BusinessLogic.Thriller;
import Models.GlobalUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class FilmSceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private ImageView godFather, starWars, darkKnight, shawshankRedemption, lordRings, backToFuture, fightClub, inception;

    @FXML
    void backToPrevScene(ActionEvent event) {
        backButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/scenes/LoginScene.fxml"));
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

    public static void nextScene(ImageView scene){
        scene.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(FilmSceneController.class.getResource("/scenes/ViewSelectedFilmScene.fxml"));
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
    void initialize() {
        godFather.setOnMouseClicked(event -> {
            GlobalUser.user.addCinema(new Drama("The God Father", "Francis Ford Coppola's gangster-movie-redefining adaptation of Mario Puzo's Mafia novel is the Empire Greatest Movies Poll No. 1 incumbent, and for a very good reason.",
                    90, "21:00"));
            GlobalUser.user.getCinema().setPoster(godFather.getImage());
            GlobalUser.user.getCinema().setPrice(150);
            nextScene(godFather);
        });
        starWars.setOnMouseClicked(event -> {
            GlobalUser.user.addCinema(new Thriller("Star Wars: Episode V — The Empire Strikes Back", "The original “this one’s darker” sequel, and by far the strongest of the saga. Not just because the baddies win (temporarily), or because it Force-slammed us with that twist (“No, I am your father”).",
                    120, "22:00"));
            GlobalUser.user.getCinema().setPoster(starWars.getImage());
            GlobalUser.user.getCinema().setPrice(200);
            nextScene(starWars);
        });
        darkKnight.setOnMouseClicked(event -> {
            GlobalUser.user.addCinema(new Thriller("The Dark Knight", "Mann crime epic — except instead of Pacino and De Niro in a diner, you get a bloke dressed as a bat and a psychotic clown in a police interrogation room.",
                    120, "23:00"));
            GlobalUser.user.getCinema().setPoster(darkKnight.getImage());
            GlobalUser.user.getCinema().setPrice(225);
            nextScene(darkKnight);
        });
        shawshankRedemption.setOnMouseClicked(event -> {
            GlobalUser.user.addCinema(new Drama("The Shawshank Redemption", "The warm, leathery embrace of Morgan Freeman’s narration... The reassuringly Gary Cooper-ish rumple of Tim Robbins’ face... ",
                    140, "21:00"));
            GlobalUser.user.getCinema().setPoster(shawshankRedemption.getImage());
            GlobalUser.user.getCinema().setPrice(200);
            nextScene(shawshankRedemption);

        });
        lordRings.setOnMouseClicked(event -> {
            GlobalUser.user.addCinema(new Comedy("The Lord Of The Rings: The Return Of The King", "Anyone who bangs on about all those endings is missing the many joys of Peter Jackson’s Academy Award-laden trilogy-closer. ",
                    135, "21:00"));
            GlobalUser.user.getCinema().setPoster(lordRings.getImage());
            GlobalUser.user.getCinema().setPrice(185);
            nextScene(lordRings);

        });
        fightClub.setOnMouseClicked(event -> {
            GlobalUser.user.addCinema(new Thriller("Fight Club", "After all the pre-release hype about how dark and brutal Fight Club was, one of the most surprising things to discover on seeing it was just how funny it actually was.",
                    140, "22:00"));
            GlobalUser.user.getCinema().setPoster(fightClub.getImage());
            GlobalUser.user.getCinema().setPrice(250);
            nextScene(fightClub);

        });
        backToFuture.setOnMouseClicked(event -> {
            GlobalUser.user.addCinema(new Comedy("Back To The Future ", "Part science-fiction caper, part generational culture-clash movie, part weirdo family drama (in which the hero has to rescue his own existence after his mother falls in lust with him, eww)",
                    120, "23:00"));
            GlobalUser.user.getCinema().setPoster(backToFuture.getImage());
            GlobalUser.user.getCinema().setPrice(180);
            nextScene(backToFuture);

        });
        inception.setOnMouseClicked(event -> {
            GlobalUser.user.addCinema(new Thriller("Inception", "Is Christopher Nolan going to make a Bond movie? Well, with Inception he kind of already has. Except, instead of a British secret agent, we get a freelance corporate dream-thief.",
                    150, "00:00"));
            GlobalUser.user.getCinema().setPoster(inception.getImage());
            GlobalUser.user.getCinema().setPrice(170);
            nextScene(inception);
        });
    }
}
