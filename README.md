# Android Starter Project Template

This template is designed to help you quickly set up your Android application with a modern, scalable, and maintainable codebase. It comes preconfigured with the most commonly used dependencies and best practices for Android development, allowing you to focus on building amazing features.

## Features

### Offline Storage:
- **Room Database:** For structured offline data storage, providing an abstraction layer over SQLite to allow fluent database access.
- **Preferences DataStore:** For efficient and asynchronous key-value storage, replacing SharedPreferences.

### Networking Client:
- **Ktor:** A modern asynchronous HTTP client for seamless networking operations.

### Dependency Injection:
- **Hilt:** A powerful DI library that simplifies the process of managing dependencies in your Android app.

### Navigation:
- **Jetpack Compose Navigation:** Simplified navigation and deep linking between composables with a single source of truth.

### ViewModel Support:
- **Hilt and Compose:** Preconfigured to use Hilt for injecting dependencies into ViewModels with Compose for UI development.

### Clean Architecture:
Follows the Clean Architecture pattern with a well-organized project structure:
- **Presentation Layer:** Contains UI components and ViewModels.
- **Domain Layer:** Contains business logic and use cases.
- **Data Layer:** Manages data sources and repositories.

## Getting Started

### Prerequisites
- **Android Studio:** Ensure you have the latest version of Android Studio installed.
- **Kotlin:** This project uses Kotlin as the primary programming language.

### Installation

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/richardmachage/Starter-Template-MVVM.git
    cd Starter-Template-MVVM
    ```

2. **Open in Android Studio:**
   - Open Android Studio, and select `Open an existing project`.
   - Navigate to the cloned repository directory and open it.

3. **Sync Gradle:**
   - Allow Android Studio to sync Gradle and download necessary dependencies.

4. **Run the App:**
   - Connect an Android device or start an emulator.
   - Click the `Run` button in Android Studio to build and deploy the app.

## Project Structure

```bash
android-starter-template/
│
├── app/                   # Application module
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── presentation/   # UI components and ViewModels
│   │   │   │   ├── domain/         # Business logic
│   │   │   │   └── data/           # Data sources and repositories
│   │   │   └── res/                # Resource files (layouts, strings, etc.)
│   │   └── test/                  # Unit tests
│   └── build.gradle               # Module-level Gradle settings
└── build.gradle                   # Project-level Gradle settings
```

## Contribution

Contributions are welcome!
If you have suggestions or improvements, feel free to open an issue or submit a pull request.
Please ensure your changes align with the project's coding standards and guidelines.
