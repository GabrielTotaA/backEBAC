package projetohotel.models;

public class Reserva {
    private String nomeHospede; 
    private String tipoQuarto;
    private int numeroDias;
    private Double valorDiaria;

    public Reserva(String nomeHospede, String tipoQuarto, Integer numeroDias, Double valorDiaria){
         if (nomeHospede == null || nomeHospede.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (tipoQuarto == null || tipoQuarto.isBlank()) {
            throw new IllegalArgumentException("Tipo do quarto não pode ser vazio.");
        }
        if (numeroDias <= 0) {
            throw new IllegalArgumentException("Dias deve ser maior que zero.");
        }
        if (valorDiaria <= 0) {
            throw new IllegalArgumentException("Valor da diária deve ser maior que zero.");
        }
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
        this.numeroDias = numeroDias;
        this.valorDiaria = valorDiaria;
    }

    public Double calcularValorTotal(){
        Double total = 0.0;
        if (valorDiaria != null) {
            total = this.numeroDias * this.valorDiaria;
        }
        return total;
    }

    public String getNome(){
        return this.nomeHospede;
    }

    public Integer getDias(){
        return this.numeroDias;
    }

    @Override
    public String toString(){
        return  "-------------------------------------"+
                "\nReserva em nome de: "+nomeHospede+
                "\nTipo de quarto: "+tipoQuarto+
                "\nQtd de dias: "+numeroDias+              
                "\nValor da diaria: "+valorDiaria+
                "\nValor total da estadia: "+calcularValorTotal()+
                "\n-------------------------------------";
    }
}
