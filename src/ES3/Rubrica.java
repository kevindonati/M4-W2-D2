package ES3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    static Logger logger = LoggerFactory.getLogger(Rubrica.class);

    private HashMap<String, String> contatto;

    public Rubrica(HashMap<String, String> contatto) {
        this.contatto = contatto;
    }

    public void addContact(String nome, String numeroTelefono) {
        contatto.put(nome, numeroTelefono);
    }

    public void removeContact(String nome) {
        contatto.remove(nome);
    }

    public String searchContactByName(String name) {
        return contatto.get(name);
    }

    public String searchContactByNumber(String numero) {
        Set<String> setChiavi = contatto.keySet();

        for (String chiave : setChiavi) {
            if (contatto.get(chiave).equals(numero)) {
                return chiave;
            }
        }
        return "Contatto non trovato";
    }

    public void showAllContact() {
        Set<String> setChiavi = contatto.keySet();

        for (String key : setChiavi) {
            logger.info("Nome: {} - Numero: {}", key, contatto.get(key));
        }
    }


}
