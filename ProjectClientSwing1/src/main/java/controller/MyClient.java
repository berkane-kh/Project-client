package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import model.CV_Test;
import model.CentreInteret;
import model.Experience;
import model.Formation;
import model.Langue;
import model.ListCV;


/**
 * Created by kheireddine on 26/04/2015.
 */
public class MyClient {

    /**
     *
     * Methode qui permet d'appeler le serveur pour récupérer la liste des CVs
     *
     * @return
     * @throws IOException
     * @throws JAXBException
     */
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
     * Methode  qui permet d'appler le serveur pour récupèrer un CV à partir d'un ID
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

    /**
     *
     * Methode qui permet d'appeler le service pour ajouter un CV
     *
     * @param cv_test
     * @throws IOException
     * @throws JAXBException
     */
    public static void PostCv (CV_Test cv_test) throws IOException, JAXBException{

        String url = "https://project-server-rest.herokuapp.com/rest/resume/add)";
        JAXBContext jaxbContext = JAXBContext.newInstance(ListCV.class,CV_Test.class,Experience.class, Formation.class,Langue.class,CentreInteret.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

        Client client = Client.create();
        WebResource webResource = client.resource("https://project-server-rest.herokuapp.com/rest/resume/add");
        ClientResponse send = webResource.accept("application/xml").post(ClientResponse.class , cv_test);


    }


}
