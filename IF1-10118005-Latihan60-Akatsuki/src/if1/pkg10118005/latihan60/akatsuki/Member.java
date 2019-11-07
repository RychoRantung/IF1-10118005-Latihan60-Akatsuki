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
public class Member extends Akatsuki{
    private String nama;
    private String asal;
    private String senjata;
    private String kekuatan;
    private String partner;
    private String status;

    public Member(String nama, String asal, String senjata, String kekuatan, String partner, String status, String arti, String tujuan, String leader) {
        super(arti, tujuan, leader);
        this.nama = nama;
        this.asal = asal;
        this.senjata = senjata;
        this.kekuatan = kekuatan;
        this.partner = partner;
        this.status = status;
    }
    public void tampilMember(){
        System.out.println("Name: " + nama);
        System.out.println("Village of Origin: " +asal);
        System.out.println("Weapon: " + senjata);
        System.out.println("Ability: "  +kekuatan);
        System.out.println("Partner: " +partner);
        System.out.println("Status: " + status+ "\n");
    }
    
    
}
