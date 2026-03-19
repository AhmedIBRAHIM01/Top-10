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
    ),
    // 1️⃣ EUROPA LÄNDER (RANKED)
    Question(
        textGerman = "Nenne die Top 10 größten Länder Europas (nach Fläche)",
        textEnglish = "Name the top 10 largest European countries by area",
        textArabic = "اذكر أكبر 10 دول في أوروبا من حيث المساحة",
        answers = listOf(
            Answer("Russland", "Russia", "روسيا", 1),
            Answer("Ukraine", "Ukraine", "أوكرانيا", 2),
            Answer("Frankreich", "France", "فرنسا", 3),
            Answer("Spanien", "Spain", "إسبانيا", 4),
            Answer("Schweden", "Sweden", "السويد", 5),
            Answer("Norwegen", "Norway", "النرويج", 6),
            Answer("Deutschland", "Germany", "ألمانيا", 7),
            Answer("Finnland", "Finland", "فنلندا", 8),
            Answer("Polen", "Poland", "بولندا", 9),
            Answer("Italien", "Italy", "إيطاليا", 10)
        )
    ),
    Question(
        textGerman = "Nenne die Top 10 Fußballspieler mit den meisten Toren",
        textEnglish = "Name the top 10 football players with most goals",
        textArabic = "اذكر أكثر 10 لاعبين تسجيلاً للأهداف",
        answers = listOf(
            Answer("Cristiano Ronaldo", "Cristiano Ronaldo", "رونالدو", 1),
            Answer("Lionel Messi", "Lionel Messi", "ميسي", 2),
            Answer("Pelé", "Pele", "بيليه", 3),
            Answer("Romario", "Romario", "روماريو", 4),
            Answer("Ferenc Puskás", "Ferenc Puskas", "بوشكاش", 5),
            Answer("Josef Bican", "Josef Bican", "بيكان", 6),
            Answer("Zlatan Ibrahimovic", "Zlatan Ibrahimovic", "إبراهيموفيتش", 7),
            Answer("Robert Lewandowski", "Robert Lewandowski", "ليفاندوفسكي", 8),
            Answer("Gerd Müller", "Gerd Müller", "مولر", 9),
            Answer("Neymar", "Neymar", "نيمار", 10)
        )
    ),

    Question(
        textGerman = "Nenne die Top 10 größten Länder der Welt (nach Fläche)",
        textEnglish = "Name the top 10 largest countries in the world",
        textArabic = "اذكر أكبر 10 دول في العالم",
        answers = listOf(
            Answer("Russland", "Russia", "روسيا", 1),
            Answer("Kanada", "Canada", "كندا", 2),
            Answer("USA", "USA", "الولايات المتحدة", 3),
            Answer("China", "China", "الصين", 4),
            Answer("Brasilien", "Brazil", "البرازيل", 5),
            Answer("Australien", "Australia", "أستراليا", 6),
            Answer("Indien", "India", "الهند", 7),
            Answer("Argentinien", "Argentina", "الأرجنتين", 8),
            Answer("Kasachstan", "Kazakhstan", "كازاخستان", 9),
            Answer("Algerien", "Algeria", "الجزائر", 10)
        )
    ),
    Question(
        textGerman = "Nenne die Top 10 bevölkerungsreichsten Länder",
        textEnglish = "Name the top 10 most populous countries",
        textArabic = "اذكر أكثر 10 دول من حيث عدد السكان",
        answers = listOf(
            Answer("China", "China", "الصين", 1),
            Answer("Indien", "India", "الهند", 2),
            Answer("USA", "USA", "الولايات المتحدة", 3),
            Answer("Indonesien", "Indonesia", "إندونيسيا", 4),
            Answer("Pakistan", "Pakistan", "باكستان", 5),
            Answer("Nigeria", "Nigeria", "نيجيريا", 6),
            Answer("Brasilien", "Brazil", "البرازيل", 7),
            Answer("Bangladesch", "Bangladesh", "بنغلاديش", 8),
            Answer("Russland", "Russia", "روسيا", 9),
            Answer("Mexiko", "Mexico", "المكسيك", 10)
        )
    ),

    Question(
        textGerman = "Nenne die Top 10 größten Wüsten der Welt",
        textEnglish = "Name the top 10 largest deserts in the world",
        textArabic = "اذكر أكبر 10 صحارى في العالم",
        answers = listOf(
            Answer("Antarktische Wüste", "Antarctic Desert", "صحراء أنتاركتيكا", 1),
            Answer("Arktische Wüste", "Arctic Desert", "الصحراء القطبية", 2),
            Answer("Sahara", "Sahara", "الصحراء الكبرى", 3),
            Answer("Arabische Wüste", "Arabian Desert", "الصحراء العربية", 4),
            Answer("Gobi", "Gobi", "صحراء غوبي", 5),
            Answer("Kalahari", "Kalahari", "كالاهاري", 6),
            Answer("Patagonische Wüste", "Patagonian Desert", "باتاغونيا", 7),
            Answer("Great Victoria", "Great Victoria Desert", "فيكتوريا الكبرى", 8),
            Answer("Syrian Desert", "Syrian Desert", "الصحراء السورية", 9),
            Answer("Great Basin", "Great Basin Desert", "الحوض العظيم", 10)
        )
    ),

    Question(
        textGerman = "Nenne die Top 10 längsten Flüsse der Welt",
        textEnglish = "Name the top 10 longest rivers in the world",
        textArabic = "اذكر أطول 10 أنهار في العالم",
        answers = listOf(
            Answer("Nil", "Nile", "النيل", 1),
            Answer("Amazonas", "Amazon", "الأمازون", 2),
            Answer("Jangtse", "Yangtze", "اليانغتسي", 3),
            Answer("Mississippi", "Mississippi", "الميسيسيبي", 4),
            Answer("Jenissei", "Yenisei", "ينيسي", 5),
            Answer("Huang He", "Yellow River", "النهر الأصفر", 6),
            Answer("Ob", "Ob", "أوب", 7),
            Answer("Paraná", "Parana", "بارانا", 8),
            Answer("Kongo", "Congo", "الكونغو", 9),
            Answer("Amur", "Amur", "آمور", 10)
        )
    ),


    Question(
        textGerman = "Nenne die Top 10 Länder mit den meisten WM-Titeln",
        textEnglish = "Name the top 10 countries with most World Cups",
        textArabic = "اذكر أكثر 10 دول فازت بكأس العالم",
        answers = listOf(
            Answer("Brasilien", "Brazil", "البرازيل", 1),
            Answer("Deutschland", "Germany", "ألمانيا", 2),
            Answer("Italien", "Italy", "إيطاليا", 3),
            Answer("Argentinien", "Argentina", "الأرجنتين", 4),
            Answer("Frankreich", "France", "فرنسا", 5),
            Answer("Uruguay", "Uruguay", "أوروغواي", 6),
            Answer("Spanien", "Spain", "إسبانيا", 7),
            Answer("England", "England", "إنجلترا", 8),
            Answer("Niederlande", "Netherlands", "هولندا", 9),
            Answer("Kroatien", "Croatia", "كرواتيا", 10)
        )
    ),

    Question(
        textGerman = "Nenne die Top 10 teuersten Fußballspieler Transfers",
        textEnglish = "Name the top 10 most expensive football transfers",
        textArabic = "اذكر أغلى 10 صفقات انتقال في كرة القدم",
        answers = listOf(
            Answer("Neymar", "Neymar", "نيمار", 1),
            Answer("Mbappé", "Mbappe", "مبابي", 2),
            Answer("Coutinho", "Coutinho", "كوتينيو", 3),
            Answer("Dembele", "Dembele", "ديمبيلي", 4),
            Answer("Joao Felix", "Joao Felix", "جواو فيليكس", 5),
            Answer("Enzo Fernandez", "Enzo Fernandez", "إنزو", 6),
            Answer("Grealish", "Grealish", "غريليش", 7),
            Answer("Rice", "Rice", "رايس", 8),
            Answer("Haaland", "Haaland", "هالاند", 9),
            Answer("Bellingham", "Bellingham", "بيلينغهام", 10)
        )
    ),


    // 1️⃣ WM TITEL
    Question(
        textGerman = "Nenne die Top 10 Nationalmannschaften mit den meisten gewonnenen Weltmeisterschaften",
        textEnglish = "Name the top 10 national teams with the most World Cup titles",
        textArabic = "اذكر أكثر 10 منتخبات فازت بكأس العالم",
        answers = listOf(
            Answer("Brasilien", "Brazil", "البرازيل", 1),
            Answer("Deutschland", "Germany", "ألمانيا", 2),
            Answer("Italien", "Italy", "إيطاليا", 3),
            Answer("Argentinien", "Argentina", "الأرجنتين", 4),
            Answer("Frankreich", "France", "فرنسا", 5),
            Answer("Uruguay", "Uruguay", "أوروغواي", 6),
            Answer("Spanien", "Spain", "إسبانيا", 7),
            Answer("England", "England", "إنجلترا", 8),
            Answer("Niederlande", "Netherlands", "هولندا", 9),
            Answer("Kroatien", "Croatia", "كرواتيا", 10)
        )
    ),

