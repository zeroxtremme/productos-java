public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE INVENTARIO CON HERENCIA (POO) ===
");

        ProductoElectronico laptop = new ProductoElectronico("Laptop Pro 15", 850.00, 8, "Lenovo", 12);
        Accesorio mouse = new Accesorio("Mouse Optico", 20.00, 15, "USB-C / Bluetooth", "Windows / macOS");

        System.out.println("--- Inventario Inicial ---");
        laptop.mostrarInfo();
        mouse.mostrarInfo();

        System.out.println("
--- Movimientos de Inventario (Metodos Heredados) ---");
        laptop.vender(3);       // Heredado de Producto
        mouse.reabastecer(5);   // Heredado de Producto

        System.out.println("
--- Operaciones Especializadas (Metodos Exclusivos) ---");
        laptop.extenderGarantia(12);      // Exclusivo de ProductoElectronico
        mouse.aplicarDescuentoLote(15);   // Exclusivo de Accesorio

        System.out.println("
--- Estado Final del Inventario ---");
        laptop.mostrarInfo();
        mouse.mostrarInfo();
    }
}

