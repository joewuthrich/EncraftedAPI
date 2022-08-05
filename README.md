# EncraftedAPI
This repository contains the API for developing Encrafted spells.

You can use this repository with [Maven](https://www.jetbrains.com/idea/guide/tutorials/working-with-maven/creating-a-project/) to allow autocompleting in Java editors such as [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows).

```xml
  <repositories>
    <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
    </repository>
  </repositories>
  
  <dependencies>
    <dependency>
     <groupId>com.github.joewuthrich</groupId>
     <artifactId>EncraftedAPI</artifactId>
     <version>9cb6291d6b</version>
    </dependency>
  </dependencies>
```

You can use this, along with the [docs](https://javadocs.encrafted.net) and [javadocs](https://javadocs.encrafted.net), to create and submit spells for the server.

If you need help, feel free to ask questions in the [discord](https://discord.encrafted.net)!

# pom.xml
Your pom.xml will likely contain at least:
```xml
    <repositories>
        <repository>
            <id>papermc</id>
            <url>https://papermc.io/repo/repository/maven-public/</url>
        </repository>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.papermc.paper</groupId>
            <artifactId>paper-api</artifactId>
            <version>1.18.2-R0.1-SNAPSHOT</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.github.joewuthrich</groupId>
            <artifactId>EncraftedAPI</artifactId>
            <version>9cb6291d6b</version>
        </dependency>
    </dependencies>
```
