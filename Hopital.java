/**
 * 
 */
/**
 * @author Mamadou NDIAYE
 *
 */


public class Hopital {
	/* POUR TESTER UNE FONCTIONNALITE VEUILLEZ DECOMMENTER LA FONCTION CORRESPONDANTE EN BAS DE CETTE CLASSE
			REMARQUE : TESTEZ UNE SEULE FONCTIONNALITE A LA FOIS
	*/
	public static void main(String[] args) {
		new Patient("0001" , "mamadou ndiaye") ;
		new Patient("0002" , "demba diop") ; 
		new Patient("0003" , "Astou Faye") ; 
		new Medicament("001"  , "paracetamol") ;
		new Medicament("002"  , "panadol") ;
		new Medicament("003"  , "doliprane") ;
		new Medecin("00M1","docteur DIOP") ;
		new Medecin("00M2","docteur FAYE") ;
		new Medecin("00M3","docteur NDIAYE") ;
		Consultation cons1 = new Consultation( "1" , "30/06/2021" , "0001" , "00M1") ;
		cons1.prescrire("001");
		cons1.prescrire("002");
		Consultation cons2 = new Consultation( "2" , "30/07/2021" , "0002" , "00M3") ;
		cons2.prescrire("002");
		cons2.prescrire("003");
		Consultation cons3 = new Consultation( "3" , "30/08/2021" , "0003" , "00M2") ;
		cons3.prescrire("002");
		cons3.prescrire("003");

		System.out.println(Patient.patientDict);
		System.out.println(Medicament.medicamentDict);
		System.out.println(Medecin.medecinDict);
		System.out.println(Consultation.consultationCarnet);

		// necessaire pour initialiser le dictionnaire contenants medicaments et nombres de prescription
		new Fonctionnalité().MedicamentsNombreFonction();


		//  --- Pour les fonctionnalitees --- //
		/*
		A :	La liste des consultations pour un patient.
		L :	La Liste des patients consultés à une date donnée.
		M :	Pour une consultation afficher le médecin et son patient.
		B :	La liste des consultations effectuées par un médecin.
		C :	La liste des patients consultés par un médecin.
		D :	La liste des médecins qui ont consulté un patient
		E :	La liste des médecins qui ont effectué des consultations à une date donnée.
		F :	Le nombre de consultations.
		G :	Liste des médicaments prescrit lors d’une consultation
		H :	La liste des médicaments prescrit par un médecin à un patient à une date donnée
		I :	La liste des médicaments prescrit par un médecin à un patient
		J :	La liste des médicaments prescrit au moins par deux médecins
		K :	Pour chaque médicament fournir le nombre total de prescription : Présenter deux solutions d’implémentation.

		*/
		
		//new Fonctionnalité().A(); 
		
		//new Fonctionnalité().B(); 
		
		//new Fonctionnalité().C(); 
		
		//new Fonctionnalité().D(); 
		
		// new Fonctionnalité().E();
		
		//new Fonctionnalité().F();
		
		//new Fonctionnalité().G();
		
		//new Fonctionnalité().H();
		
		//new Fonctionnalité().I();

		//new Fonctionnalité().J();
		
		//new Fonctionnalité().K();
		
		//new Fonctionnalité().L();
		
		//new Fonctionnalité().M();
				
	}	
}