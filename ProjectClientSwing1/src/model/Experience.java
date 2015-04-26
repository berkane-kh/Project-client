package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kheireddine on 24/04/2015.
 */

@XmlRootElement(name = "experience")
public class Experience {

    public String nameExper;
    public String dateExper;
    public String lieuExper;



   /*

     public String getLieuExper() {
        return lieuExper;
    }


    @XmlElement
    public void setLieuExper(String lieuExper) {
        this.lieuExper = lieuExper;
    }

    public String getDateExper() {
        return dateExper;
    }

    @XmlElement
    public void setDateExper(String dateExper) {
        this.dateExper = dateExper;
    }

    public String getNameExper() {
        return nameExper;
    }

    @XmlElement
    public void setNameExper(String nameExper) {
        this.nameExper = nameExper;
    }

*/

    public  Experience() {}

    public Experience(String nameExper,String dateExper,String lieuExper){
       this.nameExper=nameExper;
        this.dateExper=dateExper;
        this.lieuExper=lieuExper;

    }

}
