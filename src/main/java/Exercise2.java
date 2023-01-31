import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercise2 {

    //return product price including Danish taxes (dk: moms)
  public double salesTaxCalculation(double productPrice) {
      if (productPrice >= 0){
          return Math.round(productPrice * 1.25 * 100) / 100.0;
      }
      else {
          throw new IllegalArgumentException();
      }
  }
}
