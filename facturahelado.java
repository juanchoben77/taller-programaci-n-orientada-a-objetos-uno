public class facturahelado {
    public void main(String[] args) {
        // 1. Creamos un objeto de la clase hija (Helado)
        helado mihelado = new helado("Helado de Vainilla Clásico", 3.50, "Vainilla", "cono");


        mihelado.mostrarDetallesHelado();

        System.out.println("\n--- Llamando a la función heredada ---");
        mihelado.mostrarPrecio();


        mihelado.servir();


        System.out.println("\n--- Llamando a la descripción (sobrescrita) ---");
        mihelado.descripcionBase();
    }
}
