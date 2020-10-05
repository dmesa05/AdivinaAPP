
import java.util.Random;
import javax.swing.JOptionPane;

public class AdivinaNumero {
	public static void main(String[] args) {
		
		//A�adimos las variables con sus instrucciones
		//En el adivinar es donde generamos el numero de 0 a 100
		//En i=0 es el contador para contar fallos
		
		Random r = new Random();
		int adivinar = r.nextInt(100); 
		int i = 0; 
		int apuesta = input("Adivina el n�mero secreto entre 0 y 99. �Que n�mero es?");
		
		
		//Cada vez que falles te sale la respuesta si aciertas se acaba y si fallas //
		//te dice si es mayor o menor y se van contando los fallos//
		
		while (adivinar != apuesta) { 
			i++; 
			if (adivinar > apuesta) {
				apuesta = input("El n�mero a adivinar es m�s grande. \n Intentelo otra vez");
			} else {
				apuesta = input("El n�mero a adivinar es m�s peque�o. \n Intentelo otra vez");
			}
		}
		JOptionPane.showMessageDialog(null,
				"Felicitaciones ha dado con el n�mero con " + i + " intentos fallidos");
	}
	
	
		//Vemos el recuadro donde nos indica lo que tenemos que hacer//
	
		private static int input(String text) {
		return Integer.parseInt(JOptionPane.showInputDialog(text));
	}
}