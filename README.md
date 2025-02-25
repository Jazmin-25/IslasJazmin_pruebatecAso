# 🚀 Proyecto ASO - Simulación de Contratación de Tarjetas de Crédito

📌 Descripción del Proyecto
Este proyecto consiste en la implementación de una API REST para gestionar simulaciones de contrataciones de tarjetas de crédito en un contexto bancario. La API acepta peticiones **POST** con datos en formato **JSON** y realiza validaciones específicas sobre los datos de entrada antes de generar una respuesta.

---
**🛠 Tecnologías Utilizadas**

- ☕ Java: Lenguaje de programación principal.

- 🛡 ASO: Arquitectura de Servicios Orientados.

- ⚙️ APX: Plataforma de ejecución.

- 🐳 Docker: Contenerización de la aplicación.

- 🧪 Postman: Pruebas de la API.

---
**📍 Escenario ASO**
El servicio espera recibir un JSON con detalles específicos sobre la simulación de contratación. El path puede ser gestionado tanto con @PathParam como con @QueryParam.

🔗 Request del servicio ASO
    ```http://localhost:7500/TechArchitecture/helloWorld/v0/simulations/{nuip}```
    
Ejemplo con QueryParam:
```http://localhost:7500/TechArchitecture/helloWorld/v0/simulations?nuip=123```

---

**✅ Validaciones de Entrada**

- 🔠 details.offerType: Debe ser el mismo en la entrada y la respuesta, y solo debe contener mayúsculas.

- 💰 details.limitAmount.amount: No puede ser nulo.

- 💱 details.limitAmount.currency: No puede ser nulo ni vacío.

- 🏦 details.product.id: Debe validarse mediante un regex para asegurar que sea igual a "TDC".

- 🆔 details.product.subproduct.id: Solo puede contener de 0 a 2 caracteres.

---
**⚖️ Validaciones de Salida**

- 🔢 data.id: Debe ser un valor aleatorio de 10 caracteres.

- 🔄 data.nuip: Debe ser el mismo que el nuip proporcionado en la entrada.

- 📊 data.details.limitAmount.amount: Debe ser el mismo que en la entrada.

- 📉 data.details.minimumAmount.amount: Debe ser el 90% del limitAmount.amount.

- 📈 data.details.maximumAmount.amount: Debe ser el 105% del limitAmount.amount.

- 💲 data.details.minimumAmount.currency: Debe ser el mismo que en la entrada.

- 💲 data.details.maximumAmount.currency: Debe ser el mismo que en la entrada.

- 🎫 data.details.product.id: Debe ser el mismo que en la entrada.

- 🔠 data.details.product.subproduct.id: Debe ser el mismo que en la entrada.

---

**🚀 Instalación y Ejecución**

- 📥 Clonar el Repositorio:
  ```bash git clone https://github.com/tu-usuario/tu-repositorio.git```

- 🐳 Ejecutar con Docker:asoContainer
  ```docker run -d --name asoContainer -p 7500:7500 tu-imagen```

---

**📂  Revisar los archivos generados**
Al realizar el desarrollo del codigo en Intelijji y después de hacer un clean install se deven de verificar los siguientes archivos para realizar el despliegue con ASO-CLI:

- helloWorld.jar
- helloWorld-1.1.0-facade.jar
- helloWorld-sn.jar

Asegúrate de que Docker está corriendo antes de ejecutar los siguientes comandos.

1. Abre la terminal (CMD) en la carpeta donde están los .jar.
2. Mueve los .jar en la consola con el siguiente comando:
        ```aso-cli deploy```
   
Si todo funciona correctamente, el servicio debería estar desplegado y listo para ser utilizado. Como se muestra:

![jaresmovidos](https://github.com/Jazmin-25/IslasJazmin_pruebatecAso/blob/main/movimiento%20de%20jares%20en%20consola.png)

---

**🔬 Pruebas**

Puedes probar la API utilizando Postman o cualquier otra herramienta de pruebas de API. Asegúrate de que el servidor esté corriendo en http://localhost:7500.

**📌 Ejemplo de Request**
El siguiente json se debe colocar en POSTMAN

Se realizan pruebas en POSTMAN
![ejemplo de request](https://github.com/Jazmin-25/IslasJazmin_pruebatecAso/blob/main/ejemplo%20de%20request%20ASO.png)

---

**📌 Ejemplo de Response**
Es el resultado esperado en las pruebas en postman
![resultado esperado](https://github.com/Jazmin-25/IslasJazmin_pruebatecAso/blob/main/jsonrespuestaejemp.png)

**⚠️Resultado de mi prueba** Se realiza pruebas en mi disposito sin éxito.

![ejemplo de response](https://github.com/Jazmin-25/IslasJazmin_pruebatecAso/blob/main/response%20error%20404.png)

Se revisa el json y se realizan diferentes modificaciones. De igual forma se realizan diferente modificaciones a la url. Sin embargo en todas las pruebas aparece un 404 Not Found :(
