package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.http.HTTPBinding;

import model.CV_Test;
import model.CentreInteret;
import model.Experience;
import model.Formation;
import model.Langue;
import model.ListCV;
import sun.net.www.http.HttpClient;

public class MyClient {
	

    public static ListCV getCvs () throws IOException, JAXBException{
    
        URL url = new URL("https://project-server-rest.herokuapp.com/rest/resume/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/xml");

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String apiOutput = br.readLine();
       // System.out.println(apiOutput);
        conn.disconnect();

        JAXBContext jaxbContext = JAXBContext.newInstance(ListCV.class,CV_Test.class,Experience.class, Formation.class,Langue.class,CentreInteret.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        ListCV listeDeCV = (ListCV) jaxbUnmarshaller.unmarshal(new StringReader(apiOutput));
        
        return listeDeCV;

    }
    
    /**
     * Fonction qui récupère un CV à partir d'un ID
     * 
     * @param id
     * @return
     * @throws IOException
     * @throws JAXBException 
     */
    public static CV_Test getCvId(String id) throws IOException, JAXBException{
        
        URL url = new URL("https://project-server-rest.herokuapp.com/rest/resume/"+id);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/xml");

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String apiOutput = br.readLine();
       // System.out.println(apiOutput);
        conn.disconnect();

        JAXBContext jaxbContext = JAXBContext.newInstance(ListCV.class,CV_Test.class,Experience.class, Formation.class,Langue.class,CentreInteret.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        CV_Test cv = (CV_Test) jaxbUnmarshaller.unmarshal(new StringReader(apiOutput));
        
        return cv;
        
    
    }

     public static void PostCv () throws IOException, JAXBException{
       
         String url = "http://localhost:8080/tpSpring-1.0-SNAPSHOT/rest/resume/add)";
         
       /* Service service;
        JAXBContext jc;
        QName qname = new QName("", "");
        service = Service.create(qname);
        service.addPort(qname, HTTPBinding.HTTP_BINDING, url);
        Dispatch<Source> dispatcher = service.createDispatch(qname,
                Source.class, Service.Mode.MESSAGE);
        Map<String, Object> requestContext = dispatcher.getRequestContext();
        requestContext.put(MessageContext.HTTP_REQUEST_METHOD, "POST");
        
        /***********************  Creation CV ***********/
        CV_Test cv = new CV_Test();
        cv.name="CRB";
        cv.prenom="Arsenal";
        cv.dateNaiss="12/12/12";
        cv.adresse="rouen france";
        cv.tel="0124587";
        //Formation
        cv.listeForm.add(new Formation("F1","F2","F3") );
        //Experience
        cv.listeExper.add(new Experience("EXP1","01-02","lieu1"));
        //Centre interet
        cv.listeCentr.add(new CentreInteret("Sport"));
        //Langue
        cv.listeLang.add(new Langue("Arabe", "langue maternelle"));
       /* jc = JAXBContext.newInstance(ListCV.class,CV_Test.class,Experience.class, Formation.class,Langue.class,CentreInteret.class);
        
        try {
                dispatcher.invoke(new JAXBSource(jc, cv ));
            } catch (Exception e) {
                //
            }*/

        

     }
    
	

}
