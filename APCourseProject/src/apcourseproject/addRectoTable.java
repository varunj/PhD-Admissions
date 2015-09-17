/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcourseproject;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author VarunJain
 */
public class addRectoTable {
    SimpleStringProperty enroll;
    SimpleStringProperty name;
    SimpleStringProperty link;
    SimpleStringProperty linkcv;
    SimpleStringProperty linksop;
    public addRectoTable(String enroll, String name,String link , String linkcv, String linksop)
    {
        this.enroll = new SimpleStringProperty(enroll);
        this.name = new SimpleStringProperty(name);
        this.link = new SimpleStringProperty(link);
        this.linkcv = new SimpleStringProperty(linkcv);
        this.linksop = new SimpleStringProperty(linksop);
    }
    public String getEnroll()
    {
            return enroll.get();
    }

    public String getName()
    {
            return name.get();
    }

    public String getLink()
    {
            return link.get();
    }
    
    public String getLinkcv()
    {
            return linkcv.get();
    }
    
    public String getLinksop()
    {
            return linksop.get();
    }

    public void setEnroll(String enroll)
    {
            this.enroll.set(enroll);
    }

    public void setName(String name)
    {
            this.name.set(name);
    }

    public void setLink(String link)
    {
            this.link.set(link);
    }
    
    public void setLinkcv(String linkcv)
    {
            this.linkcv.set(linkcv);
    }
    
    public void setLinksop(String linksop)
    {
            this.linksop.set(linksop);
    }
}
