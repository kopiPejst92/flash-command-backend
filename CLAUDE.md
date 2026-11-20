#Kontekst Projektu: FlashCommand
Aplikacja backendowa w Spring Boot służąca do zarządzania fiszkami z komendami programistycznymi.
Cel: Projekt do portfolio QA Automation 

##Stack Technologiczny
-Jezyk i framework: Java 21, Spring Boot 3.11, Maven
-Warstwa danych: Spring Data JPA MapStruct (`componentModel="spring"`), Kafka
-Testy: Junit 5, Mockito, AssertJ, MockMvc, RestAssured, Testcontainer
-CI/CD: Jenkinsfile (`Jenkinsfile` jako Pipeline)

##Architektura i Konwencje
-Pakiet główny: `com.aga.flashcommand`
-Warstwy:  `Controller -> Service -> Repository`
-Encje JPA nie wychodza poza warstwe serwisu -  kontrolery operują wyłącznie na obiektach DTO (`FlashCardResponseDTO`)
-Transakcyjność: używamy `org.springframework.transaction.annotation.Transactional` (nigdy `jakarta.transaction`).
-Styl testów: konwencja `Given / When / Then`, assercja wyłącznie z AssertJ

##Zasady odpowiedzi
-Odpowiadaj konkretnie i techniczne 
-Dopasuj generowany kod bezposrednio do powyzszego stacku i konwencji