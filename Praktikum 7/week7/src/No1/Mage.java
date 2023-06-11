package No1;

public class Mage extends Character{

    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return this.attackPower;
    }

    int attack(String attackType) {

        int ret = this.attackPower;

        if (attackType.equals("frost")){
            ret = this.attackPower*2;
        } else if (attackType.equals("fire")) {
            ret = this.attackPower*3;
        }

        return ret;
    }
}
