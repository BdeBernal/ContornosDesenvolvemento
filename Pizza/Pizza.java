/**
 * Class Pizza
 */
public class Pizza {

  //
  // Fields
  //

  private double price;
  private IShape shape;
  
  //
  // Constructors
  //
  public Pizza () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of price
   * @param newVar the new value of price
   */
  public void setPrice (double newVar) {
    price = newVar;
  }

  /**
   * Get the value of price
   * @return the value of price
   */
  public double getPrice () {
    return price;
  }

  /**
   * Set the value of shape
   * @param newVar the new value of shape
   */
  public void setShape (IShape newVar) {
    shape = newVar;
  }

  /**
   * Get the value of shape
   * @return the value of shape
   */
  public IShape getShape () {
    return shape;
  }

  //
  // Other methods
  //



}



