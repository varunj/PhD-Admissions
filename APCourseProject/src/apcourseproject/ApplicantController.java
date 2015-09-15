/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcourseproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;
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
    private TextField t1text10;
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
    private TextField t2text12;
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
    private ComboBox<?> t2prefer1;
    @FXML
    private ComboBox<?> t2prefer2;
    @FXML
    private ComboBox<?> t2prefer3;
    @FXML
    private ComboBox<?> t2prefer4;
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
    private ComboBox<?> t2statedrop;
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
    private ComboBox<?> t2drop2;
    @FXML
    private RadioButton t2rb4;
    @FXML
    private TextField t2text34;
    //</editor-fold>
    /*todo mark red? + tab 2 ui end + checkAll2 + sanity checks + 2*hyperlinks
        nationity + state + pref ece + cp
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        t2drop1.getItems().clear();
        t2drop1.getItems().addAll(10, 4);
        t2drop1.getSelectionModel().selectFirst();
        t2text14.setDisable(true);
        t2text15.setDisable(true);
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
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                try
                {
                    int value;        
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
                    int value;    
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
                    int value;          
                    if (Double.parseDouble(newValue) > 100.0) t2text15.setText(oldValue);  
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
    }    
    
    @FXML
    private void userSubmitClick(ActionEvent event) {
        int checkAll = 1, checkAll2 = 1;
        String data = "";
        String uid = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
           
        if ((!t1text1.getText().equals("") && !t1text2.getText().equals("") && !t1text3.getText().equals("") && !t1text4.getText().equals("") && !t1text5.getText().equals("") && !t1text6.getText().equals("") && !t1text7.getText().equals("") && !t1text8.getText().equals("") && !t1text9.getText().equals("") && !t1text10.getText().equals("") && !t1text11.getText().equals("")) &&(t1rb1.isSelected() || t1rb2.isSelected() || t1rb3.isSelected()) &&(t1rb4.isSelected() || t1rb5.isSelected()) &&(t1rb6.isSelected() || t1rb7.isSelected() || t1rb8.isSelected() || t1rb9.isSelected()) &&(t1rb10.isSelected() || t1rb11.isSelected()) &&(!(t1dp.getValue() == null)) &&(t1rb12.isSelected() || t1rb13.isSelected()) == true )
        {
            t4warning.setVisible(false);
        }
        else
        {
            checkAll = 0;
            t4warning.setVisible(true);
        }
        if (true) 
        {
            t4warning2.setVisible(false);
        }
        else
        {
            checkAll2 = 0;
            t4warning2.setVisible(true);
        }
        
        if (checkAll == 1 && checkAll2 == 1) 
        {
            // tab 1 work------------------------------------------------------------------------------------------
            data = t1text1.getText() + ", " + t1text2.getText() + ", " + t1text3.getText() + ", " + t1text4.getText() + ", " + t1text5.getText() + ", ";
            if (t1rb1.isSelected() == true) data = data + "Computer Science" + ", ";
            if (t1rb2.isSelected() == true) data = data + "Electronics and Communication" + ", ";
            if (t1rb3.isSelected() == true) data = data + "Computational Biology" + ", ";
            data = data + t1text6.getText() + ", " + t1text7.getText() + ", " + t1text8.getText() + ", ";
            if (t1rb4.isSelected() == true) data = data + "Male" + ", ";
            if (t1rb5.isSelected() == true) data = data + "Female" + ", ";
            if (t1rb6.isSelected() == true) data = data + "General" + ", ";
            if (t1rb7.isSelected() == true) data = data + "SC" + ", ";
            if (t1rb8.isSelected() == true) data = data + "ST" + ", ";
            if (t1rb9.isSelected() == true) data = data + "OBC" + ", ";
            if (t1rb10.isSelected() == true) data = data + "Yes" + ", ";
            if (t1rb11.isSelected() == true) data = data + "No" + ", ";
            data = data + t1dp.getValue().getYear() + "/" + t1dp.getValue().getMonthValue() + "/" + t1dp.getValue().getDayOfMonth() + ", ";
            if (t1rb12.isSelected() == true) data = data + "Yes" + ", ";
            if (t1rb13.isSelected() == true) data = data + "No" + ", ";
            data = data + t1text9.getText() + ", " + t1text10.getText() + ", " + t1text11.getText() + ", ";
            if (t1text12.getText().equals("")) data = data + "NULL" + ", ";
            else                               data = data + t1text12.getText() + ", ";
            
            // tab 2 work------------------------------------------------------------------------------------------
            data = data + t2text1.getText() + ", " + t2text2.getText() + ", " + t2text3.getText() + ", " + t2text4.getText() + ", " + t2text5.getText() + ", " + t2text6.getText() + ", " + t2text7.getText() + ", " + t2text8.getText() + ", " + t2text9.getText() + ", " + t2text10.getText() + ", " + t2text11.getText() + ", " + t2text12.getText() + ", " + t2text13.getText() + ", ";
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
    
}