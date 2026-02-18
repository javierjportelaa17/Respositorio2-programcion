import javax.swing.JOptionPane;

public class hola {

    public static void main(String[] args) {

        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese un número entero")
        );

        String serie = mostrarFibonacci(numero);
        JOptionPane.showMessageDialog(null, serie);
    }

    public static String mostrarFibonacci(int numero) {
        String result = "";

        int fib = 1;
        int fib2 = 1;

        if (numero == 1) {
            result = "0";
        } else if (numero == 2) {
            result = "0 1";
        } else {
            result = "0 1 ";

            for (int i = 2; i < numero; i++) {
                int suma = fib + fib2;
                result += suma + " ";
                fib = fib2;
                fib2 = suma;
            }
        }

        return result;
    }
}
