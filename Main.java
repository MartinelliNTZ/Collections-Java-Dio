import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        fg();
    }

    private static void f() {

        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int cont = 998204856;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        for (int i = 0; i < elementos.length; i++) {
            if (a == elementos[i]) {
                cont = i;

                System.out.println("Achei " + a + " na posicao " + i);
                break;
            }
        }
        System.out.println(cont == 998204856 ? "Numero " + a + " nao encontrado! " : "biscoito");
    }

    private static void fg() {
        // List<Integer> intList = new ArrayList<>(Arrays.asList(64, 137, -16, 43, 67, 81, -90, 212, 10, 75));
        List<Double> intList = new ArrayList<>(Arrays.asList(1d, 2d, 3d, 4d));
        System.out.println("Minimo: " + Collections.min(intList));
        System.out.println("Maximo: " + Collections.max(intList));
        Iterator<Double> integerIterator = intList.iterator(); // CTRL + ALT + V cria uma variavel do tipo do retorno
        int soma = 0;
        while (integerIterator.hasNext()) {
            Double next = integerIterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);
        /**
         * Método remove pode se passar a posição do item cujo qual deseja-se excluir
         * ou passar o proprio objeto para excluir*/
        intList.remove(1); // remove o iten na posição 1
        intList.remove(1d); // remove o objeto da list
        System.out.println(intList);

        /**
         * O clear limpa todos os itens da lista*/
        intList.clear();
        System.out.println(intList);
    }
}
