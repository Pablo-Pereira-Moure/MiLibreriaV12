package libreriasv12;

public class FactoriaDeSalidas {
    public static final int CONSOLA = 1;
    public static final int VENTANA = 2;

    public static InterfaceMetodosComunes getProducto(int type, String msg) {
        switch (type) {

            case CONSOLA:
                return new Consola(msg);
            case VENTANA:
                return new Ventana(msg);
            default:
                return null;
        }
    }
}
