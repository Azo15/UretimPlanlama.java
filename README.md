# 🏭 Dinamik Programlama ile Üretim Planlama

## 📌 Problem Tanımı

Bir üretim hattında `n` adet iş sırayla tamamlanmalıdır. Her iş, `m` farklı makinede yapılabilir ve her makinede işlem süresi farklıdır. Ayrıca, makineler arasında geçiş yapılması durumunda belirli bir geçiş maliyeti (örneğin taşıma süresi veya ayar süresi) oluşur.

**Amaç:** Tüm işleri sırasıyla minimum toplam sürede tamamlayacak şekilde makine seçimi yapmaktır.

Toplam süre:  
📦 İşlem Süreleri + 🔁 Geçiş Maliyetleri

---

## 🧠 Kullanılan Yöntem: Dinamik Programlama

Bu problem, her iş ve makine kombinasyonu için en düşük maliyetli yolu seçerek çözülür.  
Her işin her makinede yapılması durumunda oluşan toplam maliyet, dinamik programlama yaklaşımıyla bir tabloya işlenir.

Adımlar:
1. İlk iş için her makinedeki işlem süresi başlangıç değeri olarak alınır.
2. Her sonraki iş için, önceki işteki tüm makinelerden geçiş maliyeti + o makinedeki süre hesaplanır.
3. En düşük toplam maliyet değeri seçilir ve son iş tamamlandığında en küçük değer çıktı olarak alınır.

---


## 🧮 Zaman ve Bellek Karmaşıklığı

| Parametre     | Karmaşıklık        |
|---------------|--------------------|
| ⏱ Zaman      | O(n × m²)          |
| 🧠 Bellek    | O(n × m)           |

**n:** iş sayısı  
**m:** makine sayısı

---
## 📋 Örnek Girdi

```java
int[][] islemSuresi = {
    {9, 2, 7},
    {6, 4, 3},
    {5, 8, 1},
    {7, 6, 9}
};

int[][] gecisMaliyeti = {
    {0, 3, 2},
    {3, 0, 1},
    {2, 1, 0}
};
