package variable;

import pokemon.Pokemon;
import static pokemon.Type.*;

import java.util.ArrayList;

public class Variable_Pokemon extends Variable_Attaque{

    public Pokemon bulbizarre() {
        Pokemon bulbizarre = new Pokemon("Bulbizarre", plante(), poison(), 0, 10, 150,attack_florizarre());
        bulbizarre.setEvolution(herbizarre());
        return bulbizarre;
    }
    public Pokemon herbizarre() {
        Pokemon herbizarre = new Pokemon("Herbizarre", plante(), poison(), 0, 15, 100,attack_florizarre());
        herbizarre.setEvolution(florizarre());
        return herbizarre;
    }
    public Pokemon florizarre() {
        return new Pokemon("Florizarre", plante(), poison(), 0, 50,attack_florizarre());
    }
    public Pokemon salameche() {
        Pokemon salameche = new Pokemon("Salameche", feu(), null, 0, 5, 150,attack_dracaufeu());
        salameche.setEvolution(reptincel());
        return salameche;
    }
    public Pokemon reptincel() {
        Pokemon reptincel = new Pokemon("Reptincel", feu(), null, 0, 10, 100,attack_dracaufeu());
        reptincel.setEvolution(dracaufeu());
        return reptincel;
    }
    public Pokemon dracaufeu() {
        return new Pokemon("Dracaufeu", feu(), vol(), 0, 50,attack_dracaufeu());
    }
    public Pokemon carapuce() {
        Pokemon carapuce = new Pokemon("Carapuce", eau(), null, 0, 10, 150,attack_tortank());
        carapuce.setEvolution(carabaffe());
        return carapuce;
    }
    public Pokemon carabaffe() {
        Pokemon carabaffe = new Pokemon("Carabaffe", eau(), null, 0, 15, 100,attack_tortank());
        carabaffe.setEvolution(tortank());
        return carabaffe;
    }
    public Pokemon tortank() {
        return new Pokemon("Tortank", eau(), null, 0, 50,attack_tortank());
    }
    public Pokemon tortipouss() {
        Pokemon tortipouss = new Pokemon("Tortipouss", plante(), null, 0, 10, 150,attack_torterra());
        tortipouss.setEvolution(boskara());
        return tortipouss;
    }
    public Pokemon boskara() {
        Pokemon boskara = new Pokemon("Boskara", plante(), null, 0, 15, 100,attack_torterra());
        boskara.setEvolution(torterra());
        return boskara;
    }
    public Pokemon torterra() {
        return new Pokemon("Torterra", plante(), sol(), 0, 50,attack_torterra());
    }
    public Pokemon ouisticram() {
        Pokemon ouisticram = new Pokemon("Ouisticram", feu(), null, 0, 5, 150,attack_simiabraz());
        ouisticram.setEvolution(chimpenfeu());
        return ouisticram;
    }
    public Pokemon chimpenfeu() {
        Pokemon chimpenfeu = new Pokemon("Chimpeufeu", feu(), combat(), 0, 10, 100,attack_simiabraz());
        chimpenfeu.setEvolution(simiabraz());
        return chimpenfeu;
    }
    public Pokemon simiabraz() {
        return new Pokemon("Simiabraz", feu(), combat(), 0, 50,attack_simiabraz());
    }
    public Pokemon tiplouf() {
        Pokemon tiplouf = new Pokemon("Tiplouf", eau(), null, 0, 10, 150,attack_pingoleon());
        tiplouf.setEvolution(prinplouf());
        return tiplouf;
    }
    public Pokemon prinplouf() {
        Pokemon prinplouf = new Pokemon("Prinplouf", eau(), null, 0, 15, 100,attack_pingoleon());
        prinplouf.setEvolution(pingoleon());
        return prinplouf;
    }
    public Pokemon pingoleon() {
        return new Pokemon("Pingoleon", eau(), acier(), 0, 50,attack_pingoleon());
    }
    public Pokemon etourmi() {
        Pokemon etourmi = new Pokemon("Etourmi", normal(), vol(), 0, 10, 150,attack_etouraptor());
        etourmi.setEvolution(etourvol());
        return etourmi;
    }
    public Pokemon etourvol() {
        Pokemon etourvol = new Pokemon("Etourvol", normal(), vol(), 0, 15, 100,attack_etouraptor());
        etourvol.setEvolution(etouraptor());
        return etourvol;
    }
    public Pokemon etouraptor() {
        return new Pokemon("Etouraptor", normal(), vol(), 0, 50,attack_etouraptor());
    }
    public Pokemon keunotor() {
        Pokemon keunotor = new Pokemon("Keunotor", normal(), null, 0, 10, 150,attack_castorno());
        keunotor.setEvolution(castorno());
        return keunotor;
    }
    public Pokemon castorno() {
        return new Pokemon("Castorno", normal(), eau(), 0, 75,attack_castorno());
    }
    public Pokemon crikzik() {
        Pokemon crikzik = new Pokemon("Crikzik", insect(), null, 0, 10, 150,attack_melokrik());
        crikzik.setEvolution(melokrik());
        return crikzik;
    }
    public Pokemon melokrik() {
        return new Pokemon("Melokrik", insect(), null, 0, 75,attack_melokrik());
    }
    public Pokemon lixy() {
        Pokemon lixy = new Pokemon("Lixy", electrik(), null, 0, 10, 150,attack_luxray());
        lixy.setEvolution(luxio());
        return lixy;
    }
    public Pokemon luxio() {
        Pokemon luxio = new Pokemon("Luxio", electrik(), null, 0, 15, 100,attack_luxray());
        luxio.setEvolution(luxray());
        return luxio;
    }
    public Pokemon luxray() {
        return new Pokemon("Luxray", electrik(), null, 0, 50,attack_luxray());
    }
    public Pokemon rozbouton() {
        Pokemon rozbouton = new Pokemon("Rozbouton", plante(), poison(), 0, 10, 150,attack_roserade());
        rozbouton.setEvolution(roselia());
        return rozbouton;
    }
    public Pokemon roselia() {
        Pokemon roselia = new Pokemon("Roselia", plante(), poison(), 0, 15, 100,attack_roserade());
        roselia.setEvolution(roserade());
        return roselia;
    }
    public Pokemon roserade() {
        return new Pokemon("Roserade", plante(), poison(), 0, 50,attack_roserade());
    }
    public Pokemon kranidos() {
        Pokemon kranidos = new Pokemon("Kranidos", roche(), null, 0, 10, 150,attack_charkos());
        kranidos.setEvolution(charkos());
        return kranidos;
    }
    public Pokemon charkos() {
        return new Pokemon("Charkos", roche(), null, 0, 75,attack_charkos());
    }
    public Pokemon dinoclier() {
        Pokemon dinoclier = new Pokemon("Dinoclier", roche(), acier(), 0, 10, 150,attack_bastiodon());
        dinoclier.setEvolution(bastiodion());
        return dinoclier;
    }
    public Pokemon bastiodion() {
        return new Pokemon("Bastiodion", roche(), acier(), 0, 75,attack_bastiodon());
    }
    public Pokemon cheniti() {
        Pokemon cheniti = new Pokemon("Cheniti", insect(), null, 0, 10, 150,attack_papilord());
        cheniti.setEvolution(cheniselle());
        return cheniti;
    }
    public Pokemon cheniselle() {
        Pokemon cheniselle = new Pokemon("Cheniselle", plante(), insect(), 0, 15, 100,attack_papilord());
        cheniselle.setEvolution(papilord());
        return cheniselle;
    }
    public Pokemon papilord() {
        return new Pokemon("Papilord", vol(), insect(), 0, 50,attack_papilord());
    }
    public Pokemon apitrini() {
        Pokemon apitrini = new Pokemon("Apitrini", insect(), vol(), 0, 10, 150,attack_apireine());
        apitrini.setEvolution(apireine());
        return apitrini;
    }
    public Pokemon apireine() {
        return new Pokemon("Apireine", insect(), vol(), 0, 75,attack_apireine());
    }
    public Pokemon pachirisu() {
        return new Pokemon("Pachirisu", electrik(), null, 0, 100,attack_pachirisu());
    }
    public Pokemon mustebouee() {
        Pokemon mustebouee = new Pokemon("Mustebouee", eau(), null, 0, 10, 150,attack_musteflott());
        mustebouee.setEvolution(musteflott());
        return mustebouee;
    }
    public Pokemon musteflott() {
        return new Pokemon("Musteflott", eau(), null, 0, 75,attack_musteflott());
    }
    public Pokemon ceribou() {
        Pokemon ceribou = new Pokemon("Ceribou", plante(), null, 0, 10, 150,attack_ceriflor());
        ceribou.setEvolution(ceriflor());
        return ceribou;
    }
    public Pokemon ceriflor() {
        return new Pokemon("Ceriflor", plante(), null, 0, 75,attack_ceriflor());
    }
    public Pokemon sancoki() {
        Pokemon sancoki = new Pokemon("Sancoki", eau(), null, 0, 10, 150,attack_tritosor());
        sancoki.setEvolution(tritosor());
        return sancoki;
    }
    public Pokemon tritosor() {
        return new Pokemon("Tritosor", eau(), sol(), 0, 75,attack_tritosor());
    }
    public Pokemon baudrive() {
        Pokemon baudrive = new Pokemon("Baudrive", spectre(), vol(), 0, 10, 150,attack_grodrive());
        baudrive.setEvolution(grodrive());
        return baudrive;
    }
    public Pokemon grodrive() {
        return new Pokemon("Grodrive", spectre(), vol(), 0, 75,attack_grodrive());
    }
    public Pokemon laporeille() {
        Pokemon laporeille = new Pokemon("Laporeille", normal(), null, 0, 10, 150,attack_lockpin());
        laporeille.setEvolution(lockpin());
        return laporeille;
    }
    public Pokemon lockpin() {
        return new Pokemon("Lockpin", normal(), null, 0, 75,attack_lockpin());
    }
    public Pokemon feuforeve() {
        Pokemon feuforeve = new Pokemon("Feuforeve", spectre(), null, 0, 10, 150,attack_magireve());
        feuforeve.setEvolution(magireve());
        return feuforeve;
    }
    public Pokemon magireve() {
        return new Pokemon("Magireve", spectre(), null, 0, 75,attack_magireve());
    }
    public Pokemon cornebre() {
        Pokemon cornebre = new Pokemon("Cornebre", tenebre(), vol(), 0, 10, 150,attack_corboss());
        cornebre.setEvolution(corboss());
        return cornebre;
    }
    public Pokemon corboss() {
        return new Pokemon("Corboss", tenebre(), vol(), 0, 75,attack_corboss());
    }
    public Pokemon moufouette() {
        Pokemon moufouette = new Pokemon("Moufouette", poison(), tenebre(), 0, 10, 150,attack_moufflair());
        moufouette.setEvolution(moufflair());
        return moufouette;
    }
    public Pokemon moufflair() {
        return new Pokemon("Moufflair", poison(), tenebre(), 0, 75,attack_moufflair());
    }
    public Pokemon mimejr() {
        Pokemon mimejr = new Pokemon("Mime jr", psy(), fee(), 0, 10, 150,attack_mmime());
        mimejr.setEvolution(mmime());
        return mimejr;
    }
    public Pokemon mmime() {
        return new Pokemon("M.mime", psy(), fee(), 0, 75,attack_mmime());
    }
    public Pokemon spiritomb() {
        return new Pokemon("Spiritomb", tenebre(), spectre(), 0, 5,attack_spiritomb());
    }
    public Pokemon griknot() {
        Pokemon griknot = new Pokemon("Griknot", dragon(), sol(), 0, 5, 150,attack_carchacrok());
        griknot.setEvolution(carmache());
        return griknot;
    }
    public Pokemon carmache() {
        Pokemon carmache = new Pokemon("Carmache", dragon(), sol(), 0, 10, 100,attack_carchacrok());
        carmache.setEvolution(carchacrok());
        return carmache;
    }
    public Pokemon carchacrok() {
        return new Pokemon("Carchacrok", dragon(), sol(), 0, 50,attack_carchacrok());
    }
    public Pokemon goinfrex() {
        Pokemon goinfrex = new Pokemon("Goinfrex", normal(), null, 0, 10, 150,attack_ronflex());
        goinfrex.setEvolution(ronflex());
        return goinfrex;
    }
    public Pokemon ronflex() {
        return new Pokemon("Ronflex", normal(), null, 0, 75,attack_ronflex());
    }
    public Pokemon riolu() {
        Pokemon riolu = new Pokemon("Riolu", combat(), null, 0, 10, 150,attack_lucario());
        riolu.setEvolution(lucario());
        return riolu;
    }
    public Pokemon lucario() {
        return new Pokemon("Lucario", combat(), acier(), 0, 75,attack_lucario());
    }
    public Pokemon rapion() {
        Pokemon rapion = new Pokemon("Rapion", poison(), insect(), 0, 10, 150,attack_drascore());
        rapion.setEvolution(drascore());
        return rapion;
    }
    public Pokemon drascore() {
        return new Pokemon("Drascore", poison(), tenebre(), 0, 75,attack_drascore());
    }
    public Pokemon cradopaud() {
        Pokemon cradopaud = new Pokemon("Cradopaud", poison(), combat(), 0, 10, 150,attack_coatox());
        cradopaud.setEvolution(coatox());
        return cradopaud;
    }
    public Pokemon coatox() {
        return new Pokemon("Coatox", poison(), combat(), 0, 75,attack_coatox());
    }
    public Pokemon blizzi() {
        Pokemon blizzi = new Pokemon("Blizzi", plante(), glace(), 0, 10, 150,attack_blizzaroi());
        blizzi.setEvolution(blizzaroi());
        return blizzi;
    }
    public Pokemon blizzaroi() {
        return new Pokemon("Blizzaroi", plante(), glace(), 0, 75,attack_blizzaroi());
    }
    public Pokemon farfuret() {
        Pokemon farfuret = new Pokemon("Farfuret", tenebre(), glace(), 0, 10, 150,attack_dimoret());
        farfuret.setEvolution(dimoret());
        return farfuret;
    }
    public Pokemon dimoret() {
        return new Pokemon("Dimoret", tenebre(), glace(), 0, 75,attack_dimoret());
    }
    public Pokemon magneti() {
        Pokemon magneti = new Pokemon("Magneti", electrik(), acier(), 0, 10, 150,attack_magnezone());
        magneti.setEvolution(magneton());
        return magneti;
    }
    public Pokemon magneton() {
        Pokemon magneton = new Pokemon("Magneton", electrik(), acier(), 0, 15, 100,attack_magnezone());
        magneton.setEvolution(magnezone());
        return magneton;
    }
    public Pokemon magnezone() {
        return new Pokemon("Magnezone", electrik(), acier(), 0, 50,attack_magnezone());
    }
    public Pokemon rhinocorne() {
        Pokemon rhinocorne = new Pokemon("Rhinocorne", sol(), roche(), 0, 10, 150,attack_rhinastoc());
        rhinocorne.setEvolution(rhinoferos());
        return rhinocorne;
    }
    public Pokemon rhinoferos() {
        Pokemon rhinoferos = new Pokemon("Rhinoferos", sol(), roche(), 0, 15, 100,attack_rhinastoc());
        rhinoferos.setEvolution(rhinastoc());
        return rhinoferos;
    }
    public Pokemon rhinastoc() {
        return new Pokemon("Rhinastoc", sol(), roche(), 0, 50,attack_rhinastoc());
    }
    public Pokemon elekid() {
        Pokemon elekid = new Pokemon("Elekid", electrik(), null, 0, 10, 150,attack_elekable());
        elekid.setEvolution(elektek());
        return elekid;
    }
    public Pokemon elektek() {
        Pokemon elektek = new Pokemon("Elektek", electrik(), null, 0, 15, 100,attack_elekable());
        elektek.setEvolution(elekable());
        return elektek;
    }
    public Pokemon elekable() {
        return new Pokemon("Elekable", electrik(), null, 0, 50,attack_elekable());
    }
    public Pokemon magby() {
        Pokemon magby = new Pokemon("Magby", feu(), null, 0, 10, 150,attack_maganon());
        magby.setEvolution(magmar());
        return magby;
    }
    public Pokemon magmar() {
        Pokemon magmar = new Pokemon("Magmar", feu(), null, 0, 15, 100,attack_maganon());
        magmar.setEvolution(maganon());
        return magmar;
    }
    public Pokemon maganon() {
        return new Pokemon("Maganon", feu(), null, 0, 50,attack_maganon());
    }
    public Pokemon togepi() {
        Pokemon togepi = new Pokemon("Togepi", fee(), null, 0, 10, 150,attack_togekiss());
        togepi.setEvolution(togetic());
        return togepi;
    }
    public Pokemon togetic() {
        Pokemon togetic = new Pokemon("Togetic", fee(), vol(), 0, 15, 100,attack_togekiss());
        togetic.setEvolution(togekiss());
        return togetic;
    }
    public Pokemon togekiss() {
        return new Pokemon("Togekiss", fee(), vol(), 0, 50,attack_togekiss());
    }
    public Pokemon yanma() {
        Pokemon yanma = new Pokemon("Yanma", insect(), vol(), 0, 10, 150,attack_yanmega());
        yanma.setEvolution(yanmega());
        return yanma;
    }
    public Pokemon yanmega() {
        return new Pokemon("Yanmega", insect(), vol(), 0, 75,attack_yanmega());
    }
    public Pokemon marcacrin() {
        Pokemon marcacrin = new Pokemon("Marcacrin", sol(), glace(), 0, 10, 150,attack_mammochon());
        marcacrin.setEvolution(cochignon());
        return marcacrin;
    }
    public Pokemon cochignon() {
        Pokemon cochignon = new Pokemon("Cochignon", sol(), glace(), 0, 15, 100,attack_mammochon());
        cochignon.setEvolution(mammochon());
        return cochignon;
    }
    public Pokemon mammochon() {
        return new Pokemon("Mammochon", sol(), glace(), 0, 50,attack_mammochon());
    }
    public Pokemon tarsal() {
        Pokemon tarsal = new Pokemon("Tarsal", fee(), psy(), 0, 10, 150,attack_gardevoir());
        tarsal.setEvolution(kirlia());
        return tarsal;
    }
    public Pokemon kirlia() {
        Pokemon kirlia = new Pokemon("Kirlia", fee(), psy(), 0, 15, 100,attack_gardevoir());
        kirlia.setEvolution(gardevoir());
        return kirlia;
    }
    public Pokemon gardevoir() {
        return new Pokemon("Gardevoir", fee(), psy(), 0, 50,attack_gardevoir());
    }
    public Pokemon kabuto() {
        Pokemon kabuto = new Pokemon("Kabuto", eau(), roche(), 0, 10, 150,attack_kabutops());
        kabuto.setEvolution(kabutops());
        return kabuto;
    }
    public Pokemon kabutops() {
        return new Pokemon("Kabutops", eau(), roche(), 0, 75,attack_kabutops());
    }
    public Pokemon minidraco() {
        Pokemon minidraco = new Pokemon("Minidraco", dragon(), null, 0, 5, 150,attack_dracolosse());
        minidraco.setEvolution(draco());
        return minidraco;
    }
    public Pokemon draco() {
        Pokemon draco = new Pokemon("Draco", dragon(), null, 0, 10, 100,attack_dracolosse());
        draco.setEvolution(dracolosse());
        return draco;
    }
    public Pokemon dracolosse() {
        return new Pokemon("Dracolosse", dragon(), vol(), 0, 50,attack_dracolosse());
    }
    public Pokemon nenupiot() {
        Pokemon nenupiot = new Pokemon("Nenupiot", plante(), eau(), 0, 5, 150,attack_ludicolo());
        nenupiot.setEvolution(lombre());
        return nenupiot;
    }
    public Pokemon lombre() {
        Pokemon lombre = new Pokemon("Lombre", plante(), eau(), 0, 10, 100,attack_ludicolo());
        lombre.setEvolution(ludicolo());
        return lombre;
    }
    public Pokemon ludicolo() {
        return new Pokemon("Ludicolo", plante(), eau(), 0, 50,attack_ludicolo());
    }
    public Pokemon anorith() {
        Pokemon anorith = new Pokemon("Anorith", insect(), roche(), 0, 10, 150,attack_armaldo());
        anorith.setEvolution(armaldo());
        return anorith;
    }
    public Pokemon armaldo() {
        return new Pokemon("Armaldo", insect(), roche(), 0, 75,attack_armaldo());
    }
    public Pokemon obalie() {
        Pokemon obalie = new Pokemon("Obalie", glace(), eau(), 0, 5, 150,attack_kaimorse());
        obalie.setEvolution(phogleur());
        return obalie;
    }
    public Pokemon phogleur() {
        Pokemon phogleur = new Pokemon("Phogleur", glace(), eau(), 0, 10, 100,attack_kaimorse());
        phogleur.setEvolution(kaimorse());
        return phogleur;
    }
    public Pokemon kaimorse() {
        return new Pokemon("Kaimorse", glace(), eau(), 0, 50,attack_kaimorse());
    }
    public Pokemon terhal() {
        Pokemon terhal = new Pokemon("Terhal", acier(), psy(), 0, 5, 150,attack_metalosse());
        terhal.setEvolution(metang());
        return terhal;
    }
    public Pokemon metang() {
        Pokemon metang = new Pokemon("Metang", acier(), psy(), 0, 10, 100,attack_metalosse());
        metang.setEvolution(metalosse());
        return metang;
    }
    public Pokemon metalosse() {
        return new Pokemon("Metalosse", acier(), psy(), 0, 50,attack_metalosse());
    }
    public Pokemon mewtwo() {
        return new Pokemon("Mewtwo", psy(), null, 0, -20,attack_mewtwo());
    }
    public Pokemon lugia() {
        return new Pokemon("Lugia", psy(), vol(), 0, -20,attack_lugia());
    }
    public Pokemon hooh() {
        return new Pokemon("Ho-oh", feu(), vol(), 0, -20,attack_hooh());
    }
    public Pokemon rayquaza() {
        return new Pokemon("Rayquaza", dragon(), vol(), 0, -20,attack_rayquaza());
    }
    public Pokemon jirachi() {
        return new Pokemon("Jirachi", psy(), acier(), 0, -20,attack_jirachi());
    }
    public Pokemon dialga() {
        return new Pokemon("Dialga", dragon(), acier(), 0, -20,attack_dialga());
    }
    public Pokemon palkia() {
        return new Pokemon("Palkia", dragon(), eau(), 0, -20,attack_palkia());
    }
    public Pokemon giratina() {
        return new Pokemon("Giratina", dragon(), spectre(), 0, -20,attack_giratina());
    }
    public Pokemon darkrai() {
        return new Pokemon("Darkrai", tenebre(), null, 0, -20,attack_darkrai());
    }

