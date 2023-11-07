public class WhackString {
//Prints out a String with a random mole 

    //instance variables
    private String whackString;
    private int index;
    
    //constructor
    public WhackString () {
        whackString = "";
        index = (int)(Math.random() * 5 + 1);
    }

    //creates a String with a random mole
    public String createString () {
      for (int i = 0; i < 5; i++) {
          if (i != index) {
              whackString += "-";
          }
          else {
              whackString += "$";
          }
      }
      return whackString;

  }
}
