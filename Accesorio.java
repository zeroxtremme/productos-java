public class Accesorio extends Producto {
    // Atributos exclusivos de la subclase Accesorio
    private String tipoConexion;
    private String compatibleCon;

    public Accesorio(String nombre, double precio, int stock, String tipoConexion, String compatibleCon) {
        super(nombre, precio, stock); // Inicializacion de atributos heredados
        this.tipoConexion = tipoConexion;
        this.compatibleCon = compatibleCon;
    }

    public void aplicarDescuentoLote(double porcentaje) {
        if (stock >= 10 && porcentaje > 0 && porcentaje <= 50) {
            double descuento = precio * (porcentaje / 100.0);
            precio -= descuento;
            System.out.printf("Descuento por lote (%.0f%%) aplicado a %s. Nuevo precio: $%.2f%n",
                    porcentaje, nombre, precio);
        } else {
            System.out.println("No aplica descuento por lote para " + nombre + " (stock insuficiente o porcentaje invalido).");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Ejecuta mostrarInfo() de Producto
        System.out.println(" | Conexion: " + tipoConexion + " | Compatible: " + compatibleCon + " [Accesorio]");
    }
}
