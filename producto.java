
    public class producto {
       public static void main(String[] args){

       }

    protected String nombre;
    protected double precio;

    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public void mostrarPrecio() {
        System.out.println("El precio de " + nombre + " es: $" + String.format("%.2f", precio));
    }

    public void descripcionBase() {
        System.out.println("Este es un producto de nuestra heladería.");
    }
}
