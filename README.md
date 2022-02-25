# 課程作業
---
* [課程作業1](#課程作業1)
* [課程作業2](#課程作業2)
* [課程作業3](#課程作業3)
* [課程作業4](#課程作業4)
* [課程作業5](#課程作業5)
* [課程作業6](#課程作業6)
---

# SpringCoreCoursework

數據庫連結: [SpringCoreCoursework_Repository](https://github.com/bravot62858/SpringCoreCoursework)

## 題目
### 課程作業1
- 請使用 Java 8 stream 進行資料分析並取得 mary 的老師有誰? (印出 name)

  程式碼: [Test1](https://github.com/bravot62858/SpringCoreCoursework/blob/main/src/test/java/com/study/SpringCoreCoursework/coursework1/Test1.java)
  
### 課程作業2
- 完成 JsonDB.java 如果 person 已存在則 return false (name、age、birth 皆與目前資料庫某一 person 資料相同)

  程式碼: [JsonDB](https://github.com/bravot62858/SpringCoreCoursework/blob/main/src/main/java/com/study/SpringCoreCoursework/coursework2/JsonDB.java)
- 完成 PersonSystem.java 選項3 ~ 7資料分析與處理

  程式碼: [PersonSystem](https://github.com/bravot62858/SpringCoreCoursework/blob/main/src/main/java/com/study/SpringCoreCoursework/coursework2/PersonSystem.java)
 
### 課程作業3
- 將每次調用 查詢 queryAll() 方法的調用時間 Log 紀錄下來(透過切面導向程式設計 AOP)

  程式碼: [TemplateTest1](https://github.com/bravot62858/SpringCoreCoursework/blob/main/src/test/java/com/study/SpringCoreCoursework/coursework3/TemplateTest1.java)
- 建立相關TABLE，並針對以下問題做分析:
  - 每一張發票有那些商品?
  - 每一張發票有幾件商品?
  - 每一張發票價值多少?
  - 每一樣商品各賣了多少?
  - 哪一件商品賣得錢最多?
  - 哪一張發票價值最高?

  程式碼: [HomeTest1](https://github.com/bravot62858/SpringCoreCoursework/blob/main/src/test/java/com/study/SpringCoreCoursework/coursework3/HomeTest1.java)
 
### 課程作業4
- 建立交易紀錄 order_log 資料表，試問: 資料表應如何創建 (注意: 若 book 的 price 欄位有變動，order_log 則不影響)，請完成整段資料庫 log 寫入機制

  程式碼: [TestBook](https://github.com/bravot62858/SpringCoreCoursework/blob/main/src/test/java/com/study/SpringCoreCoursework/coursework4/TestBook.java)

---

# SpringMVCCoursework

數據庫連結: [SpringMVCCoursework_Repository](https://github.com/bravot62858/SpringMVCCoursework)
[目錄](src/main/webapp/index.jsp)
  
### 課程作業5
- 統計每一顆號碼出現的次數(按照出現次數由大到小排序)  
  
  程式碼: [show_lotto](src/main/webapp/WEB-INF/views/coursework5/show_lotto.jsp)
  
### 課程作業6
- 時段改成spform:checkboxes
- 繳費改成spform:radiobuttons
  
  程式碼: [exam_form.jspf](src/main/webapp/WEB-INF/views/coursework6/exam_form.jspf)
  
