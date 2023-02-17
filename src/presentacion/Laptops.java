package presentacion;

public class Laptops extends PC {

    private String Marca;
    private String defPant;
    private boolean RGB;

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
        return "Marca: " + Marca + "\n"
                + "Definicion Pantalla: " + defPant + "\n"
                + "RGB: " + RGB;
    }

}
