
public class Etudiant extends personne {

	private int matriculeEtudiant;
	
	public int getmatriculeEtudiant() {
		return matriculeEtudiant;
		
	}
		
		public void setmatriculeEtudiant (int matriculeEtudiant) {
			this.matriculeEtudiant = matriculeEtudiant;
			
	}
		
		@Override
		public void calculPrime() {
			// TODO Auto-generated method stub
			
			int primeEtudiant = 50;
			
			System.out.println("Sa prime est "+primeEtudiant+" FCFA");
			
			super.calculPrime();
		}
		
		
		
 
		
}