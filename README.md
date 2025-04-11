# ☕ Coffee Addons Java Project

A simple, flexible Java implementation of the Decorator Design Pattern for customizing coffee orders with various add-ons like milk and sugar.

---

## ✨ Features
- Implementation of Decorator Design Pattern
- Easily extendable for new coffee add-ons
- Clean and modular code structure
- Real-life coffee order simulation

---

## ⚙️ Requirements
- Java JDK 8 or higher
- Any Java IDE or terminal for compiling & running

---

## 💻 Installation

Clone the repository:
```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

Compile the Java files:
```bash
javac *.java
```

Run the project:
```bash
java Main
```

---

## 💂 Project Structure
```
.
├── CoffeeAddons.java    # Abstract Decorator Class
├── ICoffee.java        # Coffee Interface
├── Main.java           # Main Class (Driver Code)
├── MilkAddon.java      # Concrete Decorator - Milk
├── PlainCoffee.java    # Concrete Coffee Class
└── SugarAddon.java     # Concrete Decorator - Sugar
```

---

## 🚀 Usage

1. Run the program
2. The console will display:
   - Plain Coffee
   - Milk added
   - Sugar added
3. Easy to extend by adding new decorator classes like *CaramelAddon*, *ChocolateAddon*, etc.

---



