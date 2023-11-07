public WhackString {
//Prints out the String with the mole in it
    private String whackString = "";
    private int index;
    index = (int)(Math.random() * 5 + 1);

    public String createString () {
      for (i = 0; i < 5; i++) {
          if (i != index) {
              String += "-";
          }
          else {
              String += "$";
          }
      }
      return String;

  }
}
