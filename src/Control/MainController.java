package Control;

import Model.Edge;
import Model.Graph;
import Model.List;
import Model.Vertex;

/**
 * Created by Jean-Pierre on 12.01.2017.
 */
public class MainController {

    //Attribute

    //Referenzen
    private Graph allUsers;

    public MainController(){
        allUsers = new Graph();
        createSomeUsers();
    }

    /**
     * Fügt Personen dem sozialen Netzwerk hinzu.
     */
    private void createSomeUsers(){
        insertUser("Ulf");
        insertUser("Silent Bob");
        insertUser("Dörte");
        insertUser("Ralle");
        befriend("Silent Bob", "Ralle");
        befriend("Dörte", "Ralle");
    }

    /**
     * Fügt einen Nutzer hinzu, falls dieser noch nicht existiert.
     * @param name
     * @return true, falls ein neuer Nutzer hinzugefügt wurde, sonst false.
     */
    public boolean insertUser(String name){
        //TODO 05: Nutzer dem sozialen Netzwerk hinzufügen.
        return false;
    }

    /**
     * Löscht einen Nutzer, falls dieser existiert. Alle Verbindungen zu anderen Nutzers werden ebenfalls gelöscht.
     * @param name
     * @return true, falls ein Nutzer gelöscht wurde, sonst false.
     */
    public boolean deleteUser(String name){
        //TODO 07: Nutzer aus dem sozialen Netzwerk entfernen.
        return false;
    }

    /**
     * Falls Nutzer vorhanden sind, so werden ihre Namen in einem String-Array gespeichert und zurückgegeben. Ansonsten wird null zurückgegeben.
     * @return
     */
    public String[] getAllUsers(){
        //TODO 06: String-Array mit allen Nutzernamen erstellen.
        return null;
    }

    /**
     * Falls der Nutzer vorhanden ist und Freunde hat, so werden deren Namen in einem String-Array gespeichert und zurückgegeben. Ansonsten wird null zurückgegeben.
     * @param name
     * @return
     */
    public String[] getAllFriendsFromUser(String name){
        //TODO 09: Freundesliste eines Nutzers als String-Array erstellen.
        return null;
    }

    /**
     * Bestimmt den Zentralitätsgrad einer Person im sozialen Netzwerk, falls sie vorhanden ist. Sonst wird -1.0 zurückgegeben.
     * Der Zentralitätsgrad ist der Quotient aus der Anzahl der Freunde der Person und der um die Person selbst verminderten Anzahl an Nutzern im Netzwerk.
     * Gibt also den Prozentwert an Personen im sozialen Netzwerk an, mit der die Person befreundet ist.
     * @param name
     * @return
     */
    public double centralityDegreeOfUser(String name){
        //TODO 10: Prozentsatz der vorhandenen Freundschaften eines Nutzers von allen möglichen Freundschaften des Nutzers.
        return 0.125456;
    }

    /**
     * Zwei Nutzern des Netzwerkes gehen eine Freundschaft neu ein, falls sie sich im Netzwerk befinden und noch keine Freunde sind.
     * @param name01
     * @param name02
     * @return true, falls eine neue Freundeschaft entstanden ist, ansonsten false.
     */
    public boolean befriend(String name01, String name02){
        //TODO 08: Freundschaften schließen.
        return false;
    }

    /**
     * Zwei Nutzer beenden ihre Freundschaft, falls sie sich im Netzwerk befinden und sie befreundet sind.
     * @param name01
     * @param name02
     * @return true, falls ihre Freundschaft beendet wurde, ansonsten false.
     */
    public boolean unfriend(String name01, String name02){
        //TODO 11: Freundschaften beenden.
        return false;
    }

    /**
     * Bestimmt die Dichte des sozialen Netzwerks und gibt diese zurück.
     * Die Dichte ist der Quotient aus der Anzahl aller vorhandenen Freundschaftsbeziehungen und der Anzahl der maximal möglichen Freundschaftsbeziehungen.
     * @return
     */
    public double dense(){
        //TODO 12: Dichte berechnen.
        return 0.12334455676;
    }

    /**
     * Gibt die möglichen Verbindungen zwischen zwei Personen im sozialen Netzwerk als Stirng-Array zurück,
     * falls die Personen vorhanden sind und sie über eine oder mehrere Ecken miteinander verbunden sind.
     * @param name01
     * @param name02
     * @return
     */
    public String[] getLinksBetween(String name01, String name02){
        Vertex user01 = allUsers.getVertex(name01);
        Vertex user02 = allUsers.getVertex(name02);
        if(user01 != null && user02 != null){
            //TODO 13: Schreibe einen Algorithmus, der mindestens ein Verbindung von einem Nutzer über Zwischennutzer zu einem anderem Nutzer bestimmt. Happy Kopfzerbrechen!
        }
        return null;
    }
}
