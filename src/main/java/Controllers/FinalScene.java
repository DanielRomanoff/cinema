package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import BusinessLogic.Cinema;
import Models.GlobalUser;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinalScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Cinema> table;

    @FXML
    private TableColumn<Cinema, String> Type;

    @FXML
    private TableColumn<Cinema, String> Title;

    @FXML
    private TableColumn<Cinema, String> Duration;

    @FXML
    private TableColumn<Cinema, String> Time;

    @FXML
    private TableColumn<Cinema, Integer> Price;

    @FXML
    void initialize() {
        ObservableList<Cinema> cinema = FXCollections.observableArrayList(GlobalUser.user.getCinema());
        Type.setCellValueFactory(new PropertyValueFactory<Cinema, String>("type"));
        Title.setCellValueFactory(new PropertyValueFactory<Cinema, String>("title"));
        Duration.setCellValueFactory(new PropertyValueFactory<Cinema, String>("duration"));
        Time.setCellValueFactory(new PropertyValueFactory<Cinema, String>("time"));
        Price.setCellValueFactory(new PropertyValueFactory<Cinema, Integer>("price"));
        GlobalUser.userService.saveUser(GlobalUser.user);
        table.setItems(cinema);
    }
}
