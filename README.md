# Mortgage-Calculator

simple java code using Docker file and springboot to host an Application calculation mortgages where you will input your name choose the amount you want a mortgage on and choose the payment plan.

I do not really need a bash/bat file for this because I will be using docker instead but I may just for coding purposes(easier to test app on the command line)

```bash
sudo apt install javac
```
```bash
chmod +x /file.sh
```
```bash
./file.sh
```
```bash
docker build -t image:tag
```
```bash
docker run -p port:port image:tag
```
__sample file structure__:
```
mortgage-calculator/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── mortgagecalculator/
│   │   │               ├── MortgageCalculatorApplication.java
│   │   │               ├── controller/
│   │   │               │   └── CalculatorController.java
│   │   │               ├── service/
│   │   │               │   └── CalculatorService.java
│   │   │               └── model/
│   │   │                   └── MortgageRequest.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           └── index.html
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── mortgagecalculator/
│                       └── MortgageCalculatorApplicationTests.java
│
├── .gitignore
├── Dockerfile
├── pom.xml
└── README.md
```
