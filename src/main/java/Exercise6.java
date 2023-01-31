import java.util.ArrayList;
import java.util.HashSet;

public class Exercise6 {

  // return the number of unique colors in ArrayList
  public int findUniqueColors(ArrayList<String> colors) {
    HashSet<String> uniqueColor = new HashSet<>(colors);
    return uniqueColor.size();
  }
}
