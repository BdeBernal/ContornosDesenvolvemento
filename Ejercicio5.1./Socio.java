

/**
 * Class Socio
 */
public class Socio {

  //
  // Fields
  //

  private String codigo;
  private Persoa socio;
  private Data alta;
  
  //
  // Constructors
  //
  public Socio () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of codigo
   * @param newVar the new value of codigo
   */
  public void setCodigo (String newVar) {
    codigo = newVar;
  }

  /**
   * Get the value of codigo
   * @return the value of codigo
   */
  public String getCodigo () {
    return codigo;
  }

  /**
   * Set the value of socio
   * @param newVar the new value of socio
   */
  public void setSocio (Persoa newVar) {
    socio = newVar;
  }

  /**
   * Get the value of socio
   * @return the value of socio
   */
  public Persoa getSocio () {
    return socio;
  }

  /**
   * Set the value of alta
   * @param newVar the new value of alta
   */
  public void setAlta (Data newVar) {
    alta = newVar;
  }

  /**
   * Get the value of alta
   * @return the value of alta
   */
  public Data getAlta () {
    return alta;
  }

  //
  // Other methods
  //

}
