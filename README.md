# Ejemplo Spring Framework

Para utilizarlo, debes primero, en Eclipse, instalar los addonds de STS. Sigue las siguientes instrucciones:

1. Ve al Marketplace de Eclipse, e instala Spring Tools 4.
2. Reinicia Eclipse.
3. Ve al Marketplace de Eclipse, e instala Spring Tools 3 Add-On for Spring Tools.
4. Reinicia Eclipse.

Recuerda que debes ejecutar el proyecto, no un archivo en particular.

## Cambios del 20 de Enero.
- Incluimos patrones en URI del RequestMapping
- Incluimos paso de parámetros por POST con @RequestParam


## Cambios del 21 de Enero.
- Implementamos JdbcTemplate (en archivo spring-context.xml). 
- Incluimos dependencias necesarias en pom.xml
- Creamos vista clientes.jsp
- Correjimos clase Clientes para que reciba datos de tabla customers (base de ejemplo de Oracle [^1]) .
- Creamos Interfae IClienteDAO
- Correjimos implementación de ClienteDAO para que impemente JdbcTemplate.

## Cambios del 22 de Enero.
- Terminamos de implementar el CRUD de Cliente, con JdbcTemplate
- Optimizamos mapeo de Cliente en DAO, utilizando la interfaz RowMapper.
- Agregamos ejemplos de CRUD para Producto, con mapeo incluido.
- Implementamos vista de Edición Cliente.
- Utilizamos ModelAndView en ClientesController


[^1]:	La BD que utilizo es [esta](https://www.oracletutorial.com/getting-started/oracle-sample-database/), adaptada a Oracle11g XE