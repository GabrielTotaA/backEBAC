package Atividade7.models;
public class Carro {
    String _modelo;
    String _montadora;
    int _ano;
    int _valor;

    public Carro(String modelo, String montadora, int ano, int valor) {
        this._modelo = modelo;
        this._montadora = montadora;
        this._ano = ano;
        this._valor = valor;
    }

    public String getNome() {
        return _modelo;
    }

    public int getValor() {
        return _valor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + _modelo + '\'' +
                ", ano=" + _ano +
                ", montadora=" + _montadora +
                ", valor= R$" + _valor +
                '}';
    }
}
