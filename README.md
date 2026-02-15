# Hotel Management App

A simple tool to manage hotel operations, guest bookings, and room availability using Python and SQLite.

## What it does

- Manages guest registration and database records
- Handles room assignments and availability tracking
- Processes check-in and check-out workflows
- Calculates basic billing and stay totals
- Provides a dashboard for occupancy overview

## Getting started

### Requirements

- Python 3.9+
- SQLite3 (included with Python)
- Tkinter (included with Python)

### Setup

1. Clone the repository:
   git clone https://github.com/cati3000/Hotel-Management-App.git

2. Navigate to the directory:
   cd Hotel-Management-App

3. Create a virtual environment:
   python -m venv .venv
   source .venv/bin/activate  # On Windows: .venv\Scripts\activate

4. Install dependencies:
   pip install -r requirements.txt

### Usage

Run the main script to start the application:
python main.py

## How it works

1. Initializes a local SQLite database for persistent storage
2. Launches a Tkinter GUI for user interaction
3. Validates guest information and room numbers
4. Updates room status in real-time upon check-in
5. Generates stay summaries for checkout

## Project structure

- main.py - Main entry point and GUI
- database.py - SQL queries and DB connection
- assets/ - UI icons and images
