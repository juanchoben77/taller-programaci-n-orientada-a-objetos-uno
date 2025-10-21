

public class helado extends producto{
     public static void main(String[] args)
 {

 }
    private String sabor;
    private String tipoEnvase; // Por ejemplo: cono, tarrina

    // Constructor del Helado
    public helado (String nombre, double precio, String sabor, String tipoEnvase) {

        super(nombre, precio);
        this.sabor = sabor;
        this.tipoEnvase = tipoEnvase;
    }


    public void servir() {
        System.out.println("Sirviendo el helado de " + sabor + " en " + tipoEnvase + ".");
    }

    @Override
    public void descripcionBase() {

        super.descripcionBase();
        System.out.println("¡Específicamente, es un delicioso helado!");
    }
    public void mostrarDetallesHelado() {
        System.out.println("\n--- DETALLES DEL HELADO ---");
        System.out.println("Nombre: " + nombre);      // Atributo heredado
        System.out.println("Sabor: " + sabor);        // Atributo propio
        System.out.println("Tipo de Envase: " + tipoEnvase); // Atributo propio
        System.out.println("---------------------------");
        mostrarPrecio(); //
    }
}