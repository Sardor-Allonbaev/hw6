public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setName("Bull");
    boss.setHealth(500);
    boss.setDamaage(50);
    boss.weapon.setName("Kalashnikov");
    boss.weapon.setWeaponType(WeaponType.FIRE);
        System.out.println("name: " + boss.getName() + "\nhealth: " + boss.getHealth() + "\ndamage: " + boss.getDamaage() + "\nweaponName: " + boss.weapon.getName() + "\nweaponType: " + boss.weapon.getWeaponType());
    }
}