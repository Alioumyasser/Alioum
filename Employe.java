
public class Employe extends personne {

	private int Matricule_employé;

	public int getMatricule_employé() {
		return Matricule_employé;
	}

	public void setMatricule_employé(int matricule_employé) {
		Matricule_employé = matricule_employé;
		
	}
	
	@Override
	public void calculPrime() {
		// TODO Auto-generated method stub
		
		int primeEmployer = 50;
		int salaireMensuel = 450;
		
		int salaireTotal = primeEmployer+salaireMensuel;
		
		System.out.println("Votre salaire à la fin est" +salaireTotal);
		
		super.calculPrime();
	}
 
  
	
}