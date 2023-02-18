package presentacion;

import static presentacion.Administrador.leer;

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

    public void Ping() {
        System.out.println("Ingrese la IP");
        String IP = leer.nextLine();

        String[] chains = IP.split("\\.");
        int decimal = Integer.parseInt(chains[3]);
        int binary = Decimal_a_Binario(decimal);

        String[] IPs = direccionIP.split("\\.");
        int decimals = Integer.parseInt(IPs[3]);
        int binary2 = Decimal_a_Binario(decimals);

        System.out.println("Pinging to " + IP + ": with 32 bits of data: "
                + "Reply from " + IP + " : bytes=32  time=37ms  TLL=46"
                + "Reply from " + IP + " : bytes=32  time=37ms  TLL=46"
                + "Reply from " + IP + " : bytes=32  time=37ms  TLL=46"
                + "Reply from " + IP + " : bytes=32  time=37ms  TLL=46");
    }

    public int Decimal_a_Binario(int numero) {
        String Binary = "";
        if (numero == 0) {
            return 0;
        } else {
            return (numero % 2 + 10 * Decimal_a_Binario(numero / 2));
        }
    }
}
