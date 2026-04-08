# 🎮 Top 10 Quiz Game

A modern multiplayer quiz game where two teams compete by guessing **Top 10 ranked answers** across different categories like geography, football, math, and general knowledge.

---

## 🚀 Features

* 🌍 **Multi-language support**

    * 🇩🇪 German
    * 🇬🇧 English
    * 🇸🇦 Arabic (RTL support)

* 🎮 **Game Master Mode**

    * One device controls the entire game
    * Teams answer verbally

* 🧠 **Top 10 Ranking System**

    * Easy answers = low points
    * Hard answers = high points

* 🔀 **Random Questions**

    * Questions are shuffled each game

* ⚡ **Real-time scoring**

    * Points are automatically calculated

* 📱 **Modern UI with Jetpack Compose**

---

## 🎯 How the Game Works

1. Select a language at startup
2. Game Master reads the question
3. Teams give answers
4. Game Master assigns correct answers
5. Points are awarded based on difficulty
6. Next question → new round

---

## 🧩 Example Question

**"Name the top 10 richest countries in the world"**

| Rank | Answer     | Points |
| ---- | ---------- | ------ |
| 1    | Luxembourg | 1      |
| 5    | USA        | 5      |
| 10   | Australia  | 10     |

---

## 🛠️ Tech Stack

* **Kotlin**
* **Jetpack Compose**
* **MVVM Architecture**
* **State Management with ViewModel**

---

## 📂 Project Structure

```
ui/
model/
viewmodel/
repo/
```

---

## 🌍 Multilingual Support

All questions and answers are stored in three languages:

```kotlin
Answer(
    textGerman = "Deutschland",
    textEnglish = "Germany",
    textArabic = "ألمانيا"
)
```

---

## 🔥 Future Improvements

* 🎨 Animations (answers flying to teams)
* 🔊 Sound effects (correct / wrong)
* ⏱️ Timer mode
* 📊 Score history
* 🌐 Online multiplayer version

---



## ⭐ License

This project is for educational purposes.
