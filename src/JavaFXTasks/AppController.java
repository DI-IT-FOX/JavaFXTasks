/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXTasks;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 * FXML Controller class
 *
 * @author Марина
 */
public class AppController implements Initializable {

    @FXML
    private TabPane mainMenu;
    @FXML
    private Tab task1Tab;
    @FXML
    private Tab task2Tab;
    @FXML
    private Tab task3Tab;
    @FXML
    private Tab aboutTab;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
