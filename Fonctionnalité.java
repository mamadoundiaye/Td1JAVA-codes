import java.util.* ;

public class Fonctionnalité{
    
    //liste consultation pour un patient donné ou medecin donné a renvoyé apres les appels des fonction concernées
    HashMap<String ,ArrayList<String>  >  Consul =  new HashMap<String , ArrayList<String> >();
    

    // pour gerer les medicament et leurs nombres de prescriptions
    static HashMap<String , Integer> MedicamentsNombre = new HashMap<String, Integer>();

    public void  MedicamentsNombreFonction(){
         // pour la rdcuperation  des medicament et leurs nombres de prescriptions
         for(String cle : Medicament.medicamentDict.keySet()) {
            int compteur = 0 ;
            for(String clemedoc : Consultation.consultationCarnet.keySet()) { 
                
                if (Consultation.consultationCarnet.get(clemedoc).contains(cle)) {							
                    compteur++ ;					
                }
                MedicamentsNombre.put(cle, compteur) ;
            }
         }

    }
    
   
    public Fonctionnalité(){
        // pour ne pas avoir a creer des instances obligatoires
    }

    //A :	La liste des consultations pour un patient.
    public void A() {
        System.out.println("veuillez entrer le NoSS du patient");
        Scanner input = new Scanner(System.in);
        String  patientNoSS = input.nextLine() ; 
        input.close();
        for(String cle : Consultation.consultationCarnet.keySet()) {
        if(Consultation.consultationCarnet.get(cle).contains(patientNoSS)){
            Consul.put(cle , Consultation.consultationCarnet.get(cle) ) ;
            
        }
        }
        System.out.println("la liste demandée "+" : " + Consul);        

    }

    // B :	La liste des consultations effectuées par un médecin.
    public void B( ) {
        System.out.println("veuillez entrer la matricule du medecin");
        Scanner input2 = new Scanner(System.in);
        String  Matricule = input2.nextLine() ; 
        input2.close();
        for(String cle : Consultation.consultationCarnet.keySet()) {
        if(Consultation.consultationCarnet.get(cle).contains(Matricule)){
            Consul.put(cle , Consultation.consultationCarnet.get(cle) ) ;
            
        }
        }
        System.out.println("la liste demandée "+" : " + Consul);

    }

    //C :	La liste des patients consultés par un médecin.
    public void C( ) {
        System.out.println("veuillez entrer la matricule du medecin");
        Scanner input3 = new Scanner(System.in);
        String  Matricule1 = input3.nextLine() ; 
        input3.close();
        for(String cle : Consultation.consultationCarnet.keySet()) {
        if(Consultation.consultationCarnet.get(cle).contains(Matricule1)){
          Consul.put(Consultation.consultationCarnet.get(cle).get(3) , Consultation.consultationCarnet.get(cle)) ;

        }
        }
        System.out.println("la liste demandée "+" : " + Consul);

    }

    //D :	La liste des médecins qui ont consulté un patient
    public void D( ) {
        HashSet <String> medecinConsultants = new HashSet <String>();
        for(String cle : Consultation.consultationCarnet.keySet()) {
            medecinConsultants.add(Consultation.consultationCarnet.get(cle).get(2)) ;
            
        }  
        System.out.println("la liste demandée "+" : " + medecinConsultants);      

    }

    //E :	La liste des médecins qui ont effectué des consultations à une date donnée.
    public void E( ) {
        System.out.println("veuillez entrer la date de consultation");
        Scanner input4 = new Scanner(System.in);
        String  date = input4.nextLine() ; 
        input4.close();
        HashSet <String> medecinConsultantsDate = new HashSet <String>();
        for(String cle : Consultation.consultationCarnet.keySet()) {
            if(Consultation.consultationCarnet.get(cle).contains(date)){
            medecinConsultantsDate.add(Consultation.consultationCarnet.get(cle).get(2)) ;
            System.out.println("la liste demandée "+" : " + medecinConsultantsDate);
        }
        }

    }


    //F :	Le nombre de consultations.
    public void F( ) {
        System.out.println("le nombre total de consultation est :"+Consultation.consultationCarnet.size());
				

    }

    //G :	Liste des médicaments prescrit lors d’une consultation
    public void G( ) {
        System.out.println("veuillez entrer le numero de la consultation");
        Scanner input5 = new Scanner(System.in);
        String  NoCons = input5.nextLine() ; 
        input5.close();
        ArrayList<String>  medicaments =  new ArrayList<String>();
        medicaments = Consultation.consultationCarnet.get(NoCons) ;
        medicaments.remove(medicaments.get(0));
        medicaments.remove(medicaments.get(0));
        medicaments.remove(medicaments.get(0));
        medicaments.remove(medicaments.get(0));
        System.out.println("la liste demandée des medicaments "+" : " + medicaments);

    }

