package application;

public class Calculcadora {
	private String display;
	private int valorDisplay;
	private int operando1;
	
	public int getValorDisplay() {
		return valorDisplay;
	}

	public void setValorDisplay(int valorDisplay) {
		this.valorDisplay = valorDisplay;
	}

	public int getOperando1() {
		return operando1;
	}

	public void setOperando1() {
		this.operando1 = Integer.valueOf(display);
	}

	public int getOperando2() {
		return operando2;
	}

	public void setOperando2() {
		this.operando2 = Integer.valueOf(display);
		
	}
    public int soma(){
    	return operando1 + operando2;
    }
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	private int operando2;
	private boolean state;

	public Calculcadora() {
		state = false;
		display = "";
	}

	public void appendDisplay(String c){
		display += c;
	}
	public void setDisplay(String valDisplay){
		display = valDisplay;
	}
	public String getDisplay(){
		return display;
	}
}
