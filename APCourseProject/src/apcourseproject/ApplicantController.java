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
import java.time.LocalDate;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author VarunJain
 */
public class ApplicantController implements Initializable {
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
    private CheckBox t2cb3;
    @FXML
    private CheckBox t2cb4;
    @FXML
    private CheckBox t2cb1;
    @FXML
    private CheckBox t2cb2;
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
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void userSubmitClick(ActionEvent event) {
        int checkAll = 0;
        
        /*@todo*/ // do this mark red + if ok then false visible + some things not necessary + fix uid
        if ((!t1text1.getText().equals("") && !t1text2.getText().equals("") && !t1text3.getText().equals("") && !t1text4.getText().equals("") && !t1text5.getText().equals("") && !t1text6.getText().equals("") && !t1text7.getText().equals("") && !t1text8.getText().equals("") && !t1text9.getText().equals("") && !t1text10.getText().equals("") && !t1text11.getText().equals("") && !t1text12.getText().equals("")) &&(t1rb1.isSelected() || t1rb2.isSelected() || t1rb3.isSelected()) &&(t1rb4.isSelected() || t1rb5.isSelected()) &&(t1rb6.isSelected() || t1rb7.isSelected() || t1rb8.isSelected() || t1rb9.isSelected()) &&(t1rb10.isSelected() || t1rb11.isSelected()) &&(!(t1dp.getValue() == null)) &&(t1rb12.isSelected() || t1rb13.isSelected()) == true )
        {
            checkAll = 1;
            t4warning.setVisible(false);
        }
        else
        {
            t4warning.setVisible(true);
        }
        // tab 1 data
	String data = "";
        String uid = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
        System.out.println(uid);
        data = data + uid + ", ";
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
        if (t2text14.getText().equals("")) data = data + "NULL" + ", ";
        else                               data = data + t2text14.getText() + ", ";                                          
        // tab 2 data
        data = data + t2text1.getText() + ", " + t2text2.getText() + ", " + t2text3.getText() + ", " + t2text4.getText() + ", " + t2text5.getText() + ", " + t2text6.getText() + ", ";
        data = data + t2text7.getText() + ", " + t2text8.getText() + ", " + t2text9.getText() + ", " + t2text10.getText() + ", " + t2text11.getText() + ", " + t2text12.getText() + ", " + t2text13.getText() + ", ";
        if (t2rb1.isSelected() == true) data = data + t2text14.getText() + ", ";
        if (t2rb2.isSelected() == true) data = data + t2text14.getText() + ", ";
        /*@todo*/ //tab2 optional stuff      
        if (t2text16.getText().equals("")) data = data + "NULL" + ", ";
        else                               data = data + t2text16.getText() + ", ";
        /*@todo*/ //tab2 file desc
        
        // // tab 3 data
        // if (t3rb1.isSelected() == true) data = data + "Advertisement in Dainik Jagran" + ", ";
        // if (t3rb2.isSelected() == true) data = data + "PhD Flier" + ", ";
        // if (t3rb3.isSelected() == true) data = data + "IIITD Website" + ", ";
        // if (t3rb4.isSelected() == true) data = data + "Other Website" + ", ";
        // if (t3rb5.isSelected() == true) data = data + "Talk/ Presentation" + ", ";
        // if (t3rb6.isSelected() == true) data = data + "College/Teacher/Academic Relation" + ", ";
        // if (t3rb7.isSelected() == true) data = data + "Friend/Family/Personal Relations" + ", ";
        // if (t3rb8.isSelected() == true) data = data + "Other" + ", ";
        // if (t3cb1.isSelected() == true) data = data + "Faculty Profile" + "& ";
        // if (t3cb2.isSelected() == true) data = data + "Aligned research area/projects" + "& ";
        // if (t3cb3.isSelected() == true) data = data + "Collaborative PhD prorgamme" + "& ";
        // if (t3cb4.isSelected() == true) data = data + "No GATE requirement" + "& ";
        // if (t3cb5.isSelected() == true) data = data + "Attractive stripend and other benefits" + "& ";
        // if (t3cb6.isSelected() == true) data = data + "Located in Delhi" + "& ";
        // if (t3cb7.isSelected() == true) data = data + "May not get into IIT" + "& ";
        // if (t3cb8.isSelected() == true) data = data + "I want to do PhD, IIITD is one good option" + "& ";
        // if (t3cb9.isSelected() == true) data = data + "None of the above" + "& ";
        // data = data + ", ";
        
        
        // tab 4 work
        if (checkAll == 1)
        {
            try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("./src/applicantDetails.txt", true)))) 
            {
                out.print(data);
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
    
    
    
}

