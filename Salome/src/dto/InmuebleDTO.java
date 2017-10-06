package dto;

public class InmuebleDTO {
	
	private int idInmueble;
	private String calle;
	private String altura;
	private String depto;
	private String localidad;
	private int duenio;
	private int inmoColega;
	private String cartel;
	private int precio;
	private String alqCom;
	private String alqPart;
	private String vtaCom;
	private String vtaPart;
	private String ambientes;
	private String mtsCub;
	private String mtsTotal;
	private String quincho;
	private String parrilla;
	private String salon;
	private String banios;
	private String habitaciones;
	private String garage;
	private String pileta;
	private String balcon;
	private String tipo;
	
	public InmuebleDTO(
		
		int idInmueble,
		String calle,
		String altura,
		String depto,
		String localidad,
		int duenio,
		int inmoColega,
		String cartel,
		int precio,
		String alqCom,
		String alqPart,
		String vtaCom,
		String vtaPart,
		String ambientes,
		String mtsCub,
		String mtsTotal,
		String quincho,
		String parrilla,
		String salon,
		String banios,
		String habitaciones,
		String garage,
		String pileta,
		String balcon,
		String tipo)
	{
		
		this.idInmueble = idInmueble;
		this.calle = calle;
		this.altura = altura;
		this.depto = depto;
		this.localidad = localidad;
		this.duenio = duenio;
		this.inmoColega = inmoColega;
		this.cartel = cartel;
		this.precio = precio;
		this.alqCom = alqCom;
		this.alqPart = alqPart;
		this.vtaCom = vtaCom;
		this.vtaPart = vtaPart;
		this.ambientes = ambientes;
		this.mtsCub = mtsCub;
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
		
	public int getIdInmueble() {
		return idInmueble;
	}
	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getDuenio() {
		return duenio;
	}
	public void setDuenio(int duenio) {
		this.duenio = duenio;
	}
	public int getInmoColega() {
		return inmoColega;
	}
	public void setInmoColega(int inmoColega) {
		this.inmoColega = inmoColega;
	}
	public String getCartel() {
		return cartel;
	}
	public void setCartel(String cartel) {
		this.cartel = cartel;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getAlqCom() {
		return alqCom;
	}
	public void setAlqCom(String alqCom) {
		this.alqCom = alqCom;
	}
	public String getAlqPart() {
		return alqPart;
	}
	public void setAlqPart(String alqPart) {
		this.alqPart = alqPart;
	}
	public String getVtaCom() {
		return vtaCom;
	}
	public void setVtaCom(String vtaCom) {
		this.vtaCom = vtaCom;
	}
	public String getVtaPart() {
		return vtaPart;
	}
	public void setVtaPart(String vtaPart) {
		this.vtaPart = vtaPart;
	}
	public String getAmbientes() {
		return ambientes;
	}
	public void setAmbientes(String ambientes) {
		this.ambientes = ambientes;
	}
	public String getMtsCub() {
		return mtsCub;
	}
	public void setMtsCub(String mtsCub) {
		this.mtsCub = mtsCub;
	}
	public String getMtsTotal() {
		return mtsTotal;
	}
	public void setMtsTotal(String mtsTotal) {
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
	public String getBanios() {
		return banios;
	}
	public void setBanios(String banios) {
		this.banios = banios;
	}
	public String getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(String habitaciones) {
		this.habitaciones = habitaciones;
	}
	public String getGarage() {
		return garage;
	}
	public void setGarage(String garage) {
		this.garage = garage;
	}
	public String getPileta() {
		return pileta;
	}
	public void setPileta(String pileta) {
		this.pileta = pileta;
	}
	public String getBalcon() {
		return balcon;
	}
	public void setBalcon(String balcon) {
		this.balcon = balcon;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
