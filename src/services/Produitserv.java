/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import entities.Produit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import utilities.Statics;

/**
 *
 * @author zaiir
 */
/*public class Produitserv {
    //singleton 
    public static Produitserv instance = null ;
    
    public static boolean resultOk = true;

    //initilisation connection request 
    private ConnectionRequest req;
    
    
    public static Produitserv getInstance() {
        if(instance == null )
            instance = new Produitserv();
        return instance ;
    }
    
    
    
    public Produitserv() {
        req = new ConnectionRequest();
        
    }
    
    
    //ajout 
    public void ajoutReclamation(Produit prod) {
        
        //String url =Statics.BASE_URL+"/addReclamation?objet="+prod.getNom_produit()+"&description="+prod.getDescription()+"&user="+prod.getIduser(); // aa sorry n3adi getId lyheya mech ta3 user ta3 reclamation
        String url =Statics.BASE_URL+"/ajouter";
        req.setUrl(url);
        req.addResponseListener((e) -> {
            
            String str = new String(req.getResponseData());//Reponse json hethi lyrinaha fi navigateur 9bila
            System.out.println("data == "+str);
        });
        
        NetworkManager.getInstance().addToQueueAndWait(req);//execution ta3 request sinon yet3ada chy dima nal9awha
        
    }
    
    
    //affichage
    
    public ArrayList<Produit>affichageReclamations() {
        ArrayList<Produit> result = new ArrayList<>();
        
        String url = Statics.BASE_URL+"/list_produit_front_Json";
        req.setUrl(url);
        
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                JSONParser jsonp ;
                jsonp = new JSONParser();
                
                try {
                    Map<String,Object>mapReclamations = jsonp.parseJSON(new CharArrayReader(new String(req.getResponseData()).toCharArray()));
                    
                    List<Map<String,Object>> listOfMaps =  (List<Map<String,Object>>) mapReclamations.get("root");
                    
                    for(Map<String, Object> obj : listOfMaps) {
                        Produit re = new Produit();
                        
                        //dima id fi codename one float 5outhouha
                        float id = Float.parseFloat(obj.get("id").toString());
                        
                        String objet = obj.get("objet").toString();
                        
                        String description = obj.get("description").toString();
                        //float etat = Float.parseFloat(obj.get("etat").toString());
                        
                        re.setId_produit((int)id);
                        re.setNom_produit(objet);
                        re.setDescription(description);
                        //re.setCategorie_produit(etat);
                        
                     
                        
                        //insert data into ArrayList result
                        result.add(re);
                       
                    
                    }
                    
                }catch(Exception ex) {
                    
                    ex.printStackTrace();
                }
            
            }
        });
        
      NetworkManager.getInstance().addToQueueAndWait(req);//execution ta3 request sinon yet3ada chy dima nal9awha

        return result;
        
        
    }
}*/