    public ArrayList<Pokemon> pokemon_faible() {
        ArrayList<Pokemon> pokemon_faible = new ArrayList<>();
        pokemon_faible.add(bulbizarre());
        pokemon_faible.add(salameche());
        pokemon_faible.add(carapuce());
        pokemon_faible.add(tortipouss());
        pokemon_faible.add(ouisticram());
        pokemon_faible.add(tiplouf());
        pokemon_faible.add(etourmi());
        pokemon_faible.add(keunotor());
        pokemon_faible.add(crikzik());
        pokemon_faible.add(lixy());
        pokemon_faible.add(rozbouton());
        pokemon_faible.add(kranidos());
        pokemon_faible.add(dinoclier());
        pokemon_faible.add(cheniti());
        pokemon_faible.add(apitrini());
        pokemon_faible.add(pachirisu());
        pokemon_faible.add(mustebouee());
        pokemon_faible.add(ceribou());
        pokemon_faible.add(sancoki());
        pokemon_faible.add(baudrive());
        pokemon_faible.add(laporeille());
        pokemon_faible.add(feuforeve());
        pokemon_faible.add(cornebre());
        pokemon_faible.add(moufouette());
        pokemon_faible.add(mimejr());
        pokemon_faible.add(griknot());
        pokemon_faible.add(goinfrex());
        pokemon_faible.add(riolu());
        pokemon_faible.add(rapion());
        pokemon_faible.add(cradopaud());
        pokemon_faible.add(blizzi());
        pokemon_faible.add(farfuret());
        pokemon_faible.add(magneti());
        pokemon_faible.add(rhinocorne());
        pokemon_faible.add(elekid());
        pokemon_faible.add(magby());
        pokemon_faible.add(togepi());
        pokemon_faible.add(yanma());
        pokemon_faible.add(marcacrin());
        pokemon_faible.add(tarsal());
        pokemon_faible.add(kabuto());
        pokemon_faible.add(minidraco());
        pokemon_faible.add(nenupiot());
        pokemon_faible.add(anorith());
        pokemon_faible.add(obalie());
        pokemon_faible.add(terhal());
        return pokemon_faible;
    }

