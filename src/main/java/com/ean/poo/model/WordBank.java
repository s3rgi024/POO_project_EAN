package com.ean.poo.model;

import java.util.ArrayList;
import java.util.Random;

public class WordBank {
    private ArrayList<Word> words;
    private Random random;

    public WordBank() {
        words = new ArrayList<>();
        random = new Random();
        loadWords();
    }

    private void loadWords() {
        loadAnimals();
        loadCountries();
        loadSports();
        loadFood();
        loadObjects();
    }

    private void loadAnimals() {
        words.add(new Word("PERRO", "Animales", "Mejor amigo del hombre"));
        words.add(new Word("GATO", "Animales", "Maulla y ronronea"));
        words.add(new Word("ELEFANTE", "Animales", "Mamífero terrestre más grande"));
        words.add(new Word("LEON", "Animales", "Rey de la selva"));
        words.add(new Word("TIGRE", "Animales", "Gran felino con rayas"));
        words.add(new Word("DELFIN", "Animales", "Mamífero marino inteligente"));
        words.add(new Word("PINGUINO", "Animales", "Ave que no puede volar"));
        words.add(new Word("JIRAFA", "Animales", "Animal más alto"));
        words.add(new Word("CEBRA", "Animales", "Rayas blancas y negras"));
        words.add(new Word("MONO", "Animales", "Le encantan los bananos"));
        words.add(new Word("CONEJO", "Animales", "Tiene orejas largas"));
        words.add(new Word("OSO", "Animales", "Hiberna en invierno"));
        words.add(new Word("LOBO", "Animales", "Aúlla a la luna"));
        words.add(new Word("ZORRO", "Animales", "Astuto y clever"));
        words.add(new Word("TIBURON", "Animales", "Depredador del océano"));
        words.add(new Word("BALLENA", "Animales", "Animal más grande de la Tierra"));
        words.add(new Word("AGUILA", "Animales", "Ave rapaz"));
        words.add(new Word("SERPIENTE", "Animales", "Se arrastra por el suelo"));
        words.add(new Word("COCODRILO", "Animales", "Reptil con mandíbulas poderosas"));
        words.add(new Word("CANGURO", "Animales", "Salta y tiene bolsa"));
        words.add(new Word("KOALA", "Animales", "Vive en eucaliptos"));
        words.add(new Word("PANDA", "Animales", "Oso blanco y negro"));
        words.add(new Word("GUEPARDO", "Animales", "Animal terrestre más rápido"));
        words.add(new Word("HIPOPOTAMO", "Animales", "Mamífero semiacuático grande"));
        words.add(new Word("RINOCERONTE", "Animales", "Tiene cuerno en la nariz"));
        words.add(new Word("GORILA", "Animales", "Primate más grande"));
        words.add(new Word("TORTUGA", "Animales", "Lenta y tiene caparazón"));
        words.add(new Word("RANA", "Animales", "Anfibio que salta"));
        words.add(new Word("MARIPOSA", "Animales", "Insecto volador colorido"));
        words.add(new Word("ABEJA", "Animales", "Produce miel"));
        words.add(new Word("ARAÑA", "Animales", "Tiene ocho patas"));
        words.add(new Word("PULPO", "Animales", "Ocho tentáculos"));
        words.add(new Word("MEDUSA", "Animales", "Criatura marina transparente"));
        words.add(new Word("ESTRELLA", "Animales", "Animal marino con forma de estrella"));
        words.add(new Word("LORO", "Animales", "Ave colorida que habla"));
        words.add(new Word("BUHO", "Animales", "Ave nocturna"));
        words.add(new Word("PAVORREAL", "Animales", "Cola de plumas hermosa"));
        words.add(new Word("FLAMENCO", "Animales", "Ave rosada"));
        words.add(new Word("CABALLO", "Animales", "Se puede montar"));
        words.add(new Word("CAMELLO", "Animales", "Animal del desierto con jorobas"));
    }

