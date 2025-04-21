# 🛵 Crowdsourced On-Demand Food Delivery (Java Simulation)

This project is a basic simulation of an Order Batching and Assignment (OBA) algorithm for crowdsourced food delivery platforms like Zomato, Swiggy, Uber Eats, etc. It’s based on the research paper:

> 📘 *Crowdsourced On-Demand Food Delivery: An Order Batching and Assignment Algorithm* (Transportation Research Part C, 2023)

---

## 📦 Features

- Generates random orders and couriers
- Clusters orders into groups
- Assigns couriers to **multiple orders** (batching)
- Displays:
  - 🚚 Courier → Assigned Orders
  - 📦 Pending Orders
  - ✅ Courier Status (Available/Busy)

---

## 📁 Project Structure

```
OBADelivery/
├── Main.java
├── model/
│   ├── Order.java
│   └── Courier.java
├── clustering/
│   └── OrderClusterer.java
├── assignment/
│   └── CourierMatcher.java
└── simulation/
    └── Simulation.java
```

---

## 🧪 How to Run (VS Code or IntelliJ)

1. **Unzip the project**
2. Open the folder in VS Code or IntelliJ
3. Run `Main.java`

### ✅ Java Version Required:
- Java 11+ (Java 17 recommended)

### 💡 VS Code Tips:
- Install **Java Extension Pack**
- Right-click `Main.java` → Run Java

---

## 🛠️ Future Scope

- Dynamic re-optimization (insertion/swap policies)
- Real location-based routing (Google Maps)
- Firebase or SQL database integration
- Agent-based animation of courier movement

---

## 📜 License

MIT License. Free for educational use & contribution.

---

## 💬 Author

Built by [sanket77u] with 💙 and Java. Inspired by the latest transportation optimization research.

## Contact

GitHub: [sanket77u](https://github.com/sanket77u)
Linkedin [sanket-uphade077](www.linkedin.com/in/sanket-uphade077)


⭐ Star this repo if you like it!
