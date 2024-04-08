public class Fecha {

	//Atributos
	private int dia;
	private int mes;
	private int anio;

	//Constructor
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	//Metodo Validar
	public boolean valida() {
		
		if (dia < 1 || dia > 31) {
			return false;
		}
		if (mes < 1 || mes > 12) {
			return false;
		}
		if (anio < 0) {
			return false;
		}
	
			//Cantidad de días del mes
			return diaMes();

	}

	//Método obtener días del mes
	private boolean diaMes() {
		int diasMes = 0;

		switch (mes) {
			//Meses con 31 días
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 
				diasMes = 31; 
				break;
			
			//Meses con 30 días
			case 4:
			case 6:
			case 9:
			case 11 : 
				diasMes = 30; 
				break;
		
			//Febrero 
			case 2 : 
				if (esBisiesto()) {
					diasMes = 29;
				} else {
					diasMes = 28;
				}
				break;
		}

		if (dia > diasMes) {
				return false;
		} else {
				return true;
		}
			}

	//Método bisiesto
	private boolean esBisiesto() {
		return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
	}
}
