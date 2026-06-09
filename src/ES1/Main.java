package ES1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = LoggerFactory.getLogger(Main.class);

        logger.info("Numero di elementi da inserire");
        int n = Integer.parseInt(scanner.nextLine());
        HashSet<String> paroleDistinte = new HashSet<>();
        HashSet<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            logger.info("Inserisci una stringa da aggiungere");
            String input = scanner.nextLine();
            if (!paroleDistinte.add(input)) {
                paroleDuplicate.add(input);
            }
        }

        logger.info("Elenco parole duplicate:");
        for (String parola : paroleDuplicate) {
            logger.info(parola);
        }

        logger.info("Numero di parole distinte: {}", paroleDistinte.size());

        logger.info("Elenco parole distinte:");
        for (String parola : paroleDistinte) {
            logger.info(parola);
        }
    }
}
