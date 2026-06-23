# 🏛️ Componentes Letivos - SENAC Santa Maria

Este repositório foi estruturado de forma estratégica para centralizar, organizar e gerenciar todos os materiais de apoio, códigos de exemplo, avaliações e exercícios das unidades curriculares (UCs) ministradas. 

O objetivo principal é manter a **excelência técnica**, a **rastreabilidade pedagógica** e uma arquitetura de pastas que facilite o consumo do conteúdo pelos alunos e a auditoria de planos de trabalho.

---

## 📅 Visão Geral do Repositório

O repositório está segmentado por Unidades Curriculares. Cada diretório raiz representa uma UC específica, contendo seu respectivo plano de aulas, códigos-fonte organizados por encontros e materiais teóricos.

```text
├── .gitignore
├── README.md
├── UC2/                         # Ex: Programação Web / Estruturada / Banco de Dados
│   ├── .estatisticas/           # Controle interno de desempenho e entregas
│   ├── avaliacoes/              # Enunciados e gabaritos de provas/projetos
│   │   ├── UC2_Avaliacao_I.md
│   │   └── gabarito/
│   ├── materiais/               # Slides, PDFs e referências bibliográficas
│   └── projetos/                # Códigos desenvolvidos em aula
│       ├── encontro_01/
│       ├── encontro_02/
│       └── projeto_integrador/
└── UC_Templates/                # Modelos padronizados para novas disciplinas
```

## 🛠️ Tecnologias e Componentes Ministrados
O ecossistema de desenvolvimento abordado nestes módulos foca em pilares fundamentais para o mercado de tecnologia, incluindo, mas não se limitando a:

🌐 Frontend de Alta Performance: Construção de interfaces modernas e reativas utilizando React.js, JavaScript Moderno (ES6+), estruturação com HTML5 e estilização avançada com CSS3.

☕ Backend & Paradigmas: Desenvolvimento de lógica robusta baseada no paradigma de Programação Orientada a Objetos (POO) em Java e fundamentos com Linguagem de Programação Estruturada.

🗄️ Persistência de Dados: Projetos de Bancos de Dados Relacionais, cobrindo desde a abstração com Modelagem Conceitual e Lógica até a escrita de scripts e consultas complexas em SQL.

📊 Metodologia de Organização (Kanban de Fluxo)A gestão das aulas e o avanço cronológico dos conteúdos baseiam-se em uma metodologia ágil visual rigorosa. Isso garante previsibilidade, foco e transparência no progresso do aprendizado:

## ⚡ Padronização de Mensagens de Commit 
Para manter o histórico de evolução do repositório limpo, semântico e profissional, adota-se o padrão de mensagens baseado em tipos organizados:

TipoDescrição✨ feat(...)Introdução de um novo exemplo de código ou funcionalidade prática desenvolvida em aula.

🐛 fix(...)Correção de bugs em códigos de exemplo ou ajustes em roteiros de laboratório.

📝 docs(...)Atualizações de documentação, arquivos instrucionais, arquivos README ou materiais de leitura.

♻️ refactor(...)Melhorias de legibilidade, clean code ou otimização de código sem alterar o seu comportamento.

💡 Exemplo prático de execução:Bashgit commit -m "docs(uc2): atualiza cronograma de encontros no README"

---

## 🚀 Como Utilizar este Repositório

### 1. Clonar o Repositório
Para transferir e sincronizar todos os materiais localmente na sua estação de trabalho, execute:

```bash
git clone [https://github.com/Lucas-C-Machado/tds-senac-sm.git](https://github.com/Lucas-C-Machado/tds-senac-sm.git)
```

### 2. Sincronizar Atualizações DiáriasAntes de iniciar qualquer atividade ou aula, certifique-se de puxar as últimas atualizações do servidor remoto para manter o histórico alinhado e evitar conflitos:

```
Bashgit pull origin main
```

📌 Notas Importantes sobre Sincronização (Dica de Git)

⚠️ Atenção para o primeiro vínculo:Caso o repositório remoto contenha arquivos iniciais (como um arquivo README.md criado diretamente pela interface do GitHub) e o seu repositório local tenha sido iniciado de forma independente através do terminal, utilize o comando de união de históricos para realizar a primeira sincronização com sucesso: 

```
Bashgit pull origin main --allow-unrelated-histories
```

### 3. Em seguida, abra o seu editor, resolva os marcadores de conflito se houver em algum arquivo, prepare os arquivos ajustados, realize o commit de fechamento e execute o envio definitivo:

```
git add .
git commit -m "merge: integrando historicos remotos e locais"
git push -u origin main
```

🔬 Manual de Organização e Governança de Código Local — SENAC Santa Maria.
