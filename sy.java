System.out.println("Please enter a single character: ");
  String character = in.next();

  System.out.println(character);

  if (character.isLetter()){
    System.out.println("The character entered is a letter.");
  }
  else (character.isDigit()){
    System.out.println("The character entered is a digit.");
