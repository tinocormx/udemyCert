public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("Orden uno");
        OrdenCompra orden2 = new OrdenCompra("Ordern dos");
        OrdenCompra orden3 = new OrdenCompra("Ultima Orden");


        orden1.addProducto(new Producto("Samsung","Tablet", 15));
        orden1.addProducto(new Producto("Apple","ipad", 17));
        orden1.addProducto(new Producto("Lenovo","T48", 300));
        orden1.addProducto(new Producto("Asus","VivoBook", 200));
        orden1.setCliente( new Cliente("Juan", "Miguel"));

        orden2.addProducto(new Producto("Xiaomi","Tablet", 16));
        orden2.addProducto(new Producto("Apple","iphone air", 17));
        orden2.addProducto(new Producto("DEll","XP", 300));
        orden2.addProducto(new Producto("Asus", "Motherboard ", 500));
        orden2.setCliente( new Cliente("Luis", "Miguel"));

        orden3.addProducto(new Producto("Nokia","Tablet", 17));
        orden3.addProducto(new Producto("Netflix","Subscripcion", 1300));
        orden3.addProducto(new Producto("Disney+","Disney+ ", 1200));
        orden3.addProducto(new Producto("Google", "Adds ", 800));
        orden3.setCliente( new Cliente("Pepe", "Malgesto"));

        System.out.println("\nInformacion orden 1");
        System.out.println("orden1.getDescripcion() = " + orden1.getDescripcion());
        System.out.println("orden1.getGranTotal() = " + orden1.getGranTotal());
        for (Producto p: orden1.getProductos() ){
            System.out.println("\t"+ p.getFabricante() +"\t" + p.getNombre() +"\t"+ p.getPrecio());
        }

        System.out.println("\nInformacion orden 2");
        System.out.println("orden2.getDescripcion() = " + orden2.getDescripcion());
        System.out.println("orden2.getGranTotal() = " + orden2.getGranTotal());
        for (Producto p: orden2.getProductos() ){
            System.out.println("\t"+ p.getFabricante() +"\t" + p.getNombre() +"\t"+ p.getPrecio());
        }

        System.out.println("\nInformacion orden 3");
        System.out.println("orden3.getDescripcion() = " + orden3.getDescripcion());
        System.out.println("orden3.getGranTotal() = " + orden3.getGranTotal());

        for (Producto p: orden3.getProductos() ){
            System.out.println("\t"+ p.getFabricante() +"\t" + p.getNombre() +"\t"+ p.getPrecio());
        }
    }
}
