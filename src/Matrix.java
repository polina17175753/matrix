import java.io.PrintStream;
import java.util.Random;

public class Matrix {
    int a;
    int b;
    int[][] m;

    public void set(int a, int b, int c) {
        this.m[a][b] = c;
    }

    public int get(int a, int b) {
        return this.m[a][b];
    }

    public Matrix(int a, int b) {
        Random random = new Random();
        this.m = new int[a][b];
        for (int i = 0; i < this.m.length; ++i) {
            for (int j = 0; j < this.m[i].length; ++j) {
                this.set(i, j, random.nextInt(10));
            }
        }
        this.a = a;
        this.b = b;
    }

    public void output() {
        for (int i = 0; i < this.m.length; ++i) {
            for (int j = 0; j < this.m[i].length; ++j) {
                PrintStream out = System.out;
                int var = this.get(i, j);
                out.print("" + var + " ");
            }
            System.out.println();
        }
    }

    Matrix mplus(Matrix m) {
        Matrix matr = new Matrix(m.a, m.b);

        for (int i = 0; i < m.a; ++i) {
            for (int j = 0; j < m.b; ++j) {
                matr.set(i, j, this.get(i, j) + m.get(i, j));
            }
        }
        return matr;
    }

    Matrix umnozhenie(int t) {
        Matrix matr = new Matrix(this.a, this.b);

        for (int i = 0; i < this.m.length; ++i) {
            for (int j = 0; j < this.m[i].length; ++j) {
                matr.set(i, j, this.get(i, j) * t);
            }
        }
        return matr;
    }

    Matrix umnozheniemat(Matrix m) {
        Matrix matr = new Matrix(m.a, m.b);

        for (int i = 0; i < m.a; ++i) {
            for (int j = 0; j < m.b; ++j) {
                matr.set(i, j, this.get(i, j) * m.get(i, j));
            }
        }
        return matr;
    }
}
