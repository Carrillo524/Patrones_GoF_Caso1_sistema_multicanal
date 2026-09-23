public class ComprobanteXML implements Comprobante {
    @Override
    public void generar(String contenido) {
        System.out.println("Generando comprobante XML:" + contenido);
    }
}