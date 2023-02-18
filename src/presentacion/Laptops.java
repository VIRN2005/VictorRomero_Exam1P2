package presentacion;

public class Laptops extends PC {

    private String Marca;
    private String defPant;
    private boolean RGB;

    public Laptops() {
        super();
    }

    public Laptops(String Marca, String defPant, boolean RGB, String hostName, String direccionIP, String maskRed) {
        super(hostName, direccionIP, maskRed);
        this.Marca = Marca;
        this.defPant = defPant;
        this.RGB = RGB;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDefPant() {
        return defPant;
    }

    public void setDefPant(String defPant) {
        this.defPant = defPant;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMarca: " + Marca + "\n"
                + "Definicion Pantalla: " + defPant + "\n"
                + "RGB: " + RGB;
    }

}
