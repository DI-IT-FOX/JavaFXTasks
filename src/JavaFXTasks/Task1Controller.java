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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Марина
 */
public class Task1Controller implements Initializable {

    @FXML
    private AnchorPane task1Controller;
    @FXML
    private Button solveButton;
    @FXML
    private Button clearButton;
    @FXML
    private TextField xTextField;
    @FXML
    private TextField aTextField;
    @FXML
    private TextField bTextField;
    @FXML
    private TextField answerTextField;
    @FXML
    private Button exitButton;
    @FXML
    private Label cautionLable;
    
    private final String ALERT_A_B_NOT_ZERO = "При x <= 7, A и B не могут одновременно равняться нулю!";
    private final String ALERT_INPUT_ERROR = "Ошибка ввода! Убедитесь, что введены только цифры!";
    
    private int x, a, b;
    private double y;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.clear(ALERT_A_B_NOT_ZERO);
    }    

    @FXML
    private void onSolveButtonClick(ActionEvent event) {
        try {
            x = Integer.parseInt(xTextField.getText());
            a = Integer.parseInt(aTextField.getText());
            b = Integer.parseInt(bTextField.getText());
        } catch (NumberFormatException e) {
            System.out.println(e);
            this.clear(ALERT_INPUT_ERROR);
            return;
        }
        if (x <= 7 ) {
            if (a == 0 && b == 0) {
                this.clear(ALERT_A_B_NOT_ZERO);
                return;
            } else {
                y = (double)(x + 4) / (a*a + b*b);
            }
        } else {
            y = (double)x * Math.pow((a + b), 2);
        }
        cautionLable.setVisible(false);
        answerTextField.setText("" + y);
    }

    @FXML
    private void onClearButtonClick(ActionEvent event) {
        this.clear(ALERT_A_B_NOT_ZERO);
    }

    @FXML
    private void onExitButtonClick(ActionEvent event) {
        System.exit(0);
    }
    
    private void clear(String alert) {
        System.out.println(alert);
        xTextField.setText("0");
        aTextField.setText("0");
        bTextField.setText("0");
        answerTextField.setText("");
        cautionLable.setText(alert);
        cautionLable.setVisible(true);
        x = 0; a = 0; b = 0;
    }
    
}
