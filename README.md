# 🔗 Linketinder

## Descrição do projeto
O Linketinder é um sistema de contratação inspirado na combinação do foco profissional do LinkedIn com a dinâmica de "Match" do Tinder. O projeto nasceu de uma demanda do empresário Dr. Antônio Paçoca, que buscava uma solução prática e objetiva para conectar empresas e candidatos, fugindo de algoritmos tendenciosos.

Esta versão é um **MVP (Minimum Viable Product)** executado inteiramente via CLI (Interface de Linha de Comando). O objetivo principal desta etapa é validar a estrutura de dados e a modelagem orientada a objetos, garantindo a listagem de empresas e candidatos pré-cadastrados no sistema, visualizando suas informações e respectivas competências (skills).

## Estrutura de pastas do projeto
O projeto foi estruturado seguindo o padrão arquitetural **MVC (Model-View-Controller)**, separando as responsabilidades para facilitar a manutenção e escalabilidade do código:

```text
📁 linketinder
├── 📁 src
│   ├── 📁 model         # Classes de domínio e interfaces
│   ├── 📁 view          # Classes responsáveis pela interface no terminal
│   ├── 📁 controller    # Lógica de controle e regras de negócio
├── 📄 README.md         # Documentação principal
```

## Como executar o código
Para rodar a aplicação, é necessário ter o ambiente Groovy (Groovy Version: 4.0.30 JVM: 17.0.18) configurado na sua máquina.

1. Clone o repositório para o seu ambiente local:
   ```bash
   git clone [https://github.com/Escarletx/linketinder.git](https://github.com/Escarletx/linketinder)
   ```
2. Navegue até a pasta de código-fonte do projeto:
   ```bash
   cd linketinder/src/com/escarlet/linketinder/view
   ```
3. Execute o arquivo principal utilizando o Groovy:
   ```bash
   groovy Main.groovy
   ```
4. Interaja com o sistema através do menu numérico apresentado no terminal.

## Tecnologias utilizadas
* **Groovy:** Linguagem de programação principal utilizada para o desenvolvimento do backend.
* **Paradigma Orientado a Objetos (POO):** Utilizado na modelagem de heranças e interfaces.
* **Padrão MVC:** Arquitetura de software para separação clara de responsabilidades (Model-View-Controller).
* **CLI (Command Line Interface):** Interação e apresentação dos dados inteiramente via terminal.

## Comentários sobre a solução
A solução foi desenhada aplicando os conceitos de Orientação a Objetos em conjunto com a arquitetura MVC. Foi criada uma interface base `Pessoa` que define os comportamentos gerais, sendo implementada/estendida por `Candidato` (representando Pessoa Física) e `Empresa` (representando Pessoa Jurídica). A utilização do padrão MVC garante que a lógica de apresentação (CLI) não se misture com as regras de negócio ou com as estruturas de dados.

Para cumprir os requisitos do MVP inicial, o sistema inicia com listas estáticas de 5 candidatos e 5 empresas pré-cadastradas em memória, contendo seus respectivos atributos básicos e uma lista de competências técnicas (ex: Python, Java, Groovy). O menu interativo no terminal permite listar e validar a consistência desses dados antes de avançarmos para regras mais complexas de interação.

## Próximos passos
Como o projeto está em evolução contínua (MVP), as próximas tarefas técnicas mapeadas no backlog incluem:
- [ ] Implementar a funcionalidade opcional de cadastro interativo de novos candidatos e empresas via CLI.
- [ ] Criar um sistema de autenticação (login) simples para separar a visão e as ações de "Candidato" e "Empresa".
- [ ] Estruturar a entidade "Vaga", associando-a a uma empresa de forma anônima para o mercado.
- [ ] Desenvolver a mecânica de "Curtidas": permitir que o candidato curta uma vaga anônima e a empresa visualize a lista de interessados.
- [ ] Implementar a lógica de "Match" quando a empresa curtir de volta um candidato que demonstrou interesse na vaga.

---
Feito com 🍰 e 💻 por Escarlet Imopoco Lima. &copy; 2026
