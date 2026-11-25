# Java-kurssin GitHub-template: käyttöönotto

## Paketin sisältö
- `student-template/`: GitHubiin julkaistava Maven-monimoduuliprojekti, 3 viikkoa, JUnit 5 -testit ja GitHub Actions.
- `teacher-only/`: erilliset piilotetut lisätestit opettajalle. **Älä julkaise tätä hakemistoa opiskelijoille.**

## Opettajan käyttöönotto
1. Asenna JDK 21, Maven 3.9+ ja Git.
2. Avaa terminaali hakemistossa `student-template` ja testaa `mvn test`. Aluksi osa testeistä **epäonnistuu tarkoituksella**, koska metodit ovat keskeneräisiä.
3. Luo GitHubiin repositorio, esim. `java-course-template`.
4. Julkaise **vain** `student-template`-hakemiston sisältö repositorion juureen:

```bash
cd student-template
git init
git add .
git commit -m "Initial three-week Java template"
git branch -M main
git remote add origin https://github.com/ORGANIZATION/java-course-template.git
git push -u origin main
```

5. GitHubin repositorion **Settings** > **Template repository** päälle.
6. Luo jokaiselle opiskelijalle yksityinen repositorio mallipohjasta (tai pyydä opiskelijaa luomaan oma yksityinen repositorio ja antamaan sinulle pääsy).
7. Opiskelija kloonaa oman repositorionsa, tekee tehtävät, ajaa `mvn -f week01/pom.xml test`, tekee commitin ja pushin. GitHub Actions ajaa kaikki kolme viikkoa automaattisesti.
8. Voit kloonata opiskelijan repositorion ja suorittaa lisätestit `teacher-only/README.md` -ohjeella.

## Tärkeä rajaus
Tämä paketti sisältää kaikki kolme viikkoa heti alussa. Jos haluat julkaista tehtävät yksi viikko kerrallaan, älä jaa koko pakettia heti. Tee erillinen viikoittainen jakelumenettely; GitHubin template ei päivitä jo luotuja opiskelijarepositorioita automaattisesti.

## Testitulokset
- Maven: `mvn test` (kaikki viikot)
- Yksi viikko: `mvn -f week02/pom.xml test`
- GitHub: opiskelijan repositorion **Actions**-välilehti
- Raportit: `weekXX/target/surefire-reports/`
