package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kheireddine on 24/04/2015.
 */

@XmlRootElement(name = "langue")
public class Langue {
    public  String nameLangue;
    public  String niveau;



   /*

   public String getNameLangue() {
        return nameLangue;
    }

   @XmlElement
    public void setNameLangue(String nameLangue) {
        this.nameLangue = nameLangue;
    }

    public String getNiveau() {
        return niveau;
    }

    @XmlElement
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }*/

    public Langue() {}

    public Langue(String nameLangue,String niveau) {
        this.nameLangue=nameLangue;
        this.niveau=niveau;

    }

}
