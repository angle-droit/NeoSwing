# NeoSwing

**NeoSwing** is a lightweight Java library built on **Swing** that provides modern, customizable GUI components. It makes creating windows, buttons, and panels easier with a simple and fluent API.

---

## Features

* **Modern components**: rounded buttons, resizable windows, flexible panels
* **Fluent API** for easy configuration (`setBackgroundColor`, `setSize`, etc.)
* **Lightweight and compatible** with standard Java Swing and AWT
* Works with **Java 8+**

---

## Installation

1. **Clone the repository**:

```bash
git clone https://github.com/yourusername/NeoSwing.git
```

2. **Add the source files** to your project or build with Maven/Gradle.

---

## Usage Example

```java
import com.alex.neoswing.component.NeoWindow;
import com.alex.neoswing.component.NeoButton;
import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NeoWindow window = new NeoWindow("NeoSwing Demo", 400, 300);

            NeoButton btn = new NeoButton("click", 100, 50);
		    btn.setAction(e -> System.out.println("test"));

            window.setLayout(new FlowLayout());
            window.add(button);
            window.pack();
            window.setVisible(true);
        });
    }
}
```

---

## Contributing

Contributions are welcome!

* Add new components, features, or fix issues
* Submit pull requests or open issues for suggestions

---

## License

This project is licensed under the **MIT License**.

---

💡 **Tip:** You can extend `NeoButton` or `NeoWindow` with your own styles and behaviors to create custom GUIs quickly.
