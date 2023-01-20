import java.util.jar.Attributes.Name;
public class weapon {
    String name;
    int damage;
    String rarity;

    public void swordName() {
        System.out.println("Weapon Name: " + name);
    }
    public void swordDamage(){
        System.out.println("Damage: " + damage);
    }
    public void swordRarity(){
        System.out.println("Rarity: "+ rarity);
    }
    void add(int damage1){
        int newDamage = this.damage + damage1;
        System.out.println("Added Damage: "+ damage1 + " "+ "= " + newDamage );
        this.damage = newDamage;
    }
    String weaponName(){
        return "Name: " + name + "  Rarity: " + rarity;
    }
    
}
