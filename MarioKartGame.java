// Programmers: Bonita Rodrigues
// Course:  CS 212, Dr.Nweke
// Due Date: 2/8/24
// Lab Assignment: Mario Kart Activity
// Problem Statement: Creates a player class which allows new players to be created
// Input: none
// Output: display user stats, boost speed
// Credits: none
class MarioKartGame {
    public static void main(String[] args) {

        // Instantiating 2 MarioKartPlayer objects (Gigi and Bonita)
        MarioKartPlayer gigi = new MarioKartPlayer("Gigi", "Luigi", 80);
        MarioKartPlayer bonita = new MarioKartPlayer("Bonita", "Mario", 70);

        // Displaying information of 2 objects
        gigi.displayInfo();
        bonita.displayInfo();

        // Boost Action for 2 objects
        gigi.boostSpeed();
        bonita.boostSpeed();

        // Display updated information
        gigi.displayInfo();
        bonita.displayInfo();

    }
}