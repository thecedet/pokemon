package pokemon;

import static Game.Utilisateur.*;

public class Attaque implements IAttaque {

    public final String NOM_ATTAQUE;
    public final int DMG;
    public final Type TYPE_ATTAQUE;
    public final String STATUS;
    private int point_de_pouvoir;
    public final int POINT_DE_POUVOIR_TOT;

    public Attaque(String nom_attaque, int dmg, Type type_attaque, String status, int point_de_pouvoir, int point_de_pouvoir_tot) {
        this.NOM_ATTAQUE = nom_attaque;
        this.DMG = dmg;
        this.TYPE_ATTAQUE = type_attaque;
        this.STATUS = status;
        this.point_de_pouvoir = point_de_pouvoir;
        this.POINT_DE_POUVOIR_TOT = point_de_pouvoir_tot;
    }

    public Attaque(String nom_attaque, Type type_attaque, String status, int point_de_pouvoir, int point_de_pouvoir_tot) {
        this.NOM_ATTAQUE = nom_attaque;
        DMG = 0;
        this.TYPE_ATTAQUE = type_attaque;
        this.STATUS = status;
        this.point_de_pouvoir = point_de_pouvoir;
        this.POINT_DE_POUVOIR_TOT = point_de_pouvoir_tot;
    }

    public void setPoint_de_pouvoir(int point_de_pouvoir) {
        this.point_de_pouvoir = point_de_pouvoir;
    }

    public int getPoint_de_pouvoir() {
        return point_de_pouvoir;
    }

    public String toString() {
        return NOM_ATTAQUE + " - " + point_de_pouvoir + "/" + POINT_DE_POUVOIR_TOT + " - [" + TYPE_ATTAQUE + "]";
    }

    public String fiche_detail_attaque() {
        String fiche = hashtag +
                "\n" +
                "\n    Attaque : " + NOM_ATTAQUE + "        Type : " + TYPE_ATTAQUE +
                "\n" +
                "\n    Dégât : " + DMG + "        PP : " + point_de_pouvoir + "/" + POINT_DE_POUVOIR_TOT +
                "\n";
        if(STATUS != null) {
            fiche += "\n    Status : " + STATUS + "\n";
        }
        fiche += hashtag;
        return fiche;
    }
}
