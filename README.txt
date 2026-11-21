BUDOWANIE (potrzebujesz JDK 21 i internetu):
1. Najprosciej: wez wrapper z https://github.com/FabricMC/fabric-example-mod
   (skopiuj pliki gradlew, gradlew.bat i folder gradle/ do tego folderu)
   albo zainstaluj Gradle 8.12+.
2. W folderze projektu uruchom:   ./gradlew build     (Windows: gradlew.bat build)
3. Gotowy mod: build/libs/hitboxmod-1.0.0.jar -> wrzuc do .minecraft/mods
   (wymaga Fabric Loader + Fabric API, Minecraft 1.21.4)

Klawisz: H (zmienisz w Opcje -> Sterowanie). Rozmiar: HitboxModClient.margin.
Inna wersja MC? Zmien wersje w gradle.properties (sprawdz na https://fabricmc.net/develop).
