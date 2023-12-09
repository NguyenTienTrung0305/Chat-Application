package application.controller;

import javafx.css.PseudoClass;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeAppController implements Initializable {
    @FXML
    private AnchorPane acNav;

    @FXML
    private Button btnGroup;

    @FXML
    private Button btnRepo;

    @FXML
    private Button btnMessage;

    @FXML
    private Button btnPersonal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnMessage.pseudoClassStateChanged(PseudoClass.getPseudoClass("selected") , true);
        btnRepo.pseudoClassStateChanged(PseudoClass.getPseudoClass("selected") , false);
        btnPersonal.pseudoClassStateChanged(PseudoClass.getPseudoClass("selected") , false);
        btnGroup.pseudoClassStateChanged(PseudoClass.getPseudoClass("selected") , false);
        showOnSecreen("/gui/Message.fxml");
    }

    public void showOnSecreen(String path) {
        try {
            System.out.println(getClass().getResource(path));
            AnchorPane component = FXMLLoader.load(getClass().getResource(path));
            acNav.getChildren().clear();
            acNav.getChildren().add(component);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onActionBtnMessage(){
        showOnSecreen("/gui/Message.fxml");
    }

    public void onActionBtnRepo(){}

    public void onActionBtnGroup(){}

    public void onActionBtnPersonal(){}

}
