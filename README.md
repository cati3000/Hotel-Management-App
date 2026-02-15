# Hotel Management App

A web application that helps users find and book hotels based on location and availability using a local JSON database.

## What it does

- Reads hotel data from a JSON database
- Locates hotels within a specific radius
- Displays real-time room availability
- Handles booking requests
- Calculates total costs based on stay duration

## Getting started

### Requirements

- Java Development Kit (JDK) 17+
- Maven 3.6+ (or use the included wrapper)

### Setup

1. Clone the repository:
   git clone https://github.com/cati3000/Hotel-Management-App.git

2. Navigate to the directory:
   cd Hotel-Management-App

3. Build the project:
   ./mvnw clean install  # On Windows: mvnw.cmd clean install

### Usage

Run the application:
./mvnw spring-boot:run  # On Windows: mvnw.cmd spring-boot:run

Then open http://localhost:8080

## How it works

1. App initializes and loads hotel data from the JSON source
2. User queries for hotels in a specific location
3. Backend filters results based on radius logic
4. User selects a room and confirms booking
5. System updates availability for the selected dates

## Project structure

- src/main/java - Application source code and logic
- src/main/resources - Configuration and JSON database
- target/ - Compiled build artifacts
- pom.xml - Project dependencies and build configuration
