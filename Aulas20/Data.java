package Aulas20;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data(int dia, int mes, int ano) {
        if (!isValidDate(dia, mes, ano)) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    public int compara(Data outraData) {
        LocalDate dataCorrente = LocalDate.of(this.ano, this.mes, this.dia);
        LocalDate dataComparada = LocalDate.of(outraData.getAno(), outraData.getMes(), outraData.getDia());
        return dataCorrente.compareTo(dataComparada);
    }
    public boolean isBissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
    }
    private boolean isValidDate(int dia, int mes, int ano) {
        try {
            LocalDate.of(ano, mes, dia);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public String getMesExtenso() {
        return LocalDate.of(this.ano, this.mes, this.dia)
                .getMonth()
                .getDisplayName(TextStyle.FULL, Locale.getDefault());
    }
    public int getDia() {
        return this.dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return this.mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return this.ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
