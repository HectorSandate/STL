# Usa Amazon Corretto 17 con Alpine como base
FROM amazoncorretto:17-alpine-jdk

# Instala PostgreSQL y otras dependencias necesarias
RUN apk add --no-cache postgresql postgresql-contrib sudo

# Copia tu aplicación
COPY /target/stl-0.0.1-SNAPSHOT.jar app.jar

# Copia un script de inicialización
COPY init.sh /init.sh
RUN chmod +x /init.sh

# Expone el puerto de tu aplicación
EXPOSE 8080

# Usa el script de inicialización como punto de entrada
ENTRYPOINT ["/init.sh"]