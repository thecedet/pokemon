package variable;

import pokemon.Attaque;
import static pokemon.Type.*;

import java.util.ArrayList;

public class Variable_Attaque {

    public Attaque acide() {
        return new Attaque("Acide",40,poison(),null,30,30);
    }
    public Attaque aeroblast() {
        return new Attaque("Aeroblast",100,vol(),null,5,5);
    }
    public Attaque aeropique() {
        return new Attaque("Aeropique",60,vol(),null,20,20);
    }
    public Attaque aile_d_acier() {
        return new Attaque("Aile d'acier",70,acier(),null,25,25);
    }
    public Attaque aqua_jet() {
        return new Attaque("Aqua-jet",40,eau(),null,20,20);
    }
    public Attaque aurasphere() {
        return new Attaque("Aurasphere",90,combat(),null,20,20);
    }
    public Attaque avalanche() {
        return new Attaque("Avalanche",60,glace(),null,10,10);
    }
    public Attaque ball_ombre() {
        return new Attaque("Ball'ombre",80,spectre(),null,15,15);
    }
    public Attaque belier() {
        return new Attaque("Belier",90,normal(),null,20,20);
    }
    public Attaque blizzard() {
        return new Attaque("Blizzard",120,glace(),"gel",5,5);
    }
    public Attaque bomb_beurk() {
        return new Attaque("Bomb-beurk",90,poison(),"poison",10,10);
    }
    public Attaque boue_bombe() {
        return new Attaque("Boue-bombe",65,sol(),null,10,10);
    }
    public Attaque boutefeu() {
        return new Attaque("Boutefeu",120,feu(),null,15,15);
    }
    public Attaque bulles_d_o() {
        return new Attaque("Bulles d'O",65,eau(),null,20,20);
    }
    public Attaque calinerie() {
        return new Attaque("Calinerie",90,fee(),null,10,10);
    }
    public Attaque canicule() {
        return new Attaque("Canicule",100,feu(),"brule",10,10);
    }
    public Attaque canon_graine() {
        return new Attaque("Canon graine",80,plante(),null,15,15);
    }
    public Attaque carnareket() {
        return new Attaque("Carnareket",140,acier(),null,5,5);
    }
    public Attaque cascade() {
        return new Attaque("Cascade",80,eau(),null,15,15);
    }
    public Attaque casse_brique() {
        return new Attaque("Casse-brique",75,combat(),null,15,15);
    }
    public Attaque charge() {
        return new Attaque("Charge",40,normal(),null,35,35);
    }
    public Attaque choc_mental() {
        return new Attaque("Choc mental",50,psy(),null,25,25);
    }
    public Attaque close_combat() {
        return new Attaque("Close combat",120,combat(),null,5,5);
    }
    public Attaque colere() {
        return new Attaque("Colere",120,dragon(),null,15,15);
    }
    public Attaque coud_krane() {
        return new Attaque("Coud'krane",100,normal(),null,10,10);
    }
    public Attaque coup_bas() {
        return new Attaque("Coup bas",80,tenebre(),null,5,5);
    }
    public Attaque coup_d_jus() {
        return new Attaque("Coup d'jus",80,electrik(),"para",15,15);
    }
    public Attaque coupe() {
        return new Attaque("Coupe",50,normal(),null,30,30);
    }
    public Attaque croc_de_mort() {
        return new Attaque("Croc de mort",80,normal(),null,15,15);
    }
    public Attaque crochetvenin() {
        return new Attaque("Crochetvenin",50,poison(),"poison",15,15);
    }
    public Attaque crocs_eclair() {
        return new Attaque("Crocs eclair",65,electrik(),"para",15,15);
    }
    public Attaque crocs_feu() {
        return new Attaque("Crocs feu",65,feu(),"brule",15,15);
    }
    public Attaque crocs_givre() {
        return new Attaque("Crocs givre",65,glace(),"gel",15,15);
    }
    public Attaque cru_aile() {
        return new Attaque("Cru-aile",60,vol(),null,35,35);
    }
    public Attaque damocles() {
        return new Attaque("Damocles",120,normal(),null,15,15);
    }
    public Attaque dard_nuee() {
        return new Attaque("Dard-nuee",60,insect(),null,20,20);
    }
    public Attaque dard_venin() {
        return new Attaque("Dard-venin",15,poison(),"poison",35,35);
    }
    public Attaque deflagration() {
        return new Attaque("Deflagration",120,feu(),"brule",5,5);
    }
    public Attaque detricanon() {
        return new Attaque("Detricanon",120,poison(),"poison",5,5);
    }
    public Attaque detritus() {
        return new Attaque("Detritus",65,poison(),"poison",20,20);
    }
    public Attaque devoreve() {
        return new Attaque("Devoreve",100,psy(),null,15,15);
    }
    public Attaque direct_toxik() {
        return new Attaque("Direct toxik",80,poison(),"poison",20,20);
    }
    public Attaque draco_ascension() {
        return new Attaque("Draco ascension",150,vol(),null,5,5);
    }
    public Attaque draco_meteor() {
        return new Attaque("Draco meteor",140,dragon(),null,5,5);
    }
    public Attaque dracocharge() {
        return new Attaque("Dracocharge",100,dragon(),null,10,10);
    }
    public Attaque dracogriffe() {
        return new Attaque("Dracogriffe",80,dragon(),null,15,15);
    }
    public Attaque dracosouffle() {
        return new Attaque("Dracosouffle",60,dragon(),"para",20,20);
    }
    public Attaque eboulement() {
        return new Attaque("Eboulement",75,roche(),null,10,10);
    }
    public Attaque eclair() {
        return new Attaque("Eclair",40,electrik(),"para",30,30);
    }
    public Attaque eco_sphere() {
        return new Attaque("Eco-sphere",80,plante(),null,10,10);
    }
    public Attaque ecras_face() {
        return new Attaque("Ecras'face",40,normal(),null,35,35);
    }
    public Attaque ecume() {
        return new Attaque("Ecume",30,eau(),null,30,30);
    }
    public Attaque elecanon() {
        return new Attaque("Elecanon",120,electrik(),"para",5,5);
    }
    public Attaque electacle() {
        return new Attaque("Electacle",120,electrik(),null,10,10);
    }
    public Attaque escalade() {
        return new Attaque("Escalade",90,normal(),null,20,20);
    }
    public Attaque exploforce() {
        return new Attaque("Exploforce",120,combat(),null,5,5);
    }
    public Attaque fatal_foudre() {
        return new Attaque("Fatal-foudre",110,electrik(),"para",10,10);
    }
    public Attaque feu_sacre() {
        return new Attaque("Feu sacre",140,feu(),"brule",5,5);
    }
    public Attaque flammeche() {
        return new Attaque("Flammeche",40,feu(),"brule",25,25);
    }
    public Attaque fleur_cannon() {
        return new Attaque("Fleur cannon",130,fee(),null,5,5);
    }
    public Attaque fouet_lianes() {
        return new Attaque("Fouet lianes",35,plante(),null,25,25);
    }
    public Attaque fracass_tete() {
        return new Attaque("Fracass'tete",150,roche(),null,5,5);
    }
    public Attaque frappe_psy() {
        return new Attaque("Frappe psy",140,psy(),null,5,5);
    }
    public Attaque giga_impact() {
        return new Attaque("Giga impact",150,normal(),null,5,5);
    }
    public Attaque griffe() {
        return new Attaque("Griffe",40,normal(),null,35,35);
    }
    public Attaque griffe_acier() {
        return new Attaque("Griffe acier",50,acier(),null,35,35);
    }
    public Attaque griffe_ombre() {
        return new Attaque("Griffe ombre",70,spectre(),null,15,15);
    }
    public Attaque hurle_temps() {
        return new Attaque("Hurle-temps",150,dragon(),null,5,5);
    }
    public Attaque hydroblast() {
        return new Attaque("Hydroblast",150,eau(),null,5,5);
    }
    public Attaque hydrocanon() {
        return new Attaque("Hydrocanon",120,eau(),null,5,5);
    }
    public Attaque jet_pierres() {
        return new Attaque("Jet-pierres",50,roche(),null,15,15);
    }
    public Attaque lame_d_air() {
        return new Attaque("Lame d'air",75,vol(),null,20,20);
    }
    public Attaque lame_de_roc() {
        return new Attaque("Lame de roc",100,roche(),null,5,5);
    }
    public Attaque lame_feuille() {
        return new Attaque("Lame-feuille",90,plante(),null,15,15);
    }
    public Attaque lance_flamme() {
        return new Attaque("Lance-flamme",95,feu(),"brule",15,15);
    }
    public Attaque lance_soleil() {
        return new Attaque("Lance-soleil",120,plante(),null,10,10);
    }
    public Attaque laser_glace() {
        return new Attaque("Laser glace",95,glace(),"gel",10,10);
    }
    public Attaque lechouille() {
        return new Attaque("Lechouille",20,spectre(),"para",30,30);
    }
    public Attaque lumi_eclat() {
        return new Attaque("Lumi-eclat",70,psy(),null,5,5);
    }
    public Attaque luminocanon() {
        return new Attaque("Luminocanon",80,acier(),null,10,10);
    }
    public Attaque mach_punch() {
        return new Attaque("Mach punch",40,combat(),null,30,30);
    }
    public Attaque machouille() {
        return new Attaque("Machouille",80,tenebre(),null,15,15);
    }
    public Attaque megafouet() {
        return new Attaque("Megafouet",120,plante(),null,10,10);
    }
    public Attaque meteores() {
        return new Attaque("Meteores",60,normal(),null,20,20);
    }
    public Attaque morsure() {
        return new Attaque("Morsure",60,tenebre(),null,25,25);
    }
    public Attaque picore() {
        return new Attaque("Picore",60,vol(),null,20,20);
    }
    public Attaque pique() {
        return new Attaque("Pique",140,vol(),null,5,5);
    }
    public Attaque piqure() {
        return new Attaque("Piqure",60,insect(),null,20,20);
    }
    public Attaque plaie_croix() {
        return new Attaque("Plaie-croix",80,insect(),null,15,15);
    }
    public Attaque poing_de_feu() {
        return new Attaque("Poing de feu",75,feu(),"brule",15,15);
    }
    public Attaque poing_meteor() {
        return new Attaque("Poing meteor",100,acier(),null,10,10);
    }
    public Attaque poing_ombre() {
        return new Attaque("Poing ombre",60,spectre(),null,20,20);
    }
    public Attaque poing_eclair() {
        return new Attaque("Poing-eclair",75,electrik(),"para",15,15);
    }
    public Attaque poinglace() {
        return new Attaque("Poinglace",75,glace(),"gel",15,15);
    }
    public Attaque poison_croix() {
        return new Attaque("Poison-croix",70,poison(),null,20,20);
    }
    public Attaque psyko() {
        return new Attaque("Psyko",90,psy(),null,10,10);
    }
    public Attaque queue_de_fer() {
        return new Attaque("Queue de fer",100,acier(),null,15,15);
    }
    public Attaque rafale_feu() {
        return new Attaque("Rafale feu",150,feu(),null,5,5);
    }
    public Attaque rafale_psy() {
        return new Attaque("Rafale psy",65,psy(),null,20,20);
    }
    public Attaque rayon_signal() {
        return new Attaque("Rayon signal",75,insect(),null,15,15);
    }
    public Attaque represailles() {
        return new Attaque("Represailles",50,tenebre(),null,10,10);
    }
    public Attaque revenant() {
        return new Attaque("Revenant",120,spectre(),null,5,5);
    }
    public Attaque roc_boulet() {
        return new Attaque("Roc-boulet",150,roche(),null,5,5);
    }
    public Attaque roue_de_feu() {
        return new Attaque("Roue de feu",60,feu(),"brule",25,25);
    }
    public Attaque seisme() {
        return new Attaque("Seisme",100,sol(),null,10,10);
    }
    public Attaque spatio_rift() {
        return new Attaque("Spatio-rift",150,dragon(),null,5,5);
    }
    public Attaque telluriforce() {
        return new Attaque("Telluriforce",90,sol(),null,10,10);
    }
    public Attaque tempete_verte() {
        return new Attaque("Tempete verte",130,plante(),null,5,5);
    }
    public Attaque tomberoche() {
        return new Attaque("Tomberoche",50,roche(),null,10,10);
    }
    public Attaque tranch_herbe() {
        return new Attaque("Tranch'herbe",55,plante(),null,25,25);
    }
    public Attaque tranche_nuit() {
        return new Attaque("Tranche-nuit",70,tenebre(),null,15,15);
    }
    public Attaque trou_noir() {
        return new Attaque("Trou noir",140,tenebre(),"endormi",5,5);
    }
    public Attaque ultralaser() {
        return new Attaque("Ultralaser",150,normal(),null,5,5);
    }
    public Attaque vampibaiser() {
        return new Attaque("Vampibaiser",75,fee(),"endormi",15,15);
    }
    public Attaque vege_attak() {
        return new Attaque("Vege-attak",150,plante(),null,5,5);
    }
    public Attaque vent_mauvais() {
        return new Attaque("Vent mauvais",60,spectre(),null,15,15);
    }
    public Attaque vibrobscur() {
        return new Attaque("Vibrobscur",80,tenebre(),null,15,15);
    }
    public Attaque voix_enjoleuse() {
        return new Attaque("Voix enjoleuse",40,fee(),null,15,15);
    }
    public Attaque berceuse() {
        return new Attaque("Berceuse",normal(),"endormi",15,15);
    }
    public Attaque cage_eclair() {
        return new Attaque("Cage-eclair",electrik(),"para",20,20);
    }
    public Attaque poudreuse() {
        return new Attaque("Poudreuse",glace(),"gel",15,15);
    }
    public Attaque toxik() {
        return new Attaque("Toxik",poison(),"poison",10,10);
    }

