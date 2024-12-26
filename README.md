# Love Framework Support for IntelliJ IDEA

![Build](https://github.com/pedrollanca/intellij-love-framework/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/26200.svg)](https://plugins.jetbrains.com/plugin/26200)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/26200.svg)](https://plugins.jetbrains.com/plugin/26200)

## Overview

**Love Framework Support** is an IntelliJ IDEA plugin designed to enhance your development experience with
the [LÖVE](https://love2d.org/) framework for Lua. By providing intelligent autocompletion for LÖVE's extensive API,
this plugin streamlines your coding workflow, reduces errors, and boosts productivity.

<!-- Plugin description -->
Love Framework Support is a simple plugin for IntelliJ IDEA that adds code completion for the LOVE 2D game engine. It
offers
suggestions for LOVE modules, functions, and callbacks, helping you write game code more easily. This plugin aims to
make developing LOVE 2D projects smoother and more efficient within IntelliJ.
<!-- Plugin description end -->

### **Key Features:**

- **Context-Aware Autocompletion:**
  - **Callbacks & Modules:** When typing `love.`, the plugin suggests relevant callbacks (e.g., `load`, `update`,
    `draw`) and modules (e.g., `audio`, `graphics`).
  - **Module-Specific Functions:** After selecting a module (e.g., `audio`) and typing `.`, only functions related to
    that module are suggested (e.g., `play`, `stop`).

- **Lightweight & Efficient:**
  - Designed to have minimal impact on IDE performance while providing robust autocompletion features.

## Installation

You can install **Love Framework Support** using one of the following methods:

### **1. Using the IDE Built-in Plugin System:**

1. Open IntelliJ IDEA.
2. Navigate to <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd>.
3. Search for "**Love Framework Support**".
4. Click <kbd>Install</kbd>.
5. Restart the IDE if prompted.

### **2. Using JetBrains Marketplace:**

1. Visit the [Love Framework Support Plugin Page](https://plugins.jetbrains.com/plugin/26200).
2. Click the <kbd>Install to ...</kbd> button. If your IDE is running, the plugin will be installed automatically.
3. Alternatively, download the [latest release](https://github.com/pedrollanca/intellij-love-framework/releases/latest)
   and install it manually:

- Open IntelliJ IDEA.
- Go to <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>.
- Select the downloaded plugin file and follow the prompts.

### **3. Manually Installing from Disk:**

1. Download the [latest release](https://github.com/pedrollanca/intellij-love-framework/releases/latest) of the plugin.
2. Open IntelliJ IDEA.
3. Navigate to <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from
   disk...</kbd>.
4. Select the downloaded `.zip` or `.jar` file.
5. Click <kbd>OK</kbd> and restart the IDE if prompted.

## Usage

Once installed, **Love Framework Support** enhances your Lua development within IntelliJ IDEA by providing intelligent
autocompletion for the LÖVE framework.

### **Getting Started:**

1. **Open a Lua File:**

- Create or open a `.lua` file in your project.

2. **Trigger Autocompletion:**

- Start typing `love.` at the beginning of a line.
- **Suggestions:** Callbacks (`load`, `update`, `draw`) and modules (`audio`, `graphics`, etc.) will appear.

3. **Module-Specific Functions:**

- Select a module from the suggestions (e.g., `audio`) and type `.` again.
- **Suggestions:** Only functions related to the selected module (e.g., `play`, `stop`) will appear.

## Future Improvements

The **love-framework** plugin is continuously evolving. Here are some planned enhancements:

- **Expanded Module Support:**
  - Incorporate autocompletion for all existing and future LÖVE modules.

- **Documentation Integration:**
  - Provide inline documentation popups for functions and modules to offer immediate context and usage examples.

- **Performance Optimization:**
  - Enhance the plugin's efficiency to ensure minimal impact on IDE performance, especially for large projects.

- **Integration with EmmyLua:**
  - Leverage EmmyLua's `LuaLanguage` class for enhanced language support and compatibility.

## Development

If you're interested in contributing to **love-framework**, follow these steps to set up the development environment:

### **1. Open the Project in IntelliJ IDEA:**

- Open IntelliJ IDEA.
- Select <kbd>File</kbd> > <kbd>Open...</kbd> and navigate to the cloned repository's directory.
- Click <kbd>OK</kbd> to open the project.

### **2. Build the Project:**

- Ensure you have the necessary dependencies configured in `build.gradle`.
- Use the Gradle tool window to build the project:
  - Locate the `build.gradle` file.
  - Run the `build` task.

### **3. Run the Plugin:**

- Use the Gradle task to run the plugin in a sandboxed IntelliJ instance:
  - Execute the `runIde` task.

### **4. Contribute:**

- Fork the repository and create a new branch for your feature or bug fix.
- Submit a pull request with detailed descriptions of your changes.

## Testing

The plugin includes a suite of tests to ensure reliability and functionality.

### **Running Tests:**

1. Open the project in IntelliJ IDEA.
2. Navigate to `src/test/java/com/pedrollanca/intellijloveframework/`.
3. Right-click on the class and select <kbd>Run</kbd>.

## License

[MIT](LICENSE)

## Acknowledgements

- [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template) – The foundation
  for building this plugin.

---