# DimayorTaller

# Taller de Tecnologías y protocolos

### Computación en la nube
#### Carlos Ocampo
#### A00052216

---
### Descripción
---
A través de este proyecto se desarrollo el taller de tecnologías y protocolos visto en la clase de comutación en la nube. El objetivo final del taller era desarrollar un API RESTful que ofreciera los servicios de agregar, editar, borrar equipos dentro de un arreglo de equipos y también el de consultar la totalidad del arreglo de equipos. Los metodos HTTP que se utulizaron para cada funcionalidad fueron:

 
| Funcionalidad | Metodo http | URL | Respuesta |
| ------ | ------ | ------ | ------ |
| Listar equipos | GET |/equipos | JSON de los equipos
| Consultar equipo | GET |/equipos/{name} | JSON del equipo
| Agregar equipo | POST |/equipos{name}{ano}{titu} | JSON del equipo recien agregado
| Editar equipo| PUT |/equipos/{name} | JSON del equipo recien editado
| Eliminar equipo| DELETE |/equipos{name} | status 200



### Estructura JSON

```json
{
    "name": "America",
    "ano": "1927",
    "titu": "13"
}
```

### Ejecución del proyecto

Para la ejecución del proyecto se requiere importar en Spring Tool Suite y correrlo. Una vez el proyecto cargue, se utiliza el navegador para introducir la siguiente URL: https://localhost:4567/ . Aquí se muestra la vista del cliente web, donde se encuentra un boton. Al pinchar el boton se listarán los equipos cargados en el proyecto con toda su información.
