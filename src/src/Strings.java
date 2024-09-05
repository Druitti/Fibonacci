import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        verifiesString(sc.nextLine());

    }

    // Método que verifica quantas vezes a letra 'a' aparece na string
    public static void verifiesString(String string) {
        int cont = 0;
        // Percorre a string e verifica se a letra 'a' aparece
       for(int i = 0; i < string.length(); i++) {
           if(string.charAt(i) == 'a'|| string.charAt(i) == 'A'){
               cont++;

           }}
           // Verifica se a letra 'a' aparece mais de uma vez
        String verifies = cont > 1 ? " vezes" : " vez";
           // Verifica se a letra 'a' aparece na string
        String result = cont > 0 ? 
            "A letra 'a' aparece " + cont + verifies + " na string" 
                : "A letra 'a' não aparece na string";
        System.out.println(result);
    }

}
