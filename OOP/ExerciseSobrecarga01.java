package OOP;

public class ExerciseSobrecarga01 {
    public int soma(int a, int b) {
        return a + b;
    }

    public int soma(int a, int b, int c) {
        return a + b + c;
    }
    public double soma(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        ExerciseSobrecarga01 newSobrecarga = new ExerciseSobrecarga01();

      double result01 = newSobrecarga.soma(10, 20);
      double result02 = newSobrecarga.soma(10,20,30);
      double result03 = newSobrecarga.soma(20.3, 12.4);

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);

    }

}
