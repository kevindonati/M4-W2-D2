package ES3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> contatti = new HashMap<>();
        Rubrica rubrica = new Rubrica(contatti);

        rubrica.addContact("Marco", "252625245");
        rubrica.addContact("Enrico", "727242787");
        rubrica.addContact("Maria", "75247275");
        rubrica.addContact("Luigi", "27272827272");

        rubrica.showAllContact();

        rubrica.removeContact("Enrico");
        rubrica.showAllContact();

        System.out.println(rubrica.searchContactByName("Luigi"));
        System.out.println(rubrica.searchContactByNumber("252625245"));
    }
}
