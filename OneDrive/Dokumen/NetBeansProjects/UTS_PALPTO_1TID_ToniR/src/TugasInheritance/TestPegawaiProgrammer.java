/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasInheritance;


/**
 *
 * @author LAB313-PC27
 */
public class TestPegawaiProgrammer {
    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        p1.inTime(p1.name);
        p1.absensi(p1.name);
        p1.meeting(p1.name);
        System.out.println("Gaji pokok "+p1.name+": "+p1.gaji);
        p1.monitoring();
        p1.service();
        System.out.println("Bonus gaji "+p1.name+": "+p1.gajiBonus);
        p1.total(p1.gaji);
}
}
