
public class Sejour extends OptionVoyage {

    private int _nbrnuit;
    private double _prixparnuit;

    public Sejour(String unNom, double unPrixForfaitaire, int unNbrNuit, double unPrixParNuit) {
        super(unNom, unPrixForfaitaire);
        this._nbrnuit = unNbrNuit;
        this._prixparnuit = unPrixParNuit;
    }

    public double prix() {
        double result;
        result = (_nbrnuit * _prixparnuit) + super.get_prixforfaitaire();
        return result;

    }

}
