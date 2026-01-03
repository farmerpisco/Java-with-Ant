# Java with Ant - GitHub Actions Practice

A simple Java project using Apache Ant to learn and practice GitHub Actions CI/CD.

## What This Project Does

- ✅ Compiles Java source code
- ✅ Runs unit tests with JUnit
- ✅ Creates a runnable JAR file
- ✅ Automatically builds on every push using GitHub Actions

## Project Structure

```
.
├── .github/workflows/ant.yml    # GitHub Actions workflow
├── src/com/example/
│   └── App.java                 # Main application
├── test/com/example/
│   └── CalculatorTest.java      # Unit tests
└── build.xml                    # Ant build configuration
```

## Quick Start

### 1. Clone the Repository

```bash
git clone <your-repo-url>
cd java-ant-github-actions
```

### 2. Build Locally (Optional)

**Requirements**: Java 8+ and Apache Ant installed

```bash
# Download JUnit (first time only)
mkdir -p lib
wget -O lib/junit-4.13.2.jar https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
wget -O lib/hamcrest-core-1.3.jar https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

# Build and run
ant compile    # Compile source code
ant test       # Run tests
ant jar        # Create JAR file
ant run        # Run the application
```

### 3. Watch GitHub Actions

Push to the `main` or `develop` branch and go to the **Actions** tab in your GitHub repository to see the workflow run automatically.

## Available Ant Commands

| Command | Description |
|---------|-------------|
| `ant compile` | Compile source code |
| `ant compile-tests` | Compile test code |
| `ant test` | Run unit tests |
| `ant jar` | Create JAR package |
| `ant run` | Run the application |
| `ant clean` | Delete build files |
| `ant all` | Clean, compile, and package |

## GitHub Actions Workflow

The workflow runs automatically on every push and:

1. Sets up Java 11
2. Downloads JUnit dependencies
3. Compiles source code
4. Compiles and runs tests
5. Creates JAR file (only if tests pass)
6. Uploads JAR as a downloadable artifact

**Workflow file**: `.github/workflows/ant.yml`

## How to Add Your Own Tests

1. Create a test file in `test/com/example/YourTest.java`
2. Name it ending with `Test.java` (e.g., `CalculatorTest.java`)
3. Use JUnit annotations:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class YourTest {
    @Test
    public void testSomething() {
        assertEquals(4, 2 + 2);
    }
}
```

4. Commit and push - the workflow will automatically run your tests!

## Learning Resources

- [GitHub Actions Documentation](https://docs.github.com/en/actions)
- [Apache Ant Manual](https://ant.apache.org/manual/)
- [JUnit 4 Documentation](https://junit.org/junit4/)

## License

This is a learning project - feel free to use and modify as needed!
