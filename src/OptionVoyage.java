
public class OptionVoyage {
    private String _nom;
    private double _prixforfaitaire;
    private boolean _tarifreduit;
    private static double COEF_TARIF_REDUIT = 0.8;

    public OptionVoyage(String unNom, double unPrixForfaitaire) {
        this._nom = unNom;
        this._prixforfaitaire = unPrixForfaitaire;
        this._tarifreduit = false;
    }

    public OptionVoyage(String unNom, double unPrixForfaitaire, boolean unTarifReduit) {
        this._nom = unNom;
        this._prixforfaitaire = unPrixForfaitaire;
        this._tarifreduit = unTarifReduit;
    }

    public double prix() {

        return this._prixforfaitaire;
    }

    public double tarifreduit() {
        double result = _prixforfaitaire;

        if (_tarifreduit == true) {
            result = _prixforfaitaire * COEF_TARIF_REDUIT;

        }
        return result;

    }

    @Override
    public String toString() {
        String result;
        result = this._nom + " -> " + this._prixforfaitaire + " euros";
        return result;

    }

    public String get_nom() {
        return _nom;
    }

}
