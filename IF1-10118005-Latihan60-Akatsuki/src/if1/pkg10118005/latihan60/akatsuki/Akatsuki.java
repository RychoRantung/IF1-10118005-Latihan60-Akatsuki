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
public class Akatsuki {
    private final String arti;
    private final String tujuan;
    private final String leader;

    public Akatsuki(String arti, String tujuan, String leader) {
        this.arti = arti;
        this.tujuan = tujuan;
        this.leader = leader;
    }

    public String getArti() {
        return arti;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getLeader() {
        return leader;
    }
    public void tampilAkatsuki(){
        System.out.println("Akatsuki : " + arti);
        System.out.println("Leader : " + leader );
        System.out.println("Goal : " + tujuan +"\n");
        
    }
}
