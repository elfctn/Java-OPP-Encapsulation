package org.example;

public class Main {
    public static void main(String[] args) {
        // Point testleri
        Point point1 = new Point(6, 5);
        Point point2 = new Point(3, 1);

        System.out.println("📌 Point Sınıfı Testleri");
        System.out.println("Mesafe (0,0): " + point1.distance());
        System.out.println("Mesafe (point2): " + point1.distance(point2));
        System.out.println("Mesafe (2,2): " + point1.distance(2, 2));
        System.out.println("Mesafe (0,0) – alternatif: " + point1.distance(0, 0));

        // Player ve Weapon testleri
        Player player = new Player("John", 100, Weapon.SWORD);
        System.out.println("\n🛡️ Player Sınıfı Testleri");
        System.out.println("Başlangıç sağlığı: " + player.healthRemaining());

        player.loseHealth(20);
        System.out.println("20 hasar sonrası sağlık: " + player.healthRemaining());

        player.restoreHealth(10);
        System.out.println("10 sağlık iksiri sonrası sağlık: " + player.healthRemaining());

        player.loseHealth(100);
        System.out.println("100 hasar sonrası sağlık: " + player.healthRemaining());

        // Weapon enum testi
        System.out.println("\n⚔️ Weapon Sınıfı Testi");
        for (Weapon w : Weapon.values()) {
            System.out.println(w.name() + " -> Damage: " + w.getDamage() + ", Attack Speed: " + w.getAttackSpeed());
        }
    }
}
