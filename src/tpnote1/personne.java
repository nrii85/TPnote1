/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnes; //package tpnote1;

/**
 *
 * @author Henri
 */
public abstract class personne 
{

private String nom;
private String prenom;
public personne (String nom, String prenom)
{
    this.nom = validate(nom, 50);
    this.prenom =  validate(prenom, 30);
}
private String validate (String chaine, Integer taille)
{       // verifie a taille et renvoie une  chiane tronquée
        //  si la taille est supérieure à taille
return chaine; }
public String toString() {return this.nom + " " + this.prenom; }
    
}
