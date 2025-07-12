# Electricity Bill Calculator

## Project Description
The Electricity Bill Calculator is a Java desktop application designed to manage customer details and electricity usage data. It provides a graphical user interface (GUI) for entering and updating customer information, recording electricity usage, and generating monthly summaries.

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- A local database server (e.g., MySQL) running on localhost
- SQL client or tool to import the provided database schema and data

## Setup Instructions

1. **Database Setup**
   - Import the provided database SQL file (e.g., `electricity_usage.sql`) into your local database server.
   - Ensure the database is accessible on `localhost` with the appropriate user credentials.

2. **Application Setup**
   - Open the project in your preferred Java IDE (e.g., NetBeans, Eclipse).
   - Build the project to compile the source code.

3. **Running the Application**
   - Run the main application frame (e.g., `MainFrame.java`) from your IDE.
   - Use the GUI to manage customers, enter electricity usage, and view monthly summaries.

## Project Structure
- `src/Classes/` - Contains Java classes for data models and database connections.
- `src/Frames/` - Contains Java Swing GUI forms and frames.
- `config/` - Contains database configuration and SQL files (if any).
- `build/` - Contains compiled classes and build artifacts.
- `config/` - Contains the database configuration file.

## Notes
- Ensure your local database server is running before launching the application.
- Update database connection settings in the source code if necessary.

## Contact
For any issues or questions, please contact the project maintainer.