    private void loadCountries() {
        words.add(new Word("COLOMBIA", "Países", "Productor de café sudamericano"));
        words.add(new Word("BRASIL", "Países", "País más grande de Sudamérica"));
        words.add(new Word("ARGENTINA", "Países", "Tierra del tango"));
        words.add(new Word("MEXICO", "Países", "Tierra de los tacos"));
        words.add(new Word("CANADA", "Países", "Segundo país más grande"));
        words.add(new Word("JAPON", "Países", "Tierra del sol naciente"));
        words.add(new Word("CHINA", "Países", "País más poblado"));
        words.add(new Word("INDIA", "Países", "Famosa por el Taj Mahal"));
        words.add(new Word("FRANCIA", "Países", "Ubicación de la Torre Eiffel"));
        words.add(new Word("ESPAÑA", "Países", "Famosa por el flamenco"));
        words.add(new Word("ITALIA", "Países", "País con forma de bota"));
        words.add(new Word("ALEMANIA", "Países", "Conocida por ingeniería"));
        words.add(new Word("INGLATERRA", "Países", "Parte del Reino Unido"));
        words.add(new Word("RUSIA", "Países", "País más grande por área"));
        words.add(new Word("AUSTRALIA", "Países", "Continente y país"));
        words.add(new Word("EGIPTO", "Países", "Tierra de las pirámides"));
        words.add(new Word("PERU", "Países", "Hogar de Machu Picchu"));
        words.add(new Word("CHILE", "Países", "País largo y angosto"));
        words.add(new Word("ECUADOR", "Países", "Nombrado por el ecuador"));
        words.add(new Word("VENEZUELA", "Países", "Tiene el Salto Ángel"));
        words.add(new Word("PORTUGAL", "Países", "Nación europea occidental"));
        words.add(new Word("GRECIA", "Países", "Cuna de la democracia"));
        words.add(new Word("TURQUIA", "Países", "Une Europa y Asia"));
        words.add(new Word("TAILANDIA", "Países", "Tierra de las sonrisas"));
        words.add(new Word("VIETNAM", "Países", "Nación del sudeste asiático"));
        words.add(new Word("COREA", "Países", "Península en Asia Oriental"));
        words.add(new Word("SUECIA", "Países", "País escandinavo"));
        words.add(new Word("NORUEGA", "Países", "Tierra de fiordos"));
        words.add(new Word("FINLANDIA", "Países", "Tierra de mil lagos"));
        words.add(new Word("POLONIA", "Países", "Nación europea central"));
        words.add(new Word("IRLANDA", "Países", "Isla esmeralda"));
        words.add(new Word("ISLANDIA", "Países", "Tierra de fuego y hielo"));
        words.add(new Word("SUIZA", "Países", "Conocida por el chocolate"));
        words.add(new Word("AUSTRIA", "Países", "Hogar de Mozart"));
        words.add(new Word("BELGICA", "Países", "Famosa por los waffles"));
        words.add(new Word("HOLANDA", "Países", "Tierra de molinos"));
        words.add(new Word("MARRUECOS", "Países", "Reino del norte de África"));
        words.add(new Word("KENIA", "Países", "Destino de safaris africanos"));
        words.add(new Word("NIGERIA", "Países", "Más poblado de África"));
        words.add(new Word("CUBA", "Países", "Isla caribeña"));
    }