    public ArrayList<Pokemon> pokemon_moyen() {
        ArrayList<Pokemon> pokemon_moyen = new ArrayList<>();
        pokemon_moyen.add(herbizarre());
        pokemon_moyen.add(reptincel());
        pokemon_moyen.add(carabaffe());
        pokemon_moyen.add(boskara());
        pokemon_moyen.add(chimpenfeu());
        pokemon_moyen.add(prinplouf());
        pokemon_moyen.add(etourvol());
        pokemon_moyen.add(luxio());
        pokemon_moyen.add(roselia());
        pokemon_moyen.add(cheniselle());
        pokemon_moyen.add(carmache());
        pokemon_moyen.add(magneton());
        pokemon_moyen.add(rhinoferos());
        pokemon_moyen.add(elektek());
        pokemon_moyen.add(magmar());
        pokemon_moyen.add(togetic());
        pokemon_moyen.add(cochignon());
        pokemon_moyen.add(kirlia());
        pokemon_moyen.add(draco());
        pokemon_moyen.add(lombre());
        pokemon_moyen.add(phogleur());
        pokemon_moyen.add(metang());
        return pokemon_moyen;
    }

    public ArrayList<Pokemon> pokemon_fort() {
        ArrayList<Pokemon> pokemon_fort = new ArrayList<>();
        pokemon_fort.add(florizarre());
        pokemon_fort.add(dracaufeu());
        pokemon_fort.add(tortank());
        pokemon_fort.add(torterra());
        pokemon_fort.add(simiabraz());
        pokemon_fort.add(pingoleon());
        pokemon_fort.add(etouraptor());
        pokemon_fort.add(castorno());
        pokemon_fort.add(melokrik());
        pokemon_fort.add(luxray());
        pokemon_fort.add(roserade());
        pokemon_fort.add(charkos());
        pokemon_fort.add(bastiodion());
        pokemon_fort.add(papilord());
        pokemon_fort.add(apireine());
        pokemon_fort.add(musteflott());
        pokemon_fort.add(ceriflor());
        pokemon_fort.add(tritosor());
        pokemon_fort.add(grodrive());
        pokemon_fort.add(lockpin());
        pokemon_fort.add(magireve());
        pokemon_fort.add(corboss());
        pokemon_fort.add(moufflair());
        pokemon_fort.add(mmime());
        pokemon_fort.add(carchacrok());
        pokemon_fort.add(ronflex());
        pokemon_fort.add(lucario());
        pokemon_fort.add(drascore());
        pokemon_fort.add(coatox());
        pokemon_fort.add(blizzaroi());
        pokemon_fort.add(dimoret());
        pokemon_fort.add(magnezone());
        pokemon_fort.add(rhinastoc());
        pokemon_fort.add(elekable());
        pokemon_fort.add(maganon());
        pokemon_fort.add(togekiss());
        pokemon_fort.add(yanmega());
        pokemon_fort.add(mammochon());
        pokemon_fort.add(gardevoir());
        pokemon_fort.add(kabutops());
        pokemon_fort.add(dracolosse());
        pokemon_fort.add(ludicolo());
        pokemon_fort.add(armaldo());
        pokemon_fort.add(kaimorse());
        pokemon_fort.add(metalosse());
        return pokemon_fort;
    }

    public ArrayList<Pokemon> pokemon_legendaire() {
        ArrayList<Pokemon> pokemon_legendaire = new ArrayList<>();
        pokemon_legendaire.add(spiritomb());
        pokemon_legendaire.add(mewtwo());
        pokemon_legendaire.add(lugia());
        pokemon_legendaire.add(hooh());
        pokemon_legendaire.add(rayquaza());
        pokemon_legendaire.add(jirachi());
        pokemon_legendaire.add(dialga());
        pokemon_legendaire.add(palkia());
        pokemon_legendaire.add(giratina());
        pokemon_legendaire.add(darkrai());
        return pokemon_legendaire;
    }

}
