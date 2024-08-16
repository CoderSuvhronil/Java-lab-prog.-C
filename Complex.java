class Complex {
    float real;
    float imaginary;

    void set(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void disp() {
        System.out.println(real + " + " + imaginary + "i");
    }

    Complex sum(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.imaginary = this.imaginary + c.imaginary;
        return result;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        c1.set(3.4f, 2.7f);
        c2.set(1.2f, 3.1f);

        c3 = c1.sum(c2);

        System.out.print("Complex number 1: ");
        c1.disp();
        System.out.print("Complex number 2: ");
        c2.disp();
        System.out.print("Sum: ");
        c3.disp();
    }
}
