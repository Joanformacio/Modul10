package fase3;

public class Fase3 {
	
	public static void main(String[] args) {
		IFase3 strReverse= (str) -> {
			String aux="";
			
			for (int i=str.length()-1; i>=0; i--) {
				
				aux+= str.charAt(i);
			}	
			return aux;
		};
		
		System.out.println(strReverse.getReverse("Hello peters"));
	}
	
}	
	
	
	
	
