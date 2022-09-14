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
    public void TestTransport() {
        Transport transport = new Transport("une croisiere", 0.00, true);

        assertEquals(1500.0, transport.prix(), DELTA);
    }

}
