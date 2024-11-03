public class Complex {
    private double real;
    private double imag;
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex()
    {
        this.real = 0.0;
        this.imag = 0.0;
    }
    public String toString()
    {
        if(imag < 0)
        {
            String s = real + "-" + (-1)*imag + "i";
            return s;
        }
        else
        {
            String s = real + "+" + imag + "i";
            return s;
        }

    }
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public void  add(Complex z) {
        this.real = this.real + z.real;
        this.imag = this.imag + z.imag;
    }
    public void sub(Complex z) {
       this.real = this.real - z.real;
       this.imag = this.imag - z.imag;
    }
    public void mulScalar(double y) {
        this.real = this.real * y;
        this.imag = this.imag * y;
    }
    public void mul(Complex z) {
        this.real = (this.real * z.real) + (this.imag * (-1)  * z.imag);
        this.imag =  this.real * z.imag + this.imag * z.real;
    }
}
