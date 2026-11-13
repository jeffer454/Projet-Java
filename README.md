# Projet-Java

Collection d'exercices de programmation en Java. L'objectif est de regrouper, au fil du temps, une vingtaine de projets (ou plus), nommés `Exercice-1` à `Exercice-20` (et au-delà).

---

## Premiers pas avec Java

Avant de commencer les exercices, voici ce qu'il faut installer et configurer sur votre machine.

### 1. Installer le JDK (Java Development Kit)

Le JDK contient le compilateur (`javac`) et la machine virtuelle Java (`java`) nécessaires pour créer et exécuter des programmes Java.

**Options recommandées :**
- [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) (version officielle)
- [Adoptium / Eclipse Temurin](https://adoptium.net/) (version Open Source, gratuite)

**Version conseillée :** JDK 17 ou supérieur (LTS).

### 2. Vérifier l'installation

Ouvrez un terminal (invite de commandes, PowerShell, ou terminal Linux/macOS) et tapez :

```bash
javac -version
java -version
```

Vous devriez voir s'afficher le numéro de version (ex: `javac 25`, `java 25`).  
Si vous obtenez une erreur du type *"commande introuvable"*, le JDK n'est pas installé ou n'est pas dans votre `PATH`.

### 3. Configurer le PATH (si nécessaire)

Si les commandes ne fonctionnent pas, ajoutez le dossier `bin` du JDK à votre variable d'environnement `PATH` :

- **Windows :** Panneau de configuration > Système > Variables d'environnement > `PATH` > ajouter `C:\Program Files\Java\jdk-X\bin`
- **macOS / Linux :** ajouter `export PATH=$PATH:/chemin/vers/jdk-X/bin` dans votre `~/.bashrc` ou `~/.zshrc`

### 4. Votre premier programme Java

Créez un fichier `Test.java` :

```java
public class Test {
    public static void main(String[] args) {
        System.out.println("Bonjour le monde !");
    }
}
```

Compilez-le :

```bash
javac Test.java
```

Cela génère le fichier `Test.class` (bytecode). Puis exécutez-le :

```bash
java Test
```

Résultat attendu :

```
Bonjour le monde !
```

> **Rappel :** le nom de la classe publique (`public class Test`) doit correspondre exactement au nom du fichier (`Test.java`).

---

## Architecture générale

```text
Projet-Java/
├── .gitignore                 # Ignore les .class et fichiers IDE/OS
├── README.md                  # Ce fichier (récapitulatif général)
├── Exercice-1/
│   ├── Exercice1.java         # Code source
│   ├── Exercice1.class        # Bytecode compilé (ignoré par Git)
│   └── README.md              # Récapitulatif de l'exercice 1
├── Exercice-2/
│   ├── Exercice2.java         # Code source
│   ├── Exercice2.class        # Bytecode compilé (ignoré par Git)
│   └── README.md              # Récapitulatif de l'exercice 2
├── Exercice-3/                # À créer au fil du temps
│   ├── Exercice3.java
│   └── README.md
└── ...
```

## Récapitulatif des exercices

| Exercice | Thème | Fichier source | Statut |
|----------|-------|----------------|--------|
| Exercice-1 | Informations personnelles d'un étudiant (variables, types, `Scanner`) | `Exercice1.java` | ✅ Fait |
| Exercice-2 | Calculatrice avec menu interactif | `Exercice2.java` | ✅ Fait |
| Exercice-3 | — | — | ⏳ À venir |
| Exercice-4 | — | — | ⏳ À venir |
| ... | — | — | ⏳ À venir |
| Exercice-20 | — | — | ⏳ À venir |

## Comment ajouter un nouvel exercice

1. Créer un dossier `Exercice-N/` à la racine.
2. Y ajouter le fichier source `ExerciceN.java`.
3. Le compiler pour générer `ExerciceN.class` :
   ```bash
   javac ExerciceN.java
   ```
4. Ajouter un fichier `README.md` résumant l'exercice (objectif, fonctionnement, fichiers, compilation).
5. Mettre à jour ce `README.md` général avec la nouvelle ligne du tableau.

## Règles importantes

- Les fichiers compilés `*.class` **ne doivent pas être committés**. Ils sont déjà exclus via le `.gitignore` à la racine.
- Chaque exercice est autonome : son propre `.java`, son `.class` généré localement, et son propre `README.md`.
- Le nommage des classes doit correspondre au nom du fichier source (ex: `Exercice1.java` → `public class Exercice1`).

## Compilation / exécution rapide

Depuis la racine du projet :

```bash
# Exercice 1
cd Exercice-1 && javac Exercice1.java && java Exercice1

# Exercice 2
cd ../Exercice-2 && javac Exercice2.java && java Exercice2
```
