package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kheireddine on 16/04/2015.
 */
@XmlRootElement(name = "resume")
public class CV_Test {



    public String name;
    public String prenom;
    public String dateNaiss;
    public String adresse;
    public String tel;
    public List<Formation> listeForm = new ArrayList<Formation>();
    public List<Experience> listeExper = new ArrayList<Experience>();
    public List<CentreInteret> listeCentr = new ArrayList<CentreInteret>();
    public List<Langue> listeLang = new ArrayList<Langue>();

    public CV_Test() {}

    public CV_Test(String name,String prenom,String dateNaiss,String adresse,String tel,List<Formation> listeForm,List<Experience> listeExper,List<CentreInteret> listeCentr,List<Langue> listeLang ) {
        this.name=name;
        this.prenom=prenom;
        this.dateNaiss=dateNaiss;
        this.adresse=adresse;
        this.tel=tel;
        this.listeForm=listeForm;
        this.listeExper=listeExper;
        this.listeCentr=listeCentr;
        this.listeLang=listeLang;

    }

   /* public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    @XmlElement
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    @XmlElement
    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getAdresse() {
        return adresse;
    }

    @XmlElement
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    @XmlElement
    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Formation> getListeForm() {
        return listeForm;
    }

    @XmlElement
    public void setListeForm(List<Formation> listeForm) {
        this.listeForm = listeForm;
    }

    public List<Experience> getListeExper() {
        return listeExper;
    }

    @XmlElement
    public void setListeExper(List<Experience> listeExper) {
        this.listeExper = listeExper;
    }

    public List<CentreInteret> getListeCentr() {
        return listeCentr;
    }

    @XmlElement
    public void setListeCentr(List<CentreInteret> listeCentr) {
        this.listeCentr = listeCentr;
    }

    public List<Langue> getListeLang() {
        return listeLang;
    }

    @XmlElement
    public void setListeLang(List<Langue> listeLang) {
        this.listeLang = listeLang;
    }
    */




}
