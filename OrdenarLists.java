import java.util.ArrayList;
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
        List<Gato> cats = new ArrayList<>();
        cats.add(new Gato("Jon", 18, "preto"));
        cats.add(new Gato("Simba", 6, "tigrado"));
        cats.add(new Gato("Jon", 12, "amarelo"));
    }
    }