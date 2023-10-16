package Entidad;

public class TemperatureConverter {

    private double gradosC;
    private double gradosF;
    private double gradosK;

    public TemperatureConverter() {
    }

    public TemperatureConverter(double gradosC, double gradosF, double gradosK) {
        this.gradosC = gradosC;
        this.gradosF = gradosF;
        this.gradosK = gradosK;
    }

    public double getGradosC() {
        return gradosC;
    }

    public void setGradosC(double gradosC) {
        this.gradosC = gradosC;
    }

    public double getGradosF() {
        return gradosF;
    }

    public void setGradosF(double gradosF) {
        this.gradosF = gradosF;
    }

    public double getGradosK() {
        return gradosK;
    }

    public void setGradosK(double gradosK) {
        this.gradosK = gradosK;
    }
}
