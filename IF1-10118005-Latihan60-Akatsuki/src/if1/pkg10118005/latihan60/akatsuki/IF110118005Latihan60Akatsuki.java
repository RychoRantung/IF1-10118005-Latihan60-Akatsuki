/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan60.akatsuki;

/**
 *
 * @author USER
 */
public class IF110118005Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Akatsuki akatsuki = new Akatsuki("(暁, Literally meaning: \"Dawn\" or \"Daybreak\") was a group of shinobi that existed outside the usual system of hidden villages.", "Gaining domination over the Shinobi world", "Pain & Uchiha Obito");
        Member itachi = new Member("Uchiha Itachi", "Konohagakure", "Katana,Shuriken,Kunai", "Mangekyo Sharingan", "Hoshigaki Kisame", "Succumbed to illness while fighting Uchiha Sasuke", null, null, null);
        Member kisame = new Member("Hoshigaki Kisame", "Kirigakure", "Samehada", "Great physical strength", "Uchiha Itachi", "	Committed suicide on the Island Turtle", null, null, null);
        Member kakuzu = new Member("Kakuzu", "Takigakure", "-", "Able to release 5 elements", "Hidan", "Killed by Kakashi Hatake", null, null, null);
        Member hidan = new Member("Hidan", "Yugakure", "Scythe", "Immortality", "Kakuzu", "Buried by Shikamaru Nara", null, null, null);
        Member sasori = new Member("Sasori", "Sunagakure", "Puppets", "Able to control his puppets", "Deidara", "Killer by Chiyo", null, null, null);
        Member deidara = new Member("Deidara", "Iwagakure", "Clay", "Explosion release kekkai genkai", "Sasori", "Committed suicide while fighting Sasuke Uchiha", null, null, null);
        Member obito = new Member("Uchiha Obito", "Konohagakure", "Gunbai", "Mangekyo Sharingan,Rinnegan", "Deidara", "Killed by Kaguya Ōtsutsuki", null, null, null);
        Member konan = new Member("Konan", "Amegakure", "Paper", "Turn the paper to a weapon", "Pain", "Killed by Obito", null, null, null);
        Member pain = new Member("Pain", "Amegakure", "-", "Rinnegan", "Konan", "Deceased", null, null, null);
        
        akatsuki.tampilAkatsuki();
        itachi.tampilMember();
        kisame.tampilMember();
        kakuzu.tampilMember();
        hidan.tampilMember();
        sasori.tampilMember();
        deidara.tampilMember();
        obito.tampilMember();
        konan.tampilMember();
        pain.tampilMember();
    }
    
}
