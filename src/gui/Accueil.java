/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;

/**
 *
 * @author zaiir
 */

    public class Accueil extends Form {

    public Accueil() {
        super("accueil");

        Toolbar tb = this.getToolbar();
        this.add(new com.codename1.ui.Label("Accueil Produit"));

       //  System.setProperty("com.codename1.io.disableSSLVerification", "true");


       tb.addMaterialCommandToSideMenu("Produit", FontImage.MATERIAL_GAMEPAD, (ActionListener) (ActionEvent evt) -> {
            ProduitView mysportGui = new ProduitView();
            mysportGui.show();
        });

       /* tb.addMaterialCommandToSideMenu("Commande", FontImage.MATERIAL_PEOPLE, (ActionListener) (ActionEvent evt) -> {
            CoachingGui coachingGui = new CoachingGui();
            coachingGui.show();
       });*/
          tb.addMaterialCommandToSideMenu("Liste Produit", FontImage.MATERIAL_FAVORITE, (ActionListener) (ActionEvent evt) -> {
            ProduitListView favorisGui = new ProduitListView();
            favorisGui.show();
       });


        this.show();
    }

}
    

