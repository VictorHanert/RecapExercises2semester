public class Exercise5 {

  // return how many times a specific letter occurs in text string
  public int letterCount(char letter, String text) {
    int count = 0;

    for (int i = 0; i < text.length(); i++) {
      if (text.toLowerCase().charAt(i) == Character.toLowerCase(letter)) {
        count++;
      }
    }
    return count;
  }
}
