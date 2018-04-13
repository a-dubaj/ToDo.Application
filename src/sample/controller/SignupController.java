package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import sample.Database.DatabaseHandler;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by andrzejdubaj on 12.04.2018.
 */
public class SignupController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField signUpFirstName;

    @FXML
    private JFXTextField signUpLastName;

    @FXML
    private JFXTextField sihnUpUserName;

    @FXML
    private JFXCheckBox signUpCheckBoxMale;

    @FXML
    private JFXCheckBox signUpCheckBoxFemale;

    @FXML
    private JFXPasswordField signUpPassword;

    @FXML
    private JFXButton signUpLcation;

    @FXML
    private JFXButton signUpButton;

    @FXML
    void initialize() {
        DatabaseHandler databaseHandler = new DatabaseHandler();
        signUpButton.setOnAction(event -> {
            databaseHandler.signUpUser(signUpFirstName.getText(), signUpLastName.getText(),
                    sihnUpUserName.getText(), signUpPassword.getText(), signUpLcation.getText(), "Female");
        });

    }


}
