# Ecossistema Spring

## Projetos do Spring
- <b>Spring Boot</b>: O Spring Boot facilita a criação de aplicativos autônomos baseados em Spring de nível de produção que você pode "simplesmente executar";
- <b>Spring Framework</b>: O Spring Framework fornece um modelo abrangente de programação e configuração para aplicativos empresariais modernos baseados em Java - em qualquer tipo de plataforma de implementação;
- <b>Spring Data</b>: A missão da Spring Data é fornecer um modelo de programação familiar e consistente baseado em Spring para acesso a dados, mantendo as características especiais do armazenamento de dados subjacente;

## Dependências do projeto
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-h2console</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webmvc</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa-test</artifactId>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webmvc-test</artifactId>
    <scope>test</scope>
</dependency>
```

## Dependências externas:
- <b>H2 Database</b>: O H2 é um Sistema Gerenciador de Banco de Dados Relacional (SGBDR) escrito em Java, extremamente leve e rápido. Ele é muito popular no desenvolvimento de software, especialmente por poder rodar diretamente na memória RAM (sem salvar no disco) ou ser embutido dentro da própria aplicação.
```
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

## Inserindo dados no H2
```
INSERT INTO tb_especialidade (nome) VALUES ('Clínica Geral');
INSERT INTO tb_especialidade (nome) VALUES ('Cardiologia');
INSERT INTO tb_especialidade (nome) VALUES ('Pediatria');
INSERT INTO tb_medico (nome, email, crm, atende_convenio, id_especialidade) VALUES ('Paula Moraes', 'pmoraes@gmail.com', '55412', TRUE, 1);
INSERT INTO tb_medico (nome, email, crm, atende_convenio, id_especialidade) VALUES ('Mônica Persa', 'drapersa@gmail.com', '41547', FALSE, 2);
INSERT INTO tb_medico (nome, email, crm, atende_convenio, id_especialidade) VALUES ('João Antônio Silveira', 'ja.silveira@gmail.com', '32002', TRUE, 1);
```

## Annotations
- <b>@Serial</b>: A anotação @Serial (do pacote java.io) não é exclusiva do Spring, mas sim um recurso nativo do Java introduzido na versão 14. Ela serve para fazer verificações em tempo de compilação de classes que implementam a interface Serializable.

## Links

- Spring Initializr
```
https://start.spring.io/
```

## CRIAÇÃO DE REPOSITÓRIO
```
git init
git config --global user.email "marcelo.souza@dnweb.com.br"
git config --global user.name "Marcelo Gonçalves de Souza"
git remote add origin https://github.com/marcelogoncalvesdesouza/xxx.git
git branch -M main
git add .
git commit -m "Update."
git push -u origin main
```

## ATUALIZAÇÃO DE REPOSITÓRIO
```
git add .
git commit -m "Update."
git push -u origin main
```

## REPOSITÓRIO EXISTENTE
```
git init
git remote add origin https://github.com/marcelogoncalvesdesouza/xxx.git
git branch -M main
git pull origin main
```