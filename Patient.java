/**
 * 
 */
/**
 * @author Mamadou NDIAYE
 * 
 */
import java.util.* ;

public class Patient {
	public String NoSS  ;
	public String Nom ;
	// dictionnaire Noss et Nom de tous les patients
	static HashMap<String , String> patientDict = new HashMap<String, String>();
	
	
	//constructeur patient
	public  Patient( String NoSS , String Nom) {		
		this.NoSS = NoSS ;
		this.Nom = Nom ;
		patientDict.put(this.NoSS, this.Nom);
	}
	
}