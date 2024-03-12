https://github.com/ddealsan/CasoFinalIntegrador2.2.git


# Proyecto Zoológico - README

## Introducción
Este proyecto es un sistema de gestión para un zoológico que permite a visitantes y trabajadores acceder a diferentes funcionalidades según su rol. Proporciona información sobre los animales, hábitats, recursos, seguridad y más.

## Funcionalidades
El proyecto consta de varias partes:

### 1. **Gestión de Animales**
- Clases relacionadas: `Animal`, `Acuático`, `Terrestre`, `Ave`, `RegistrarNuevoAnimal`.
- Descripción: Permite registrar nuevos animales en el zoológico, especificando su nombre, especie, edad y tipo (acuático, terrestre o ave).

### 2. **Gestión de Hábitats**
- Clase: `SistemaMonitoreo`.
- Descripción: Permite monitorear y registrar información sobre las condiciones de los hábitats, como temperatura, humedad y limpieza.

### 3. **Administración de Recursos**
- Clases relacionadas: `ManejoRecursosZoologico`, `Recurso`, `Pedido`, `Proveedor`.
- Descripción: Permite gestionar los recursos del zoológico, como alimentos y medicinas, realizando pedidos a proveedores y actualizando el inventario.

### 4. **Mantenimiento y Seguridad**
- Clases relacionadas: `Camera`, `Sensor`, `SistemaSeguridad`, `RegistroMantenimiento`, `ReparacionUrgente`.
- Descripción: Proporciona funciones para mantener la seguridad en el zoológico, como el monitoreo mediante cámaras y sensores, así como el registro de mantenimiento y reparaciones urgentes.

### 5. **Visitas**
- Clases relacionadas: `MostrarAcuaticos`, `MostrarTerrestres`, `MostrarAves`.
- Descripción: Muestra información sobre los diferentes tipos de animales disponibles en el zoológico, separados por su tipo: acuáticos, terrestres y aves.

### 6. **Interfaz de Usuario**
- Clase: `Main`.
- Descripción: Proporciona una interfaz de línea de comandos para que los visitantes y trabajadores accedan a las funcionalidades del sistema según su rol.

## Uso
1. Clona el repositorio en tu máquina local.
2. Compila y ejecuta el programa usando un IDE o mediante la línea de comandos
