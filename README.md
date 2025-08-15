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


