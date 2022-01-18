package cuentas;

/**
 * CCuenta va a representar una cuenta bancaria de un usuario donde podrá consultar, ingresar o retirar una cantidad de dinero.
 * @author Manu
 *
 */

public class CCuenta {
	
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private float cantidad;
    
    public CCuenta()
    {
    }
    
    /**
     * Método constructor que recibe como parámetros un nombre de usuario, número de cuenta, saldo disponible y tipo de interés.
     * Incluye métodos setters para actualizar nombre, número de cuenta y saldo.
     * @param nom Nombre titular cuenta
     * @param cue Número de cuenta
     * @param sal Saldo disponible en cuenta
     * @param tipo Tipo de interés sobre cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Método que retorna el saldo actual de la cuenta
     * @return Retorna saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar cantidad de dinero en la cuenta
     * @param cantidad Cantidad a ingresar en cuenta
     * @throws Exception Lanza excepción en caso de que la cantidad ingresada sea negativa
     * En caso de ser positiva, obtiene saldo actual y le suma la cantidad ingresada
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar cantidad de dinero en la cuenta
     * @param cantidad Cantidad a retirar en cuenta
     * @throws Exception Lanza excepción en caso de que la cantidad retirada sea negativa o si la cantidad a retirar es mayor al saldo disponible
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
     * Método getter para obtener el nombre del titular
     * @return Retorna el nombre
     */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método setter para cambiar el nombre del titular
	 * @param nombre Nombre titular
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método getter para obtener número de cuenta
	 * @return Retorna número de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Método setter para modificar número de cuenta
	 * @param cuenta Número de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método getter para obtener saldo disponible en cuenta
	 * @return Retorna saldo actual
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método setter para actualizar saldo disponible en cuenta
	 * @param saldo Saldo disponible en cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método getter para obtener tipo de interés
	 * @return Retorna tipo de interés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Método setter para actualizar tipo de interés
	 * @param tipoInterés Tipo de interés sobre cuenta
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	/**
	 * Método getter para obtener cantidad a ingresar o retirar
	 * @return Retorna cantidad
	 */
	public float getCantidad() {
		return this.cantidad;
	}
	
	/**
	 * Método setter para actualizar cantidad
	 * @param cantidad Cantidad de saldo
	 */
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
}
