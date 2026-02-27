# Advanced Java Learning

BTK Akademi **İleri Seviye Java** eğitimi kapsamında yapılan örnekler ve mini demoların toplandığı çalışma repository’si.  
Amaç; Java ekosisteminde **Spring (IoC/DI + Web)** ve **Hibernate/JPA (ORM)** konularını tekrar etmek ve pratik etmektir.

---

## İçerik

Repository, birbirinden bağımsız örnek/modüller içerir:

- **intro/**: Maven tabanlı giriş çalışmaları + Hibernate Core bağımlılığı
- **springIntro/**: Spring’e giriş (temel kavramlar)
- **springDemoIoCAnnotation/**: Annotation tabanlı IoC/DI örnekleri
- **springBootDemo/**: Spring Boot ile web/REST demo
- **hibernateDemo/**: Hibernate örnekleri
- **hibernateAndJpa/**: Spring Boot + Spring Data JPA + MySQL ile ORM örneği

---

## Neler öğrenildi / pekiştirildi?

- **Spring Core**
  - IoC (Inversion of Control) ve DI (Dependency Injection) yaklaşımı
  - Annotation tabanlı bean yönetimi ve bağımlılık enjeksiyonu

- **Spring Boot**
  - Spring Boot proje yapısı ve Maven ile çalıştırma
  - Web/REST katmanına giriş (starter-web)

- **ORM (Hibernate / JPA)**
  - Hibernate Core ile ORM yaklaşımını tanıma
  - Spring Data JPA ile repository yaklaşımı
  - Veritabanı bağlantısı ve temel Hibernate ayarları (dialect, ddl-auto, show-sql)

---

## Kullanılan teknolojiler ve versiyonlar

- **Java**
  - `intro` modülü: compiler `source/target = 1.11` (Java 11)

- **Build Tool**
  - Maven

- **Spring Boot**
  - `spring-boot-starter-parent`: **2.1.3.RELEASE**
  - `spring-boot-starter-web`
  - `spring-boot-starter-test`
  - (bazı modüllerde) `spring-boot-devtools`

- **Hibernate / JPA**
  - `org.hibernate:hibernate-core`: **5.4.1.Final** (intro modülü)
  - `spring-boot-starter-data-jpa` (hibernateAndJpa modülü)

- **Database**
  - MySQL
  - `mysql:mysql-connector-java`: **8.0.15**
  - Hibernate dialect: `org.hibernate.dialect.MySQL5InnoDBDialect`

---

## Nasıl çalıştırılır?

Her modül ayrı proje gibi düşünülebilir.

1) İlgili modül dizinine gir:
```bash
cd springBootDemo
```

2) Maven ile build al:
```bash
mvn clean package
```

3) Spring Boot modüllerini çalıştır:
```bash
mvn spring-boot:run
```

> `hibernateAndJpa` modülünde MySQL bağlantısı için `application.properties` içindeki DB ayarlarının (url/username/password) yerel ortamına göre güncellenmesi gerekebilir.

## Kurulum ve Çalıştırma

1. Repo'yu klonlayın:

```bash
git clone https://github.com/Salihapeker/advanced-java-learning.git
cd advanced-java-learning
