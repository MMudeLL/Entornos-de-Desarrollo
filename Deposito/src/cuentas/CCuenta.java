package cuentas;

/**
 * CCuenta va a representar una cuenta bancaria de un usuario donde podr� consultar, ingresar o retirar una cantidad de dinero.
 * @author Manu
 *
 */

public class CCuenta {
	
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInter�s;
    private float cantidad;
    
    public CCuenta()
    {
    }
    
    /**
     * M�todo constructor que recibe como par�metros un nombre de usuario, n�mero de cuenta, saldo disponible y tipo de inter�s.
     * Incluye m�todos setters para actualizar nombre, n�mero de cuenta y saldo.
     * @param nom Nombre titular cuenta
     * @param cue N�mero de cuenta
     * @param sal Saldo disponible en cuenta
     * @param tipo Tipo de inter�s sobre cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * M�todo que retorna el saldo actual de la cuenta
     * @return Retorna saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * M�todo para ingresar cantidad de dinero en la cuenta
     * @param cantidad Cantidad a ingresar en cuenta
     * @throws Exception Lanza excepci�n en caso de que la cantidad ingresada sea negativa
     * En caso de ser positiva, obtiene saldo actual y le suma la cantidad ingresada
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * M�todo para retirar cantidad de dinero en la cuenta
     * @param cantidad Cantidad a retirar en cuenta
     * @throws Exception Lanza excepci�n en caso de que la cantidad retirada sea negativa o si la cantidad a retirar es mayor al saldo disponible
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * M�todo getter para obtener el nombre del titular
     * @return Retorna el nombre
     */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo setter para cambiar el nombre del titular
	 * @param nombre Nombre titular
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo getter para obtener n�mero de cuenta
	 * @return Retorna n�mero de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * M�todo setter para modificar n�mero de cuenta
	 * @param cuenta N�mero de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * M�todo getter para obtener saldo disponible en cuenta
	 * @return Retorna saldo actual
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * M�todo setter para actualizar saldo disponible en cuenta
	 * @param saldo Saldo disponible en cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * M�todo getter para obtener tipo de inter�s
	 * @return Retorna tipo de inter�s
	 */
	public double getTipoInter�s() {
		return tipoInter�s;
	}

	/**
	 * M�todo setter para actualizar tipo de inter�s
	 * @param tipoInter�s Tipo de inter�s sobre cuenta
	 */
	public void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}
	
	/**
	 * M�todo getter para obtener cantidad a ingresar o retirar
	 * @return Retorna cantidad
	 */
	public float getCantidad() {
		return this.cantidad;
	}
	
	/**
	 * M�todo setter para actualizar cantidad
	 * @param cantidad Cantidad de saldo
	 */
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
}
