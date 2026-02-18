import javax.swing.JOptionPane;

public class repositorio {

    public static void main(String[] args) {

        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese un número entero")
        );

        int[] impares = busquedaImpares(numero);

        String mensaje = "Números impares:\n";
        for (int i = 0; i < impares.length; i++) {
            mensaje += impares[i] + " ";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static int[] busquedaImpares(int numero) {
        int cont = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                cont++;
            }
        }

        int[] numerosImpares = new int[cont];
        int j = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                numerosImpares[j++] = i;
            }
        }

        return numerosImpares;
    }
}