    public ArrayList<Attaque> attack_florizarre(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(fouet_lianes());
        liste_attack.add(acide());
        liste_attack.add(tranch_herbe());
        liste_attack.add(detritus());
        liste_attack.add(megafouet());
        liste_attack.add(detricanon());
        liste_attack.add(seisme());
        liste_attack.add(vege_attak());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_dracaufeu() {
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(griffe());
        liste_attack.add(flammeche());
        liste_attack.add(morsure());
        liste_attack.add(crocs_feu());
        liste_attack.add(lame_d_air());
        liste_attack.add(dracogriffe());
        liste_attack.add(machouille());
        liste_attack.add(lance_flamme());
        liste_attack.add(rafale_feu());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_tortank(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(ecras_face());
        liste_attack.add(ecume());
        liste_attack.add(bulles_d_o());
        liste_attack.add(morsure());
        liste_attack.add(coud_krane());
        liste_attack.add(laser_glace());
        liste_attack.add(hydrocanon());
        liste_attack.add(blizzard());
        liste_attack.add(hydroblast());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_torterra(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(tranch_herbe());
        liste_attack.add(morsure());
        liste_attack.add(eco_sphere());
        liste_attack.add(queue_de_fer());
        liste_attack.add(seisme());
        liste_attack.add(machouille());
        liste_attack.add(tempete_verte());
        liste_attack.add(vege_attak());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_simiabraz(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(griffe());
        liste_attack.add(flammeche());
        liste_attack.add(mach_punch());
        liste_attack.add(roue_de_feu());
        liste_attack.add(tomberoche());
        liste_attack.add(poing_eclair());
        liste_attack.add(close_combat());
        liste_attack.add(boutefeu());
        liste_attack.add(rafale_feu());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_pingoleon(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(ecras_face());
        liste_attack.add(bulles_d_o());
        liste_attack.add(picore());
        liste_attack.add(aqua_jet());
        liste_attack.add(griffe_acier());
        liste_attack.add(laser_glace());
        liste_attack.add(hydrocanon());
        liste_attack.add(blizzard());
        liste_attack.add(hydroblast());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_etouraptor(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(picore());
        liste_attack.add(cru_aile());
        liste_attack.add(aile_d_acier());
        liste_attack.add(damocles());
        liste_attack.add(aeropique());
        liste_attack.add(close_combat());
        liste_attack.add(aeroblast());
        liste_attack.add(giga_impact());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_castorno(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(ecume());
        liste_attack.add(bulles_d_o());
        liste_attack.add(coupe());
        liste_attack.add(croc_de_mort());
        liste_attack.add(cascade());
        liste_attack.add(ball_ombre());
        liste_attack.add(laser_glace());
        liste_attack.add(hydrocanon());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_melokrik(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(piqure());
        liste_attack.add(griffe());
        liste_attack.add(dard_nuee());
        liste_attack.add(dard_venin());
        liste_attack.add(toxik());
        liste_attack.add(plaie_croix());
        liste_attack.add(coupe());
        liste_attack.add(lance_soleil());
        liste_attack.add(giga_impact());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_luxray(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(eclair());
        liste_attack.add(morsure());
        liste_attack.add(cage_eclair());
        liste_attack.add(crocs_eclair());
        liste_attack.add(crocs_givre());
        liste_attack.add(machouille());
        liste_attack.add(fatal_foudre());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_roserade(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(dard_venin());
        liste_attack.add(tranch_herbe());
        liste_attack.add(coupe());
        liste_attack.add(eco_sphere());
        liste_attack.add(toxik());
        liste_attack.add(bomb_beurk());
        liste_attack.add(calinerie());
        liste_attack.add(fleur_cannon());
        liste_attack.add(lance_soleil());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_charkos(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(eboulement());
        liste_attack.add(belier());
        liste_attack.add(represailles());
        liste_attack.add(queue_de_fer());
        liste_attack.add(coud_krane());
        liste_attack.add(lance_flamme());
        liste_attack.add(fracass_tete());
        liste_attack.add(giga_impact());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_bastiodon(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(boue_bombe());
        liste_attack.add(belier());
        liste_attack.add(tomberoche());
        liste_attack.add(seisme());
        liste_attack.add(machouille());
        liste_attack.add(luminocanon());
        liste_attack.add(deflagration());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_papilord(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(dard_nuee());
        liste_attack.add(tranch_herbe());
        liste_attack.add(rafale_psy());
        liste_attack.add(lame_d_air());
        liste_attack.add(plaie_croix());
        liste_attack.add(psyko());
        liste_attack.add(aeropique());
        liste_attack.add(lance_soleil());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_apireine(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(picore());
        liste_attack.add(dard_nuee());
        liste_attack.add(coupe());
        liste_attack.add(rayon_signal());
        liste_attack.add(aeropique());
        liste_attack.add(plaie_croix());
        liste_attack.add(toxik());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_pachirisu(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(ecras_face());
        liste_attack.add(eclair());
        liste_attack.add(coup_d_jus());
        liste_attack.add(meteores());
        liste_attack.add(croc_de_mort());
        liste_attack.add(cage_eclair());
        liste_attack.add(vampibaiser());
        liste_attack.add(eco_sphere());
        liste_attack.add(fatal_foudre());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_musteflott(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(griffe());
        liste_attack.add(ecume());
        liste_attack.add(bulles_d_o());
        liste_attack.add(morsure());
        liste_attack.add(aqua_jet());
        liste_attack.add(crocs_givre());
        liste_attack.add(machouille());
        liste_attack.add(laser_glace());
        liste_attack.add(hydrocanon());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_ceriflor(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(tranch_herbe());
        liste_attack.add(voix_enjoleuse());
        liste_attack.add(eco_sphere());
        liste_attack.add(berceuse());
        liste_attack.add(bomb_beurk());
        liste_attack.add(plaie_croix());
        liste_attack.add(damocles());
        liste_attack.add(lance_soleil());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_tritosor(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(ecras_face());
        liste_attack.add(ecume());
        liste_attack.add(bulles_d_o());
        liste_attack.add(bulles_d_o());
        liste_attack.add(cascade());
        liste_attack.add(seisme());
        liste_attack.add(lame_de_roc());
        liste_attack.add(hydrocanon());
        liste_attack.add(giga_impact());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_grodrive(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(griffe());
        liste_attack.add(picore());
        liste_attack.add(vent_mauvais());
        liste_attack.add(toxik());
        liste_attack.add(ball_ombre());
        liste_attack.add(represailles());
        liste_attack.add(aeropique());
        liste_attack.add(fatal_foudre());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_lockpin(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(ecras_face());
        liste_attack.add(mach_punch());
        liste_attack.add(escalade());
        liste_attack.add(casse_brique());
        liste_attack.add(poing_eclair());
        liste_attack.add(poing_de_feu());
        liste_attack.add(laser_glace());
        liste_attack.add(lance_soleil());
        liste_attack.add(close_combat());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_magireve(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(vent_mauvais());
        liste_attack.add(rafale_psy());
        liste_attack.add(ball_ombre());
        liste_attack.add(eco_sphere());
        liste_attack.add(griffe_ombre());
        liste_attack.add(vibrobscur());
        liste_attack.add(devoreve());
        liste_attack.add(aeropique());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_corboss(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(picore());
        liste_attack.add(coupe());
        liste_attack.add(represailles());
        liste_attack.add(cru_aile());
        liste_attack.add(tranche_nuit());
        liste_attack.add(aeropique());
        liste_attack.add(vibrobscur());
        liste_attack.add(psyko());
        liste_attack.add(aeroblast());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_moufflair(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(griffe());
        liste_attack.add(coup_bas());
        liste_attack.add(bomb_beurk());
        liste_attack.add(toxik());
        liste_attack.add(griffe_ombre());
        liste_attack.add(queue_de_fer());
        liste_attack.add(tranche_nuit());
        liste_attack.add(lance_flamme());
        liste_attack.add(detricanon());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_mmime(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(rafale_psy());
        liste_attack.add(voix_enjoleuse());
        liste_attack.add(tranch_herbe());
        liste_attack.add(berceuse());
        liste_attack.add(psyko());
        liste_attack.add(calinerie());
        liste_attack.add(devoreve());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_spiritomb(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(vent_mauvais());
        liste_attack.add(coup_bas());
        liste_attack.add(tomberoche());
        liste_attack.add(tranche_nuit());
        liste_attack.add(ball_ombre());
        liste_attack.add(psyko());
        liste_attack.add(vibrobscur());
        liste_attack.add(devoreve());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_carchacrok(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(griffe());
        liste_attack.add(dracosouffle());
        liste_attack.add(boue_bombe());
        liste_attack.add(direct_toxik());
        liste_attack.add(crocs_feu());
        liste_attack.add(seisme());
        liste_attack.add(dracocharge());
        liste_attack.add(machouille());
        liste_attack.add(draco_meteor());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_ronflex(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(morsure());
        liste_attack.add(escalade());
        liste_attack.add(canon_graine());
        liste_attack.add(tomberoche());
        liste_attack.add(aurasphere());
        liste_attack.add(machouille());
        liste_attack.add(colere());
        liste_attack.add(giga_impact());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_lucario(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(griffe());
        liste_attack.add(casse_brique());
        liste_attack.add(griffe_acier());
        liste_attack.add(poing_ombre());
        liste_attack.add(aurasphere());
        liste_attack.add(telluriforce());
        liste_attack.add(poinglace());
        liste_attack.add(poing_meteor());
        liste_attack.add(close_combat());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_drascore(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(dard_nuee());
        liste_attack.add(crochetvenin());
        liste_attack.add(morsure());
        liste_attack.add(toxik());
        liste_attack.add(plaie_croix());
        liste_attack.add(poison_croix());
        liste_attack.add(machouille());
        liste_attack.add(seisme());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_coatox(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(ecras_face());
        liste_attack.add(coup_bas());
        liste_attack.add(boue_bombe());
        liste_attack.add(direct_toxik());
        liste_attack.add(casse_brique());
        liste_attack.add(tomberoche());
        liste_attack.add(poing_eclair());
        liste_attack.add(detricanon());
        liste_attack.add(close_combat());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_blizzaroi(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(tranch_herbe());
        liste_attack.add(avalanche());
        liste_attack.add(poudreuse());
        liste_attack.add(canon_graine());
        liste_attack.add(poinglace());
        liste_attack.add(machouille());
        liste_attack.add(blizzard());
        liste_attack.add(lance_soleil());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_dimoret(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(griffe());
        liste_attack.add(coup_bas());
        liste_attack.add(poinglace());
        liste_attack.add(tranche_nuit());
        liste_attack.add(poudreuse());
        liste_attack.add(griffe_ombre());
        liste_attack.add(griffe_acier());
        liste_attack.add(vibrobscur());
        liste_attack.add(blizzard());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_magnezone(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(crocs_eclair());
        liste_attack.add(meteores());
        liste_attack.add(cage_eclair());
        liste_attack.add(coup_d_jus());
        liste_attack.add(rayon_signal());
        liste_attack.add(luminocanon());
        liste_attack.add(electacle());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_rhinastoc(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(jet_pierres());
        liste_attack.add(boue_bombe());
        liste_attack.add(casse_brique());
        liste_attack.add(coud_krane());
        liste_attack.add(lame_de_roc());
        liste_attack.add(seisme());
        liste_attack.add(canicule());
        liste_attack.add(roc_boulet());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_elekable(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(mach_punch());
        liste_attack.add(poing_eclair());
        liste_attack.add(poing_de_feu());
        liste_attack.add(coup_d_jus());
        liste_attack.add(seisme());
        liste_attack.add(queue_de_fer());
        liste_attack.add(elecanon());
        liste_attack.add(giga_impact());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_maganon(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(griffe());
        liste_attack.add(flammeche());
        liste_attack.add(casse_brique());
        liste_attack.add(poing_de_feu());
        liste_attack.add(coup_bas());
        liste_attack.add(canicule());
        liste_attack.add(exploforce());
        liste_attack.add(deflagration());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_togekiss(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(voix_enjoleuse());
        liste_attack.add(coupe());
        liste_attack.add(vampibaiser());
        liste_attack.add(aeropique());
        liste_attack.add(calinerie());
        liste_attack.add(damocles());
        liste_attack.add(aeroblast());
        liste_attack.add(fleur_cannon());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_yanmega(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(piqure());
        liste_attack.add(cru_aile());
        liste_attack.add(dard_nuee());
        liste_attack.add(aeropique());
        liste_attack.add(represailles());
        liste_attack.add(plaie_croix());
        liste_attack.add(psyko());
        liste_attack.add(aeroblast());
        liste_attack.add(lance_soleil());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_mammochon(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(boue_bombe());
        liste_attack.add(tomberoche());
        liste_attack.add(poudreuse());
        liste_attack.add(crocs_givre());
        liste_attack.add(machouille());
        liste_attack.add(seisme());
        liste_attack.add(blizzard());
        liste_attack.add(giga_impact());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_gardevoir(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(ecras_face());
        liste_attack.add(choc_mental());
        liste_attack.add(vampibaiser());
        liste_attack.add(lumi_eclat());
        liste_attack.add(calinerie());
        liste_attack.add(ball_ombre());
        liste_attack.add(devoreve());
        liste_attack.add(lance_soleil());
        liste_attack.add(fleur_cannon());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_kabutops(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(ecume());
        liste_attack.add(jet_pierres());
        liste_attack.add(tranch_herbe());
        liste_attack.add(aqua_jet());
        liste_attack.add(eboulement());
        liste_attack.add(seisme());
        liste_attack.add(dracogriffe());
        liste_attack.add(hydrocanon());
        liste_attack.add(fracass_tete());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_dracolosse(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(dracosouffle());
        liste_attack.add(cru_aile());
        liste_attack.add(lame_d_air());
        liste_attack.add(dracocharge());
        liste_attack.add(lance_flamme());
        liste_attack.add(laser_glace());
        liste_attack.add(aeroblast());
        liste_attack.add(draco_meteor());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_ludicolo(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(ecume());
        liste_attack.add(tranch_herbe());
        liste_attack.add(bulles_d_o());
        liste_attack.add(coup_bas());
        liste_attack.add(lame_feuille());
        liste_attack.add(cascade());
        liste_attack.add(eco_sphere());
        liste_attack.add(hydrocanon());
        liste_attack.add(tempete_verte());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_armaldo(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(griffe());
        liste_attack.add(boue_bombe());
        liste_attack.add(bulles_d_o());
        liste_attack.add(jet_pierres());
        liste_attack.add(eco_sphere());
        liste_attack.add(eboulement());
        liste_attack.add(seisme());
        liste_attack.add(plaie_croix());
        liste_attack.add(lance_soleil());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_kaimorse(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(bulles_d_o());
        liste_attack.add(crocs_givre());
        liste_attack.add(poudreuse());
        liste_attack.add(cascade());
        liste_attack.add(damocles());
        liste_attack.add(laser_glace());
        liste_attack.add(hydrocanon());
        liste_attack.add(blizzard());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_metalosse(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(griffe());
        liste_attack.add(griffe_acier());
        liste_attack.add(choc_mental());
        liste_attack.add(casse_brique());
        liste_attack.add(psyko());
        liste_attack.add(seisme());
        liste_attack.add(devoreve());
        liste_attack.add(poing_meteor());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_mewtwo(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(charge());
        liste_attack.add(choc_mental());
        liste_attack.add(ball_ombre());
        liste_attack.add(represailles());
        liste_attack.add(psyko());
        liste_attack.add(aurasphere());
        liste_attack.add(damocles());
        liste_attack.add(frappe_psy());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_lugia(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(cru_aile());
        liste_attack.add(choc_mental());
        liste_attack.add(coupe());
        liste_attack.add(aqua_jet());
        liste_attack.add(psyko());
        liste_attack.add(devoreve());
        liste_attack.add(hydrocanon());
        liste_attack.add(pique());
        liste_attack.add(draco_meteor());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_hooh(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(flammeche());
        liste_attack.add(cru_aile());
        liste_attack.add(represailles());
        liste_attack.add(telluriforce());
        liste_attack.add(lance_soleil());
        liste_attack.add(lance_flamme());
        liste_attack.add(aeroblast());
        liste_attack.add(feu_sacre());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_rayquaza(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(morsure());
        liste_attack.add(dracogriffe());
        liste_attack.add(lame_d_air());
        liste_attack.add(machouille());
        liste_attack.add(queue_de_fer());
        liste_attack.add(laser_glace());
        liste_attack.add(colere());
        liste_attack.add(draco_ascension());
        liste_attack.add(draco_meteor());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_jirachi(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(choc_mental());
        liste_attack.add(meteores());
        liste_attack.add(coup_d_jus());
        liste_attack.add(psyko());
        liste_attack.add(aeropique());
        liste_attack.add(luminocanon());
        liste_attack.add(devoreve());
        liste_attack.add(carnareket());
        liste_attack.add(ultralaser());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_dialga(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(dracosouffle());
        liste_attack.add(griffe_acier());
        liste_attack.add(aurasphere());
        liste_attack.add(seisme());
        liste_attack.add(luminocanon());
        liste_attack.add(dracocharge());
        liste_attack.add(queue_de_fer());
        liste_attack.add(deflagration());
        liste_attack.add(hurle_temps());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_palkia(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(dracosouffle());
        liste_attack.add(aqua_jet());
        liste_attack.add(dracogriffe());
        liste_attack.add(telluriforce());
        liste_attack.add(cascade());
        liste_attack.add(aurasphere());
        liste_attack.add(blizzard());
        liste_attack.add(hydrocanon());
        liste_attack.add(spatio_rift());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_giratina(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(lechouille());
        liste_attack.add(dracosouffle());
        liste_attack.add(griffe_ombre());
        liste_attack.add(lame_d_air());
        liste_attack.add(lame_de_roc());
        liste_attack.add(seisme());
        liste_attack.add(revenant());
        liste_attack.add(aeroblast());
        liste_attack.add(draco_meteor());
        return liste_attack;
    }
    public ArrayList<Attaque> attack_darkrai(){
        ArrayList<Attaque> liste_attack = new ArrayList<>();
        liste_attack.add(coup_bas());
        liste_attack.add(ball_ombre());
        liste_attack.add(berceuse());
        liste_attack.add(tranche_nuit());
        liste_attack.add(psyko());
        liste_attack.add(vibrobscur());
        liste_attack.add(devoreve());
        liste_attack.add(fatal_foudre());
        liste_attack.add(trou_noir());
        return liste_attack;
    }
}
