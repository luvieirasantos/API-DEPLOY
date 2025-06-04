# API de Perfis - Conexão Solidária

API RESTful desenvolvida em Java com Spring Boot para cadastro de perfis de usuário e contatos de emergência.  
**Deploy pronta e online para avaliação!**

---

## 📎 Links principais

- **API online:** [https://api-deploy-1-0xst.onrender.com](https://api-deploy-1-0xst.onrender.com)
- **Swagger (Documentação interativa):** [https://api-deploy-1-0xst.onrender.com/swagger-ui/index.html#/](https://api-deploy-1-0xst.onrender.com/swagger-ui/index.html#/)

---

## 📑 Endpoints disponíveis

### Perfis

- **GET** `/api/perfis`  
  Lista todos os perfis.

- **GET** `/api/perfis/{id}`  
  Busca perfil pelo ID.

- **POST** `/api/perfis`  
  Cria um novo perfil (enviar JSON no corpo).

- **PUT** `/api/perfis/{id}`  
  Atualiza perfil existente.

- **DELETE** `/api/perfis/{id}`  
  Remove perfil pelo ID.

### Contatos de Emergência

- **GET** `/api/contatos-emergencia`  
  Lista todos os contatos de emergência.

- **POST** `/api/contatos-emergencia`  
  Cria um contato de emergência.

- **DELETE** `/api/contatos-emergencia/{id}`  
  Remove um contato de emergência.

---

## 🚀 Como acessar/testar

1. Acesse a documentação interativa pelo Swagger:
   [https://api-deploy-1-0xst.onrender.com/swagger-ui/index.html#/](https://api-deploy-1-0xst.onrender.com/swagger-ui/index.html#/)
   
2. No Swagger, é possível:
   - Visualizar todos os endpoints
   - Testar operações (GET, POST, PUT, DELETE)
   - Ver exemplos de payloads para envio

3. Os endpoints estão abertos para teste (sem autenticação obrigatória).

---

## 📄 Exemplo de requisição (POST perfil)

```json
POST /api/perfis
Content-Type: application/json

{
  "nickname": "Maria",
  "bloodType": "O+",
  "allergies": "Amendoim",
  "medicalConditions": "Diabetes",
  "continuousMedication": "Insulina",
  "observations": "Prefere contato por WhatsApp",
  "avatarUrl": "https://img.com/avatar.png",
  "emergencyContactName": "João",
  "emergencyContactPhone": "11999999999",
  "userId": 1
}
```

## 🧑‍💻 Como rodar localmente
- Pré-requisitos:

*Java 17+*

*Maven*

```bash
Copiar
Editar
git clone https://github.com/luvieirasantos/API-DEPLOY.git
cd API-DEPLOY
mvn clean package
java -jar target/api-perfil-0.0.1-SNAPSHOT.jar
Acesse: http://localhost:8080/swagger-ui/index.html#/
```

## ☁️ Deploy em nuvem
Projeto já publicado no Render:
https://api-deploy-1-0xst.onrender.com

Se quiser deployar em outro serviço (Railway, Heroku, AWS, Azure), basta clonar o projeto e seguir o padrão Spring Boot.

## 📝 Observações
Esta API é didática e voltada para avaliação, com todos os endpoints disponíveis para testes rápidos.

Caso encontre erro 500 nos endpoints, pode ser limitação de conexões do banco Oracle cloud/free — reinicie o serviço ou aguarde alguns minutos para testar de novo.

## 👨‍🏫 Atende aos requisitos acadêmicos:
API RESTful

- Persistência em banco relacional (Spring Data JPA)

- Relacionamento entre entidades

- Validações com Bean Validation

- Documentação Swagger

- Deploy público em nuvem

  

  **Desenvolvido por Lu Vieira, Melissa Pereira e Diego Furigo – FIAP / Conexão Solidária**