    private void loadSports() {
        words.add(new Word("FUTBOL", "Deportes", "Deporte más popular del mundo"));
        words.add(new Word("BALONCESTO", "Deportes", "Se juega con aros"));
        words.add(new Word("TENIS", "Deportes", "Deporte de raqueta"));
        words.add(new Word("NATACION", "Deportes", "Deporte acuático"));
        words.add(new Word("BOXEO", "Deportes", "Deporte de combate con guantes"));
        words.add(new Word("BEISBOL", "Deportes", "Popular en América"));
        words.add(new Word("VOLEIBOL", "Deportes", "Deporte con red"));
        words.add(new Word("GOLF", "Deportes", "Deporte con palos y pelota"));
        words.add(new Word("HOCKEY", "Deportes", "Se juega sobre hielo"));
        words.add(new Word("RUGBY", "Deportes", "Deporte físico de equipo"));
        words.add(new Word("CRICKET", "Deportes", "Popular en Inglaterra"));
        words.add(new Word("CICLISMO", "Deportes", "Montar en bicicleta"));
        words.add(new Word("ATLETISMO", "Deportes", "Pista y campo"));
        words.add(new Word("GIMNASIA", "Deportes", "Deporte acrobático"));
        words.add(new Word("ESQUI", "Deportes", "Deporte de invierno en nieve"));
        words.add(new Word("SURF", "Deportes", "Montar olas del océano"));
        words.add(new Word("LUCHA", "Deportes", "Deporte de combate cuerpo a cuerpo"));
        words.add(new Word("ESGRIMA", "Deportes", "Deporte con espadas"));
        words.add(new Word("ARQUERIA", "Deportes", "Deporte con arco y flechas"));
        words.add(new Word("KARATE", "Deportes", "Arte marcial"));
        words.add(new Word("JUDO", "Deportes", "Arte marcial japonés"));
        words.add(new Word("TAEKWONDO", "Deportes", "Arte marcial coreano"));
        words.add(new Word("BADMINTON", "Deportes", "Deporte con volante"));
        words.add(new Word("SQUASH", "Deportes", "Deporte de raqueta interior"));
        words.add(new Word("POLO", "Deportes", "Se juega a caballo"));
        words.add(new Word("VELA", "Deportes", "Carreras en barco"));
        words.add(new Word("REMO", "Deportes", "Barco con remos"));
        words.add(new Word("CLAVADOS", "Deportes", "Saltar al agua"));
        words.add(new Word("PATINAJE", "Deportes", "Sobre ruedas o hielo"));
        words.add(new Word("SNOWBOARD", "Deportes", "Tabla en la nieve"));
        words.add(new Word("ESCALADA", "Deportes", "Escalar montañas"));
        words.add(new Word("BALONMANO", "Deportes", "Pelota lanzada con la mano"));
        words.add(new Word("SOFTBOL", "Deportes", "Similar al béisbol"));
        words.add(new Word("BOLICHE", "Deportes", "Derribar pinos"));
        words.add(new Word("BILLAR", "Deportes", "Juego de mesa con bolas"));
        words.add(new Word("DARDOS", "Deportes", "Lanzar al objetivo"));
        words.add(new Word("AJEDREZ", "Deportes", "Juego de estrategia en tablero"));
        words.add(new Word("MARATON", "Deportes", "Carrera de larga distancia"));
        words.add(new Word("TRIATLON", "Deportes", "Carrera de tres deportes"));
        words.add(new Word("PESAS", "Deportes", "Levantamiento de peso"));
    }

    private void loadFood() {
        words.add(new Word("PIZZA", "Comida", "Plato italiano con queso"));
        words.add(new Word("HAMBURGUESA", "Comida", "Carne en pan"));
        words.add(new Word("PASTA", "Comida", "Fideos italianos"));
        words.add(new Word("ARROZ", "Comida", "Alimento básico de grano"));
        words.add(new Word("POLLO", "Comida", "Carne de ave"));
        words.add(new Word("ENSALADA", "Comida", "Vegetales mezclados"));
        words.add(new Word("SOPA", "Comida", "Plato líquido caliente"));
        words.add(new Word("SANDWICH", "Comida", "Pan con relleno"));
        words.add(new Word("BISTEC", "Comida", "Corte de carne"));
        words.add(new Word("PESCADO", "Comida", "Comida del mar"));
        words.add(new Word("CAMARON", "Comida", "Marisco pequeño"));
        words.add(new Word("LANGOSTA", "Comida", "Marisco grande"));
        words.add(new Word("SUSHI", "Comida", "Plato japonés con arroz"));
        words.add(new Word("TACO", "Comida", "Tortilla mexicana enrollada"));
        words.add(new Word("BURRITO", "Comida", "Tortilla grande envuelta"));
        words.add(new Word("NACHOS", "Comida", "Chips con queso"));
        words.add(new Word("PERRO", "Comida", "Salchicha en pan"));
        words.add(new Word("TOCINO", "Comida", "Tiras crujientes de cerdo"));
        words.add(new Word("HUEVOS", "Comida", "Proteína del desayuno"));
        words.add(new Word("PAN", "Comida", "Producto horneado de trigo"));
        words.add(new Word("QUESO", "Comida", "Producto lácteo"));
        words.add(new Word("MANTEQUILLA", "Comida", "Untable de leche"));
        words.add(new Word("YOGUR", "Comida", "Leche fermentada"));
        words.add(new Word("LECHE", "Comida", "Bebida láctea blanca"));
        words.add(new Word("CHOCOLATE", "Comida", "Dulce de cacao"));
        words.add(new Word("PASTEL", "Comida", "Postre horneado dulce"));
        words.add(new Word("GALLETA", "Comida", "Snack dulce horneado"));
        words.add(new Word("DULCE", "Comida", "Golosina azucarada"));
        words.add(new Word("HELADO", "Comida", "Postre congelado"));
        words.add(new Word("MANZANA", "Comida", "Fruta roja o verde"));
        words.add(new Word("BANANA", "Comida", "Fruta amarilla curva"));
        words.add(new Word("NARANJA", "Comida", "Fruta cítrica"));
        words.add(new Word("FRESA", "Comida", "Baya roja"));
        words.add(new Word("UVA", "Comida", "Fruta pequeña redonda"));
        words.add(new Word("SANDIA", "Comida", "Fruta grande verde"));
        words.add(new Word("PIÑA", "Comida", "Fruta tropical espinosa"));
        words.add(new Word("MANGO", "Comida", "Fruta tropical dulce"));
        words.add(new Word("AGUACATE", "Comida", "Fruta verde cremosa"));
        words.add(new Word("TOMATE", "Comida", "Fruta vegetal roja"));
        words.add(new Word("PAPA", "Comida", "Vegetal subterráneo"));
    }

