import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Matheus Martinelli
 * 13-11-2022
 */
public class OrdenarLists {

    public static void main(String[] args) {
        f();
    }

    private static void f() {
        List<Gato> cats = new ArrayList<>() {
            {
                add(new Gato("Jon", 18, "preto"));
                add(new Gato("Simba", 6, "tigrado"));
                add(new Gato("Jon", 12, "amarelo"));
                add(new Gato("Jon", 15, "amarelo"));
                add(new Gato("Jon", 15, "preto"));
                add(new Gato("Poro", 5, "Rosa"));
                add(new Gato("Libano", 11, "Rosa"));
                add(new Gato("Libano", 15, "Rosa"));
            }
        };
        System.out.println("\n\t Ordem de irserção!!");
        System.out.println(cats);

        System.out.println("\n\t---\t Aleatório!! \t---");
        Collections.shuffle(cats);
        System.out.println(cats);
        // a ordem ira ocorrer de acordo com o metodo compareto
        System.out.println("\n\t---\t Ordem Natural(Nome)!! \t---");
        Collections.sort(cats);
        System.out.println(cats);

        System.out.println("\n\t---\t Ordem Idade()!! \t---");
        // Collections.sort(cats, new compareIdadeGato());
        cats.sort(new compareIdadeGato());
        System.out.println(cats);

        System.out.println("\n\t---\tOrdenado por Cor!! \t---");
        cats.sort(new compareCorGato());
        System.out.println(cats);

        System.out.println("\n\t---\tOrdenado por Nome Cor Idade!! \t---");
        cats.sort(new compareNomeCorIdadeGato());
        System.out.println(cats);
    }
}