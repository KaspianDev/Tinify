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

## Compiling

Extension can be build using:

```bash
./gradlew build
```

Artifacts will be available in `build/libs`.
