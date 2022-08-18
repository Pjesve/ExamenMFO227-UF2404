
public class SeguroCoche extends Poliza {
	
	public String matricula;
	public int anyoCarnet;
	
	
	public SeguroCoche(String idPoliza, String nombre, String apellidos, String dni, int anyo, String formaPago,
			double primaBase, int numSiniestrosHistorico, String matricula, int anyoCarnet) {
		super(idPoliza, nombre, apellidos, dni, anyo, formaPago, primaBase, numSiniestrosHistorico);
		this.matricula = matricula;
		this.anyoCarnet = anyoCarnet;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getAnyoCarnet() {
		return anyoCarnet;
	}


	public void setAnyoCarnet(int anyoCarnet) {
		this.anyoCarnet = anyoCarnet;
	}


	@Override
	public String toString() {
		return "SeguroCoche [matricula=" + matricula + ", anyoCarnet=" + anyoCarnet + "]";
	}
	
	
	

}
