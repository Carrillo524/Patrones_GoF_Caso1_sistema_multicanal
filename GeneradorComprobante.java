public class GeneradorComprobante {
    public void generar(String tipo, String contenido) {
        Comprobante comprobante = ComprobanteFactory.crearComprobante(tipo);
        comprobante.generar(contenido);
    }
}