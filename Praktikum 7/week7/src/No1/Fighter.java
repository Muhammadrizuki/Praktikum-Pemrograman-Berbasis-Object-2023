package No1;

public class Fighter extends Character{
    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return this.attackPower;
    }

    int attack(String attackType) {

        int ret = this.attackPower;

        if (attackType.equals("melee")){
            ret = this.attackPower*2;
        } else if (attackType.equals("ranged")) {
            ret = this.attackPower;
        }

        return ret;
    }


}
