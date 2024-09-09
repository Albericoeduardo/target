import questions.Question1;
import questions.Question2;
import questions.Question3;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Questão 1");
        Question1.isFibonnaci(13);
        
        System.out.println("Questão 2");
        Question2.contaLetra("banana");

        System.out.println("Questão 3");
        Question3.numeroIndice(12);
    }
}
