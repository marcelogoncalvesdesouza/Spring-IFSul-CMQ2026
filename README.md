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
```

## Annotations
- <b>@Serial</b>: A anotação @Serial (do pacote java.io) não é exclusiva do Spring, mas sim um recurso nativo do Java introduzido na versão 14. Ela serve para fazer verificações em tempo de compilação de classes que implementam a interface Serializable.

## Links

- Spring Initializr

```
https://start.spring.io/
```
