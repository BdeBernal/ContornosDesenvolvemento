/**
 * Class Rectangle
 */
public class Rectangle implements IShape {

  //
  // Fields
  //

  private double width;
  private double height;
  
  //
  // Constructors
  //
  public Rectangle () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of width
   * @param newVar the new value of width
   */
  public void setWidth (double newVar) {
    width = newVar;
  }

  /**
   * Get the value of width
   * @return the value of width
   */
  public double getWidth () {
    return width;
  }

  /**
   * Set the value of height
   * @param newVar the new value of height
   */
  public void setHeight (double newVar) {
    height = newVar;
  }

  /**
   * Get the value of height
   * @return the value of height
   */
  public double getHeight () {
    return height;
  }

  //
  // Other methods
  //

  /**
   * @return       double
   */
  public double getArea()
  {
    return height * width;
  }


}
