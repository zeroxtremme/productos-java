public class ProductoElectronico extends Producto {
    // Atributos exclusivos de la subclase ProductoElectronico
    private String marca;
    private int garantiaMeses;


    public ProductoElectronico(String nombre, double precio, int stock, String marca, int garantiaMeses) {
        super(nombre, precio, stock); // Reutilizacion del constructor de Producto
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public void extenderGarantia(int mesesAdicionales) {
        if (mesesAdicionales > 0) {
            this.garantiaMeses += mesesAdicionales;
            double costoPoliza = this.precio * 0.05;
            this.precio += costoPoliza;
            System.out.printf("Garantia de %s (%s) extendida a %d meses (+$%.2f por poliza).%n",
                    nombre, marca, garantiaMeses, costoPoliza);
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al metodo original de Producto
        System.out.println(" | Marca: " + marca + " | Garantia: " + garantiaMeses + " meses [Electronico]");
    }
}
