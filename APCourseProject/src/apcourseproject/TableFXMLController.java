/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcourseproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author VarunJain
 */
public class TableFXMLController implements Initializable {
    @FXML
    private TableView<?> table1;
    @FXML
    private TableColumn<?, ?> table1col1;
    @FXML
    private TableColumn<?, ?> table1col2;
    @FXML
    private TableColumn<?, ?> table1col3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        BufferedReader fileStream = null;
        String[] records = null;
        String eachRec = "";
        int i = 0;
        try
        {
            fileStream = new BufferedReader(new FileReader("./src/applicantDetails.txt"));
            while ((eachRec = fileStream.readLine()) != null)
            {
                if (!eachRec.equals(""))
                {
                    
                }
                
            }
        }
        catch (Exception e) {}
        
        ObservableList<String[]> data = FXCollections.observableArrayList();
        table1.setEditable(true);
        table1col1.setCellValueFactory(new PropertyValueFactory<>("category"));
        table1col2.setCellValueFactory(new PropertyValueFactory<>("amount"));
        table1col3.setCellValueFactory(new PropertyValueFactory<>("dt"));
//        table1.setItems(data);
        
    }    
    
}
