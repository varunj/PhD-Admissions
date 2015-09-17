/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcourseproject;

import java.net.URL;
import java.util.ArrayList;
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
    private TableView<addRectoTable> table1;
    @FXML
    private TableColumn<addRectoTable, String> table1col1;
    @FXML
    private TableColumn<addRectoTable, String> table1col2;
    @FXML
    private TableColumn<addRectoTable, String> table1col3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<String[]> records = new ArrayList<>();
        String eachRec = "";
        String eachRec1 = "";
        try
        {
            eachRec = "101, VarunJain, Link, ";
            eachRec1 = "201, ayush, Yo, ";
            records.add(eachRec.split(", "));
            records.add(eachRec1.split(", "));
        
            ObservableList<addRectoTable> data = FXCollections.observableArrayList();
            for(int j=0;j<records.size();j++)
            {
                String[] format=records.get(j);
                data.add(new addRectoTable(format[0], format[1], format[2]));
            }
            table1.setEditable(true);
            table1col1.setCellValueFactory(new PropertyValueFactory<>("enroll"));
            table1col2.setCellValueFactory(new PropertyValueFactory<>("name"));
            table1col3.setCellValueFactory(new PropertyValueFactory<>("link"));
            table1.setItems(data);
        }
        catch (Exception e) 
        {
            table1.setEditable(true);
            ObservableList<addRectoTable> data = FXCollections.observableArrayList();
            table1col1.setCellValueFactory(new PropertyValueFactory<>("enroll"));
            table1col2.setCellValueFactory(new PropertyValueFactory<>("name"));
            table1col3.setCellValueFactory(new PropertyValueFactory<>("link"));
            table1.setItems(data);
        }
    }    
    
}
