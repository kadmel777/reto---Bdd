# Conclusiones del Ejercicio de Automatización en Serenity BDD

## Hallazgos

1. **XPath Compartido**: Se observó que todos los botones para agregar productos al carrito comparten el mismo XPath. Esto puede generar conflictos al seleccionar elementos, ya que el robot podría interactuar con un botón incorrecto si no se gestiona adecuadamente.

2. **Botones Ocultos**: Durante el proceso de “Checkout”, la página presenta múltiples botones de continuar que son invisibles para el usuario pero accesibles para el robot. Esto puede llevar a interacciones inesperadas si no se implementan controles adicionales.

3. **Interacción Rápida del Robot**: La velocidad del robot al ejecutar acciones es un factor crítico. Se notó que al intentar hacer clic en el "botón de ver el carrito", la página realiza un scroll automático, lo que provoca que el robot intente hacer clic antes de que el modal esté completamente cargado. Esto se resolvió implementando una espera antes de la interacción.

## Conclusiones

1. **Gestión de XPaths**: Es fundamental implementar una estrategia para manejar los XPaths que comparten múltiples elementos, ya sea utilizando identificadores únicos o creando un mecanismo de selección más específico.

2. **Control de Visibilidad**: Debe considerarse la implementación de controles que verifiquen la visibilidad de los elementos antes de interactuar con ellos, para asegurar que el robot no intente acceder a elementos ocultos.

3. **Sincronización**: La sincronización entre el robot y la carga de la página es crucial. Las esperas adecuadas deben ser implementadas para evitar clics prematuros que podrían llevar a errores en la ejecución de las pruebas.

4. **Estrategia de Pruebas**: Se recomienda llevar a cabo pruebas adicionales para validar el flujo completo de compra, incluyendo escenarios de error y validaciones de contenido en cada paso del proceso.
