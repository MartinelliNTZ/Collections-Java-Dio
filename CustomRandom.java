import java.util.Random;

public class CustomRandom {


    /**
     * Retorna um int aleatório dentro do intervalo pré-estabelecido
     * @param inicio define o inicio do intervalo inicio - n
     * @param limite define o fim do intervalo n- limite
     * @return um Int dentro do intervalo informado
     * */
    public static int nextInt(int inicio,  int limite){
        int escopo = limite -inicio +1;
        Random random = new Random();
        int resultado = random.nextInt(escopo) +inicio;
        return resultado;
    }
}
