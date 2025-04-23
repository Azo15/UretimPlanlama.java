# Üretim Planlama - Dinamik Programlama Yaklaşımı

Bu proje, üretim hattında sırayla yapılması gereken işleri farklı makinelerde minimum toplam süre ile gerçekleştirmek için **dinamik programlama** yaklaşımını kullanır.

---

## 📌 Problem Tanımı

Bir üretim hattında **n adet iş** (örneğin, bir ürünün parçalarının işlenmesi) sırayla tamamlanmalıdır. Bu işler **m farklı makinede** yapılabilir. Her işin her makinedeki tamamlanma süresi farklıdır. Ayrıca, işler makineler arasında aktarılırken **geçiş maliyeti** (örneğin, ayar süresi veya taşıma süresi) oluşur.

Amaç: Tüm işleri sırayla tamamlamak için **minimum toplam süreyi** bulmaktır.

---

## 🧠 Çözüm Yöntemi

Bu problem, **matris zinciri çarpımı** problemine benzer şekilde ele alınarak dinamik programlama ile çözülür.

- `islemSuresi[i][j]` → i. işin j. makinede yapılma süresi
- `gecisMaliyeti[k][j]` → k. makinadan j. makineye geçişin maliyeti

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
