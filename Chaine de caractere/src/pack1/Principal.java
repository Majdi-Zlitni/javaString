package pack1;

public class Principal {

	public static void main(String[] args) {
		calculOcc("AAAbcdeeA");

	}
	
	//occurance d'une phrase
		public static int calc(char c,String ch) {
			int count=0;
			int j=0;
			System.out.println(ch.length());
			while(j!=ch.length()) {
				
				if(c==ch.charAt(j)) {
					count++;
					if(j==0) {
						ch=ch.substring(0,j)+ch.substring(j+1,ch.length());	
					}
					else {
						if(j!=ch.length()-1) {
							ch=ch.substring(0,j-1);	
						}
						else {
							ch=ch.substring(0,j-1)+ch.substring(j+1,ch.length());
						}
						
					}
					j++;
					
				
				}
				j++;
			}
			return count;
			
		
		}
		
		public static void calculOcc(String ch) {
			int i=0;
			System.out.println(ch);
			while(ch.length()!=0) {
				System.out.println("Le charactére "+ch.charAt(i)+"et afficher "+calc(ch.charAt(i),ch)+" fois dans cette phrase");
					i++;
					
				}
				
			}

}
