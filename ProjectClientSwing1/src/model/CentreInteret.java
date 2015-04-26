package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kheireddine on 24/04/2015.
 */

@XmlRootElement(name = "CentreInteret")
public class CentreInteret {
    public  String loisir;

    public CentreInteret(){}

    public CentreInteret(String loisir){
        this.loisir=loisir;
    }

   /* public String getLoisir() {
        return loisir;
    }

    @XmlElement
    public void setLoisir(String loisir) {
        this.loisir = loisir;
    }*/
}
