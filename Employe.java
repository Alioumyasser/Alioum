
public class Employe extends personne {

	private int Matricule_employ�;

	public int getMatricule_employ�() {
		return Matricule_employ�;
	}

	public void setMatricule_employ�(int matricule_employ�) {
		Matricule_employ� = matricule_employ�;
		
	}
	
	@Override
	public void calculPrime() {
		// TODO Auto-generated method stub
		
		int primeEmployer = 50;
		int salaireMensuel = 450;
		
		int salaireTotal = primeEmployer+salaireMensuel;
		
		System.out.println("Votre salaire � la fin est" +salaireTotal);
		
		super.calculPrime();
	}
 
  
	
}