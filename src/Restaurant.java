public class Restaurant extends OptionVoyage {

    private String _nomRestau;
    private double _prix;

    public Restaurant(String unNom, double unPrixForfaitaire, String unNomRestau, double unPrix) {
        super(unNom, unPrixForfaitaire);
        this._nomRestau = unNomRestau;
        this._prix = unPrix;
    }

    public double prix() {
        double result = super.prix() + _prix;

        return result;
    }

    @Override
    public String toString() {
        String result;
        result = this._nomRestau + " -> " + prix() + " euros";
        return result;
    }

}
