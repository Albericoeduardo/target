package questions;

public class Question2 {
    String letraBuscada = "a";

    public static void contaLetra(String palavra) {
        int conta = 0;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
                conta++;
            }
        }

        System.out.println("A letra 'a' aparece " + conta + " vezes na palavra " + palavra);
    }
}
