public class Exercise4 {

  // Exchange bad word with nicer word
  public String exchangeBadword(String text) {
    String newText;
    if (text.contains("sgu")){
      newText = text.replace("sgu", "sandelig");
    }
    else if (text.contains("fandeme")){
      newText = text.replace("fandeme", "sandelig");
    }
    else if (text.contains("kraftedme")){
      newText = text.replace("kraftedme", "sandelig");
    }
    else {
      return text;
    }
    return newText;
  }

}
