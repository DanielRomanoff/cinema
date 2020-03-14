import Models.GlobalUser;
import Models.User;
import Services.UserService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/scenes/LoginScene.fxml"));
        primaryStage.setTitle("Cinema");
        primaryStage.setScene(new Scene(root, 698 , 402));
        primaryStage.setResizable(false);
        primaryStage.show();
        GlobalUser.user = new User("Username");
        GlobalUser.userService = new UserService();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
