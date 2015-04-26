package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kheireddine on 24/04/2015.
 */

@XmlRootElement(name = "formation")
public class Formation {


    public String NameFormation;
    public  String date ;
    public  String universite;

   /*

    public String getNameFormation() {
        return NameFormation;
    }
   @XmlElement
    public void setDate(String date) {
        this.date = date;
    }

    @XmlElement
    public void setNameFormation(String nameFormation) {

        NameFormation = nameFormation;
    }

    public String getDate() {
        return date;
    }

    public String getUniversite() {
        return universite;
    }

    @XmlElement
    public void setUniversite(String universite) {
        this.universite = universite;
    }*/

    public Formation() {}

    public Formation(String NameFormation,String date,String universite){
        this.NameFormation= NameFormation;
        this.date=date;
        this.universite=universite;

    }

}
