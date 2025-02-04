# Zemberek-NLP Yazım Denetleyici Uygulaması

Bu proje, **Zemberek-NLP** kütüphanesini kullanarak **Türkçe yazım denetimi** yapan bir uygulamadır. Kullanıcıdan alınan cümledeki kelimelerin doğru yazılıp yazılmadığını kontrol eder.

## 📌 Özellikler
- **Zemberek-NLP** kullanarak kelimelerin yazım doğruluğunu kontrol eder.
- Java tabanlıdır ve **IntelliJ IDEA** ortamında geliştirilmiştir.
- Kullanıcıdan alınan cümledeki her kelimenin doğru veya yanlış yazıldığını bildirir.

## 🔍 Kullanım
Örnek bir kullanım aşağıdaki gibidir:

**Girdi:**
```
Bugun hava cok guzel.
```

**Çıktı:**
```
Kelime: Bugun → Yanlış (Doğrusu: Bugün)
Kelime: hava → Doğru
Kelime: cok → Yanlış (Doğrusu: çok)
Kelime: guzel → Yanlış (Doğrusu: güzel)
```

## 🛠 Kod Açıklaması
- **Zemberek Başlatma:** `TurkishMorphology` sınıfı ile başlatılır.
- **Yazım Denetleyici:** `SpellChecker` sınıfı ile kelimelerin doğruluğu kontrol edilir.
- **Cümle Analizi:** `split()` metodu kullanılarak cümledeki kelimeler diziye aktarılır ve analiz edilir.
- **Sonuç Gösterimi:** Doğru ve yanlış yazılan kelimeler belirlenerek ekrana yazdırılır.

## 📚 Kaynaklar
- [Zemberek-NLP GitHub](https://github.com/ahmetaa/zemberek-nlp)
- [Zemberek-NLP Resmi Belgeler](https://zemberek-nlp.readthedocs.io)

## 📜 Lisans
Bu proje açık kaynak olarak paylaşılmaktadır. Katkıda bulunmak isterseniz lütfen bir **pull request** oluşturun!

