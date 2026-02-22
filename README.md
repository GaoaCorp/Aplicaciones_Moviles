# Ecosistema Móvil – Aplicación Android

Este proyecto corresponde a una aplicación Android desarrollada en Kotlin como parte del laboratorio/práctica de la asignatura Ecosistema Móvil.  
La aplicación muestra información sobre distintos paradigmas de desarrollo móvil y hace uso del sistema de logs de Android (Logcat).

---

## 📋 Requisitos

- Android Studio (recomendado: versión reciente)
- JDK 17 o superior
- Emulador Android o dispositivo físico
- API mínima: Android 8.0 (API 26)

---

## ▶️ Instrucciones para ejecutar el proyecto

1. Abrir **Android Studio**
2. Seleccionar **Open an existing project**
3. Abrir la carpeta del proyecto **EcosistemaMovil**
4. Esperar a que Gradle sincronice automáticamente
5. Seleccionar un emulador o dispositivo físico
6. Presionar el botón **Run (▶)**

La aplicación se ejecutará y mostrará la interfaz con los paradigmas de desarrollo móvil.

---

## 🖥️ Funcionalidades principales

- Creación de interfaz de usuario mediante código (sin XML)
- Uso de `LinearLayout` y `ScrollView`
- Visualización de tarjetas informativas
- Implementación de logs con diferentes niveles:
    - `Log.d` (Debug)
    - `Log.w` (Warning)
    - `Log.e` (Error)

---

## 🧪 Uso de Logcat

Durante la ejecución de la aplicación, se generan mensajes de registro visibles en Logcat:

- Azul: mensajes de depuración (`Log.d`)
- Amarillo: advertencias (`Log.w`)
- Rojo: errores (`Log.e`)

Estos mensajes permiten identificar el estado y comportamiento de la aplicación durante su ejecución.

---

## ⚠️ Problemas encontrados

- Inicialmente se presentó un error de compilación debido al uso de `AppCompatActivity` sin la dependencia correspondiente.
- El problema se solucionó reemplazando `AppCompatActivity` por `ComponentActivity`, evitando conflictos con librerías.
- Se presentaron advertencias en Logcat propias del sistema Android, las cuales no afectan el funcionamiento de la aplicación.

---

## ✅ Estado del proyecto

✔ Proyecto funcional  
✔ Compilación exitosa  
✔ Ejecución correcta en emulador  
✔ Logs visibles en Logcat

---

## 👤 Autor

- Nombre: Gustavo Ordonez
- Programa: Ingeniería de Sistemas
- Asignatura: Aplicaciones Móviles
