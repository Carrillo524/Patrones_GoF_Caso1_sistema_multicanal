public class ComprobanteJSON implements Comprobante {
    @Override
    public void generar(String contenido) {
        System.out.println("Generando comprobante JSON:" + contenido);
    }
}