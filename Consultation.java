import java.util.*;


/**
 * 
 */
/**
 * @author Mamadou NDIAYE
 * 
 */
public class Consultation {
	String No ;
	String date ;
	String patientNoss  ;
	String medecinMatricule ;
	ArrayList<String>  consultationElement =  new ArrayList<String>();
	static HashMap<String , ArrayList<String>> consultationCarnet = new HashMap<String, ArrayList<String>>();
	
	//constructeur Consultation
		public  Consultation(String  No , String  date , String  NoSS , String Matricule) {
			this.No = No ;
			this.date = date ;
			this.patientNoss = NoSS ;
			this.medecinMatricule = Matricule ;

			// verifions si le patient , le medecin les .... sont dans le system
			if (Patient.patientDict.containsKey(this.patientNoss) && Medecin.medecinDict.containsKey(this.medecinMatricule)){
			
				this.consultationElement.add(this.No) ;
				this.consultationElement.add(this.date) ;
				this.consultationElement.add(this.medecinMatricule) ;
				this.consultationElement.add(this.patientNoss) ;
				
			}
			
			
		}
	
	public void prescrire( String medoc) {
		// maintenant on gere la prescription des medicaments
		// en gerant aussi si les medicament sont dans le systeme
		String input = medoc ;
		 if ( Medicament.medicamentDict.containsKey(input) ) {
				this.consultationElement.add(input) ;
				consultationCarnet.put(this.consultationElement.get(0) , this.consultationElement) ;
		}

	}

	
}