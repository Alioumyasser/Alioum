
public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Etudiant pers;
		pers = new Etudiant();
		


		pers.setmatriculeEtudiant(2844);
		
		System.out.printf("le nom de cet etudiant est"+pers.getNom()+","+pers.getPrenom()+","+pers.getAdresse()+","+pers.getDate_Naissance()+","+pers.getmatriculeEtudiant()+".");
		 pers.calculPrime();
		
		Employe empl;
		
			empl = new Employe();
			
			empl.setNom("NANGUE");
			empl.setPrenom(".....");
			empl.setAdresse("Tsinga ");
			empl.setDate_Naissance("xx-xx-xxxx");	
			empl.setMatricule_employé(12345);
			
			System.out.printf("le nom de cet employe est"+empl.getNom()+","+empl.getPrenom()+","+empl.getAdresse()+","+empl.getDate_Naissance()+","+empl.getMatricule_employé()+".");
			empl.calculPrime();
		
		
		
	}

}
