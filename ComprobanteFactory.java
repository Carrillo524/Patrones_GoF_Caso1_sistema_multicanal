public class ComprobanteFactory {
    public static Comprobante crearComprobante(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de comprobante no soportado");
        }

        switch (tipo.toUpperCase()) {
            case "PDF":
                return new ComprobantePDF();
            case "HTML":
                return new ComprobanteHTML();
            case "XML":
                return new ComprobanteXML();
            case "JSON": // <-- Nuevo caso agregado
                return new ComprobanteJSON(); // <-- Retorna la instancia JSON
            default:
                throw new IllegalArgumentException("Tipo de comprobante no soportado");
        }
    }
}