    // H :	La liste des médicaments prescrit par un médecin à un patient à une date donnée
    public void H( ) {
        System.out.println("veuillez entrer dans l'ordre le medecin , le patient et la date de la consultation");
        Scanner input6 = new Scanner(System.in);
        Scanner input7 = new Scanner(System.in);
        Scanner input8 = new Scanner(System.in);
        String  medecin = input6.nextLine() ; 
        String  patient = input7.nextLine() ; 
        String  date1 = input8.nextLine() ; 
        input6.close();
        input7.close();
        input8.close();
        //la liste suivante est pour gerer le cas ou le patien effectue plusieurs consultations pour une date donnee
        HashMap<String , ArrayList<String>> consMedicaments = new HashMap<String, ArrayList<String>>();
        HashMap<String , ArrayList<String>> ListMedicamentsFinale = new HashMap<String, ArrayList<String>>();
        for(String cle : Consultation.consultationCarnet.keySet()) {
            if(Consultation.consultationCarnet.get(cle).contains(medecin) && Consultation.consultationCarnet.get(cle).contains(patient) && Consultation.consultationCarnet.get(cle).contains(date1)){
                consMedicaments.put(cle , Consultation.consultationCarnet.get(cle)) ;
                consMedicaments.get(cle).remove(consMedicaments.get(cle).get(0));
                consMedicaments.get(cle).remove(consMedicaments.get(cle).get(0));
                consMedicaments.get(cle).remove(consMedicaments.get(cle).get(0));
                consMedicaments.get(cle).remove(consMedicaments.get(cle).get(0));
                ListMedicamentsFinale.put(cle , consMedicaments.get(cle)) ;
            }
        }
        System.out.println("la liste demandée des medicaments "+" : " + ListMedicamentsFinale);

    }

    //I :	La liste des médicaments prescrit par un médecin à un patient
    public void I( ) {
        System.out.println("veuillez entrer dans l'ordre le medecin et le patient");
        Scanner input9 = new Scanner(System.in);
        Scanner input10 = new Scanner(System.in);
        String  medecin1 = input9.nextLine() ; 
        String  patient1 = input10.nextLine() ; 
        input9.close();
        input10.close();
        //la liste suivante est pour gerer le cas ou le patien effectue plusieurs consultations pour une date donnee
        HashMap<String , ArrayList<String>> consMedicamentsNoDate = new HashMap<String, ArrayList<String>>();
        HashMap<String , ArrayList<String>> ListMedicamentsFinaleNoDate = new HashMap<String, ArrayList<String>>();
        for(String cle : Consultation.consultationCarnet.keySet()) {
            if(Consultation.consultationCarnet.get(cle).contains(medecin1) && Consultation.consultationCarnet.get(cle).contains(patient1)){
                consMedicamentsNoDate.put(cle , Consultation.consultationCarnet.get(cle)) ;
                consMedicamentsNoDate.get(cle).remove(consMedicamentsNoDate.get(cle).get(0));
                consMedicamentsNoDate.get(cle).remove(consMedicamentsNoDate.get(cle).get(0));
                consMedicamentsNoDate.get(cle).remove(consMedicamentsNoDate.get(cle).get(0));
                consMedicamentsNoDate.get(cle).remove(consMedicamentsNoDate.get(cle).get(0));
                ListMedicamentsFinaleNoDate.put(cle , consMedicamentsNoDate.get(cle)) ;
            }
        }
        System.out.println("la liste demandée des medicaments "+" : " + ListMedicamentsFinaleNoDate);

    }


    //J :	La liste des médicaments prescrit au moins par deux médecins
    public void J( ) {
        
        System.out.print("les codes medicament prescrits par au moins 2 medecins sont :") ;
        for(String cle : MedicamentsNombre.keySet()) {
            if (MedicamentsNombre.get(cle) >= 2) {
                
                System.out.print(cle + " ") ;
        }
        else 
                System.out.print("") ;
    }

    }

    //K :	Pour chaque médicament fournir le nombre total de prescription : Présenter deux solutions d’implémentation.
    public void K( ) {
        System.out.print("les medicament prescrits et leurs nombres de presciption :"+MedicamentsNombre) ;
				

    }

    //L :	La Liste des patients consultés à une date donnée.
    public void L( ) {
        // recuperer la date de la consultation
        System.out.println("veuillez entrer la date de la consultation");
        Scanner Date = new Scanner(System.in);
        String  DateCons = Date.nextLine() ; 
        Date.close();

        HashMap<String , String  >  patientConsulte =  new HashMap<String , String  >();//liste stockant les patients consultés a la date donnée
        // on recupere maintenant la liste des patients en parcourant la liste des consultations
        for(String cle : Consultation.consultationCarnet.keySet()) {
                if(Consultation.consultationCarnet.get(cle).contains(DateCons)){
                    String clientConsulte = Consultation.consultationCarnet.get(cle).get(3) ;
                    patientConsulte.put(clientConsulte , Patient.patientDict.get(clientConsulte)) ;
                    
                }
                    
        }
        System.out.println("la liste des clients consulté le  " + DateCons + " : " + patientConsulte);

    }

    //M :	Pour une consultation afficher le médecin et son patient.
    public void M( ) {
        // recuperer le NoSS du patient 
        System.out.println("veuillez entrer le numero de la consultation");
        Scanner numero = new Scanner(System.in);
        String  consultNumero = numero.nextLine() ; 
        numero.close();

        // on recupere la liste des consultations
        if(Consultation.consultationCarnet.containsKey(consultNumero)){

            System.out.println("le medecin :"+Consultation.consultationCarnet.get(consultNumero).get(2));					
            System.out.println("le patient :"+Consultation.consultationCarnet.get(consultNumero).get(3));
        }

    }

}