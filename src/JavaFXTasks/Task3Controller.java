/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXTasks;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Марина
 */
public class Task3Controller implements Initializable {

    @FXML
    private TableView<?> randomTable;
    @FXML
    private TableColumn<?, ?> c1TableColomn;
    @FXML
    private TableColumn<?, ?> c2TableColomn;
    @FXML
    private TableColumn<?, ?> c3TableColomn;
    @FXML
    private TableColumn<?, ?> c4TableColomn;
    @FXML
    private TableColumn<?, ?> c5TableColomn;
    @FXML
    private Button filling2Button;
    @FXML
    private Button run2Button;
    @FXML
    private Label maxLabel;
    @FXML
    private Label minLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onFilling2ButtonClick(ActionEvent event) {
    }

    @FXML
    private void onRun2ButtonClick(ActionEvent event) {
    }
    
}
