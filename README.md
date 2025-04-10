# API Spring Boot para Gestión de Productos

Este proyecto es una API RESTful construida con **Spring Boot** que permite la gestión de productos en un sistema. El sistema utiliza **MySQL** como base de datos para almacenar la información de los productos. Además, el proyecto incluye dos interfaces frontend que consumen la API: una desarrollada en **React** y otra en **Angular**.

## Descripción

La API ofrece endpoints para realizar las siguientes operaciones sobre los productos:
- Crear productos.
- Leer productos.
- Actualizar productos.
- Eliminar productos.

La base de datos **MySQL** almacena toda la información relacionada con los productos y las interacciones con la API se gestionan a través de las solicitudes HTTP RESTful.

Los proveedores de frontend (React y Angular) permiten interactuar con la API desde interfaces de usuario modernas, proporcionando una forma sencilla de crear, editar y eliminar productos.

## Tecnologías utilizadas

- **Backend**:
  - **Spring Boot**: Framework principal para construir la API RESTful.
  - **MySQL**: Base de datos relacional para almacenar la información de los productos.
  - **JPA/Hibernate**: Para la persistencia de datos en la base de datos.
  
- **Frontend**:
  - **React**: Interfaz de usuario para gestionar los productos mediante una aplicación web en React.
  - **Angular**: Otra interfaz de usuario que consume la misma API, construida en Angular.
