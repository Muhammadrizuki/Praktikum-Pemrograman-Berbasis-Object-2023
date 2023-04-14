package no01;

public class Main {
    public static void main(String[] args) {
        Power attackTitanPower = new Power(100, 50, 20);
        Power armoredTitanPower = new Power(100, 40, 70);

        Titan attackTitan = new Titan("Eren", "Attack Titan", attackTitanPower);
        Titan armoredTitan = new Titan("Reiner", "Armored Titan", armoredTitanPower);

        armoredTitan.statusTitan();
        attackTitan.attackTo(armoredTitan);
        armoredTitan.statusTitan();
        armoredTitan.upDefense(20);
        armoredTitan.statusTitan();
        attackTitan.upAttack(30);
        attackTitan.statusTitan();
        armoredTitan.upAttack(20);
        armoredTitan.statusTitan();
        attackTitan.upDefense(10);
        attackTitan.statusTitan();
        attackTitan.attackTo(armoredTitan);
        armoredTitan.statusTitan();
        armoredTitan.attackTo(attackTitan);
        attackTitan.statusTitan();
        attackTitan.attackTo(armoredTitan);

        // armoredTitan.attackTo(attackTitan);
    }

    
}
