
import static java.lang.Math.*;

public class FirstLab {
  public static double func2 (double x) {
    return asin(1/exp(pow(acos((x+4.5d) / 17.0d)/4.0d, tan(pow(x / 2.0d, 3.0d)))));
  }

  public static double func3 (double x){
    return sin(pow(2.0d*sin(pow(PI/x, 3.0d)), 2.0d));
  }

  public static void main(String[] args) {
    short[] d = new short[14]; // от 4 до 17 это 14 чисел
    for (int i = 0; i < 14; i++) {
      d[i] = (short) (i + 4); // каждый элемент это индекс + 4
    }

    double[] x = new double[18]; // новый массив для 18ти случайных чисел
    for (int i = 0; i < 18; i++) {
      x[i] = random() * 17 - 4; // [0,0; 1,0] * 17 - 4 = [0,0; 17,0] - 4 = [-4,0; 13,0]
    }

    double[][] dd = new double[14][18]; // массив номер три для всех результатов
    for (int i = 0; i < 14; i++) {
      for (int j = 0; j < 18; j++) {
        switch (d[i]) {
          case 17: dd[i][j] = 0.5d * exp(exp(x[j])); break;

          case 5:
          case 6:
          case 9:
          case 10:
          case 11:
          case 13:
          case 15: dd[i][j] = func2(x[j]); break;

          default: dd[i][j] = func3(x[j]); break;

        }
        System.out.printf("%.5f ", dd[i][j]);
      }
      System.out.printf("\n");
    }
  }
  
}
