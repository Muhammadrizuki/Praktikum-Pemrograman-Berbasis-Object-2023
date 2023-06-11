package No1;

public class Mage extends Character {

    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
       return attackPower;
    }

    @Override
    int attack(String attackType) {
      int KekuatanSerangan = attackPower;
      if (attackType.equalsIgnoreCase("fire")) {
        KekuatanSerangan = attackPower * 3 ;
      } else if (attackType.equalsIgnoreCase("frost")) {
        KekuatanSerangan = attackPower* 2 ;
      }
      return KekuatanSerangan;
    }
}
