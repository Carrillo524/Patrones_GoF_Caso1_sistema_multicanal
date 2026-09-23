import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorComprobanteTest {

    private GeneradorComprobante generador;

    @BeforeEach
    void setUp() {
        generador = new GeneradorComprobante();
    }

    @Test
    @DisplayName("Debe generar comprobante PDF correctamente sin lanzar excepciones")
    void testGenerarComprobantePDFExitoso() {
        assertDoesNotThrow(() -> {
            generador.generar("PDF", "Factura #001 - Cliente A");
        });
    }

    @Test
    @DisplayName("Debe generar comprobante HTML correctamente sin lanzar excepciones")
    void testGenerarComprobanteHTMLExitoso() {
        assertDoesNotThrow(() -> {
            generador.generar("HTML", "Factura #002 - Cliente B");
        });
    }

    @Test
    @DisplayName("Debe generar comprobante XML correctamente")
    void testGenerarComprobanteXMLExitoso() {
        assertDoesNotThrow(() -> {
            generador.generar("XML", "Factura #003 - Cliente C");
        });
    }
    @Test
    @DisplayName("Debe generar comprobante JSON correctamente")
    void testGenerarComprobanteJSONExitoso() {
        assertDoesNotThrow(() -> {
            generador.generar("JSON", "Factura #004 - Cliente D");
        });
    }

    @Test
    @DisplayName("Debe lanzar IllegalArgumentException cuando el tipo no es soportado")
    void testGenerarComprobanteTipoNoSoportadoLanzaExcepcion() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    generador.generar("CSV", "Factura #003");
                });

        assertEquals("Tipo de comprobante no soportado", exception.getMessage());
    }
}