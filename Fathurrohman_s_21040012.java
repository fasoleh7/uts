/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fathurrohman_s_21040012;

import javax.swing.JOptionPane;

/**
 *
 * @author Fathurrohman Solehudin 21040012
 */
public class Fathurrohman_s_21040012 {
    public static void main(String[] args) {
       String string_nama, Prodi, nim, Kelas,Semester = " ";
JOptionPane.showMessageDialog(null, " POLITEKNIK HARAPAN BERSAMA TEGAL\n"
                                  + " Jl. Dewi Sartika No. 71 (0283)352000\n"
                                  + " =====================================\n");
string_nama = JOptionPane.showInputDialog(null, " Masukkan Nama Anda");
Prodi = JOptionPane.showInputDialog(null,"Masukkan Nama Prodi Anda");
nim = JOptionPane.showInputDialog(null, "Masukkan no. ujian Anda");
Kelas = JOptionPane.showInputDialog(null, " Masukkan Kelas Anda ");
Semester = JOptionPane.showInputDialog(null, "Masukkan Semester Anda");

        System.out.println("PILITEKNIK HARAPAN BRSAMATEGAL\n"
                         + "Jl. Mataram No.09(0283)3520000\n"
                         + "====================================\n"
                         + "KARTU PESERTA UJIAN TENGAH SEMESTER 3\n"
                         + "\n"
                         + "NAMA      :  " +string_nama+"\n"
                         + "PRODI     :  " +Prodi+"\n"
                         + "No. Ujian :  " +nim+"\n"
                         + "KELAS     :  " +Kelas+"\n"
                         + "SEMESTER  :  " +Semester+"\n"
                         + "_________________________________________\n"
                         +"Sekertaris                   Ka.Prodi D3 Kom\n"
                         +"                                            \n"
                         +"(Eko Budi ,ST,M.Kom)         (Rais, S.Pd,M.kom)");
JOptionPane.showMessageDialog(null, "  PILITEKNIK HARAPAN BRSAMA TEGAL\n"
                                  + "  Jl. Mataram No.09(0283)3520000\n"
                                  + "====================================\n"
                                  + "KARTU PESERTA UJIAN TENGAH SEMESTER 3\n"
                                  + "\n"
                                  + "NAMA            :  " +string_nama+"\n"
                                  + "PRODI           :  " +Prodi+"\n"
                                  + "No. Ujian       :  " +nim+"\n"
                                  + "KELAS           :  " +Kelas+"\n"
                                  + "SEMESTER   :  " +Semester+"\n"
                                  + "_______________________________________________\n"
                                  + "Sekretaris                                  Ka.Prodi D3 Kom\n"
                                  + "                                            \n"
                                  + "(Eko Budi,ST,M.Kom)                 (Rais, S.Pd, M.Kom) \n");
    }
    
}