// 2️⃣ CHAMPIONS LEAGUE TITEL
    Question(
        textGerman = "Nenne die Top 10 Vereine mit den meisten Champions-League-Titeln",
        textEnglish = "Name the top 10 clubs with the most Champions League titles",
        textArabic = "اذكر أكثر 10 أندية فازت بدوري أبطال أوروبا",
        answers = listOf(
            Answer("Real Madrid", "Real Madrid", "ريال مدريد", 1),
            Answer("AC Milan", "AC Milan", "ميلان", 2),
            Answer("Bayern München", "Bayern Munich", "بايرن ميونخ", 3),
            Answer("Liverpool", "Liverpool", "ليفربول", 4),
            Answer("Barcelona", "Barcelona", "برشلونة", 5),
            Answer("Ajax", "Ajax", "أياكس", 6),
            Answer("Inter", "Inter", "إنتر", 7),
            Answer("Manchester United", "Manchester United", "مانشستر يونايتد", 8),
            Answer("Juventus", "Juventus", "يوفنتوس", 9),
            Answer("Chelsea", "Chelsea", "تشيلسي", 10)
        )
    ),

// 3️⃣ MARKTWERT
    Question(
        textGerman = "Nenne die Top 10 Fußballvereine mit dem höchsten Marktwert",
        textEnglish = "Name the top 10 football clubs with the highest market value",
        textArabic = "اذكر أعلى 10 أندية من حيث القيمة السوقية",
        answers = listOf(
            Answer("Real Madrid", "Real Madrid", "ريال مدريد", 1),
            Answer("Manchester City", "Manchester City", "مانشستر سيتي", 2),
            Answer("Barcelona", "Barcelona", "برشلونة", 3),
            Answer("Bayern München", "Bayern Munich", "بايرن ميونخ", 4),
            Answer("PSG", "PSG", "باريس سان جيرمان", 5),
            Answer("Arsenal", "Arsenal", "أرسنال", 6),
            Answer("Liverpool", "Liverpool", "ليفربول", 7),
            Answer("Chelsea", "Chelsea", "تشيلسي", 8),
            Answer("Manchester United", "Manchester United", "مانشستر يونايتد", 9),
            Answer("Tottenham", "Tottenham", "توتنهام", 10)
        )
    ),
    // 4️⃣ BEVÖLKERUNG
    Question(
        textGerman = "Nenne die Top 10 Länder mit der größten Bevölkerung",
        textEnglish = "Name the top 10 most populated countries",
        textArabic = "اذكر أكثر 10 دول من حيث عدد السكان",
        answers = listOf(
            Answer("China", "China", "الصين", 1),
            Answer("Indien", "India", "الهند", 2),
            Answer("USA", "USA", "الولايات المتحدة", 3),
            Answer("Indonesien", "Indonesia", "إندونيسيا", 4),
            Answer("Pakistan", "Pakistan", "باكستان", 5),
            Answer("Nigeria", "Nigeria", "نيجيريا", 6),
            Answer("Brasilien", "Brazil", "البرازيل", 7),
            Answer("Bangladesch", "Bangladesh", "بنغلاديش", 8),
            Answer("Russland", "Russia", "روسيا", 9),
            Answer("Mexiko", "Mexico", "المكسيك", 10)
        )
    ),

