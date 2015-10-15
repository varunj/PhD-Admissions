/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcourseproject;

import java.awt.Desktop;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.util.Callback;
/**
 *
 * @author VarunJain
 */
public class ApplicantController implements Initializable {
    //<editor-fold defaultstate="collapsed" desc="ComponentInitialisation">
    @FXML
    private Hyperlink linkcontact;
    @FXML
    private Hyperlink linkfaq;
    @FXML
    private Tab tab1;
    @FXML
    private ScrollPane scroll1;
    @FXML
    private Label t1lab2;
    @FXML
    private Label t1lab1;
    @FXML
    private Label t1lab5;
    @FXML
    private Label t1lab3;
    @FXML
    private Label t1lab4;
    @FXML
    private TextField t1text3;
    @FXML
    private TextField t1text5;
    @FXML
    private TextField t1text1;
    @FXML
    private TextField t1text4;
    @FXML
    private TextField t1text2;
    @FXML
    private Label t1lab6;
    @FXML
    private RadioButton t1rb1;
    @FXML
    private ToggleGroup t1tg1;
    @FXML
    private RadioButton t1rb3;
    @FXML
    private RadioButton t1rb2;
    @FXML
    private Label t1lab7;
    @FXML
    private TextField t1text6;
    @FXML
    private TextField t1text7;
    @FXML
    private TextField t1text8;
    @FXML
    private Label t1lab8;
    @FXML
    private RadioButton t1rb4;
    @FXML
    private ToggleGroup t1tg2;
    @FXML
    private RadioButton t1rb5;
    @FXML
    private RadioButton t1rb6;
    @FXML
    private ToggleGroup t1tg3;
    @FXML
    private RadioButton t1rb7;
    @FXML
    private RadioButton t1rb10;
    @FXML
    private ToggleGroup t1tg4;
    @FXML
    private RadioButton t1rb11;
    @FXML
    private DatePicker t1dp;
    @FXML
    private RadioButton t1rb12;
    @FXML
    private ToggleGroup t1tg5;
    @FXML
    private RadioButton t1rb13;
    @FXML
    private RadioButton t1rb8;
    @FXML
    private RadioButton t1rb9;
    @FXML
    private TextField t1text9;
    @FXML
    private AnchorPane t1text10;
    @FXML
    private TextField t1text11;
    @FXML
    private TextField t1text12;
    @FXML
    private TextField t2text1;
    @FXML
    private TextField t2text2;
    @FXML
    private TextField t2text3;
    @FXML
    private TextField t2text4;
    @FXML
    private TextField t2text5;
    @FXML
    private TextField t2text6;
    @FXML
    private TextField t2text7;
    @FXML
    private TextField t2text8;
    @FXML
    private TextField t2text9;
    @FXML
    private TextField t2text10;
    @FXML
    private TextField t2text11;
    @FXML
    private TextField t2text13;
    @FXML
    private RadioButton t2rb1;
    @FXML
    private RadioButton t2rb2;
    @FXML
    private TextField t2text14;
    @FXML
    private TextField t2text15;
    @FXML
    private TextField t2text16;
    @FXML
    private Button t4btn1;
    @FXML
    private Label t4warning;
    @FXML
    private RadioButton t3rb1;
    @FXML
    private ToggleGroup t3;
    @FXML
    private RadioButton t3rb2;
    @FXML
    private RadioButton t3rb3;
    @FXML
    private RadioButton t3rb4;
    @FXML
    private RadioButton t3rb5;
    @FXML
    private RadioButton t3rb6;
    @FXML
    private RadioButton t3rb7;
    @FXML
    private RadioButton t3rb8;
    @FXML
    private CheckBox t3cb1;
    @FXML
    private CheckBox t3cb2;
    @FXML
    private CheckBox t3cb3;
    @FXML
    private CheckBox t3cb4;
    @FXML
    private CheckBox t3cb5;
    @FXML
    private CheckBox t3cb6;
    @FXML
    private CheckBox t3cb7;
    @FXML
    private CheckBox t3cb8;
    @FXML
    private CheckBox t3cb9;
    @FXML
    private Label t4warning2;
    @FXML
    private ChoiceBox<Integer> t2drop1;
    @FXML
    private ScrollPane scroll2;
    @FXML
    private ScrollPane scroll3;
    @FXML
    private ToggleGroup t2g1;
    @FXML
    private Button t2choose1;
    @FXML
    private Button t2choose2;
    @FXML
    private ComboBox<String> t2prefer1;
    @FXML
    private ComboBox<String> t2prefer2;
    @FXML
    private ComboBox<String> t2prefer3;
    @FXML
    private ComboBox<String> t2prefer4;
    @FXML
    private TextField t2text17;
    @FXML
    private TextField t2text18;
    @FXML
    private TextField t2text19;
    @FXML
    private TextField t2text20;
    @FXML
    private TextField t2text21;
    @FXML
    private TextField t2text22;
    @FXML
    private TextField t2text23;
    @FXML
    private TextField t2text24;
    @FXML
    private TextField t2text25;
    @FXML
    private TextField t2text26;
    @FXML
    private TextField t2text27;
    @FXML
    private TextField t2text28;
    @FXML
    private ComboBox<String> t2statedrop;
    @FXML
    private TextField t2text29;
    @FXML
    private TextField t2text30;
    @FXML
    private TextField t2text31;
    @FXML
    private TextField t2text32;
    @FXML
    private RadioButton t2rb3;
    @FXML
    private TextField t2text33;
    @FXML
    private ComboBox<Integer> t2drop2;
    @FXML
    private RadioButton t2rb4;
    @FXML
    private TextField t2text34;
    @FXML
    private ComboBox<String> t1drop1;
    @FXML
    private ComboBox<String> t2drop3;
    
