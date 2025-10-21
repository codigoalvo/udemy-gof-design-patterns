# Padrões de Projeto GoF — Exemplos em Java

Repositório: **[codigoalvo/udemy-gof-design-patterns](https://github.com/codigoalvo/udemy-gof-design-patterns)**  
Curso: **[Padrões de Projeto GoF (Design Patterns) — Udemy](https://www.udemy.com/course/gof-design-patterns/)**

> Este repositório reúne implementações de estudo dos 23 _Design Patterns_ clássicos descritos no livro **_Design Patterns: Elements of Reusable Object‑Oriented Software_** (Gang of Four — GoF), com foco em **Java**. A ideia é servir como guia rápido, laboratório de experimentos e base para comparação entre abordagens.

---

## 📁 Estrutura sugerida do projeto
A organização abaixo facilita localizar rapidamente os exemplos por categoria. (Adapte para refletir seu código atual.)

```
src/
 └── main/java/
     ├── creational/
     │   ├── abstractfactory/
     │   ├── builder/
     │   ├── factorymethod/
     │   ├── prototype/
     │   └── singleton/
     ├── structural/
     │   ├── adapter/
     │   ├── bridge/
     │   ├── composite/
     │   ├── decorator/
     │   ├── facade/
     │   ├── flyweight/
     │   └── proxy/
     └── behavioral/
         ├── chainofresponsibility/
         ├── command/
         ├── interpreter/
         ├── iterator/
         ├── mediator/
         ├── memento/
         ├── observer/
         ├── state/
         ├── strategy/
         ├── templatemethod/
         └── visitor/
```

> Dica: se preferir, crie um README dentro de cada pasta com um diagrama UML simples, problema que o padrão resolve, forças/limitações, variações e um trecho de código mínimo.

---

## 🚀 Como executar os exemplos

### Pré‑requisitos
- **Java 17+** (ou a versão usada no curso)  
- **Maven 3.9+** (ou Gradle, caso você opte por usar)

### Passos
```bash
git clone https://github.com/codigoalvo/udemy-gof-design-patterns.git
cd udemy-gof-design-patterns

# Se usar Maven
mvn -q -DskipTests package
mvn -q exec:java -Dexec.mainClass="com.exemplo.Main"   # ajuste a classe de entrada do exemplo desejado

# Ou, se cada padrão tiver um Main próprio, rode por IDE ou:
mvn -q exec:java -Dexec.mainClass="creational.builder.Demo"
```

> Sugestão: padronize uma classe `Demo` por padrão (ex.: `structural.adapter.Demo`) para facilitar a execução.

---

## 🧩 Padrões contemplados (23 GoF)

### Criação (_Creational_)
- **Singleton**
- **Factory Method**
- **Abstract Factory**
- **Builder**
- **Prototype**

### Estruturais (_Structural_)
- **Adapter**
- **Bridge**
- **Composite**
- **Decorator**
- **Facade**
- **Flyweight**
- **Proxy**

### Comportamentais (_Behavioral_)
- **Chain of Responsibility**
- **Command**
- **Interpreter**
- **Iterator**
- **Mediator**
- **Memento**
- **Observer**
- **State**
- **Strategy**
- **Template Method**
- **Visitor**

> Checklist: marque cada item como ✅ quando houver exemplo funcional e testes. Crie uma seção `README` específica por padrão com **problema**, **solução**, **quando usar**, **trade‑offs** e **exemplo mínimo**.

---

## 🧪 Testes (opcional mas recomendado)
- Use **JUnit 5** + **AssertJ** para cenários sintéticos (fáceis de manter).
- Para padrões com comportamento temporal/assíncrono (ex.: *Observer*), considere _fakes/mocks_.

---

## 📚 Leituras e referências rápidas
- **GoF** — _Design Patterns: Elements of Reusable Object‑Oriented Software_ (Gamma, Helm, Johnson, Vlissides).
- **Catálogo de Padrões** — páginas de referência/UML por padrão dentro do projeto.
- **Princípios SOLID** — úteis para discutir *por que* certos padrões se encaixam bem (e onde **não** usar).

---

## 📌 Roadmap de estudos (sugestão)
1. **Leia o problema** que cada padrão resolve (anti‑exemplo primeiro).
2. **Execute o demo** e altere parâmetros para ver o efeito.
3. **Escreva um teste** que falha sem o padrão e passa com ele.
4. **Compare alternativas** (ex.: `Factory Method` vs `Abstract Factory`; `Strategy` vs `State`).
5. **Anote decisões** e regras de bolso (quando _não_ usar).

---

## 🙌 Créditos
Curso Udemy: **Padrões de Projeto GoF (Design Patterns)**  
Instrutor: **Marco Aurélio Regis**  

> Agradecimento especial ao instrutor pelo conteúdo do curso e pelas explicações claras que inspiraram este repositório de estudos.

---

## 📄 Licença