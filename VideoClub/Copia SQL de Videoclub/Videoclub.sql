-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 19-05-2015 a las 19:09:24
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `Videoclub`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Pelicula`
--

CREATE TABLE IF NOT EXISTS `Pelicula` (
`IDPelicula` int(6) NOT NULL,
  `Titulo` varchar(100) COLLATE utf8_bin NOT NULL,
  `Director` varchar(35) COLLATE utf8_bin NOT NULL,
  `Genero` varchar(15) COLLATE utf8_bin NOT NULL,
  `Fecha_Alta` date NOT NULL,
  `Argumento` varchar(500) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `Pelicula`
--

INSERT INTO `Pelicula` (`IDPelicula`, `Titulo`, `Director`, `Genero`, `Fecha_Alta`, `Argumento`) VALUES
(1, 'Metrópolis', 'Fritz Lang', 'Ciencia Ficción', '2015-05-15', 'Futuro, año 2000. En la megalópolis de Metrópolis la sociedad se divide en dos clases, los ricos que tienen el poder y los medios de producción'),
(2, 'Metrópolis', 'Fritz Lang', 'Ciencia Ficción', '2015-05-15', 'Futuro, año 2000. En la megalópolis de Metrópolis la sociedad se divide en dos clases, los ricos que tienen el poder y los medios de producción'),
(3, 'La guerra de las galaxias. Episodio IV: Una nueva esperanza', 'George Lucas', 'Ciencia Ficción', '2015-05-15', 'La princesa Leia, líder del movimiento rebelde que desea reinstaurar la República en la galaxia en los tiempos ominosos del Imperio, es capturada por las Fuerzas Imperiales, capitaneadas por el implacable Darth Vader, el sirviente más fiel del Emperador. El intrépido y joven Luke Skywalker, ayudado por Han Solo, capitán de la nave espacial "El Halcón Milenario", y los androides, R2D2 y C3PO, serán los encargados de luchar contra el enemigo y e intentar rescatar a la princesa.'),
(4, 'La guerra de las galaxias. Episodio V: El imperio contraataca', 'Irvin Kershner', 'Ciencia Ficción', '2015-05-15', 'Tras un ataque sorpresa de las tropas imperiales a las bases camufladas de la alianza rebelde, Luke Skywalker, en compañía de R2D2, parte hacia el planeta Dagobah en busca de Yoda, el último maestro Jedi, para que le enseñe los secretos de la Fuerza. Mientras, Han Solo, la princesa Leia, Chewbacca, y C3PO esquivan a las fuerzas imperiales y piden refugio al antiguo propietario del Halcón Milenario, Lando Calrissian, en la ciudad minera de Bespin.'),
(5, 'La guerra de las galaxias. Episodio VI: El retorno del Jedi', 'Richard Marquand', 'Ciencia Ficción', '2015-05-15', 'Para ir a Tatooine y liberar a Han Solo, Luke Skywalker y la princesa Leia deben infiltrarse en la peligrosa guarida de Jabba the Hutt, el gángster más temido de la galaxia. Una vez reunidos, el equipo recluta a tribus de Ewoks para combatir a las fuerzas imperiales en los bosques de la luna de Endor. Mientras tanto, el Emperador y Darth Vader conspiran para atraer a Luke al lado oscuro, pero el joven está decidido a reavivar el espíritu del Jedi en su padre. La guerra civil galáctica termina co'),
(6, 'El viaje de', 'Hayao Miyazaki', 'Animación', '2015-05-15', 'Chihiro es una niña de diez años que viaja en coche con sus padres. Después de atravesar un túnel, llegan a un mundo fantástico, en el que no hay lugar para los seres humanos, sólo para los dioses de primera y segunda clase. Cuando descubre que sus padres han sido convertidos en cerdos, Chihiro se siente muy sola y asustada.'),
(7, 'The Wall (Pink Floyd - El Muro)', 'Alan Parker', 'Animación', '2015-05-15', 'Pink, el cantante de un grupo musical, arrastra desde su infancia una serie de traumas debido a la dura educación que recibió. Cansado de todo lo que rodea su profesión, se acaba refugiando en las drogas como única opción para romper con el muro que él mismo ha creado a su alrededor.'),
(8, 'Toy Story', 'John Lasseter', 'Animación', '2015-05-15', 'Los juguetes de Andy, un niño de 6 años, temen que haya llegado su hora y que un nuevo regalo de cumpleaños les sustituya en el corazón de su dueño. Woody, un vaquero que ha sido hasta ahora el juguete favorito de Andy, trata de tranquilizarlos hasta que aparece Buzz Lightyear, un héroe espacial dotado de todo tipo de avances tecnológicos. Woody es relegado a un segundo plano. Su constante rivalidad se transformará en una gran amistad cuando ambos se pierden en la ciudad sin saber cómo volver a '),
(9, 'Toy Story 2', 'John Lasseter, Ash Brannon, Lee', 'Animación', '2015-05-15', 'Cuando Andy se va de campamento dejando solos a los juguetes, Al McWhiggin, un compulsivo coleccionista de juguetes valiosos, secuestra a Woody. Buzz Lightyear y los demás juguetes tendrán que actuar con rapidez si quieren rescatarlo. Durante la operación de rescate no sólo tendrán que afrontar múltiples peligros, sino que también vivirán divertidas situaciones.'),
(11, 'Hermanos de sangre (Televisión)', 'Stephen Ambrose', 'Bélico', '2015-05-15', 'Miniserie de TV de 10 episodios que se basa en el bestseller de Stephen E. Ambrose "Band Of Brothers". Narra la historia de la Easy Company, un batallón americano del regimiento 506 de paracaidistas que luchó en Europa durante la II Guerra Mundial (1939-1945). Incluye entrevistas a los supervivientes, recuerdos de los periodistas y cartas de los soldados.'),
(12, '¿Teléfono rojo? Volamos hácia Moscú', 'Stanley Kubrick', 'Comedia', '2015-05-15', 'Convencido de que los comunistas están contaminando los Estados Unidos, un general ordena, en un acceso de locura, un ataque aéreo nuclear sorpresa contra la Unión Soviética. Su ayudante, el capitán Mandrake, trata de encontrar la fórmula para impedir el bombardeo. Por su parte, el Presidente de los EE.UU. se pone en contacto con Moscú para convencer al gobierno soviético de que el ataque no es más que un estúpido error. Mientras tanto, el asesor del Presidente, un antiguo científico nazi, el do'),
(13, 'La ventana indiscreta', 'Alfred Hitchcock', 'Intriga', '2015-05-15', 'Un reportero fotográfico (Stewart) se ve obligado a permanecer en reposo con una pierna escayolada. A pesar de la compañía de su novia (Kelly) y de su enfermera (Ritter), procura escapar al tedio observando desde la ventana de su apartamento con unos prismáticos lo que ocurre en las viviendas de enfrente. Debido a una serie de extrañas circunstancias empieza a sospechar de un vecino cuya mujer ha desaparecido.'),
(14, 'Crimen perfecto', 'Alfred Hitchcock', 'Intriga', '2015-05-15', 'Tony Wendice (Ray Milland)'),
(15, 'Aviones', 'John Lasseter', 'Animación', '2015-05-16', 'Dusty es un avión que sueña con participar en una competición aérea de altos vuelos. Pero Dusty no fue precisamente construido para competir y resulta que... ¡tiene miedo a las alturas! Así que, recurre a un experimentado aviador naval que le ayuda a clasificarse para retar al vigente campeón del circuito de carreras.'),
(16, 'Aviones 2', 'Klay Hall', 'Animación', '2015-05-16', 'Dusty'),
(17, 'Robots', 'Chris Wedge', 'Animación', '2015-05-16', 'Rodney Hojalata es un joven y genial inventor que sueña con hacer del mundo un lugar mejor.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Prestamo`
--

