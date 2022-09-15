import java.util.ArrayList;

public class KitVoyage {

    private ArrayList<OptionVoyage> _options;
    private String _depart;
    private String _destination;

    public KitVoyage(String unDepart, String uneDestination) {

        this._depart = unDepart;
        this._destination = uneDestination;
        this._options = new ArrayList<OptionVoyage>();

    }

    public double prix() {
        double prix = 0;
        for (OptionVoyage element : _options) {
            prix += element.prix();
        }
        return prix;
    }

    public void ajouterOption(OptionVoyage uneOptionVoyage) {

        if (uneOptionVoyage != null) {
            _options.add(uneOptionVoyage);
        }

    }

    @Override
    public String toString() {
        String result;
        result = "Voyage de " + this._depart + " a " + this._destination + " avec pour option: \n";
        for (OptionVoyage element : _options) {
            result += "- " + element.get_nom() + " -> " + element.prix() + " euros \n";
        }
        result += "Prix Total: " + prix() + " euros";

        return result;
    }

    public void annuler() {
        _options.clear();
    }

    public int getNbOptions() {
        int i = 0;
        for (OptionVoyage element : _options) {
            i++;
        }
        return i;
    }

}
