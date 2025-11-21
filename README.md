# 🎮 Juego del Ahorcado - Proyecto POO

## 📋 Descripción

Este es un juego del ahorcado interactivo desarrollado en Java usando la librería Swing para la interfaz gráfica. El proyecto fue creado como parte del curso de Programación Orientada a Objetos (POO).

## 🎯 Características del Juego

- **200 palabras** organizadas en 5 categorías diferentes:
  - 🐶 Animales (40 palabras)
  - 🌍 Países (40 palabras)
  - ⚽ Deportes (40 palabras)
  - 🍕 Comida (40 palabras)
  - 🛠️ Objetos (40 palabras)

- **7 intentos máximos** antes de perder
- **3 pistas disponibles** durante cada partida:
  - Pista de categoría: revela a qué categoría pertenece la palabra
  - Pista de letra: revela una letra aleatoria de la palabra
  - Pista de texto: muestra una pista escrita relacionada con la palabra

- **Interfaz gráfica intuitiva** con dibujo animado del ahorcado

## 🚀 Cómo Ejecutar el Proyecto
  
### Requisitos Previos

- Java JDK 11 o superior instalado
- Maven instalado (opcional, pero recomendado)

### Opción 1: Ejecutar con Maven

1. Abre una terminal en la carpeta del proyecto
2. Compila el proyecto:
   ```bash
   mvn compile
   ```
3. Ejecuta el juego:
   ```bash
   mvn exec:java -Dexec.mainClass="com.ean.poo.Main"
   ```

### Opción 2: Ejecutar con Java directamente

1. Compila todos los archivos Java:
   ```bash
   javac -d target/classes src/main/java/com/ean/poo/**/*.java
   ```
2. Ejecuta el juego:
   ```bash
   java -cp target/classes com.ean.poo.Main
   ```

### Opción 3: Ejecutar desde un IDE

1. Abre el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, NetBeans, etc.)
2. Busca el archivo `Main.java` en `src/main/java/com/ean/poo/`
3. Haz clic derecho y selecciona "Run" o "Ejecutar"

## 🎮 Cómo Jugar

1. **Iniciar el juego**: Al ejecutar el programa, se abrirá una ventana con una palabra oculta representada por guiones bajos (`_`).

2. **Adivinar letras**: Haz clic en los botones de letras del teclado en pantalla para adivinar.

3. **Usar pistas**: Puedes usar hasta 3 pistas durante la partida haciendo clic en los botones de pistas en el panel derecho:
   - **Categoría**: Muestra la categoría de la palabra
   - **Revelar Letra**: Revela una letra aleatoria de la palabra
   - **Pista de Texto**: Muestra una pista escrita
   
   ⚠️ **Nota**: Cada vez que uses una pista, se dibujará una parte del ahorcado.

4. **Ganar o Perder**:
   - **Ganar**: Adivina todas las letras de la palabra antes de quedarte sin intentos
   - **Perder**: Si cometes 7 errores, el juego termina

5. **Reiniciar**: Haz clic en el botón "Reiniciar" para comenzar una nueva partida con una palabra diferente.

## 📁 Estructura del Proyecto

```
POO_project_EAN/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── ean/
│                   └── poo/
│                       ├── Main.java              # Punto de entrada del programa
│                       ├── model/                 # Clases del modelo (lógica del juego)
│                       │   ├── Game.java          # Controla la lógica del juego
│                       │   ├── Word.java          # Representa una palabra con su categoría y pista
│                       │   └── WordBank.java      # Almacena todas las palabras del juego
│                       └── view/                  # Clases de la vista (interfaz gráfica)
│                           ├── GameWindow.java    # Ventana principal del juego
│                           └── HangmanPanel.java  # Panel que dibuja el ahorcado
├── pom.xml                                        # Configuración de Maven
└── README.md                                      # Este archivo
```

## 🏗️ Arquitectura del Proyecto

El proyecto está organizado siguiendo el patrón **Modelo-Vista**:

- **Modelo (`model/`)**: Contiene la lógica del juego
  - `Game`: Controla el flujo del juego, intentos, pistas y estado
  - `Word`: Representa una palabra individual con su categoría y pista
  - `WordBank`: Gestiona el banco de 200 palabras

- **Vista (`view/`)**: Contiene la interfaz gráfica
  - `GameWindow`: Ventana principal con todos los componentes
  - `HangmanPanel`: Panel personalizado que dibuja el ahorcado

## 💡 Conceptos de POO Aplicados

- **Encapsulación**: Los atributos de las clases son privados y se acceden mediante métodos públicos (getters/setters)
- **Clases y Objetos**: Cada componente del juego es una clase independiente
- **ArrayList**: Se usa para almacenar dinámicamente las palabras y las letras adivinadas
- **Manejo de Eventos**: Los botones y acciones del usuario se manejan con listeners de Swing
  
## 📄 Licencia

Este proyecto fue desarrollado con fines educativos para el curso de POO.
