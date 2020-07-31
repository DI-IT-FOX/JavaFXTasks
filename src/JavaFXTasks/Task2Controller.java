/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXTasks;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


class RandomData {
    private DoubleProperty k;
    private DoubleProperty y;
    
    public double getK() { return this.k.get(); }
    public void setK(double k) { this.k.set(k); }
    public DoubleProperty kProperty () { return this.k; }
    
    public double getY() { return this.y.get(); }
    public void setY(double y) { this.y.set(y); }
    public DoubleProperty yProperty() { return this.y; }
    
    public RandomData(int mult) {
        double k = Math.random() * mult;
        double y = k;
        this.k = new SimpleDoubleProperty(k);
        this.y = new SimpleDoubleProperty(y);
    }
    
}

/**
 * FXML Controller class
 *
 * @author Марина
 */
public class Task2Controller implements Initializable {

    @FXML
    private TableView<RandomData> resultTable;
    @FXML
    private TableColumn<RandomData, Double> Ki;
    @FXML
    private TableColumn<RandomData, Double> Yi;
    @FXML
    private TextField aTextField;
    @FXML
    private TextField bTextField;
    @FXML
    private Button fillingButton;
    @FXML
    private Button runButton;
    @FXML
    private Button clearTableButton;
    @FXML
    private Button exitButton;
    
    private int a, b;
    
     private ObservableList<RandomData> tableData = FXCollections.observableArrayList();
 
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Ki.setCellValueFactory(data -> data.getValue().kProperty().asObject());
        Yi.setCellValueFactory(data -> data.getValue().yProperty().asObject());
        this.fillRandomTable();
    } 
    
    private void fillRandomTable () {
        resultTable.getItems().clear();
        for(int i = 0; i < 10; i++) tableData.add(new RandomData(100)); // добавить строку
        resultTable.setItems(tableData);
    }

    @FXML
    private void onFllingButtonClick(ActionEvent event) {
        this.fillRandomTable();
    }

    @FXML
    private void onRunButton(ActionEvent event) {
          try {
            a = Integer.parseInt(aTextField.getText());
            b = Integer.parseInt(bTextField.getText());
        } catch (NumberFormatException e) {
            System.out.println(e);
            return;
        
    }
    }
    @FXML
    private void onClearTableButtonClick(ActionEvent event) {
        //System.clearProperty();
//        double Y = Math.sqrt(Math.cos(Ki));
    }

    @FXML
    private void onExitButtonClick(ActionEvent event) {
        System.exit(0);
    }
    
    }

