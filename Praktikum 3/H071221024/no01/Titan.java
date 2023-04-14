package no01;

public class Titan {
    public String name;
    public String titanType;
    public Power power;

    public Titan(){

    }
    public Titan(String name, String titanType, Power power){
        this.name = name;
        this.titanType = titanType;
        this.power = power;
    }

    public void attackTo(Titan enemy){
        if (enemy.power.hp > 0 && this.power.hp > 0){ //syarat power hp musuh harus lebih besar dari nol dan hp hero harus lebih besar dari nol
            if (enemy.power.attack >= 0 && this.power.attack >= 0 && enemy.power.defense >= 0 && this.power.defense >= 0){
                if (power.attack > enemy.power.defense) {
                    enemy.power.hp = enemy.power.hp - (power.attack - enemy.power.defense);
                    if (enemy.power.defense > 0) { //ketika enemy defense = 0, kode line 22 sampai dengan 27 tidak akan dieksekusi (enemy defense akan tetap sama dengan 0 dan enemy defense tidak akan berkurang)
                        enemy.power.defense -= power.attack;
                        if (enemy.power.defense < 0) { //lama-lama enemy defense akan berkurang.., jadi harus dibatasi
                            enemy.power.defense = 0; //ambang batas defensenya nol
                        }
                    }
                    if (enemy.power.hp > 0){
                        System.out.println("HAHAHAHA Rasakan ini!!!");
                        System.out.println("Sisa Hp " + enemy.titanType + " = " + enemy.power.hp);
                        System.out.println();
                    } else if (enemy.power.hp <= 0){
                        enemy.power.hp = 0;
                        System.out.println("HAHAHAHA Rasakan ini!!!");
                        System.out.println("Sisa Hp " + enemy.titanType + " = " + enemy.power.hp);
                        System.out.println();
                        System.out.println("Hp dari " + enemy.titanType + " sudah habis!!!");
                        System.out.println(this.titanType + " menang!!!");
                        System.out.println();    
                    }
                } else {
                    enemy.power.defense -= power.attack;
                    System.out.println("UPSSSS!!! Defense Powerku Kuat!!!");
                    System.out.println("Sisa Hp " + enemy.titanType + " = " + enemy.power.hp);
                    System.out.println();
                }  
            } else {
                System.out.println("Attack & Defense Power dari Titan harus lebih dari atau sama dengan nol");
                System.out.println(); 
            }
        } else {
            System.out.println("Hp dari Titan harus lebih dari nol");
            System.out.println();
        }
        
    }
    public void upAttack(int upAttack){
        power.attack += upAttack;
        System.out.println("Attack Power dari " + this.titanType + " bertambah sebanyak " + upAttack);
        System.out.println("Attack Power dari " + this.titanType+ " sekarang = " + power.attack);
        System.out.println();
    }
    public void upDefense(int upDefense){
        power.defense += upDefense;
        System.out.println("Defense Power dari " + this.titanType + " bertambah sebanyak " + upDefense);
        System.out.println("Defense Power dari " + this.titanType+ " sekarang = " + power.defense);
        System.out.println();
    }
    public void statusTitan(){
        System.out.println("Name : " + this.name);
        System.out.println("Tipe Titan: " + this.titanType);
        System.out.println("Hp : " + power.hp);
        System.out.println("Attack Power : " + power.attack);
        System.out.println("Defense Power : " + power.defense);
        System.out.println();
    }
}
