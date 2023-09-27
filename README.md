# Who Wants to be Dockernized? (WWTBD)

docker-compose build
docker-compose --env-file .\.env  up -d




## Description

**Who Wants to be Dockernized? (WWTBD)** is a satirical application inspired by the famous quiz show "Who Wants to Be a Millionaire?" In this "dockernized" version, users can choose the theme of the questions they want to answer, and ChatGPT will be consulted to generate questions related to the chosen theme.

## Prerequisites

Make sure you have the following tools installed on your system:

- Docker
- Docker Compose

## Installation

1. Clone this repository to your local machine:

```bash
git clone https://github.com/danieldjgomes/WhoWantsToBeDockerized.git
```
Navigate to the project directory:

```bash
cd wwtbd
```
    
Create an `.env` file in the project's root directory and set the required environment variables. You can use the template below as a starting point:
    
```bash
OPENAI_API_KEY=YOUR_CHATGPT_API_KEY
```
Replace `YOUR_CHATGPT_API_KEY` with your ChatGPT API key.

Build the Docker images:

```bash
docker-compose build
```
Start the application in Docker containers:


```bash
docker-compose --env-file .\.env  up -d
```
The application should now be running in the background.

# Usage
Open a web browser and access http://localhost:3000 to access the application.

On the home page, you can choose a theme for the questions you want to answer. Enter the theme in the input field and click "Start."

ChatGPT will be consulted to generate a series of questions related to the chosen theme.

Answer the questions and see how many you can get right!

## Stopping the Application
To stop the application and clean up the Docker containers, run the following command:

```bash
docker-compose down
```

## Contribution
If you'd like to contribute to this project, please feel free to fork it, make your improvements, and submit a pull request. Contributions are welcome!

## License
This project is licensed under the APACHE License. See the LICENSE file for details.

Enjoy playing Who Wants to be Dockernized? and learning about Docker at the same time! If you have any questions or need assistance, don't hesitate to reach out.

Note: This is a fictional and purely satirical project intended for demonstration and learning purposes only.