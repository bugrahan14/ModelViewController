# Thymeleaf Demo - Spring Boot MVC Project
👤 Developer BUĞRAHAN ERTAŞ
This project is a demo project that demonstrates web application development using Spring Boot and Thymeleaf. The project exemplifies fundamental web development concepts such as form processing, data binding, and dynamic content creation with the Spring MVC architecture.

## 📋 Table of Contents

- [About the Project](#about-the-project)
- [Technologies](#technologies)
- [Features](#features)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Development](#development)
- [Contributing](#contributing)

## 🎯 About the Project

This project provides practical examples of creating and processing web forms using Spring Boot and Thymeleaf. The project covers topics such as:

- Simple "Hello World" examples
- Form data processing
- Using request parameters
- Model-View-Controller (MVC) architecture
- Dynamic HTML generation with Thymeleaf template engine
- Student registration form example

## 🛠 Technologies

- **Java 21** - Programming language
- **Spring Boot 3.5.4** - Framework
- **Spring MVC** - Web framework
- **Thymeleaf** - Template engine
- **Maven** - Dependency management and build tool
- **Spring Boot DevTools** - Development tools

## ✨ Features

### 1. Hello World Examples
- Simple page display
- Form data processing
- Reading request parameters
- Adding data to the model

### 2. Student Registration Form
- Dynamic country selection (dropdown)
- Favorite programming language selection (radio button)
- Favorite operating systems selection (checkbox)
- Form data processing and confirmation page

### 3. Thymeleaf Features
- Thymeleaf expression syntax (`th:text`, `th:field`, `th:each`)
- Form binding (`th:object`, `th:field`)
- Dynamic content creation
- Displaying model data

## 📁 Project Structure

```
thymeleafdemo/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── bugrahan/
│   │   │           └── springboot/
│   │   │               └── thymeleafdemo/
│   │   │                   ├── ThymeleafdemoApplication.java
│   │   │                   ├── controller/
│   │   │                   │   ├── DemoController.java
│   │   │                   │   ├── HelloWorldController.java
│   │   │                   │   └── StudentController.java
│   │   │                   └── model/
│   │   │                       └── Student.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       │   └── css/
│   │       │       └── demo.css
│   │       └── templates/
│   │           ├── helloworld.html
│   │           ├── helloworld-form.html
│   │           ├── student-form.html
│   │           └── student-confirmation.html
│   └── test/
│       └── java/
│           └── com/
│               └── bugrahan/
│                   └── springboot/
│                       └── thymeleafdemo/
│                           └── ThymeleafdemoApplicationTests.java
│
├── pom.xml
└── README.md
```

## 🚀 Installation

### Requirements

- Java 21 or higher
- Maven 3.6+ or higher
- IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Steps

1. **Clone or download the project**
   ```bash
   git clone <repository-url>
   cd thymeleafdemo
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```
   
   Or run the `ThymeleafdemoApplication.java` file in your IDE.

4. **Open in browser**
   ```
   http://localhost:8080
   ```

## 📖 Usage

### Hello World Examples

#### Simple Hello World Page
```
http://localhost:8080/hello
```
Displays a simple "Hello World" message with date and time information.

#### Name Input Form
```
http://localhost:8080/showForm
```
A form page opens. When you enter a name and submit, a message converted to uppercase is displayed.

**Different Versions:**
- `/processForm` - Simple form processing
- `/processFormVersionTwo` - Reading parameters using HttpServletRequest
- `/processFormVersionThree` - Reading parameters using @RequestParam annotation

### Student Registration Form

#### Form Page
```
http://localhost:8080/showStudentForm
```

On this page, you can enter the following information:
- **First Name** - Student first name
- **Last Name** - Student last name
- **Country** - Country selection (dropdown)
- **Favorite Programming Language** - Favorite programming language (radio button)
- **Favorite Operating Systems** - Favorite operating systems (checkbox - multiple selection)

#### Form Submission
When you fill out the form and click the "Submit" button, the `/processStudentForm` endpoint is called and the entered information is displayed on the confirmation page.

## 🔌 API Endpoints

| HTTP Method | Endpoint | Description |
|------------|----------|-------------|
| GET | `/hello` | Simple hello world page (with date) |
| GET | `/showForm` | Name input form |
| GET | `/processForm` | Simple form processing |
| GET | `/processFormVersionTwo` | Form processing with HttpServletRequest |
| GET | `/processFormVersionThree` | Form processing with @RequestParam |
| GET | `/showStudentForm` | Student registration form |
| POST | `/processStudentForm` | Process student form data |

## ⚙️ Configuration

### application.properties

The project contains the following configurations in the `src/main/resources/application.properties` file:

```properties
countries=Turkey,Brazil,France,Germany,India,Mexico,Spain,United States
languages=Java,Python,JavaScript,Go,C#,Ruby,PHP
operatingSystems=Linux,Mac OS,Windows,Ubuntu,Debian
```

These values are used to dynamically create the dropdown, radio button, and checkbox options in the student registration form.

### Changing Port

The default port is 8080. To change the port, add the following to the `application.properties` file:

```properties
server.port=8081
```

## 💻 Development

### Controllers

#### DemoController
Provides a simple hello world page and date display.

#### HelloWorldController
Contains form processing examples:
- Simple form display
- Reading parameters with HttpServletRequest
- Reading parameters with @RequestParam annotation

#### StudentController
Manages student registration form operations:
- Form display (GET)
- Form data processing (POST)
- Adding data to the model
- Reading list data from application.properties

### Model Classes

#### Student
Model class that holds student information:
- `firstName` - First name
- `lastName` - Last name
- `country` - Country
- `favoriteLanguage` - Favorite programming language
- `favoriteOperatingSystems` - List of favorite operating systems

### Template Files

All Thymeleaf templates are located in the `src/main/resources/templates/` folder:

- `helloworld.html` - Hello world message display
- `helloworld-form.html` - Name input form
- `student-form.html` - Student registration form
- `student-confirmation.html` - Student information confirmation page

### Thymeleaf Features Usage

#### Data Display
```html
<span th:text="${message}"></span>
```

#### Form Binding
```html
<form th:action="@{/processStudentForm}" th:object="${student}" method="POST">
  <input type="text" th:field="*{firstName}" />
</form>
```

#### Loop
```html
<option th:each="tempCountry : ${countries}"
        th:value="${tempCountry}"
        th:text="${tempCountry}">
</option>
```

#### URL Generation
```html
<form th:action="@{/processFormVersionThree}" method="get">
```

## 🧪 Testing

The project can be tested with the Spring Boot Test framework:

```bash
mvn test
```

## 📝 Notes

- Spring Boot DevTools plugin enables automatic restart on code changes.
- Thymeleaf templates are automatically loaded from the `src/main/resources/templates/` folder.
- Static files (CSS, JS, images) should be placed in the `src/main/resources/static/` folder.

## 🤝 Contributing

1. Fork this repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request





****

## 🙏 Acknowledgments

- Spring Boot team
- Thymeleaf community
- All open source contributors

---

**Note:** This project is a demo project prepared for those who want to learn Spring Boot and Thymeleaf. Security and performance improvements should be made before using it in a production environment.
