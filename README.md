# Alex Pharmacy

## Веб-додаток для обліку та контролю над базою даних магазину ноутбуків

Додаток розроблений для адміністрування масштабуємої інформаційної системи аптек.<br/>
Користуючись ним, співробітники в декілька кліків зможуть додавати, переглядати, змінювати та видаляти довільну інформацію,
тобто використовувати весь CRUD пакет задач. Усі дані перед записом до бази даних проходять двохетапну валідацію: з користувальницької та серверної сторін.<br/>
Додатково можна реалізовувати бажані власні запити в Data JPA репозиторіях уніфікованою мовою JPQL чи мовою підключеної СКБД для максимальної гнучкості та зручного формування звітів.<br />
Додаток убезпечено від витоку інформації про програмну структуру в результаті виключних ситуацій. При помилці, на сервері буде сформовано форматовану відповідь з кодом та текстом помилки й виведено у відведене вікно.

---

## Технічні деталі реалізації:

- Back-end: **Java 14 + Spring Boot 2.3.0.RC1**<br/>(_MVC, Data JPA, Rest Repository, Bean Validation_)
- Front-end: **Vue.js 4.3.1**<br/>(_Axios, Vue Router, Vuex, Babel, VueJsLogger, VueMoment, Bootstrap-Vue, VeeValidate, vWow_)
- СКБД: **Microsoft SQL Server 2019**
- Додаткові бібліотеки: _Jetbrains Annotations, Apache Commons Lang3, Lombok, Spring Boot Devtools_

---

## Демонстрація:

_**Disclaimer:** швидкість анімації та якість фонового градієнтного зображення може спотворюватися через обмеження формату .gif. Тому помітні різкі переходи кольорів, які відсутні безпосередньо на сайті додатку._

![LandingPhoto](/demo/LandingPhoto.png)

![Landing transitions](/demo/transitionsDemo.gif)

![Basket CRUD](/demo/basketValidation.gif)

![Requests](/demo/requests.gif)

---
