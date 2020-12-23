public class Operacion {
    private String tipoOperacion;
    private double montoOperacion;

    public Operacion(String tipoOperacion, Double montoOperacion) {
        this.tipoOperacion = tipoOperacion;
        this.montoOperacion = montoOperacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public Double getMontoOperacion() {
        return montoOperacion;
    }

    public void setMontoOperacion(Double montoOperacion) {
        this.montoOperacion = montoOperacion;
    }
}
