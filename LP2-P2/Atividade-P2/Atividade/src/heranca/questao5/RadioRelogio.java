package heranca.questao5;

public class RadioRelogio implements Radio, Relogio{
	private String horario; 
	private String despertar; 
	private String horarioAlarme; 
	private String emissora; 
	private String tipoEmissora; 
	private int volumeRadio; 
	private int volumeRelogio;
	
	@Override
	public void setHorario(String horario) {
		this.horario = horario; 
	}
	
	@Override
	public String getHorario() {
		return horario;
	}
	@Override
	public void setHorarioAlarme(String horario) {
		this.horarioAlarme = horario;
	}
	
	@Override
	public String getHorarioAlarme() {
		return horarioAlarme;
	}
	
	@Override
	public void ligarAlarme() {
		this.despertar = "on";
	}
	@Override
	public void desligarAlarme() {
		this.despertar = "off";
	}
	
	@Override
	public void setVolumeRelogio(int vol) {
		this.volumeRelogio = vol; 
	}
	
	@Override
	public int getVolumeRelogio() {
		return volumeRelogio;
	}
	
	@Override
	public void setEmissora(String emissora, String tipoEmi) {
		this.emissora = emissora;
		this.tipoEmissora = tipoEmi;
	}
	
	@Override
	public String getEmissora() {
		return emissora;
	}
	
	@Override
	public String tipoEmissora() {
		return tipoEmissora;
	}
	
	@Override
	public void setVolumeRadio(int vol) {
		this.volumeRadio = vol; 
		
	}
	
	@Override
	public int getVolumeRadio() {
		return volumeRadio;
	}
}
