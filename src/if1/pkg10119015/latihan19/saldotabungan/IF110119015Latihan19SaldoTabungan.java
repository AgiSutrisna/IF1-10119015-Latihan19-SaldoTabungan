/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan19.saldotabungan;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int i;
        int saldoAwal = 2500000;
        
        for(i=1; i<=6; i++){
            double bunga = 0.15 * saldoAwal;
            System.out.print("Saldo di bulan ke-"+i+" Rp.");
            System.out.println(saldoAwal=(int) (saldoAwal+bunga));
        }
    }
    
}
