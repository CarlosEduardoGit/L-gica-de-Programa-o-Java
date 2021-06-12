
public class TiposPrimitivos {

	public static void main(String[] args) {
		
	/*	// INTEIROS
		
		byte   1				bits 01010011 01010011 01010011 01010011
		short  2					 01010011 01010011 01010011 01010011
		int    4
		long   8
		
		// REAIS
		
		float  4
		double 8
		
		// CARACTERES
		
		char   2
		
		// LÓGICOS
		
		boolean  1
		
*/
		
		
// --------------------------------------------------------------------------------		
		
		
// INTEIROS

byte tipo1 = -128;
byte tipo2 = 127;
				
short tipo3 = -32768;
short tipo4 = 32767;

int tipo5 = -2147483648;
int tipo6 = 2147483647;

long tipo7 = -9223372036854775808L;//l ou L
long tipo8 = 9223372036854775807L;// l ou L

						
//REAIS 

// Por padrão são números do tipo double
float tipo9 = 1.40129846432481708e-45F;// f ou F
float tipo10 = -1.40129846432481707e-45F;// f ou F

double tipo11 = -4.94065645841246544e-324;
double tipo12 = 4.94065645841246544e-324;		
		
//CARACTERE

char tipo13 = '\u0000';
char tipo15 = '\uFFFF';

char tipo16 = 'A';
char tipo17 = 'b';
char tipo18 = '8';		
		
//LÓGICO

boolean tipo19 = true; // verdadeiro
boolean tipo20 = false; // falso

		
	}

}
