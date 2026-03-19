package com.example.top10.repo

import com.example.top10.model.Answer
import com.example.top10.model.Question

val sampleQuestions = listOf(

    // 1️⃣ REICHE LÄNDER
    Question(
        textGerman = "Nenne die Top 10 reichsten Länder",
        textEnglish = "Name the top 10 richest countries",
        textArabic = "اذكر أغنى 10 دول في العالم",
        answers = listOf(
            Answer("Luxemburg", "Luxembourg", "لوكسمبورغ", 1),
            Answer("Schweiz", "Switzerland", "سويسرا", 2),
            Answer("Irland", "Ireland", "إيرلندا", 3),
            Answer("Norwegen", "Norway", "النرويج", 4),
            Answer("USA", "USA", "الولايات المتحدة", 5),
            Answer("Dänemark", "Denmark", "الدنمارك", 6),
            Answer("Niederlande", "Netherlands", "هولندا", 7),
            Answer("Island", "Iceland", "آيسلندا", 8),
            Answer("Singapur", "Singapore", "سنغافورة", 9),
            Answer("Australien", "Australia", "أستراليا", 10)
        )
    ),

    // 2️⃣ STÄDTE
    Question(
        textGerman = "Nenne die Top 10 größten Städte",
        textEnglish = "Name the top 10 largest cities",
        textArabic = "اذكر أكبر 10 مدن في العالم",
        answers = listOf(
            Answer("Tokio", "Tokyo", "طوكيو", 1),
            Answer("Delhi", "Delhi", "دلهي", 2),
            Answer("Shanghai", "Shanghai", "شنغهاي", 3),
            Answer("São Paulo", "São Paulo", "ساو باولو", 4),
            Answer("Mexico City", "Mexico City", "مكسيكو سيتي", 5),
            Answer("Kairo", "Cairo", "القاهرة", 6),
            Answer("Dhaka", "Dhaka", "دكا", 7),
            Answer("Mumbai", "Mumbai", "مومباي", 8),
            Answer("Peking", "Beijing", "بكين", 9),
            Answer("Osaka", "Osaka", "أوساكا", 10)
        )
    ),

    // 3️⃣ FILME
    Question(
        textGerman = "Nenne die Top 10 erfolgreichsten Filme",
        textEnglish = "Name the top 10 highest grossing movies",
        textArabic = "اذكر أكثر 10 أفلام تحقيقاً للإيرادات",
        answers = listOf(
            Answer("Avatar", "Avatar", "أفاتار", 1),
            Answer("Avengers Endgame", "Avengers Endgame", "أفنجرز النهاية", 2),
            Answer("Titanic", "Titanic", "تايتانيك", 3),
            Answer("Star Wars", "Star Wars", "حرب النجوم", 4),
            Answer("Frozen", "Frozen", "فروزن", 5),
            Answer("Jurassic World", "Jurassic World", "عالم الديناصورات", 6),
            Answer("Lion King", "Lion King", "الأسد الملك", 7),
            Answer("Spider-Man", "Spider-Man", "سبايدر مان", 8),
            Answer("Batman", "Batman", "باتمان", 9),
            Answer("Harry Potter", "Harry Potter", "هاري بوتر", 10)
        )
    )
)