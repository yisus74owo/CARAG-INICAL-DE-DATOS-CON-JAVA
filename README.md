# 📂 Carga inicial de datos con Java EE (GlassFish)

## 📖 Descripción
Este proyecto corresponde a un módulo desarrollado en **Java EE** desplegado en el servidor de aplicaciones **GlassFish**, que implementa la **carga inicial de datos desde archivos Excel** utilizando **JSF**, **PrimeFaces** y **Apache POI**.  
La finalidad es permitir al usuario cargar registros desde una hoja de cálculo, procesarlos y almacenarlos automáticamente en la base de datos mediante **EJBs** y **JPA**.

## ⚙️ Tecnologías utilizadas
- Java EE / Jakarta EE  
- GlassFish Server  
- JSF (JavaServer Faces)  
- PrimeFaces  
- EJB (Enterprise JavaBeans)  
- JPA (Java Persistence API)  
- Apache POI  

## 📑 Funcionalidad principal
1. Subida de un archivo Excel desde la interfaz web.  
2. Procesamiento de filas y celdas con Apache POI.  
3. Creación de entidades `Countries` y `Regions`.  
4. Inserción en la base de datos mediante `CountriesFacadeLocal`.  
5. Retroalimentación al usuario con mensajes de éxito o error.  

---

## 📚 Referencias (Normas APA 7.ª edición)

Apache Software Foundation. (2024). *Apache POI - the Java API for Microsoft Documents*. Apache. Recuperado de https://poi.apache.org  

GlassFish Foundation. (2024). *GlassFish Server Open Source Edition*. Eclipse Foundation. Recuperado de https://glassfish.org  

Oracle. (2024). *Jakarta EE Platform*. Eclipse Foundation. Recuperado de https://jakarta.ee  

PrimeFaces. (2024). *PrimeFaces User Guide*. PrimeTek. Recuperado de https://www.primefaces.org  

---

