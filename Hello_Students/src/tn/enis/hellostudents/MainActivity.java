package tn.enis.hellostudents;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

  /**
   * 
   * C'est l'exemple le plus simple d'android Le "Hello World"
   * 
   * Cet exemple est basé sur des activités (sans fragments)
   * 
   */

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    // Cette ligne invoke la méthode (onCreate) du parent Activity
    // Et oui, c'est de l'orienté objet :p
    super.onCreate(savedInstanceState);

    // Cette méthode (fonction) charge l'interface graphique
    // Noter le chemin R -> layout -> activity_main
    // R est la racine de tous les ressources placés sous le répértoire "res"
    setContentView(R.layout.activity_main);
  }

}
