# Sistema Multicanal de Generación de Comprobantes

## Descripción del Proyecto y Patrón Implementado
Este repositorio contiene la refactorización de un sistema monolítico encargado de generar comprobantes comerciales. Para solucionar los code smells de alto acoplamiento y rigidez estructural, se implementó el patrón de diseño creacional **Factory Method**. 

La implementación de este patrón permite delegar la instanciación de los distintos formatos (PDF, HTML, XML, JSON) a una clase creadora especializada (`ComprobanteFactory`). Esto aísla al cliente principal, logrando cumplir con el principio Open/Closed (OCP), ya que el sistema ahora puede escalar y soportar nuevos formatos sin modificar el código de la clase coordinadora.

## Requisitos Técnicos
* **JDK:** 17 o superior.
* **IDE recomendado:** IntelliJ IDEA, Eclipse o VS Code.
* **Dependencias:** JUnit 5 (Jupiter) integrado para las pruebas unitarias.

## Instrucciones para Compilar y Ejecutar el Proyecto
1. Clone este repositorio en su entorno local ejecutando: 
   `git clone https://github.com/Carrillo524/Patrones_GoF_Caso1_sistema_multicanal.git`
2. Abra su IDE (por ejemplo, IntelliJ IDEA) y seleccione **Open** para importar la carpeta raíz del proyecto.
3. Asegúrese de que el IDE esté utilizando el SDK de Java 17 (o superior). El proyecto compilará automáticamente al indexar los archivos `.java`.
4. Dado que este proyecto es un módulo de lógica de negocio (sin interfaz gráfica), la ejecución de sus funcionalidades se valida directamente a través de su suite de pruebas unitarias.

## Instrucciones para correr la Suite de Pruebas (JUnit 5)
1. En el panel explorador de su IDE, abra el archivo de pruebas `GeneradorComprobanteTest.java`.
2. Haga clic en el ícono verde de **Play** (Run) ubicado en el margen izquierdo junto a la declaración de la clase, o presione `Ctrl+Shift+F10` (en Windows/IntelliJ).
3. Se ejecutará el arnés de pruebas completo, validando la creación de los 4 formatos soportados (PDF, HTML, XML, JSON) y el manejo de excepciones para formatos inválidos.
4. Verifique en la consola de JUnit que los 5 escenarios pasen exitosamente (en verde).

## Guía de Actividad Realizada
1. Importación y comprobación de compilación del código base.
2. Análisis de estructura y acoplamiento existente.
3. Construcción de línea base de pruebas documentando el comportamiento original.
4. Refactorización estructural aplicando Factory Method.
5. Validación de regresión e incorporación de nuevos requerimientos (XML/JSON).