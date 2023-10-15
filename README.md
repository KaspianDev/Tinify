# Tinify

Tinify is a fast [PlaceholderAPI](https://www.spigotmc.org/resources/6245)
extension that changes the font of the input string to a small, pixelated variant.

## Usage

You can use Tinify in two ways:

```
%tinify_<text>% (or %tinify_{placeholder}%)
```

This format gives output like this:  
![thin letter example](assets/letters.png)

or

```
%tinify_bold_<text>% (or %tinify_bold_{placeholder}%)
```

This format gives output like this:  
![bold letter example](assets/letters-bold.png)

## Installation

Just put the jar in `plugins/PlaceholderAPI/extensions` folder.

## Using the API

First off all add jitpack repo to your build script:

```gradle
repositories {
    maven {
        url = "https://jitpack.io"
    }
}
```

Then you can add the package as dependency (you should shade it):

```gradle
dependencies {
    implementation "com.github.KaspianDev.Tinify:Tinify-api:master-SNAPSHOT"
}
```

## Compiling

Extension can be build using:

```bash
./gradlew build
```

Artifacts will be available in `build/libs`.
