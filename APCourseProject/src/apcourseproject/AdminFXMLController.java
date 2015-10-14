/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcourseproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.time.LocalDate;
import java.time.chrono.HijrahChronology;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;
import javafx.util.StringConverter;

/**
 * FXML Controller class
 *
 * @author VarunJain
 */
public class AdminFXMLController implements Initializable {
    // <editor-fold defaultstate="collapsed" desc=" ComponentInitialisation ">

    @FXML
    private TextField at1text1;
    @FXML
    private TextField at1text2;
    @FXML
    private TextField at1text3;
    @FXML
    private ComboBox<String> at1drop1;
    @FXML
    private RadioButton at1rb1;
    @FXML
    private RadioButton at1rb2;
    @FXML
    private RadioButton at1rb3;
    @FXML
    private RadioButton at1rb4;
    @FXML
    private RadioButton at1rb5;
    @FXML
    private RadioButton at1rb6;
    @FXML
    private RadioButton at1rb7;
    @FXML
    private DatePicker at1date;
    @FXML
    private ComboBox<String> at2drop1;
    @FXML
    private ComboBox<String> at2drop2;
    @FXML
    private ComboBox<String> at2drop3;
    @FXML
    private ComboBox<String> at2drop4;
    @FXML
    private ComboBox<String> a2drop6;
    @FXML
    private ComboBox<String> a2drop7;
    @FXML
    private RadioButton at2r1;
    @FXML
    private ToggleGroup t2grp1;
    @FXML
    private RadioButton at2r2;
    @FXML
    private RadioButton at2r3;
    @FXML
    private RadioButton at2r4;
    @FXML
    private ToggleGroup t2grp2;
    @FXML
    private RadioButton at2r5;
    @FXML
    private RadioButton at2r6;
    @FXML
    private RadioButton at2r7;
    @FXML
    private ToggleGroup t2grp3;
    @FXML
    private RadioButton at2r8;
    @FXML
    private RadioButton at2r9;
    @FXML
    private RadioButton at2r10;
    @FXML
    private ToggleGroup t2grp4;
    @FXML
    private RadioButton at2r11;
    @FXML
    private RadioButton at2r12;
    @FXML
    private RadioButton at2r13;
    @FXML
    private ToggleGroup t2grp5;
    @FXML
    private RadioButton at2r14;
    @FXML
    private RadioButton at2r15;
    @FXML
    private ToggleGroup at1grp1;
    @FXML
    private ToggleGroup at1grp2;
    @FXML
    private ToggleGroup at1grp3;
    @FXML
    private ComboBox<String> at2drop5;
    @FXML
    private TextField a2text1;
    @FXML
    private TextField at2text2;
    @FXML
    private ComboBox<String> at2drop8;
    @FXML
    private ComboBox<String> at2drop9;
    @FXML
    private TextField at2text3;
    @FXML
    private TextField at2text4;
    @FXML
    private TextField at2text5;
    @FXML
    private TextField at2text6;
    @FXML
    private TextField at2text7;
    @FXML
    private DatePicker at3dp1;
    @FXML
    private DatePicker at3dp2;
    @FXML
    private Button at3filter;
    