// 5️⃣ FLÄCHE
    Question(
        textGerman = "Nenne die Top 10 größten Länder der Welt nach Fläche",
        textEnglish = "Name the top 10 largest countries by area",
        textArabic = "اذكر أكبر 10 دول في العالم من حيث المساحة",
        answers = listOf(
            Answer("Russland", "Russia", "روسيا", 1),
            Answer("Kanada", "Canada", "كندا", 2),
            Answer("USA", "USA", "الولايات المتحدة", 3),
            Answer("China", "China", "الصين", 4),
            Answer("Brasilien", "Brazil", "البرازيل", 5),
            Answer("Australien", "Australia", "أستراليا", 6),
            Answer("Indien", "India", "الهند", 7),
            Answer("Argentinien", "Argentina", "الأرجنتين", 8),
            Answer("Kasachstan", "Kazakhstan", "كازاخستان", 9),
            Answer("Algerien", "Algeria", "الجزائر", 10)
        )
    ),

// 6️⃣ BERGE
    Question(
        textGerman = "Nenne die Top 10 höchsten Berge der Welt nach Höhe",
        textEnglish = "Name the top 10 highest mountains by elevation",
        textArabic = "اذكر أعلى 10 جبال في العالم من حيث الارتفاع",
        answers = listOf(
            Answer("Mount Everest", "Mount Everest", "إيفرست", 1),
            Answer("K2", "K2", "كي 2", 2),
            Answer("Kangchenjunga", "Kangchenjunga", "كانغشينجونغا", 3),
            Answer("Lhotse", "Lhotse", "لوتسي", 4),
            Answer("Makalu", "Makalu", "ماكالو", 5),
            Answer("Cho Oyu", "Cho Oyu", "تشو أويو", 6),
            Answer("Dhaulagiri", "Dhaulagiri", "دهاولاغيري", 7),
            Answer("Manaslu", "Manaslu", "ماناسلو", 8),
            Answer("Nanga Parbat", "Nanga Parbat", "نانغا باربات", 9),
            Answer("Annapurna", "Annapurna", "أنابورنا", 10)
        )
    ),
    Question(
        textGerman = "Nenne die Top 10 Spieler mit den meisten Länderspielen",
        textEnglish = "Name the top 10 players with the most international caps",
        textArabic = "اذكر أكثر 10 لاعبين مشاركة مع منتخباتهم",
        answers = listOf(
            Answer("Cristiano Ronaldo", "Cristiano Ronaldo", "رونالدو", 1),
            Answer("Bader Al-Mutawa", "Bader Al-Mutawa", "بدر المطوع", 2),
            Answer("Lionel Messi", "Lionel Messi", "ميسي", 3),
            Answer("Ali Daei", "Ali Daei", "علي دائي", 4),
            Answer("Sergio Ramos", "Sergio Ramos", "راموس", 5),
            Answer("Ahmed Hassan", "Ahmed Hassan", "أحمد حسن", 6),
            Answer("Gianluigi Buffon", "Buffon", "بوفون", 7),
            Answer("Luka Modric", "Modric", "مودريتش", 8),
            Answer("Andres Guardado", "Guardado", "غواردادو", 9),
            Answer("Claudio Suarez", "Suarez", "سواريز", 10)
        )
    ),

    Question(
        textGerman = "Nenne die Top 10 Spieler mit den meisten Toren in der Champions League",
        textEnglish = "Name the top 10 scorers in Champions League history",
        textArabic = "اذكر أكثر 10 لاعبين تسجيلاً في دوري الأبطال",
        answers = listOf(
            Answer("Cristiano Ronaldo", "Cristiano Ronaldo", "رونالدو", 1),
            Answer("Lionel Messi", "Lionel Messi", "ميسي", 2),
            Answer("Robert Lewandowski", "Lewandowski", "ليفاندوفسكي", 3),
            Answer("Karim Benzema", "Benzema", "بنزيما", 4),
            Answer("Raul", "Raul", "راؤول", 5),
            Answer("Ruud van Nistelrooy", "Van Nistelrooy", "فان نيستلروي", 6),
            Answer("Thomas Müller", "Muller", "مولر", 7),
            Answer("Thierry Henry", "Henry", "هنري", 8),
            Answer("Zlatan Ibrahimovic", "Ibrahimovic", "إبراهيموفيتش", 9),
            Answer("Neymar", "Neymar", "نيمار", 10)
        )
    ),

    Question(
        textGerman = "Nenne die Top 10 größten Inseln der Welt nach Fläche",
        textEnglish = "Name the top 10 largest islands by area",
        textArabic = "اذكر أكبر 10 جزر في العالم",
        answers = listOf(
            Answer("Grönland", "Greenland", "غرينلاند", 1),
            Answer("Neuguinea", "New Guinea", "غينيا الجديدة", 2),
            Answer("Borneo", "Borneo", "بورنيو", 3),
            Answer("Madagaskar", "Madagascar", "مدغشقر", 4),
            Answer("Baffininsel", "Baffin Island", "بافين", 5),
            Answer("Sumatra", "Sumatra", "سومطرة", 6),
            Answer("Honshu", "Honshu", "هونشو", 7),
            Answer("Victoria Island", "Victoria Island", "فيكتوريا", 8),
            Answer("Großbritannien", "Great Britain", "بريطانيا", 9),
            Answer("Ellesmere", "Ellesmere", "إليسمير", 10)
        )
    ),

    Question(
        textGerman = "Nenne die Top 10 Länder mit den meisten Nachbarländern",
        textEnglish = "Name the top 10 countries with the most borders",
        textArabic = "اذكر الدول التي لها أكبر عدد من الحدود مع دول أخرى",
        answers = listOf(
            Answer("China", "China", "الصين", 1),
            Answer("Russland", "Russia", "روسيا", 2),
            Answer("Brasilien", "Brazil", "البرازيل", 3),
            Answer("Deutschland", "Germany", "ألمانيا", 4),
            Answer("Frankreich", "France", "فرنسا", 5),
            Answer("Österreich", "Austria", "النمسا", 6),
            Answer("Türkei", "Turkey", "تركيا", 7),
            Answer("Indien", "India", "الهند", 8),
            Answer("Iran", "Iran", "إيران", 9),
            Answer("Polen", "Poland", "بولندا", 10)
        )
    ),

    Question(
        textGerman = "Nenne die Top 10 meistgesprochenen Sprachen der Welt",
        textEnglish = "Name the top 10 most spoken languages",
        textArabic = "اذكر أكثر 10 لغات تحدثاً في العالم",
        answers = listOf(
            Answer("Englisch", "English", "الإنجليزية", 1),
            Answer("Mandarin", "Mandarin", "الصينية", 2),
            Answer("Hindi", "Hindi", "الهندية", 3),
            Answer("Spanisch", "Spanish", "الإسبانية", 4),
            Answer("Französisch", "French", "الفرنسية", 5),
            Answer("Arabisch", "Arabic", "العربية", 6),
            Answer("Bengalisch", "Bengali", "البنغالية", 7),
            Answer("Portugiesisch", "Portuguese", "البرتغالية", 8),
            Answer("Russisch", "Russian", "الروسية", 9),
            Answer("Urdu", "Urdu", "الأردية", 10)
        )
    ),

    Question(
        textGerman = "Nenne die Top 10 größten Unternehmen der Welt nach Umsatz",
        textEnglish = "Name the top 10 largest companies by revenue",
        textArabic = "اذكر أكبر 10 شركات في العالم من حيث الإيرادات",
        answers = listOf(
            Answer("Walmart", "Walmart", "وول مارت", 1),
            Answer("Amazon", "Amazon", "أمازون", 2),
            Answer("State Grid", "State Grid", "ستيت غريد", 3),
            Answer("Saudi Aramco", "Saudi Aramco", "أرامكو", 4),
            Answer("Sinopec", "Sinopec", "سينوبيك", 5),
            Answer("Apple", "Apple", "أبل", 6),
            Answer("Volkswagen", "Volkswagen", "فولكسفاغن", 7),
            Answer("Toyota", "Toyota", "تويوتا", 8),
            Answer("ExxonMobil", "ExxonMobil", "إكسون", 9),
            Answer("Berkshire Hathaway", "Berkshire Hathaway", "بيركشاير", 10)
        )
    )
)