package pokemon;

import java.util.ArrayList;

public enum Type {

    NORMAL,FEU,EAU,PLANTE,ELECTRIK,GLACE,COMBAT,POISON,SOL,VOL,PSY,INSECT,ROCHE,SPECTRE,DRAGON,TENEBRE,ACIER,FEE;

    public final ArrayList<Type> FORT;
    public final ArrayList<Type> FAIBLE;
    public final ArrayList<Type> INEFFICACE;

    Type() {
        FORT = new ArrayList<>();
        FAIBLE = new ArrayList<>();
        INEFFICACE = new ArrayList<>();
    }

    public static Type normal() {
        if(NORMAL.FAIBLE.isEmpty()) {
            NORMAL.FAIBLE.add(ROCHE);
            NORMAL.FAIBLE.add(ACIER);
            NORMAL.INEFFICACE.add(SPECTRE);
        }
        return NORMAL;
    }
    public static Type feu() {
        if(FEU.FAIBLE.isEmpty()) {
            FEU.FORT.add(PLANTE);
            FEU.FORT.add(GLACE);
            FEU.FORT.add(INSECT);
            FEU.FORT.add(ACIER);
            FEU.FAIBLE.add(FEU);
            FEU.FAIBLE.add(EAU);
            FEU.FAIBLE.add(ROCHE);
            FEU.FAIBLE.add(DRAGON);
        }
        return FEU;
    }
    public static Type eau() {
        if(EAU.FAIBLE.isEmpty()) {
            EAU.FORT.add(FEU);
            EAU.FORT.add(SOL);
            EAU.FORT.add(ROCHE);
            EAU.FAIBLE.add(EAU);
            EAU.FAIBLE.add(PLANTE);
            EAU.FAIBLE.add(DRAGON);
        }
        return EAU;
    }
    public static Type plante() {
        if(PLANTE.FAIBLE.isEmpty()) {
            PLANTE.FORT.add(EAU);
            PLANTE.FORT.add(SOL);
            PLANTE.FORT.add(ROCHE);
            PLANTE.FAIBLE.add(FEU);
            PLANTE.FAIBLE.add(PLANTE);
            PLANTE.FAIBLE.add(POISON);
            PLANTE.FAIBLE.add(VOL);
            PLANTE.FAIBLE.add(INSECT);
            PLANTE.FAIBLE.add(DRAGON);
            PLANTE.FAIBLE.add(ACIER);
        }
        return PLANTE;
    }
    public static Type electrik() {
        if(ELECTRIK.FAIBLE.isEmpty()) {
            ELECTRIK.FORT.add(EAU);
            ELECTRIK.FORT.add(VOL);
            ELECTRIK.FAIBLE.add(PLANTE);
            ELECTRIK.FAIBLE.add(ELECTRIK);
            ELECTRIK.FAIBLE.add(DRAGON);
            ELECTRIK.INEFFICACE.add(SOL);
        }
        return ELECTRIK;
    }
    public static Type glace() {
        if(GLACE.FAIBLE.isEmpty()) {
            GLACE.FORT.add(PLANTE);
            GLACE.FORT.add(SOL);
            GLACE.FORT.add(VOL);
            GLACE.FORT.add(DRAGON);
            GLACE.FAIBLE.add(FEU);
            GLACE.FAIBLE.add(EAU);
            GLACE.FAIBLE.add(GLACE);
            GLACE.FAIBLE.add(ACIER);
        }
        return GLACE;
    }
    public static Type combat() {
        if(COMBAT.FAIBLE.isEmpty()) {
            COMBAT.FORT.add(NORMAL);
            COMBAT.FORT.add(GLACE);
            COMBAT.FORT.add(ROCHE);
            COMBAT.FORT.add(TENEBRE);
            COMBAT.FORT.add(ACIER);
            COMBAT.FAIBLE.add(POISON);
            COMBAT.FAIBLE.add(VOL);
            COMBAT.FAIBLE.add(PSY);
            COMBAT.FAIBLE.add(INSECT);
            COMBAT.FAIBLE.add(FEE);
            COMBAT.INEFFICACE.add(SPECTRE);
        }
        return COMBAT;
    }
    public static Type poison() {
        if(POISON.FAIBLE.isEmpty()) {
            POISON.FORT.add(PLANTE);
            POISON.FORT.add(FEE);
            POISON.FAIBLE.add(POISON);
            POISON.FAIBLE.add(SOL);
            POISON.FAIBLE.add(ROCHE);
            POISON.FAIBLE.add(SPECTRE);
            POISON.INEFFICACE.add(ACIER);
        }
        return POISON;
    }
    public static Type sol() {
        if(SOL.FAIBLE.isEmpty()) {
            SOL.FORT.add(FEU);
            SOL.FORT.add(ELECTRIK);
            SOL.FORT.add(POISON);
            SOL.FORT.add(ROCHE);
            SOL.FORT.add(ACIER);
            SOL.FAIBLE.add(PLANTE);
            SOL.FAIBLE.add(INSECT);
            SOL.INEFFICACE.add(VOL);
        }
        return SOL;
    }
    public static Type vol() {
        if(VOL.FAIBLE.isEmpty()) {
            VOL.FORT.add(PLANTE);
            VOL.FORT.add(COMBAT);
            VOL.FORT.add(INSECT);
            VOL.FAIBLE.add(ELECTRIK);
            VOL.FAIBLE.add(ROCHE);
            VOL.FAIBLE.add(ACIER);
        }
        return VOL;
    }
    public static Type psy() {
        if(PSY.FAIBLE.isEmpty()) {
            PSY.FORT.add(COMBAT);
            PSY.FORT.add(POISON);
            PSY.FAIBLE.add(PSY);
            PSY.FAIBLE.add(ACIER);
            PSY.INEFFICACE.add(TENEBRE);
        }
        return PSY;
    }
    public static Type insect() {
        if(INSECT.FAIBLE.isEmpty()) {
            INSECT.FORT.add(PLANTE);
            INSECT.FORT.add(PSY);
            INSECT.FORT.add(TENEBRE);
            INSECT.FAIBLE.add(FEU);
            INSECT.FAIBLE.add(COMBAT);
            INSECT.FAIBLE.add(POISON);
            INSECT.FAIBLE.add(VOL);
            INSECT.FAIBLE.add(SPECTRE);
            INSECT.FAIBLE.add(ACIER);
            INSECT.FAIBLE.add(FEE);
        }
        return INSECT;
    }
    public static Type roche() {
        if(ROCHE.FAIBLE.isEmpty()) {
            ROCHE.FORT.add(FEU);
            ROCHE.FORT.add(GLACE);
            ROCHE.FORT.add(VOL);
            ROCHE.FORT.add(INSECT);
            ROCHE.FAIBLE.add(COMBAT);
            ROCHE.FAIBLE.add(SOL);
            ROCHE.FAIBLE.add(ACIER);
        }
        return ROCHE;
    }
    public static Type spectre() {
        if(SPECTRE.FAIBLE.isEmpty()) {
            SPECTRE.FORT.add(PSY);
            SPECTRE.FORT.add(SPECTRE);
            SPECTRE.FAIBLE.add(TENEBRE);
            SPECTRE.INEFFICACE.add(NORMAL);
        }
        return SPECTRE;
    }
    public static Type dragon() {
        if(DRAGON.FAIBLE.isEmpty()) {
            DRAGON.FORT.add(DRAGON);
            DRAGON.FAIBLE.add(ACIER);
            DRAGON.INEFFICACE.add(FEE);
        }
        return DRAGON;
    }
    public static Type tenebre() {
        if(TENEBRE.FAIBLE.isEmpty()) {
            TENEBRE.FORT.add(PSY);
            TENEBRE.FORT.add(SPECTRE);
            TENEBRE.FAIBLE.add(COMBAT);
            TENEBRE.FAIBLE.add(TENEBRE);
            TENEBRE.FAIBLE.add(FEE);
        }
        return TENEBRE;
    }
    public static Type acier() {
        if(ACIER.FAIBLE.isEmpty()) {
            ACIER.FORT.add(GLACE);
            ACIER.FORT.add(ROCHE);
            ACIER.FORT.add(FEE);
            ACIER.FAIBLE.add(FEU);
            ACIER.FAIBLE.add(EAU);
            ACIER.FAIBLE.add(ELECTRIK);
            ACIER.FAIBLE.add(ACIER);
        }
        return ACIER;
    }
    public static Type fee() {
        if(FEE.FAIBLE.isEmpty()) {
            FEE.FORT.add(COMBAT);
            FEE.FORT.add(DRAGON);
            FEE.FORT.add(TENEBRE);
            FEE.FAIBLE.add(FEU);
            FEE.FAIBLE.add(POISON);
            FEE.FAIBLE.add(ACIER);
        }
        return FEE;
    }
}
