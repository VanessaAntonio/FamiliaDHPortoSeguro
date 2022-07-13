package PortoSeguro;

public class TesteComparaVeotr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [] vetA = new int[3];
		    int [] vetB = new int[3];
		    int [] vetC = new int[6];
		    
		    vetA[0] = 5;
		    vetA[1] = 6;
		    vetA[2] = 7;
		    
		    vetB[0] = 5;
		    vetB[1] = 4;
		    vetB[2] = 7;
		    
		    for(int i=0; i<vetA.length; i++){
		        for(int j=0; j<vetB.length; j++){
		            if(vetA != vetB){
		                vetC[i] = vetA[i];
		            }
		        }
		    }
		            
		    for(int i=0; i<vetC.length; i++){
		    System.out.print(vetC[i]);
		    }
	}

}
