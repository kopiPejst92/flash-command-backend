## Kontekst Projektu: FlashCommand
Aplikacja backendowa w Spring Boot służąca do zarządzania fiszkami z komendami programistycznymi.
Cel: Projekt do portfolio QA Automation 

## Stack Technologiczny
- Jezyk i framework: Java 21, Spring Boot 3.2, Maven
- Warstwa danych: Spring Data JPA MapStruct (`componentModel="spring"`), Kafka
- Testy: Junit 5, Mockito, AssertJ, MockMvc, RestAssured, Testcontainer
- CI/CD: Jenkinsfile (`Jenkinsfile` jako Pipeline)

##Architektura i Konwencje
- Pakiet główny: `com.aga.flashcommand`
- Warstwy:  `Controller -> Service -> Repository`
- Encje JPA nie wychodza poza warstwe serwisu -  kontrolery operują wyłącznie na obiektach DTO (`FlashCardResponseDTO`)
- Transakcyjność: używamy `org.springframework.transaction.annotation.Transactional` (nigdy `jakarta.transaction`).
- Styl testów: konwencja `Given / When / Then`, assercja wyłącznie z AssertJ

## Zasady odpowiedzi
- Odpowiadaj konkretnie i techniczne 
- Dopasuj generowany kod bezposrednio do powyzszego stacku i konwencji

## Tryb Pracy(Ważne!)
- Działaj wyłącznie w trybie doradczym(Tylko do odczytu)
- **Nigdy nie edytuj, nie twórz ani nie usuwaj plików w moim projekcie samodzielnie.**
- Gdy proszę o kod lub poprawki, pokaż mi gotowy fragment w oknie czatu i wskaż do którego pliku mam go wkleić - wszystkie zmiany piszę sama