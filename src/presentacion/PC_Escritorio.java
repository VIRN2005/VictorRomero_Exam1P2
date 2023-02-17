package presentacion;

public class PC_Escritorio extends PC {

    private int RAM;
    private int almacenamiento;
    private String tipoAlmacenamiento;
    private boolean tarjGrafica;

    public PC_Escritorio() {
        super();
    }

    public PC_Escritorio(int RAM, int almacenamiento, String tipoAlmacenamiento, boolean tarjGrafica, String hostName, String direccionIP, String maskRed) {
        super(hostName, direccionIP, maskRed);
        this.RAM = RAM;
        this.almacenamiento = almacenamiento;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.tarjGrafica = tarjGrafica;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public boolean isTarjGrafica() {
        return tarjGrafica;
    }

    public void setTarjGrafica(boolean tarjGrafica) {
        this.tarjGrafica = tarjGrafica;
    }

    @Override
    public String toString() {
        return "RAM: " + RAM + "\n"
                + "Almacenamiento: " + almacenamiento + "\n"
                + "Tipo de Almacenamiento: " + tipoAlmacenamiento + "\n"
                + "Tarjeta Grafica: " + tarjGrafica;
    }

}
