Autenticación y Autorización
Token-based Authentication:
JWT (JSON Web Tokens): Explicar en detalle las partes de un JWT (header, payload, signature) y sus ventajas (autocontenidos, seguros, fáciles de usar).
OAuth 2.0: Detallar los diferentes flujos de autorización (authorization code, implicit, client credentials) y sus escenarios de uso.
Otros mecanismos de autenticación:
API Keys: Mencionar las API Keys como un método simple de autenticación, aunque menos seguro que otros.
Certificados digitales: Explicar cómo se utilizan los certificados digitales para autenticar clientes y servidores.
Autorización basada en roles (RBAC): Detallar cómo funciona el RBAC y cómo se asignan roles y permisos a los usuarios.
Códigos de Estado HTTP
Rangos de códigos: Explicar los diferentes rangos de códigos de estado (1xx informativos, 2xx éxito, 3xx redirección, 4xx error del cliente, 5xx error del servidor).
Códigos de estado personalizados: Mencionar la posibilidad de definir códigos de estado personalizados para aplicaciones específicas.
Recursos y su Importancia
Hipermedia: Relacionar el concepto de recurso con HATEOAS (Hypermedia as the Engine of Application State), donde los enlaces en las respuestas guían al cliente sobre las acciones posibles.
Versionado de recursos: Explicar la importancia de versionar los recursos para realizar cambios sin afectar a los clientes existentes.
Comunicación Sin Estado e Idempotencia
Sesiones: Aunque REST promueve la comunicación sin estado, en algunos casos se pueden utilizar mecanismos como cookies para mantener un estado de sesión a nivel del cliente.
Idempotencia y operaciones seguras: Relacionar la idempotencia con las operaciones seguras (GET, PUT, DELETE) y las operaciones no seguras (POST).
Seguridad en REST
Ataques comunes: Mencionar ataques comunes como inyección SQL, XSS, CSRF y cómo prevenirlos.
Protección de API: Describir medidas de seguridad adicionales como rate limiting, protección contra DDoS, y WAF (Web Application Firewall).