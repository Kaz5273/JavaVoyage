import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testVoyage {
    private static final double DELTA = 1e-2;

    @Test
    public void TestPartie1() {
        OptionVoyage optionVoyage = new OptionVoyage("Sejour au camping", 40.0);

        assertEquals("Sejour au camping", optionVoyage.get_nom());
        assertEquals(40.0, optionVoyage.prix(), DELTA);

    }

    @Test
    public void TestTarifReduit() {
        OptionVoyage optionVoyage = new OptionVoyage("Sejour au camping", 40.0, true);
        assertEquals(32.0, optionVoyage.prix(), DELTA);

    }

    @Test
    public void TestPrixSejour() {
        Sejour sejour = new Sejour("Sejour au camping", 20.0, 10, 30.0);

        assertEquals(320.0, sejour.prix(), DELTA);
    }

    @Test
    public void TestTransportTRUE() {
        Transport transport = new Transport("une croisiere", 0.00, true);

        assertEquals(1500.0, transport.prix(), DELTA);
    }

    @Test
    public void TestTransportFALSE() {
        Transport transport = new Transport("une croisiere", 50.0);

        assertEquals(250.0, transport.prix(), DELTA);
    }

    @Test
    public void TestKitVoyagePrix() {
        KitVoyage unKitOption = new KitVoyage("Paris", "Zurich");
        unKitOption.ajouterOption(new Sejour("Hotel 3* : Les amandiers", 40.0, 5, 100));
        unKitOption.ajouterOption(new Transport("Trajet en train", 50.0));

        assertEquals(790.0, unKitOption.prix(), DELTA);
    }

    @Test
    public void TestGetNb() {
        KitVoyage unKitOption = new KitVoyage("Paris", "Zurich");
        unKitOption.ajouterOption(new Sejour("Hotel 3* : Les amandiers", 40.0, 5, 100));
        unKitOption.ajouterOption(new Transport("Trajet en train", 50.0));

        assertEquals(2, unKitOption.getNbOptions());
    }

}
