package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginController {

  @FXML
  private TextField loginUser;

  @FXML
  private Button loginButton;

  @FXML
  private PasswordField loginPass;

  @FXML
  private Tab createAccountButton;

  @FXML
  private TextField createUser;

  @FXML
  private PasswordField createPass;

  @FXML
  private TextField createFirstN;

  @FXML
  private TextField createLastN;

  public LoginController() throws IOException {
  }

  @FXML
  public void initialize(){
    System.out.println("plz work");
  }

  public void login(javafx.event.ActionEvent event) throws IOException {
    Parent ScriptListParent = FXMLLoader.load(getClass().getResource("ScriptList.fxml"));
    Scene ScriptListScene = new Scene(ScriptListParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(ScriptListScene);
    window.show();
  }

  public void create(javafx.event.ActionEvent event) throws IOException {
    Parent ScriptListParent = FXMLLoader.load(getClass().getResource("ScriptList.fxml"));
    Scene ScriptListScene = new Scene(ScriptListParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(ScriptListScene);
    window.show();
  }
}
