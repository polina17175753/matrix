        public class Main {
        public static void main(String[] args) {
            Matrix m1 = new Matrix(3, 3);
            Matrix m2 = new Matrix(3, 3);
            new Matrix(3, 3);
            new Matrix(3, 3);
            new Matrix(3, 3);
            m1.output();
            System.out.println();
            m2.output();
            System.out.println();
            Matrix m3 = m1.mplus(m2);
            m3.output();
            System.out.println();
            Matrix m4 = m1.umnozhenie(3);
            m4.output();
            System.out.println();
            Matrix m5 = m1.umnozheniemat(m4);
            m5.output();
            System.out.println();
    }
}