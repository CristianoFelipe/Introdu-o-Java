package IntJava;

    import java.util.Scanner;

     public class IntroduçãoJava {
	 
    	 public static void main(String[] args) {
    	 
	
    		int dias, meses, anos, DIAS_NO_ANO = 365, DIAS_NO_MES = 30;
    		Scanner leitor = new Scanner(System.in);
    		
    				
    				System.out.println("Informe a sua idade: ");
    				anos = leitor.nextShort();
    				
    				System.out.print("Meses: ");
    				meses = leitor.nextShort();
    			
    				System.out.print("Dias: ");
    				dias = leitor.nextShort();
    				
    				dias += (anos * DIAS_NO_ANO) + (meses * DIAS_NO_MES);
    				
    				System.out.println("\n\nA sua idade em dias é " + dias);
    			}
    		}