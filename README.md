# Arithmetic Web App With Exceptions

## Description
This is a **web-based Java application** that performs arithmetic operations (addition, subtraction, and multiplication) with robust exception handling. It ensures that only valid inputs are processed and throws custom exceptions for invalid inputs. The application is built using **Java Servlets** and **JSP**.

## Features
- **Arithmetic Operations**: Supports addition, subtraction, and multiplication.
- **Exception Handling**: Throws custom exceptions for invalid inputs (e.g., non-positive numbers, incorrect formats).
- **Validation**: Validates input numbers before performing arithmetic operations.
- **Web-Based**: Built using Java Servlets and JSP for a user-friendly web interface.

## How to Run
1. Clone the repository:
   ```bash
   git clone https
   ://github.com/birdiey/Arithmetic-Web-App-With-Exceptions.git


   ## Code Structure
- **Servlets**:
  - `AddingServlet.java`: Handles addition logic and forwards the result to `sum_outcome.jsp`.
  - `SubtractServlet.java`: Handles subtraction logic and forwards the result to `subtr.jsp`.
  - `MultiplyServlet.java`: Handles multiplication logic and forwards the result to `mult_outcome.jsp`.

- **Business Logic**:
  - `Addition.java`: Implements the addition operation and validates input.
  - `Subtractions.java`: Implements the subtraction operation and validates input.
  - `Multiplication.java`: Implements the multiplication operation and validates input.

- **Exception Handling**:
  - `NumberException.java`: Custom exception class for invalid inputs.

- **JSP Files**:
  - `sum_outcome.jsp`: Displays the result of addition.
  - `subtr.jsp`: Displays the result of subtraction.hjkk
  - `mult_outcome.jsp`: Displays the result of multiplication.
  - `number_exception.jsp`: Displays custom exception messages.
  - `number_format.jsp`: Displays format-related exception messages.

- **HTML Files**:
  - `add.html`: Form for addition input.
  - `subtract.html`: Form for subtraction input.
  - `multiply.html`: Form for multiplication input.
  - `menu.html`: Navigation menu for the application.
  - `index.html`: Home page of the application.

- **Configuration Files**:
  - `web.xml`: Servlet and JSP configuration.
  - `glassfish-web.xml`: Deployment descriptor for GlassFish (optional).
