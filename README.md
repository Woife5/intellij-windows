# Windows Themes for IntelliJ IDEA

Classic Windows UI themes for JetBrains IDEs.

## Included Themes

- **Windows XP** - The iconic Windows XP visual style with blue title bars, silver/gray panel chrome, and a light editor color scheme
- **Windows Classic** - The timeless Windows 95/NT/2000 look with silver 3D buttons, navy blue accents, and classic text editor syntax highlighting

## Screenshots

### Windows XP

![Windows XP Theme](screenshots/windows-xp.png)

### Windows Classic

![Windows Classic Theme](screenshots/windows-classic.png)

## Installation

### From JetBrains Marketplace

1. Open your JetBrains IDE
2. Go to **Settings → Plugins → Marketplace**
3. Search for "Windows Themes"
4. Click **Install** and restart

### From Disk

1. Download the latest release from [Releases](https://github.com/woife5/intellij-windows/releases)
2. Go to **Settings → Plugins → ⚙️ → Install Plugin from Disk...**
3. Select the downloaded ZIP file and restart

## Getting Started

After installation:

1. Go to **Settings → Appearance & Behavior → Appearance**
2. Select **Windows XP** or **Windows Classic** from the Theme dropdown
3. Click **OK**

## Development

### Prerequisites

- Java 21 (Java 25 is not supported by the IntelliJ Platform Gradle Plugin)

### Building

```bash
export JAVA_HOME="/path/to/java-21"
./gradlew buildPlugin
```

The plugin ZIP will be at `build/distributions/intellij-windows-themes-<version>.zip`

### Running a Test IDE

```bash
./gradlew runIde
```

This launches a sandboxed IntelliJ instance with the plugin pre-installed.

## Releasing

Releases are automated via GitHub Actions.

1. Update the version in `gradle.properties` if desired
2. Commit your changes
3. Create and push a version tag:

```bash
git tag v1.0.0
git push origin main --tags
```

The workflow will:
- Build the plugin with the version from the tag
- Publish to JetBrains Marketplace
- Create a GitHub Release with the ZIP attached

### Manual Publishing

```bash
export PUBLISH_TOKEN="your_jetbrains_token"
./gradlew publishPlugin
```

## License

MIT
