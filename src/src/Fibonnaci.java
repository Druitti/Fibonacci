import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele está na sequência de Fibonacci: ");

        String result = isFibonnaci(Integer.parseInt(sc.nextLine())) ? 
            "Está na sequência de Fibonacci" 
            : "Não está na sequência de Fibonacci";
        System.out.println(result);
    }
    // Método que retorna uma lista com os 15 primeiros números da sequência de Fibonacci
    public static List<Integer> fibonnaci() {
       List<Integer> fibonnaciElements = new ArrayList<Integer>();
       int limit = 15;
       for (int i = 0; i < limit; i++) {
                // Adiciona os dois primeiros números da sequência
           if (i == 0 || i == 1) {
               fibonnaciElements.add(i);
           } else {
                // Adiciona os próximos números da sequência
               fibonnaciElements.add(fibonnaciElements.get(i - 1) + fibonnaciElements.get(i - 2));
           }
       }
       return fibonnaciElements;
    }
    // Método que verifica se um número está na sequência de Fibonacci
    public static boolean isFibonnaci(int number) {
        List<Integer> fibonnaciElements = fibonnaci();
        return fibonnaciElements.contains(number);
    }
}
