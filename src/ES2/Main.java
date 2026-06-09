package ES2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    static Logger logger = LoggerFactory.getLogger(Main.class);
    static Random random = new Random();

    public static void main(String[] args) {
        logger.info("-----PRIMA FUNZIONE-----");
        randomNumber(15);

        logger.info("-----SECONDA FUNZIONE-----");
        List<Integer> lista1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(101);
            lista1.add(r);
        }
        invertiLista(lista1);

        logger.info("-----TERZA FUNZIONE-----");
        pariDispari(lista1, true);
    }

    public static void randomNumber(int n) {
        List<Integer> listaNumeri = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int r = random.nextInt(101);
            listaNumeri.add(r);
        }

        listaNumeri.sort(Integer::compareTo);
        logger.info(listaNumeri.toString());
    }

    public static void invertiLista(List<Integer> l) {
        List<Integer> nuovaLista = new ArrayList<>();
        List<Integer> listaInvertita = l.reversed();

        nuovaLista.addAll(l);
        nuovaLista.addAll(listaInvertita);

        logger.info(nuovaLista.toString());
    }

    public static void pariDispari(List<Integer> l, boolean b) {
        if (b) {
            for (int i = 0; i < l.size(); i += 2) {
                logger.info(String.valueOf(l.get(i)));
            }
        } else {
            for (int j = 1; j < l.size(); j += 2) {
                logger.info(String.valueOf(l.get(j)));
            }
        }
    }
}
