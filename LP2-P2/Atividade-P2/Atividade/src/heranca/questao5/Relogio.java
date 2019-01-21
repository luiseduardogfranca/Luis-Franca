package heranca.questao5;

public interface Relogio {
	public void setHorario(String horario);
	public String getHorario();
	public void setHorarioAlarme(String horario); 
	public String getHorarioAlarme();
	public void ligarAlarme();
	public void desligarAlarme(); 
	public void setVolumeRelogio(int vol);
	public int getVolumeRelogio(); 
}
