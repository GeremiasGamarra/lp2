¿Qué es un servicio REST?
REST (Representational State Transfer) es un estilo arquitectónico para sistemas distribuidos basado en un conjunto de principios que describen cómo las aplicaciones en red deben comunicarse entre sí.

¿Cuáles son los principios del diseño RESTful?
Cliente-Servidor: La arquitectura REST separa las responsabilidades del cliente y el servidor. El cliente maneja la interfaz de usuario y la gestión de la experiencia del usuario
mientras que el servidor maneja el almacenamiento de datos y la lógica de negocio.
Sin Estado: Cada solicitud del cliente al servidor debe contener toda la información necesaria para entender y procesar la solicitud. El servidor no debe almacenar ningún estado del cliente entre solicitudes.
Cacheabilidad: Las respuestas deben ser explícitamente definidas como cacheables o no, para que los clientes puedan almacenar en caché las respuestas y reutilizarlas en futuras solicitudes, mejorando así la eficiencia.
Interfaz Uniforme: REST debe tener una interfaz uniforme que permita que la interacción entre los componentes sea sencilla y comprensible. 
Sistema en Capas: La arquitectura debe estar compuesta por capas jerárquicas, donde cada capa tiene una funcionalidad específica. Esto permite que los componentes sean intercambiables y escalables.
Código Bajo Demanda (opcional): Los servidores pueden enviar código ejecutable (por ejemplo, scripts JavaScript) al cliente bajo demanda para extender la funcionalidad.

¿Qué es HTTP y cuáles son los métodos HTTP más comunes?
HTTP (Hypertext Transfer Protocol) es un protocolo de comunicación utilizado para enviar y recibir información en la web. Los métodos HTTP más comunes son:
GET: Recupera información de un recurso especificado.
POST: Envía datos al servidor para crear un nuevo recurso.
PUT: Actualiza o reemplaza un recurso existente con los datos proporcionados.
DELETE: Elimina un recurso especificado.
PATCH: Aplica modificaciones parciales a un recurso.

¿Qué es un recurso en el contexto de un servicio REST?
En REST, un recurso es cualquier entidad que se puede identificar de manera única y que se puede manipular a través de un servicio web. Los recursos pueden ser
documentos, imágenes, servicios, colecciones de otros recursos o cualquier objeto que el servidor pueda gestionar.

¿Qué es un endpoint?
Un endpoint es una URL específica en un servicio web que representa un recurso único y que permite a los clientes interactuar con el servicio. 

¿Qué es un URI y cómo se define?
Un URI (Uniform Resource Identifier) es una cadena de caracteres que identifica un recurso de manera única en un servicio web. Un URI generalmente incluye:

El esquema (por ejemplo, http o https).
El nombre del host (por ejemplo, www.ejemplo.com).
La ruta al recurso (por ejemplo, /api/usuarios/123).
Opcionalmente, puede incluir una cadena de consulta para enviar parámetros adicionales (por ejemplo, ?id=123).
Ejemplo de un URI completo: https://www.ejemplo.com/api/usuarios/123.

¿Qué es una API RESTful?
Una API RESTful es una API que sigue los principios y restricciones de la arquitectura REST. Permite la comunicación entre un cliente y un servidor utilizando métodos HTTP 
estándar para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en los recursos definidos por la API.

¿Qué son los códigos de estado HTTP y cómo se usan en REST?
Los códigos de estado HTTP son códigos numéricos que el servidor devuelve en respuesta a las solicitudes HTTP del cliente, indicando el resultado de la solicitud. En REST, estos códigos ayudan a 
los clientes a comprender si una solicitud fue exitosa, si hubo un error y qué tipo de error ocurrió.

400	Error del cliente	Bad Request: La solicitud es incorrecta o no se puede procesar.
401	Error del cliente	Unauthorized: La autenticación es necesaria y ha fallado o no se ha proporcionado.
403	Error del cliente	Forbidden: El cliente no tiene permisos para acceder al recurso.
404	Error del cliente	Not Found: El recurso solicitado no se encontró.
500	Error del servidor	Internal Server Error: El servidor encontró un error interno.
503	Error del servidor	Service Unavailable: El servidor no está disponible temporalmente.

¿Qué es JSON y por qué se usa comúnmente en APIs REST?
JSON (JavaScript Object Notation) es un formato ligero de intercambio de datos fácil de leer y escribir tanto para humanos como para máquinas.
