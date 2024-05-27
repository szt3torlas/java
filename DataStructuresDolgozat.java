import java.util.ArrayList;
import java.util.HashMap;

public class DataStructuresDolgozat {
    public static void ujElemHozzaadasa(ArrayList lista){
        lista.add("Ljubljana", "Sarajevo", "Zagreb");
    }
    public static void kiirat(ArralyList lista){
        for (Int i = 0; i < lista.length-1; ++i){
            System.out.println(lista(i));
        }

    }
    public static void torolElemet(ArrayList lista, String elem){
        lista.remove(elem);
    }
    public static void ujFovarosOrszagPar(HashMap Countries, Key Capital, Value Country){
        Countries.put(Capital, Country);
    }
    public static void fvoeszpar(HashMap Countries){
        for (Int i = 0; i<Countries.length-1;++i){
            System.out.println(Countries.Key[i] + " - ", Countries.Value[i]);
        }
    }
    public static void fovarosOrszaga(HadhMap Countries, Key Capital){
        try {
            System.out.println(map.Value.get(Capital));

        } catch (Exception e) {
            return "Nincs " + Capital + " főváros az adatok között";
        }
    }
    public static void torolAdatPart(HashMap Countries, Key Capital){
        try {
            Countries.remove(Capital);
        } catch (Exception e) {
            return "Nincs " + Capital + " főváros az adatok között";
        }
    }
    public static void main(String[] args) {

        // Hozz létre egy változót, mely fővárosok neveit tárolja.
        // 1 pont
        ArrayList<string> valtoz = new ArrayList<>();

        // Tartalmazza az alábbi adatokat: "Wien", "Budapest", "Prag", "Bratislava"
        // 2 pont
        valtoz.add("Wien", "Budapest", "Prag", "Bratislava");

        // Írasd ki a fővárosokat!
        // 1 pont
        kiirat(valtoz);

        // Add hozzá a "Ljubljana", "Sarajevo" és "Zagreb" értékeket a fővásrosok listájához
        // az ujElemHozzaadasa() metódussal
        // 3 pont
        ujElemHozzaadasa(valtoz);

        // Írasd ki a fővárosokat!
        // 1 pont
        kiirat(valtoz);

        // Töröld a fővárosok listából "Sarajevo" elemet a torolElemet() metódussal
        // 1 pont
        torolElemet(valtoz, "Sarajevo");

        // Írasd ki a fővárosokat!
        // 1 pont
        kiirat(valtoz);

        // Hozz létre egy változót, mely főváros, ország párokat tartalmaz.
        // 1 pont
        HashMap<String, String> fovarorszag = new HashMap();

        // A tartalma a főváros, ország pároknak a következő legyen:
        // "Wien", "Österreich"
        // "Budapest", "Magyarország"
        // "Ljubljana", "Slovenija"
        // 3 pont
        ujFovarosOrszagPar(fovarorszag, "Wien", "Österreich");
        ujFovarosOrszagPar(fovarorszag, "Budapest", "Magyarország");
        ujFovarosOrszagPar(fovarorszag, "Ljubljana", "Slovenija");

        // Írasd ki a főváros, ország párokat!
        // 1 pont
        fvoeszpar(fovarorszag);

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Budapest"
        // 1 pont
        fovarosOrszaga(fovarorszag, "Budapest");

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Zagreb"
        // 1 pont
        fovarosOrszaga(fovarorszag, "Zagreb");

        // Az ujFovarosOrszagPar() metódussal add hozzá a "Zagreb", "Hrvatska" párt a fővárosok országok párokhoz
        // 1 pont
        ujFovarosOrszagPar(fovarorszag, "Zagreb", "Hrvatska");


        // A torolAdatPart() metódussal törld a "Ljubljana" főváros ország párt
        // 1 pont
        torolAdatPart(fovarorszag, "Ljubljana");

        // A torolAdatPart() metódussal törld a "Prag" főváros ország párt
        // kezeld a felmerülő hibát és írd ki a hibát
        // 3 pont
        torolAdatPart(fovarorszag, "Prag");

        // Írasd ki a főváros, ország párokat!
        // 1 pont
        fvoeszpar(fovarorszag);

    }

    /**
     * ujElemHozzaadasa() - egy elemet ad hozzá a megadott listához
     * @param list a lista, melyhez hozzá kell adni az elemet
     * @param elem az új elem
     */
    // 3 pont


    /**
     * torolElemet() - a megadott listából törli a megadott elemet
     * @param list a lista, melyből törölni kell az elemet
     * @param elem a törlendő érték
     */
    // 3 pont


    /**
     * fovarosOrszaga() - a megadott főváros, ország párok és főváros adatokra visszaadja az osztágot és a fővárost,
     * vagy visszaadja, hogy az adott főváros nincs az adatai között.
     * @param countries a főváros ország párok
     * @param capital a főváros
     * @return "country fővárosa capital", ha a párok között szerepel a főváros, egyébként
     * capital nincs az adatok között.
     * Példa:
     * England fővárosa London.
     * London nincs az adatok között.
     */
    // 3 pont


    /**
     * ujFovarosOrszagPar() - A coutries-hoz hozzáadja a főváros ország (capital country) párt.
     * @param coutries a főváros ország párok
     * @param capital a főváros neve
     * @param country az ország neve
     */
    // 3 pont


    /**
     * A coutries főváros ország adatpárok közül törli a capital főváros ország adatpárt, ha szerepel benne.
     * Ha nem szerepel benne, akkor "Nincs " + capital + " főváros az adatok között" hibát dob.
     * @param coutries a főváros ország adatpárok
     * @param capital a főváros neve
     * @throws IllegalArgumentException
     */
    // 5 pont


}