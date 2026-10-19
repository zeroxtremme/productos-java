public class Main {
    public static void main(String[] args) {
        System.out.println("--- Mi Tienda de Articulos ---");

        Producto p1 = new Producto("Laptop", 850.00, 8);
        Producto p2 = new Producto("Mouse", 20.00, 15);

        p1.mostrarInfo();
        p2.mostrarInfo();

        System.out.println("\n--- Probando movimientos ---");
        p1.vender(3); 
        p2.reabastecer(5);

        System.out.println("\n--- Estado Final ---");
        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}
