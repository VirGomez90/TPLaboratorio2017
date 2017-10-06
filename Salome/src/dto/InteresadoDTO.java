package dto;

public class InteresadoDTO {
	private int idInteresado;
	private int personaInteresada;
	private int ambientes;
	private int mtsCubiertos;
	private int mtsTotal;
	private String quincho;
	private String parrilla;
	private String salon;
	private int banios;
	private int habitaciones;
	private int garage;
	private int pileta;
	private int balcon;
	private int tipo;
	
	public InteresadoDTO(
		int idInteresado,
		int personaInteresada,
		int ambientes,
		int mtsCubiertos,
		int mtsTotal,
		String quincho,
		String parrilla,
		String salon,
		int banios,
		int habitaciones,
		int garage,
		int pileta,
		int balcon,
		int tipo)
	{
		this.idInteresado = idInteresado;
		this.personaInteresada = personaInteresada;
		this.ambientes = ambientes;
		this.mtsCubiertos = mtsCubiertos;
		this.mtsTotal = mtsTotal;
		this.quincho = quincho;
		this.parrilla = parrilla;
		this.salon = salon;
		this.banios = banios;
		this.habitaciones = habitaciones;
		this.garage = garage;
		this.pileta = pileta;
		this.balcon = balcon;
		this.tipo = tipo;
	}
	
	public int getIdInteresado() {
		return idInteresado;
	}
	public void setIdInteresado(int idInteresado) {
		this.idInteresado = idInteresado;
	}
	public int getPersonaInteresada() {
		return personaInteresada;
	}
	public void setPersonaInteresada(int personaInteresada) {
		this.personaInteresada = personaInteresada;
	}
	public int getAmbientes() {
		return ambientes;
	}
	public void setAmbientes(int ambientes) {
		this.ambientes = ambientes;
	}
	public int getMtsCubiertos() {
		return mtsCubiertos;
	}
	public void setMtsCubiertos(int mtsCubiertos) {
		this.mtsCubiertos = mtsCubiertos;
	}
	public int getMtsTotal() {
		return mtsTotal;
	}
	public void setMtsTotal(int mtsTotal) {
		this.mtsTotal = mtsTotal;
	}
	public String getQuincho() {
		return quincho;
	}
	public void setQuincho(String quincho) {
		this.quincho = quincho;
	}
	public String getParrilla() {
		return parrilla;
	}
	public void setParrilla(String parrilla) {
		this.parrilla = parrilla;
	}
	public String getSalon() {
		return salon;
	}
	public void setSalon(String salon) {
		this.salon = salon;
	}
	public int getBanios() {
		return banios;
	}
	public void setBanios(int banios) {
		this.banios = banios;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	public int getGarage() {
		return garage;
	}
	public void setGarage(int garage) {
		this.garage = garage;
	}
	public int getPileta() {
		return pileta;
	}
	public void setPileta(int pileta) {
		this.pileta = pileta;
	}
	public int getBalcon() {
		return balcon;
	}
	public void setBalcon(int balcon) {
		this.balcon = balcon;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
