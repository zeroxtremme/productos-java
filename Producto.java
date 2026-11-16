public class Producto {
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad <= stock && cantidad > 0) {
            stock -= cantidad;
            System.out.println("Vendido: " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("No hay suficiente stock de " + nombre);
        }
    }


    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Se agregaron " + cantidad + " unidades a " + nombre);
        }
    }

    public void mostrarInfo() {
        System.out.printf("Producto: %s | Precio: $%.2f | Stock: %d", nombre, precio, stock);
    }
}