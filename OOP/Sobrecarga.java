package OOP;

public class Sobrecarga {
    public String name;
    public int valueStok;
    public double priceValueUniStok;



   public Sobrecarga() {
    }
    public Sobrecarga(String name, int valueStok, double priceValueUniStok) {
       this.name = name;
       this.valueStok = valueStok;
       this.priceValueUniStok = priceValueUniStok;
    }

    public Sobrecarga(String name, int valueStok) {
       this.name = name;
       this.valueStok = valueStok;
    }

    public double valorEmEstoque(double value) {
       double result = (value * 10)  + priceValueUniStok;
       return result;
    }
}
