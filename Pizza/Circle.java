

/**
 * Class Circle
 */
public class Circle implements IShape {

  //
  // Fields
  //

  private double radius;
  
  //
  // Constructors
  //
  public Circle () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of radius
   * @param newVar the new value of radius
   */
  public void setRadius (double newVar) {
    radius = newVar;
  }

  /**
   * Get the value of radius
   * @return the value of radius
   */
  public double getRadius () {
    return radius;
  }

  //
  // Other methods
  //

  /**
   * @return       double
   */
  public double getArea()
  {
    return Math.PI * radius * radius;
  }


}
