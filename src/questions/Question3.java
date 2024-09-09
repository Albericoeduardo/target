package questions;

public class Question3 {
    public static void numeroIndice(int indice){
        int soma = 0;
        for (int k = 1; k < indice; k++) {
            soma += k;
        }
        System.out.println("valor de soma no final = " + soma);
    }
}