    ArrayList<String[]> records = new ArrayList<String[]>();
    ArrayList<String[]> recordsFiltered = new ArrayList<String[]>();

// </editor-fold>

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // t1 drop down category
        at1drop1.getItems().clear();
        at1drop1.getItems().addAll("NULL" ,"General", "SC", "ST", "OBC");
        // t2 drop down category
        at2drop1.getItems().clear();
        at2drop1.getItems().addAll("Computer Science", "Electronics and Communication", "Computational Biology");
        // t2 drop down category
        at2drop2.getItems().clear();
        at2drop2.getItems().addAll("BTech");
        // t2 drop down category
        at2drop3.getItems().clear();
        at2drop3.getItems().addAll("MTech");
        // t2 drop down category
        at2drop4.getItems().clear();
        at2drop4.getItems().addAll("CBSE", "IB");
        // t2 drop down category
        at2drop5.getItems().clear();
        at2drop5.getItems().addAll("CBSE", "IB");
        // t2 drop down category
        a2drop6.getItems().clear();
        a2drop6.getItems().addAll("Computer Science", "Electronics and Communication", "Computational Biology");
        // t2 drop down category
        a2drop7.getItems().clear();
        a2drop7.getItems().addAll("Computer Science", "Electronics and Communication", "Computational Biology");
        // t2 drop down category
        at2drop8.getItems().clear();
        at2drop8.getItems().addAll("Delhi", "Haryana", "Uttar Pradesh", "Jammu and Kashmir", "Uttrakhand", "Assam");
        // t2 drop down category
        at2drop9.getItems().clear();
        at2drop9.getItems().addAll("Delhi", "Haryana", "Uttar Pradesh", "Jammu and Kashmir", "Uttrakhand", "Assam");
        // t1 date
        at1date.setValue(LocalDate.now());
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
        at1date.setDayCellFactory(dayCellFactory);
        // t2 date
        at3dp1.setValue(LocalDate.now());
        Callback<DatePicker, DateCell> dayCellFactory2 = dp -> new DateCell()
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
        at3dp1.setDayCellFactory(dayCellFactory2);
        // t2 date
        at3dp2.setValue(LocalDate.now());
        Callback<DatePicker, DateCell> dayCellFactory3 = dp -> new DateCell()
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
        at3dp2.setDayCellFactory(dayCellFactory3);      
    }    

    @FXML
    private void submitClick(ActionEvent event) throws IOException {
        records.clear();
        recordsFiltered.clear();
        BufferedReader fileStream = null;
        String eachRec = "";
        try
        {
            fileStream = new BufferedReader(new FileReader("./src/applicantDetails.txt"));
            while ((eachRec = fileStream.readLine()) != null)
            {
                if (!eachRec.equals(""))
                {
                    eachRec = eachRec + "1, ";
                    records.add(eachRec.split(", "));
                }
            }
        }
        catch (Exception e) {}
        //-----------------------------------------------------------------------------------------------------
        // tab 1 work------------------------------------------------------------------------------------------
        // email
        if (!at1text1.getText().equals(""))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[0].equals(at1text1.getText())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // name
        if (!at1text2.getText().equals(""))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[1].equals(at1text2.getText())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // enr id
        if (!at1text3.getText().equals(""))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[2].equals(at1text3.getText())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // cat
        if (at1drop1.getValue() != null)
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[10].equals(at1drop1.getValue())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // gender
        if ((at1rb1.isSelected() == true) || (at1rb2.isSelected() == true))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if ((at1rb1.isSelected() == true) && (records.get(i)[9].equals("Female")))
                {
                    records.get(i)[58] = "0";
                }
                if ((at1rb2.isSelected() == true) && (records.get(i)[9].equals("Male")))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // physically tutahua
        if ((at1rb3.isSelected() == true) || (at1rb4.isSelected() == true))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if ((at1rb3.isSelected() == true) && (records.get(i)[11].equals("No")))
                {
                    records.get(i)[58] = "0";
                }
                if ((at1rb4.isSelected() == true) && (records.get(i)[11].equals("Yes")))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // date
        if ((at1rb5.isSelected() == true) || (at1rb6.isSelected() == true) || (at1rb7.isSelected() == true))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (at1rb5.isSelected() == true && (LocalDate.parse(records.get(i)[12]).isAfter(at1date.getValue())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at1rb6.isSelected() == true && (LocalDate.parse(records.get(i)[12]).isEqual(at1date.getValue())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at1rb7.isSelected() == true && (LocalDate.parse(records.get(i)[12]).isBefore(at1date.getValue())) )
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // tab 2 work------------------------------------------------------------------------------------------
        // ayush ko nahi likhne denge
        // phd stream
        if (at2drop1.getValue() != null)
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[5].equals(at2drop1.getValue())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // grad deg
        if (at2drop2.getValue() != null)
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[24].equals(at2drop2.getValue())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // grad deg
        if (at2drop2.getValue() != null)
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[24].equals(at2drop2.getValue())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // post grad deg
        if (at2drop3.getValue() != null)
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[53].equals(at2drop3.getValue())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // x board
        if (at2drop4.getValue() != null)
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[18].equals(at2drop4.getValue())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // xii board
        if (at2drop5.getValue() != null)
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[21].equals(at2drop5.getValue())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // grad dept
        if (a2drop6.getValue() != null)
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[25].equals(a2drop6.getValue())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // post grad dept
        if (a2drop7.getValue() != null)
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[52].equals(a2drop7.getValue())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // grad state
        if (at2drop8.getValue() != null)
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[29].equals(at2drop8.getValue())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // post grad state
        if (at2drop9.getValue() != null)
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[51].equals(at2drop9.getValue())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // University of Graduation
        if (!a2text1.getText().equals(""))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[26].equals(a2text1.getText())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // post grad univ
        if (!at2text2.getText().equals(""))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (!(records.get(i)[49].equals(at2text2.getText())))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // x percent
        if ((at2r1.isSelected() == true) || (at2r2.isSelected() == true) || (at2r3.isSelected() == true))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (at2r1.isSelected() == true && (Double.parseDouble(records.get(i)[19]) < Double.parseDouble(at2text3.getText())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at2r2.isSelected() == true && (Double.parseDouble(records.get(i)[19]) > Double.parseDouble(at2text3.getText())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at2r3.isSelected() == true && ((Double.compare(Double.parseDouble(records.get(i)[19]), Double.parseDouble(at2text3.getText()))) != 0 ))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // xii percent
        if ((at2r4.isSelected() == true) || (at2r5.isSelected() == true) || (at2r6.isSelected() == true))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (at2r4.isSelected() == true && (Double.parseDouble(records.get(i)[22]) < Double.parseDouble(at2text4.getText())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at2r5.isSelected() == true && (Double.parseDouble(records.get(i)[22]) > Double.parseDouble(at2text4.getText())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at2r6.isSelected() == true && ((Double.compare(Double.parseDouble(records.get(i)[22]), Double.parseDouble(at2text4.getText()))) != 0 ))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // grad percent
        if ((at2r7.isSelected() == true) || (at2r8.isSelected() == true) || (at2r9.isSelected() == true))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (at2r7.isSelected() == true && (Double.parseDouble(records.get(i)[31]) < Double.parseDouble(at2text5.getText())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at2r8.isSelected() == true && (Double.parseDouble(records.get(i)[31]) > Double.parseDouble(at2text5.getText())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at2r9.isSelected() == true && ((Double.compare(Double.parseDouble(records.get(i)[31]), Double.parseDouble(at2text5.getText()))) != 0 ))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // post grad percent
        if ((at2r10.isSelected() == true) || (at2r11.isSelected() == true) || (at2r12.isSelected() == true))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (at2r10.isSelected() == true && (Double.parseDouble(records.get(i)[56]) < Double.parseDouble(at2text6.getText())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at2r11.isSelected() == true && (Double.parseDouble(records.get(i)[56]) > Double.parseDouble(at2text6.getText())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at2r12.isSelected() == true && ((Double.compare(Double.parseDouble(records.get(i)[56]), Double.parseDouble(at2text6.getText()))) != 0 ))
                {
                    records.get(i)[58] = "0";
                }
            }
        }
        // gate percent
        if ((at2r13.isSelected() == true) || (at2r14.isSelected() == true) || (at2r15.isSelected() == true))
        {
            for (int i = 0; i < records.size(); i++)
            {
                if (at2r13.isSelected() == true && (Double.parseDouble(records.get(i)[42]) < Double.parseDouble(at2text7.getText())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at2r14.isSelected() == true && (Double.parseDouble(records.get(i)[42]) > Double.parseDouble(at2text7.getText())) )
                {
                    records.get(i)[58] = "0";
                }
                if (at2r15.isSelected() == true && ((Double.compare(Double.parseDouble(records.get(i)[42]), Double.parseDouble(at2text7.getText()))) != 0 ))
                {
                    records.get(i)[58] = "0";
                }
            }
        }

        // tab 3 work------------------------------------------------------------------------------------------
        // date
        for (int i = 0; i < records.size(); i++)
        {
            String toProcess = records.get(i)[57];
            String newDate = toProcess.substring(0, 4) + "-" + toProcess.substring(4, 6) + "-" + toProcess.substring(6, 8);
            LocalDate date = LocalDate.parse(newDate);
            if ((date.isBefore(at3dp1.getValue())) || (date.isAfter(at3dp2.getValue())) )
            {
                records.get(i)[58] = "0";
            }
        }
        // make new arraylist
        for (int i = 0; i < records.size(); i++)
        {
            if (records.get(i)[58].equals("1"))
            {
                recordsFiltered.add(records.get(i));
            }
        }

//        for (int i = 0; i < recordsFiltered.size(); i++)
//        {
//            for (int ii = 0; ii < recordsFiltered.get(i).length; ii++)
//            {
//                System.out.print(recordsFiltered.get(i)[ii] + "   ");
//            }
//            System.out.println("");
//        }

        // clear folder
        File toClr = new File("./archiveTxt//");
        File[] files = toClr.listFiles();
        if(files != null) 
        {
            for (File f: files) 
            {
                
                f.delete();
            }
        }

        // make new individual files
        for (int i = 0; i < recordsFiltered.size(); i++)
        {
            try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("./archiveTxt//" + recordsFiltered.get(i)[57] +".txt", true)))) 
            {
                for (int ii = 0; ii < recordsFiltered.get(i).length; ii++)
                {
                    out.print(recordsFiltered.get(i)[ii]);
                    out.print(", ");
                }
            }
            catch (Exception e) {}
        
        }
        for (int i = 0; i < recordsFiltered.size(); i++)
        {
            try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("./archiveTxt//cumm.txt", true)))) 
            {
                for (int ii = 0; ii < recordsFiltered.get(i).length; ii++)
                {
                    out.print(recordsFiltered.get(i)[ii]);
                    out.print(", ");
                }
                out.println("\n");
            }
            catch (Exception e) {}
        
        }

        
        // open table window
        Parent parent = FXMLLoader.load(getClass().getResource("/apcourseproject/tableFXML.fxml"));
        Scene scene = new Scene(parent);
        APCourseProject.stage2.setScene(scene);
        APCourseProject.stage2.show();
        

    }

    
}
