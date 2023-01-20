public class App {
    public static void main(String[] args) {
        

        Character knight = new Character();
        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.attack();

        System.out.println();

        Character mage = new Character();
        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.attack();

        System.out.println();

        Character thief = new Character();
        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.attack();

        System.out.println();

        weapon sword = new weapon(); 
        sword.name = "Excalibur";
        sword.damage = 8;
        sword.rarity = "Imortal";
        sword.swordName();
        sword.swordDamage();
        sword.swordRarity();
        
       

        System.out.println();

        weapon archer = new weapon();
        archer.name = "Dawnbreaker";
        archer.damage = 10;
        archer.rarity = "Mythical";
        archer.swordName();
        archer.swordDamage();
        archer.swordRarity();

        System.out.println();

        weapon gun = new weapon();
        gun.name = "AK47";
        gun.damage = 5;
        gun.rarity = "Rare";
        gun.swordName();
        gun.swordDamage();
        gun.swordRarity();
        gun.add(100);
        gun.add(100);
        System.out.println(gun.weaponName());


        
    }
}
