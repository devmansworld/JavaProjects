public class Operacion {
    private String tipoOperacion;
    private Double montoOperacion;
    private Integer cuentaDestino;
    private String nombreDestinatario;
    private Integer dniDestinatario;
    private String bancoDestino;


    public Operacion(String tipoOperacion, Double montoOperacion, Integer cuentaDestino, String nombreDestinatario, Integer dniDestinatario, String bancoDestino) {
        this.tipoOperacion = tipoOperacion;
        this.montoOperacion = montoOperacion;
        this.cuentaDestino = cuentaDestino;
        this.nombreDestinatario = nombreDestinatario;
        this.dniDestinatario = dniDestinatario;
        this.bancoDestino = bancoDestino;
    }

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

    public Integer getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Integer cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public Integer getDniDestinatario() {
        return dniDestinatario;
    }

    public void setDniDestinatario(Integer dniDestinatario) {
        this.dniDestinatario = dniDestinatario;
    }

    public String getBancoDestino() {
        return bancoDestino;
    }

    public void setBancoDestino(String bancoDestino) {
        this.bancoDestino = bancoDestino;
    }
}
