public class Data{

    private int dia;
    private int mes;
    private int ano;
    
    //construtores inicializadores
    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Data padrão definida: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    //getters e setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validaData(dia, mes, ano)) {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validaData(dia, mes, ano)) {
            this.ano = ano;
        }
    }
    
    
    //to string
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    
    
    //valida data 
    private boolean validaData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        if (mes == 2) {
            if (dia > 28 && !verificaAnoBissexto()) {
                return false;
            } else if (dia > 29) {
                return false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;
            }
        }

        return true;
    }

    //valida ano bissexto
    public boolean verificaAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}