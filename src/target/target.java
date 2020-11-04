/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package target;

/**
 *
 * @author RAF
 */
public class target {
    public double saldoAwal = 3500000;
    public double bunga = 0.08;
    public double saldoTarget = 6000000;
        
    public void hitungSaldo(double totalBunga, double total){
        int i = 1;
        do{
        totalBunga = saldoAwal * bunga;
        total = totalBunga + saldoAwal;
        System.out.printf("Saldo di bulan ke-"+i+" Rp. %,1.0f%n",+total);
        saldoAwal += totalBunga;
        i++ ;
        } while (total <= saldoTarget);
    }
}