    String path1 = "", path2 = "", uid = "";
    @FXML
    private Label t2wran1;
    @FXML
    private Label t2wran2;
    @FXML
    private ToggleGroup xx;
    @FXML
    private Button importButton;
    @FXML
    private AnchorPane anchor;
    //</editor-fold>
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        uid = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
        // t1text1 unfilled check
        t1text1.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue1, String newValue1) 
            {
                if (!t1text1.getText().equals(""))  t1text1.setStyle("-fx-border-color: grey;");
                if (t1text1.getText().equals(""))   t1text1.setStyle("-fx-border-color: red;");
            }
        });
        // drop down nations t1
        t1drop1.getItems().clear();
        t1drop1.getItems().addAll("India", "Algeria", "Bangladesh", "China", "Namibia", "Pakistan", "Kazakhstan", "Zaire");
        t1drop1.getSelectionModel().selectFirst();
        // drop down states t2
        t2drop3.getItems().clear();
        t2drop3.getItems().addAll("Delhi", "Haryana", "Uttar Pradesh", "Jammu and Kashmir", "Uttrakhand", "Assam");
        t2drop3.getSelectionModel().selectFirst();
        // drop down2 states t2
        t2statedrop.getItems().clear();
        t2statedrop.getItems().addAll("Delhi", "Haryana", "Uttar Pradesh", "Jammu and Kashmir", "Uttrakhand", "Assam");
        t2statedrop.getSelectionModel().selectFirst();
        // ece phd t2
        t2prefer1.getItems().clear();
        t2prefer1.getItems().addAll("NULL", "Advanced Signal Processing", "Digital VLSI Design", "Analog CMOS Design", "Comm Networks", "Intro to Robotics", "RF Circuit Design", "Embedded Systems");
        t2prefer1.getSelectionModel().selectFirst();
        // ece phd t2
        t2prefer2.getItems().clear();
        t2prefer2.getItems().addAll("NULL", "Advanced Signal Processing", "Digital VLSI Design", "Analog CMOS Design", "Comm Networks", "Intro to Robotics", "RF Circuit Design", "Embedded Systems");
        t2prefer2.getSelectionModel().selectFirst();
        // ece phd t2
        t2prefer3.getItems().clear();
        t2prefer3.getItems().addAll("NULL", "Advanced Signal Processing", "Digital VLSI Design", "Analog CMOS Design", "Comm Networks", "Intro to Robotics", "RF Circuit Design", "Embedded Systems");
        t2prefer3.getSelectionModel().selectFirst();
        // ece phd t2
        t2prefer4.getItems().clear();
        t2prefer4.getItems().addAll("NULL", "Advanced Signal Processing", "Digital VLSI Design", "Analog CMOS Design", "Comm Networks", "Intro to Robotics", "RF Circuit Design", "Embedded Systems");
        t2prefer4.getSelectionModel().selectFirst();
        // drop down cgpa
        t2drop1.getItems().clear();
        t2drop1.getItems().addAll(10, 4);
        t2drop1.getSelectionModel().selectFirst();
        // drop down cgpa2
        t2drop2.getItems().clear();
        t2drop2.getItems().addAll(10, 4);
        t2drop2.getSelectionModel().selectFirst();
        // marks/cgpa textfields
        t2text14.setDisable(true);
        t2text15.setDisable(true);
        t2text33.setDisable(true);
        t2text34.setDisable(true);
        // mobile
        t1text5.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue1, String newValue1) 
            {
                try
                {
                    int value;
                    if (newValue1.length() > 10) t1text5.setText(oldValue1); 
                    if (newValue1.matches("\\d*")) value = Integer.parseInt(newValue1);
                    else t1text5.setText(oldValue1);            
                     
                }
                catch(Exception e) {} 
            }
        });
        // pincode
        t1text12.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;
                    if (newValue.matches("\\d*")) value = Integer.parseInt(newValue);
                    else t1text12.setText(oldValue);            
                    if (newValue.length() > 6) t1text12.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // marks
        t2text2.textProperty().addListener(new ChangeListener<String>() 
        {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    if (!(newValue.matches("\\d*") || newValue.contains("."))) t2text2.setText(oldValue);
                    if (Double.parseDouble(newValue) > 100.0) t2text2.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // marks
        t2text5.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    if (!(newValue.matches("\\d*") || newValue.contains("."))) t2text5.setText(oldValue);
                    if (Double.parseDouble(newValue) > 100.0) t2text5.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // marks
        t2text15.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    if (!(newValue.matches("\\d*") || newValue.contains("."))) t2text15.setText(oldValue);
                    if (Double.parseDouble(newValue) > 100.0) t2text15.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // marks2.1
        t2text19.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    if (!(newValue.matches("\\d*") || newValue.contains("."))) t2text19.setText(oldValue);
                    if (Double.parseDouble(newValue) > 100.0) t2text19.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // marks2.2
        t2text20.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    if (!(newValue.matches("\\d*"))) t2text20.setText(oldValue);
                    if (Double.parseDouble(newValue) > 100.0) t2text20.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // marks2.3
        t2text25.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    if (!(newValue.matches("\\d*"))) t2text25.setText(oldValue);
                    if (Double.parseDouble(newValue) > 100.0) t2text25.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // marks2.4
        t2text34.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    if (!(newValue.matches("\\d*") || newValue.contains("."))) t2text34.setText(oldValue);
                    if (Double.parseDouble(newValue) > 100.0) t2text34.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // rank
        t2text21.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;
                    if (newValue.matches("\\d*")) value = Integer.parseInt(newValue);
                    else t2text21.setText(oldValue);            
                    if (newValue.length() > 6) t2text21.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // rank
        t2text26.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;
                    if (newValue.matches("\\d*")) value = Integer.parseInt(newValue);
                    else t2text26.setText(oldValue);            
                    if (newValue.length() > 6) t2text26.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // year
        t2text3.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;
                    if (newValue.matches("\\d*")) value = Integer.parseInt(newValue);
                    else t2text3.setText(oldValue);            
                    if (Integer.parseInt(newValue) >= Calendar.getInstance().get(Calendar.YEAR)) t2text3.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // year
        t2text6.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;
                    if (newValue.matches("\\d*")) value = Integer.parseInt(newValue);
                    else t2text6.setText(oldValue);            
                    if (Integer.parseInt(newValue) >= Calendar.getInstance().get(Calendar.YEAR)) t2text6.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // year
        t2text13.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;
                    if (newValue.matches("\\d*")) value = Integer.parseInt(newValue);
                    else t2text13.setText(oldValue);            
                    if (Integer.parseInt(newValue) >= Calendar.getInstance().get(Calendar.YEAR)) t2text13.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // year2.1
        t2text18.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;
                    if (newValue.matches("\\d*")) value = Integer.parseInt(newValue);
                    else t2text18.setText(oldValue);            
                    if (Integer.parseInt(newValue) >= Calendar.getInstance().get(Calendar.YEAR)) t2text18.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // year2.1
        t2text24.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;
                    if (newValue.matches("\\d*")) value = Integer.parseInt(newValue);
                    else t2text24.setText(oldValue);            
                    if (Integer.parseInt(newValue) >= Calendar.getInstance().get(Calendar.YEAR)) t2text24.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // year2.2
        t2text32.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;
                    if (newValue.matches("\\d*")) value = Integer.parseInt(newValue);
                    else t2text32.setText(oldValue);            
                    if (Integer.parseInt(newValue) >= Calendar.getInstance().get(Calendar.YEAR)) t2text32.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // cgpa
        t2text14.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;          
                    if (Integer.parseInt(newValue) > 10) t2text14.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // cgpa2.1
        t2text33.textProperty().addListener(new ChangeListener<String>() 
        {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;          
                    if (Integer.parseInt(newValue) > 10) t2text33.setText(oldValue);  
                }
                catch(Exception e) {} 
            }
        });
        // t1 date
        t1dp.setValue(LocalDate.now());
        Callback<DatePicker, DateCell> dayCellFactory = dp -> new DateCell()
        {
            public void updateItem(LocalDate item, boolean empty)
            {
                super.updateItem(item, empty);

                if(item.isAfter(LocalDate.now()))
                {
                    setStyle("-fx-background-color: #ffc0cb;");
                    setDisable(true);
                    addEventFilter(MouseEvent.MOUSE_CLICKED, e -> e.consume());
                }
            }
        };
        t1dp.setDayCellFactory(dayCellFactory);
     
        
    }    
    
    @FXML
    private void userSubmitClick(ActionEvent event) {
        int checkAll = 1, checkAll2 = 1;
        String data = "";
        
        if ((!t1text1.getText().equals("") && !t1text2.getText().equals("") && !t1text3.getText().equals("") && !t1text4.getText().equals("") && !t1text5.getText().equals("") && !t1text6.getText().equals("") && !t1text7.getText().equals("") && !t1text8.getText().equals("") && !t1text9.getText().equals("") && !t1text11.getText().equals("")) && (t1rb1.isSelected() || t1rb2.isSelected() || t1rb3.isSelected()) && (t1rb4.isSelected() || t1rb5.isSelected()) && (t1rb6.isSelected() || t1rb7.isSelected() || t1rb8.isSelected() || t1rb9.isSelected()) && (t1rb10.isSelected() || t1rb11.isSelected()) && (!(t1dp.getValue() == null)) && (t1rb12.isSelected() || t1rb13.isSelected()) == true) {
            t4warning.setVisible(false);
        } else {
            checkAll = 0;
            t4warning.setVisible(true);
        }
        if (!t2text1.getText().equals("") && !t2text2.getText().equals("") && !t2text3.getText().equals("") && !t2text4.getText().equals("") && !t2text5.getText().equals("") && !t2text6.getText().equals("") && !t2text7.getText().equals("") && !t2text8.getText().equals("") && !t2text9.getText().equals("") && !t2text10.getText().equals("") && !t2text11.getText().equals("") && !t2text13.getText().equals("") == true) {
            t4warning2.setVisible(false);
        } else {
            checkAll2 = 0;
            t4warning2.setVisible(true);
        }
        
        if (checkAll == 1 && checkAll2 == 1) {
            // tab 1 work------------------------------------------------------------------------------------------
            data = t1text1.getText() + ", " + t1text2.getText() + ", " + t1text3.getText() + ", " + t1text4.getText() + ", " + t1text5.getText() + ", ";
            if (t1rb1.isSelected() == true) {
                data = data + "Computer Science" + ", ";
            }
            if (t1rb2.isSelected() == true) {
                data = data + "Electronics and Communication" + ", ";
            }
            if (t1rb3.isSelected() == true) {
                data = data + "Computational Biology" + ", ";
            }
            data = data + t1text6.getText() + ", " + t1text7.getText() + ", " + t1text8.getText() + ", ";
            if (t1rb4.isSelected() == true) {
                data = data + "Male" + ", ";
            }
            if (t1rb5.isSelected() == true) {
                data = data + "Female" + ", ";
            }
            if (t1rb6.isSelected() == true) {
                data = data + "General" + ", ";
            }
            if (t1rb7.isSelected() == true) {
                data = data + "SC" + ", ";
            }
            if (t1rb8.isSelected() == true) {
                data = data + "ST" + ", ";
            }
            if (t1rb9.isSelected() == true) {
                data = data + "OBC" + ", ";
            }
            if (t1rb10.isSelected() == true) {
                data = data + "Yes" + ", ";
            }
            if (t1rb11.isSelected() == true) {
                data = data + "No" + ", ";
            }
            data = data + t1dp.getValue()+ ", ";
            if (t1rb12.isSelected() == true) {
                data = data + "Yes" + ", ";
            }
            if (t1rb13.isSelected() == true) {
                data = data + "No" + ", ";
            }
            data = data + t1text9.getText() + ", " + t1drop1.getValue() + ", " + t1text11.getText() + ", ";
            if (t1text12.getText().equals("")) {
                data = data + "NULL" + ", ";
            } else {
                data = data + t1text12.getText() + ", ";
            }            
            // tab 2 work------------------------------------------------------------------------------------------
            data = data + t2text1.getText() + ", " + t2text2.getText() + ", " + t2text3.getText() + ", " + t2text4.getText() + ", " + t2text5.getText() + ", " + t2text6.getText() + ", " + t2text7.getText() + ", " + t2text8.getText() + ", " + t2text9.getText() + ", " + t2text10.getText() + ", " + t2text11.getText() + ", " + t2drop3.getValue() + ", " + t2text13.getText() + ", ";
            if (t2rb1.isSelected() == true)
            {
                if (t2drop1.getValue() == 4)
                {
                    data = data + (Integer.parseInt(t2text14.getText()) * 100)/4 + ", ";
                }
                if (t2drop1.getValue() == 10)
                {
                    data = data + (Integer.parseInt(t2text14.getText()) * 10) + ", ";
                }
            }
            if (t2rb2.isSelected() == true) data = data + t2text15.getText() + ", ";      
            if (t2text16.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text16.getText() + ", ";

            data = data + path1 + ", " + path2 + ", ";
            data = data + t2prefer1.getValue() + ", " + t2prefer2.getValue() + ", " + t2prefer3.getValue() + ", " + t2prefer4.getValue() + ", ";
            
            if (t2text17.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text17.getText() + ", ";
            if (t2text18.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text18.getText() + ", ";
            if (t2text19.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text19.getText() + ", ";
            if (t2text20.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text20.getText() + ", ";
            if (t2text21.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text21.getText() + ", ";
            if (t2text22.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text22.getText() + ", ";
            if (t2text23.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text23.getText() + ", ";
            if (t2text24.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text24.getText() + ", ";
            if (t2text25.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text25.getText() + ", ";
            if (t2text26.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text26.getText() + ", ";
            if (t2text27.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text27.getText() + ", ";
            if (t2text28.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text28.getText() + ", ";
            data = data + t2statedrop.getValue() + ", ";
            if (t2text29.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text29.getText() + ", ";
            if (t2text30.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text30.getText() + ", ";
            if (t2text31.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text31.getText() + ", ";
            if (t2text32.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t2text32.getText() + ", ";
            
            if (t2rb3.isSelected() == true)
            {
                if (t2drop2.getValue() == 4)
                {
                    data = data + (Integer.parseInt(t2text33.getText()) * 100)/4 + ", ";
                }
                if (t2drop2.getValue() == 10)
                {
                    data = data + (Integer.parseInt(t2text33.getText()) * 10) + ", ";
                }
            }
            if (t2rb4.isSelected() == true) data = data + t2text34.getText() + ", ";      
            
            // tab 4 work------------------------------------------------------------------------------------------
            try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("./src/applicantDetails.txt", true)))) 
            {
                out.print(data);
                System.out.print(uid);
                out.print(uid);
                out.println(", ");
                out.print("\n");
            }
            catch (Exception e) {}
        
        }
    }

    @FXML
    private void t2NoneofAboveClick(ActionEvent event) {
        t3cb1.setSelected(false);
        t3cb2.setSelected(false);
        t3cb3.setSelected(false);
        t3cb4.setSelected(false);
        t3cb5.setSelected(false);
        t3cb6.setSelected(false);
        t3cb7.setSelected(false);
        t3cb8.setSelected(false);
    }

    @FXML
    private void t2cgpaPress(ActionEvent event) {
        t2text14.setDisable(false);
        t2text15.setDisable(true);
    }

    @FXML
    private void t2marksPress(ActionEvent event) {
        t2text15.setDisable(false);
        t2text14.setDisable(true);
    }    

    private void numberDot(KeyEvent event) {
        char inpChar = event.getCharacter().toCharArray()[0];
        if (!((inpChar >= '0' && inpChar <= '9') || inpChar == '.'))
        {
            event.consume();
        }
        if (t2text2.getText().equals(""))
        {
            return;
        }
    }

    @FXML
    private void uploader1(ActionEvent event) {
        try
        {
            Node node = (Node) event.getSource();
            FileChooser chooser = new FileChooser();
            chooser.setTitle("Open File");
            File x = chooser.showOpenDialog(node.getScene().getWindow());
            if (x == null) 
            {
                path1 = "NULL";
                t2wran1.setVisible(true);
            }
            else           
            {
                File dest = new File("./archive//" +uid+ "_cv.pdf");
                path1 = x.getPath();
                Files.copy(x.toPath(), dest.toPath(), REPLACE_EXISTING);
                t2wran1.setVisible(false);
            }
        } 
        
        catch (Exception e) {}    
    }

    @FXML
    private void uploader2(ActionEvent event) {
        try
        {
            Node node = (Node) event.getSource();
            FileChooser chooser = new FileChooser();
            chooser.setTitle("Open File");
            File x = chooser.showOpenDialog(node.getScene().getWindow());
            if (x == null) 
            {
                path2 = "NULL";
                t2wran2.setVisible(true);
            }
            else           
            {
                File dest = new File("./archive//" +uid+ "_sop.pdf");
                path2 = x.getPath();
                Files.copy(x.toPath(), dest.toPath(), REPLACE_EXISTING);
                t2wran2.setVisible(false);
            }
        }
        catch (Exception e) {}
    }

    @FXML
    private void t2cgpa2press(ActionEvent event) {
        t2text33.setDisable(false);
        t2text34.setDisable(true);
    }

    @FXML
    private void t2marks2press(ActionEvent event) {
        t2text34.setDisable(false);
        t2text33.setDisable(true);
    }

    @FXML
    private void hyp2(ActionEvent event) throws IOException, URISyntaxException {
        if(Desktop.isDesktopSupported())
        {
            Desktop.getDesktop().browse(new URI("http://phdadmissions.iiitd.edu.in/contact/"));
        }
    }

    @FXML
    private void hyp1(ActionEvent event) throws IOException, URISyntaxException {
        if(Desktop.isDesktopSupported())
        {
            Desktop.getDesktop().browse(new URI("http://phdadmissions.iiitd.edu.in/faq/"));
        }
    }

    @FXML
    private void importButtonClick(ActionEvent event) {
        BufferedReader fileStream = null;
        String eachRec = "";
        int countLine = 0;
        try
        {
            fileStream = new BufferedReader(new FileReader("./src/Data_to_Import.csv"));
            while ((eachRec = fileStream.readLine()) != null)
            {
                if (countLine != 0)
                {
                    eachRec = eachRec.replace(", ", "-*-");
                    eachRec = eachRec.replace(",", ", ");
                    eachRec = eachRec.replace("-*-", ",");
                    eachRec = eachRec.replace("\"", "");
                    eachRec = eachRec.replace("\"", "");
                    ArrayList<String> arrListFromInp = new ArrayList<String>();
                    ArrayList<String> arrListOut = new ArrayList<String>();
                    String[] strArrSplit = eachRec.split(", ");
                    for (String x : strArrSplit)
                    {
                        arrListFromInp.add(x);
                    }

                    for (int i = 0; i < arrListFromInp.size(); i++)
                    {
                        if (arrListFromInp.get(i).equals(""))
                        {
                            arrListFromInp.set(i, "NULL");
                        }          
                    }
                    for (int i = 0; i < 62; i++)
                    {
                        if (i == 0) {arrListOut.add(0, arrListFromInp.get(0));}
                        if (i == 1) {arrListOut.add(1, arrListFromInp.get(1));}
                        if (i == 2) {arrListOut.add(2, arrListFromInp.get(59));}
                        if (i == 3) {arrListOut.add(3, arrListFromInp.get(2));}
                        if (i == 4) {arrListOut.add(4, arrListFromInp.get(3));}
                        if (i == 5) {arrListOut.add(5, arrListFromInp.get(4));}
                        if (i == 6) {arrListOut.add(6, arrListFromInp.get(5));}
                        if (i == 7) {arrListOut.add(7, arrListFromInp.get(6));}
                        if (i == 8) {arrListOut.add(8, arrListFromInp.get(7));}
                        if (i == 9) {arrListOut.add(9, arrListFromInp.get(8));}
                        if (i == 10) {arrListOut.add(10, arrListFromInp.get(9));}
                        if (i == 11) {arrListOut.add(11, arrListFromInp.get(10));}
                        // added
                        if (i == 12) {arrListOut.add(12, arrListFromInp.get(11).split("-")[2] + "-" + arrListFromInp.get(11).split("-")[1] + "-" + arrListFromInp.get(11).split("-")[0]);}
                        // added
                        if (i == 13) {arrListOut.add(13, arrListFromInp.get(12));}
                        if (i == 14) {arrListOut.add(14, arrListFromInp.get(13));}
                        if (i == 15) {arrListOut.add(15, arrListFromInp.get(14));}
                        if (i == 16) {arrListOut.add(16, arrListFromInp.get(15));}
                        if (i == 17) {arrListOut.add(17, arrListFromInp.get(16));}
                        if (i == 18) {arrListOut.add(18, arrListFromInp.get(17));}
                        if (i == 19) {arrListOut.add(19, arrListFromInp.get(18));}
                        if (i == 20) {arrListOut.add(20, arrListFromInp.get(19));}
                        if (i == 21) {arrListOut.add(21, arrListFromInp.get(20));}
                        if (i == 22) {arrListOut.add(22, arrListFromInp.get(21));}
                        if (i == 23) {arrListOut.add(23, arrListFromInp.get(22));}
                        if (i == 24) {arrListOut.add(24, arrListFromInp.get(23));}
                        if (i == 25) {arrListOut.add(25, arrListFromInp.get(24));}
                        if (i == 26) {arrListOut.add(26, arrListFromInp.get(25));}
                        if (i == 27) {arrListOut.add(27, arrListFromInp.get(26));}
                        if (i == 28) {arrListOut.add(28, arrListFromInp.get(27));}
                        if (i == 29) {arrListOut.add(29, arrListFromInp.get(28));}
                        if (i == 30) {arrListOut.add(30, arrListFromInp.get(29));}
                        if (i == 31) {
                            if (arrListFromInp.get(30).split(":")[0].equals("Marks")) {
                                arrListOut.add(31, arrListFromInp.get(30).split(":")[1]);
                            }
                            if (arrListFromInp.get(30).split(":")[0].equals("CGPA")) {
                                int xx = 0;
                                xx = (int) (Double.parseDouble(arrListFromInp.get(30).split(":")[1]) * 10.0);
                                arrListOut.add(31, Integer.toString(xx));
                            } 
                        }

                        if (i == 32) {arrListOut.add(32, arrListFromInp.get(57));}
                        if (i == 33) {arrListOut.add(33, "NULL");}
                        if (i == 34) {arrListOut.add(34, "NULL");}

                        if (i == 35) {arrListOut.add(35, arrListFromInp.get(32));}
                        if (i == 36) {arrListOut.add(36, arrListFromInp.get(33));}
                        if (i == 37) {arrListOut.add(37, arrListFromInp.get(34));}
                        if (i == 38) {arrListOut.add(38, arrListFromInp.get(35));}
                        if (i == 39) {
                            if (arrListFromInp.get(31).equals("No")) {arrListOut.add(35, "NULL");arrListOut.add(36, "NULL");arrListOut.add(37, "NULL");arrListOut.add(38, "NULL");}
                        }

                        if (i == 40) {arrListOut.add(39, arrListFromInp.get(52));}
                        if (i == 41) {arrListOut.add(40, arrListFromInp.get(53));}
                        if (i == 42) {arrListOut.add(41, arrListFromInp.get(54));}
                        if (i == 43) {arrListOut.add(42, arrListFromInp.get(55));}
                        if (i == 44) {arrListOut.add(43, arrListFromInp.get(56));}
                        if (i == 45) {
                            if (arrListFromInp.get(51).equals("No")) {arrListOut.add(39, "NULL");arrListOut.add(40, "NULL");arrListOut.add(41, "NULL");arrListOut.add(42, "NULL");arrListOut.add(43, "NULL");}
                        }

                        if (i == 46) {arrListOut.add(44, arrListFromInp.get(46));}
                        if (i == 47) {arrListOut.add(45, arrListFromInp.get(47));}
                        if (i == 48) {arrListOut.add(46, arrListFromInp.get(48));}
                        if (i == 49) {arrListOut.add(47, arrListFromInp.get(49));}
                        if (i == 50) {arrListOut.add(48, arrListFromInp.get(50));}
                        if (i == 51) {
                            if (arrListFromInp.get(45).equals("No")) {arrListOut.add(44, "NULL");arrListOut.add(45, "NULL");arrListOut.add(46, "NULL");arrListOut.add(47, "NULL");arrListOut.add(48, "NULL");}
                        }

                        if (i == 52) {arrListOut.add(49, arrListFromInp.get(39));}
                        if (i == 53) {arrListOut.add(50, arrListFromInp.get(41));}
                        if (i == 54) {arrListOut.add(51, arrListFromInp.get(42));}
                        if (i == 55) {arrListOut.add(52, arrListFromInp.get(38));}
                        if (i == 56) {arrListOut.add(53, arrListFromInp.get(37));}
                        if (i == 57) {arrListOut.add(54, arrListFromInp.get(40));}
                        if (i == 58) {arrListOut.add(55, arrListFromInp.get(43));}
                        if (i == 59) {
                            if (arrListFromInp.get(44).split(":")[0].equals("Marks")) {
                                arrListOut.add(56, arrListFromInp.get(44).split(":")[1]);
                            }
                            if (arrListFromInp.get(44).split(":")[0].equals("CGPA")) {
                                int xx = 0;
                                xx = (int) (Double.parseDouble(arrListFromInp.get(44).split(":")[1]) * 10.0);
                                arrListOut.add(56, Integer.toString(xx));
                            } 
                        }
                        if (i == 60) {
                            if (arrListFromInp.get(36).equals("No")) {arrListOut.add(49, "NULL");arrListOut.add(50, "NULL");arrListOut.add(51, "NULL");arrListOut.add(52, "NULL");arrListOut.add(53, "NULL");arrListOut.add(54, "NULL");arrListOut.add(55, "NULL");arrListOut.add(56, "NULL");}
                        }

                        if (i == 61) {
                            Calendar cal = Calendar.getInstance();
                            String time = arrListFromInp.get(58), timeFin = "";
                            String[] timeSplit = time.split(" ");
                            cal.setTime(new SimpleDateFormat("MMM").parse((timeSplit[0].split("-"))[1])); 
                            timeFin = (timeSplit[0].split("-"))[0] + new DecimalFormat("00").format((cal.get(Calendar.MONTH) + 1)) + (timeSplit[0].split("-"))[2] + (timeSplit[1].split(":"))[0] + (timeSplit[1].split(":"))[1] + (timeSplit[1].split(":"))[2]; 
                            arrListOut.add(57, timeFin);
                        }
                    }
                    
                    List<String> arrListOutFin = arrListOut.subList(0, 58);
                    String out = "";
                    for (String x : arrListOutFin)
                    {
                        out = out + x + ", ";
                    }
                    try(PrintWriter outt = new PrintWriter(new BufferedWriter(new FileWriter("./src/applicantDetails.txt", true)))) 
                    {
                        outt.print(out);
                        outt.println("\n");
                    }
                    catch (Exception e) {}
                }
                countLine++;
            }
                
        }
        catch (Exception e) {System.out.println("!!!");}
    }

}