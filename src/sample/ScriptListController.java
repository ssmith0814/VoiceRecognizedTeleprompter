package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class ScriptListController {

  @FXML
  public ComboBox importOrCreate;

  @FXML
  public Button logoutBut;

  @FXML
  private ListView<File> ScriptListView;

  @FXML
  private Button ViewScriptBut;

  @FXML
  private Button ImportScriptBut;

  @FXML
  private TextArea viewScript;

  private ObservableList<File> scriptList = FXCollections.observableArrayList();

  private ObservableList<String> ICList = FXCollections.observableArrayList();

  public InputStream scriptInputStream;

  @FXML
  private void initialize(){

    scriptList.add(new File("src/Scripts/Script1.txt"));
    scriptList.add(new File("src/Scripts/Script2.txt"));
    ScriptListView.setItems(scriptList);

    ICList.add("Import");
    ICList.add("Create");

    importOrCreate.setItems(ICList);

  }

  public void viewScript(javafx.event.ActionEvent event) throws IOException {
    File selectedScript = ScriptListView.getSelectionModel().getSelectedItem();

    Scanner scan = new Scanner(selectedScript);
    String temp = "";
    while(scan.hasNextLine()){
      temp = temp.concat(scan.nextLine() + "\n");
    }

    viewScript.setText(temp);

  }

  public void logout(javafx.event.ActionEvent event) throws IOException {
    Parent LoginViewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
    Scene LoginViewScene = new Scene(LoginViewParent);

    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

    window.setScene(LoginViewScene);
    window.show();
  }


}