CREATE TABLE IF NOT EXISTS `Prestamo` (
  `Socio` int(6) NOT NULL,
  `Pelicula` int(6) NOT NULL,
  `Fecha` date DEFAULT NULL,
  `Precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `Prestamo`
--

INSERT INTO `Prestamo` (`Socio`, `Pelicula`, `Fecha`, `Precio`) VALUES
(4, 7, '2015-05-19', 3),
(4, 8, '2015-05-15', 2),
(5, 5, '2015-05-19', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Socio`
--

CREATE TABLE IF NOT EXISTS `Socio` (
`IDSocio` int(6) NOT NULL,
  `Nombre` varchar(35) COLLATE utf8_bin NOT NULL,
  `Apellido` varchar(35) COLLATE utf8_bin NOT NULL,
  `DNI` varchar(9) COLLATE utf8_bin NOT NULL,
  `Telefono` int(9) NOT NULL,
  `E_mail` varchar(35) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `Socio`
--

INSERT INTO `Socio` (`IDSocio`, `Nombre`, `Apellido`, `DNI`, `Telefono`, `E_mail`) VALUES
(1, 'Elena', 'Lozano', '76973671P', 606876534, 'elenamartinez@hotmail.com'),
(2, 'Ivan', 'López', '25187064V', 607223432, 'ivanlopez@gmail.com'),
(3, 'Miguel', 'Hernández', '72965665M', 650987645, 'miguelhernandez@yahoo.com'),
(4, 'Miguel Ángel', 'Rosales', '74987645K', 606987678, 'marosalesruiz@gmail.com'),
(5, 'María', 'Caravela', '72968170A', 645980963, 'mariacaravela@msn.es'),
(8, 'Irene', 'Maldonado', '19892567P', 654345654, 'irenemaldonado@gmail.com'),
(9, 'Adelaida', 'Romero', '75643324J', 654898765, 'adelaida@hotmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Pelicula`
--
ALTER TABLE `Pelicula`
 ADD PRIMARY KEY (`IDPelicula`);

--
-- Indices de la tabla `Prestamo`
--
ALTER TABLE `Prestamo`
 ADD PRIMARY KEY (`Socio`,`Pelicula`), ADD KEY `FK_Prestamos2` (`Pelicula`);

--
-- Indices de la tabla `Socio`
--
ALTER TABLE `Socio`
 ADD PRIMARY KEY (`IDSocio`), ADD UNIQUE KEY `DNI` (`DNI`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Pelicula`
--
ALTER TABLE `Pelicula`
MODIFY `IDPelicula` int(6) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT de la tabla `Socio`
--
ALTER TABLE `Socio`
MODIFY `IDSocio` int(6) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Prestamo`
--
ALTER TABLE `Prestamo`
ADD CONSTRAINT `FK_Prestamos1` FOREIGN KEY (`Socio`) REFERENCES `Socio` (`IDSocio`),
ADD CONSTRAINT `FK_Prestamos2` FOREIGN KEY (`Pelicula`) REFERENCES `Pelicula` (`IDPelicula`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
