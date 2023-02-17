package presentacion;

public class PC {

    protected String hostName;
    protected String direccionIP;
    protected String maskRed;

    public PC() {
    }

    public PC(String hostName, String direccionIP, String maskRed) {
        this.hostName = hostName;
        this.direccionIP = direccionIP;
        this.maskRed = maskRed;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getMaskRed() {
        return maskRed;
    }

    public void setMaskRed(String maskRed) {
        this.maskRed = maskRed;
    }

    @Override
    public String toString() {
        return "HostName: " + hostName + "\n"
                + "Direccion IP: " + direccionIP + "\n"
                + "Mascara de Red=" + maskRed + '}';
    }

}
