/**
 * 
 */
/**
 * @author Mamadou NDIAYE
 * 
 */
import java.util.* ;


public class Medecin {
	public String Matricule ;
	public String Nom ;
	// dictionnaire Noss et Nom de tous les medecins
	static HashMap<String , String> medecinDict = new HashMap<String, String>() ;
	
	//constructeur Medicament
		public  Medecin( String Matricule , String Nom ) {
			this.Matricule = Matricule;
			this.Nom= Nom ;
			medecinDict.put(this.Matricule, this.Nom);//remplissage de la liste
		}
	
}