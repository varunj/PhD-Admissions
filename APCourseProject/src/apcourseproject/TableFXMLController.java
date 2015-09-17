/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcourseproject;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

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
    private TableColumn<addRectoTable, addRectoTable> table1col3;
    @FXML
    private Button back;
    @FXML
    private TableColumn<addRectoTable, addRectoTable> table1col4;
    @FXML
    private TableColumn<addRectoTable, addRectoTable> table1col5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<String[]> records = new ArrayList<>();
        BufferedReader fileStream = null;
        String eachRec = "";
        String eachRec1 = "";
        try
        {
            fileStream = new BufferedReader(new FileReader("./archiveTxt//cumm.txt"));
            while ((eachRec = fileStream.readLine()) != null)
            {
                if (!eachRec.equals(""))
                {
                    records.add(eachRec.split(", "));
                }
            }
        
            ObservableList<addRectoTable> data = FXCollections.observableArrayList();
            for(int i = 0; i < records.size(); i++)
            {
                data.add(new addRectoTable(records.get(i)[57], records.get(i)[1], records.get(i)[57], records.get(i)[33], records.get(i)[34]));
            }
            table1.setEditable(true);
            table1col1.setCellValueFactory(new PropertyValueFactory<>("enroll"));
            table1col2.setCellValueFactory(new PropertyValueFactory<>("name"));

            //----------------------------------------------------------------------           
            table1col3.setCellValueFactory(new Callback<CellDataFeatures<addRectoTable, addRectoTable>, ObservableValue<addRectoTable>>() 
            {
              @Override 
              public ObservableValue<addRectoTable> call(CellDataFeatures<addRectoTable, addRectoTable> features) 
              {
                return new ReadOnlyObjectWrapper(features.getValue());
              }
            });
            table1col3.setCellFactory(new Callback<TableColumn<addRectoTable, addRectoTable>, TableCell<addRectoTable, addRectoTable>>() 
            {
              @Override 
              public TableCell<addRectoTable, addRectoTable> call(TableColumn<addRectoTable, addRectoTable> btnCol) 
              {
                return new TableCell<addRectoTable, addRectoTable>() 
                {
                  final Button button = new Button(); 
                  {
                    button.setMinWidth(120);
                  }
                  @Override 
                  public void updateItem(final addRectoTable person, boolean empty) 
                  {
                    super.updateItem(person, empty);
                    if (person != null) 
                    {
                      button.setText("Data");
                      setGraphic(button);                  
                      button.setOnAction(new EventHandler<ActionEvent>() 
                      {
                        @Override
                        public void handle(ActionEvent event) 
                        {
                            File file = new File("./archiveTxt/" + person.getLink() + ".txt");
                            try {
                                Desktop.getDesktop().open(file);
                            } catch (IOException ex) {
                                Logger.getLogger(TableFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                      });
                    }
                  }
                };
              }
            });
            //------------------------
            table1col4.setCellValueFactory(new Callback<CellDataFeatures<addRectoTable, addRectoTable>, ObservableValue<addRectoTable>>() 
            {
              @Override 
              public ObservableValue<addRectoTable> call(CellDataFeatures<addRectoTable, addRectoTable> features) 
              {
                return new ReadOnlyObjectWrapper(features.getValue());
              }
            });
            table1col4.setCellFactory(new Callback<TableColumn<addRectoTable, addRectoTable>, TableCell<addRectoTable, addRectoTable>>() 
            {
              @Override 
              public TableCell<addRectoTable, addRectoTable> call(TableColumn<addRectoTable, addRectoTable> btnCol) 
              {
                return new TableCell<addRectoTable, addRectoTable>() 
                {
                  final Button button = new Button(); 
                  {
                    button.setMinWidth(120);
                  }
                  @Override 
                  public void updateItem(final addRectoTable person, boolean empty) 
                  {
                    super.updateItem(person, empty);
                    if (person != null) 
                    {
                      button.setText("CV");
                      setGraphic(button);                  
                      button.setOnAction(new EventHandler<ActionEvent>() 
                      {
                        @Override
                        public void handle(ActionEvent event) 
                        {
                            File file = new File("./archive/" + person.getLink() + "_cv.pdf");
                            try {
                                Desktop.getDesktop().open(file);
                            } catch (IOException ex) {
                                Logger.getLogger(TableFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                      });
                    }
                  }
                };
              }
            });
            //------------------
            table1col5.setCellValueFactory(new Callback<CellDataFeatures<addRectoTable, addRectoTable>, ObservableValue<addRectoTable>>() 
            {
              @Override 
              public ObservableValue<addRectoTable> call(CellDataFeatures<addRectoTable, addRectoTable> features) 
              {
                return new ReadOnlyObjectWrapper(features.getValue());
              }
            });
            table1col5.setCellFactory(new Callback<TableColumn<addRectoTable, addRectoTable>, TableCell<addRectoTable, addRectoTable>>() 
            {
              @Override 
              public TableCell<addRectoTable, addRectoTable> call(TableColumn<addRectoTable, addRectoTable> btnCol) 
              {
                return new TableCell<addRectoTable, addRectoTable>() 
                {
                  final Button button = new Button(); 
                  {
                    button.setMinWidth(120);
                  }
                  @Override 
                  public void updateItem(final addRectoTable person, boolean empty) 
                  {
                    super.updateItem(person, empty);
                    if (person != null) 
                    {
                      button.setText("SOP");
                      setGraphic(button);                  
                      button.setOnAction(new EventHandler<ActionEvent>() 
                      {
                        @Override
                        public void handle(ActionEvent event) 
                        {
                            File file = new File("./archive/" + person.getLink() + "_sop.pdf");
                            try {
                                Desktop.getDesktop().open(file);
                            } catch (IOException ex) {
                                Logger.getLogger(TableFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                      });
                    }
                  }
                };
              }
            });
            
            //------------------------------------------------------------------------------------------------
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

    @FXML
    private void backClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/apcourseproject/AdminFXML.fxml"));
        Scene scene = new Scene(parent);
        APCourseProject.stage2.setScene(scene);
        APCourseProject.stage2.show();
    }
    
}
