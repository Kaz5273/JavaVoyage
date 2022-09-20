
public abstract class OptionVoyage {
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
        double result = _prixforfaitaire;

        if (_tarifreduit == true) {
            result = _prixforfaitaire * COEF_TARIF_REDUIT;

        }
        return result;

    }

    @Override
    public String toString() {
        String result;
        result = this._nom + " -> " + prix() + " euros";
        return result;

    }

    public String get_nom() {
        return _nom;
    }

    public double get_prixforfaitaire() {
        return _prixforfaitaire;
    }

}
