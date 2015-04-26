package model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kheireddine on 16/04/2015.
 */
@XmlRootElement
public class ListCV {

    public List<CV_Test> listecv = new ArrayList<CV_Test>();

    public void addCv(CV_Test cv) {
        this.listecv.add(cv);
    }

    public List<CV_Test> getListecv() {
        return listecv;
    }

    public ListCV(){

        listecv = new ArrayList<CV_Test>();
        List<Formation> formations = new ArrayList<Formation>();
        List<Experience> experiences = new ArrayList<Experience>();
        List<CentreInteret> centreInterets = new ArrayList<CentreInteret>();
        List<Langue> langues = new ArrayList<Langue>();

        /************ Formations *****************/
        formations.add(new Formation("Diplome Master informatique", "2011-2013", "universite Alger"));
        formations.add(new Formation("Diplome Licence informatique", "2008-2011", "universite Alger"));
        formations.add(new Formation("Baccalaureat", "2008", "Lycee ALger "));

        /************ Experience *****************/
        experiences.add(new Experience("Developpeur Delphi", "2013-2014", "Presence IT (Alger)"));
        experiences.add(new Experience("Stage Licence", "2011", "Banque AGB (Alger)"));

        /************ CentreInteret *****************/
        centreInterets.add(new CentreInteret("Nouvelles technologies"));
        centreInterets.add(new CentreInteret("Films"));
        centreInterets.add(new CentreInteret("Sport"));

        /************ Langues *****************/
        langues.add(new Langue("Arabe", "tres bon"));
        langues.add(new Langue("Français", "tres Bon"));
        langues.add(new Langue("Anglais", "Intermediare"));


        /************** Liste de CV  **********/

        listecv.add(new CV_Test("Ber1","Kheiro1","01/01/1900","rouen France","076666666",formations,experiences,centreInterets,langues));
        listecv.add(new CV_Test("Ber2","Kheiro2","01/01/1900","rouen France","076666666",formations,experiences,centreInterets,langues));
        listecv.add(new CV_Test("Ber3","Kheiro3","01/01/1900","rouen France","076666666",formations,experiences,centreInterets,langues));
        listecv.add(new CV_Test("Ber4","Kheiro4","01/01/1900","rouen France","076666666",formations,experiences,centreInterets,langues));


    }


}
