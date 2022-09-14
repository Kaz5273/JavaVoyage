public class Transport extends OptionVoyage {

    public static double TARIF_LONG = 1500.0;
    public static double TARIF_BASE = 200.0;
    private boolean _trajetlong;

    public Transport(String unNom, double unPrixForfaitaire, Boolean unTrajetLong) {
        super(unNom, unPrixForfaitaire);
        this._trajetlong = unTrajetLong;
    }

    public Transport(String unNom, double unPrixForfaitaire) {
        super(unNom, unPrixForfaitaire);
        this._trajetlong = false;
    }

    public double prix() {
        double result = 0;

        if (_trajetlong == true) {

            result = TARIF_LONG;

        } else {

            result = TARIF_BASE;
        }

        result += super.prix();

        return result;

    }
}
