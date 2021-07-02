

/**
 * 
 */
/**
 * @author Mamadou NDIAYE
 * 
 */
import java.util.* ;

public class Medicament {
	public String Code ;
	public String Libelle ;
	// dictionnaire Noss et Nom de tous les patients
	static HashMap<String , String> medicamentDict  = new HashMap<String, String>() ;
	
	//constructeur Medicament
	public  Medicament( String Code , String Libelle ) {
			
		this.Code = Code ;
		this.Libelle = Libelle ;
		medicamentDict.put(this.Code, this.Libelle);
	}
}