# Usar uma imagem oficial do Java
FROM eclipse-temurin:17-jdk

# Setar diretório de trabalho
WORKDIR /app

# Copiar o projeto inteiro para dentro da imagem
COPY . .

# Garante permissão de execução do Maven Wrapper
RUN chmod +x ./mvnw

# Compila o projeto
RUN ./mvnw clean package -DskipTests

# Executar a aplicação
CMD ["java", "-jar", "target/api-perfil-0.0.1-SNAPSHOT.jar"]