    private void loadObjects() {
        words.add(new Word("TELEFONO", "Objetos", "Dispositivo de comunicación"));
        words.add(new Word("COMPUTADORA", "Objetos", "Máquina electrónica"));
        words.add(new Word("SILLA", "Objetos", "Mueble para sentarse"));
        words.add(new Word("MESA", "Objetos", "Mueble de superficie plana"));
        words.add(new Word("LIBRO", "Objetos", "Páginas para leer"));
        words.add(new Word("LAPICERO", "Objetos", "Herramienta para escribir"));
        words.add(new Word("LAPIZ", "Objetos", "Herramienta de grafito"));
        words.add(new Word("CUADERNO", "Objetos", "Papel para notas"));
        words.add(new Word("MOCHILA", "Objetos", "Bolsa para llevar cosas"));
        words.add(new Word("RELOJ", "Objetos", "Indica la hora"));
        words.add(new Word("LAMPARA", "Objetos", "Proporciona luz"));
        words.add(new Word("ESPEJO", "Objetos", "Refleja la imagen"));
        words.add(new Word("VENTANA", "Objetos", "Abertura de vidrio"));
        words.add(new Word("PUERTA", "Objetos", "Punto de entrada"));
        words.add(new Word("LLAVE", "Objetos", "Abre cerraduras"));
        words.add(new Word("CERRADURA", "Objetos", "Dispositivo de seguridad"));
        words.add(new Word("BILLETERA", "Objetos", "Guarda dinero"));
        words.add(new Word("GAFAS", "Objetos", "Ayudan a ver"));
        words.add(new Word("SOMBRERO", "Objetos", "Se usa en la cabeza"));
        words.add(new Word("ZAPATOS", "Objetos", "Se usan en los pies"));
        words.add(new Word("CAMISA", "Objetos", "Ropa de la parte superior"));
        words.add(new Word("PANTALON", "Objetos", "Ropa de la parte inferior"));
        words.add(new Word("CHAQUETA", "Objetos", "Ropa exterior"));
        words.add(new Word("PARAGUAS", "Objetos", "Protección contra lluvia"));
        words.add(new Word("BICICLETA", "Objetos", "Vehículo de dos ruedas"));
        words.add(new Word("CARRO", "Objetos", "Vehículo a motor"));
        words.add(new Word("TREN", "Objetos", "Transporte por rieles"));
        words.add(new Word("AVION", "Objetos", "Vehículo volador"));
        words.add(new Word("BARCO", "Objetos", "Embarcación de agua"));
        words.add(new Word("GUITARRA", "Objetos", "Instrumento de cuerdas"));
        words.add(new Word("PIANO", "Objetos", "Instrumento de teclado"));
        words.add(new Word("TAMBOR", "Objetos", "Instrumento de percusión"));
        words.add(new Word("CAMARA", "Objetos", "Toma fotos"));
        words.add(new Word("TELEVISION", "Objetos", "Pantalla para ver"));
        words.add(new Word("RADIO", "Objetos", "Reproduce audio"));
        words.add(new Word("MICROFONO", "Objetos", "Amplifica la voz"));
        words.add(new Word("ALTAVOZ", "Objetos", "Reproduce sonido"));
        words.add(new Word("TECLADO", "Objetos", "Entrada de computadora"));
        words.add(new Word("RATON", "Objetos", "Puntero de computadora"));
        words.add(new Word("CELULAR", "Objetos", "Teléfono móvil"));
    }

    public Word getRandomWord() {
        int index = random.nextInt(words.size());
        return words.get(index);
    }

    public int getTotalWords() {
        return words.size();
    }
}

