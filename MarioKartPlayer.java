// Read the README.md
// Read it again
// Your code here
// Delete these 4 lines of comments

class MarioKartPlayer {

//////////////////////////////////////////////////////////////////////////////////

// Data Fields (variables)
private String playerName;
private String character;
private int speed;

// General Constructor (parameterized)
public MarioKartPlayer(String playerName, String character, int speed){
    this.playerName = playerName;
    this.character = character;
    this.speed = speed;
}
// Default Constructor
public MarioKartPlayer(){
    this.playerName = "Unknown";
    this.character = "Unknown";
    this.speed = 50;
}

//////////////////////////////////////////////////////////////////////////////////

// Methods
public void boostSpeed(){
    speed += 10;
    System.out.println(character + "'s speed increased to " + speed + "\n");
}
public void displayInfo(){
    System.out.println("Player Name: " + playerName);
    System.out.println("Character: " + character);
    System.out.println("Current Speed: " + speed + "\n");
}

////////////////////////////////////////////////////////////////////////////////////
}


