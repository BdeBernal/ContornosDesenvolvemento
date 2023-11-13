

/**
 * Class Persoa
 */
public class Persoa {

  //
  // Fields
  //

  private Nif NIF;
  private Nome nome_completo;
  private Data data_nacemento;
  
  //
  // Constructors
  //
  public Persoa () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of NIF
   * @param newVar the new value of NIF
   */
  public void setNIF (Nif newVar) {
    NIF = newVar;
  }

  /**
   * Get the value of NIF
   * @return the value of NIF
   */
  public Nif getNIF () {
    return NIF;
  }

  /**
   * Set the value of nome_completo
   * @param newVar the new value of nome_completo
   */
  public void setNome_completo (Nome newVar) {
    nome_completo = newVar;
  }

  /**
   * Get the value of nome_completo
   * @return the value of nome_completo
   */
  public Nome getNome_completo () {
    return nome_completo;
  }

  /**
   * Set the value of data_nacemento
   * @param newVar the new value of data_nacemento
   */
  public void setData_nacemento (Data newVar) {
    data_nacemento = newVar;
  }

  /**
   * Get the value of data_nacemento
   * @return the value of data_nacemento
   */
  public Data getData_nacemento () {
    return data_nacemento;
  }

  //
  // Other methods
  //

}
