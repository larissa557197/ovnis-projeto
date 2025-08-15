# 🛸 OVNI - WebApp
---

### Aplicação web para registro e listagem de avistamento de OVNIs, desenvolvida com `Spring Boot, Thymeleaf, PostgreSQL (Docker) e Flyway` para controle de versão do banco de dados.

---

## Funcionalidades
- 📄 **Listar** todos os avistamentos registrados
- ➕ **Adicionar** um novo avistamento via formulário
- 📦 **Armazenamento** no `PostgreSQL` com `Docker`
- 🗂  **Migrations** de banco usando `Flyway`
- Arquitetura **MVC** com boas práticas apresentadas em aula

---

## Campos do Avistamento
Cada registro inclui:
- **Location** (local do avistamento)
- **Date and Time** (data e hora do avistamento)
- **Color** (cor observada)
- **Shape** (`DISC`, `SPHERE`, `TRIANGLE`, `OTHER`)
- **Quantity of Objects** (quantidade de objetos avistados)

--- 

##Tecnologias Utilizadas
- Java 17+
- Spring Boot (Web, Data JPA, Thymeleaf)
- PostgreSQL
- Flyway
- Docker
- Maven/Gradle

---

## Configuração e Execução

### Clonar o repositório
```
git clone https://github.com/seu_usuario/ovnis-projeto.git
cd ovnis-projeto
```

### Subir o PostgreSQL com Docker
`docker-compose up -d`

```
services:
  postgres:
    image: 'postgres:latest'
    container_name: postgres_g
    environment:
      - 'POSTGRES_DB=ovni'
      - 'POSTGRES_PASSWORD=ovni'
      - 'POSTGRES_USER=ovni'
    ports:
      - '5432:5432'

```

### Rodar a aplicação

- com mvn
`./mvnw spring-boot:run`

- com gradlew
`./gradlew bootRun`

---
## Estrutura MVC
- **Model** → Classe `RegisterOvni` mapeada como entidade JPA
- **Repository** → Interface `RegisterOvniRepository` estendendo `JpaRepository`
- **Controller** → Classe `RegisterOvniController` com rotas GET/POST
- **Views** → Templates Thymeleaf (`index.html`, `form.html`)

---

## 📷 Preview das Páginas
####   | Página         |   Descrição              |
       |----------------|--------------------------|
####   | localhost:8080 |  página inicial          |
####   | /register/form | formulário de cadastro   |




---
Este projeto foi desenvolvido para fins educacionais na disciplina de `Java Advanced`.



