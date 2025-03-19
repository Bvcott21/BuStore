# BuStore - E-Commerce Microservices Application

## Overview
BuStore is a microservices-based e-commerce application similar to Amazon. It includes various services for authentication, order processing, product management, and more. The system is built using **Spring Boot**, **RabbitMQ**, **Kafka**, and **Docker Compose** for containerized deployment.

## Architecture
The application follows a **microservices architecture**, with the following core services:
- **API Gateway**: Routes requests to appropriate services.
- **Auth Service**: Handles user authentication and authorization.
- **Order Service**: Manages orders and transactions.
- **Product Service**: Handles product catalog and inventory.
- **RabbitMQ & Kafka**: Used for event-driven communication.
- **MySQL Database**: Stores user and transactional data.

## Getting Started
### Prerequisites
Ensure you have the following installed:
- Docker & Docker Compose
- Java 17+
- Node.js (for frontend development)

### Running the Application
1. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/BuStore.git
   cd BuStore
   ```
2. Create a `.env` file in the root directory:
   ```sh
   cp .env.example .env  # Modify with your credentials
   ```
3. Start all services:
   ```sh
   docker-compose --env-file .env up -d
   ```
4. Access the services:
   - API Gateway: `http://localhost:8080`
   - Frontend: `http://localhost:3000`
   - RabbitMQ UI: `http://localhost:15672`
   - Kafka (via CLI or monitoring tools)

## Project Structure
```
BuStore/
│── api-gateway/
│── auth-service/
│── order-service/
│── product-service/
│── frontend/
│── docker-compose.yml
│── .env (excluded from Git)
│── README.md
│── .gitignore
```

## Contributing
1. Fork the repo and create your branch:
   ```sh
   git checkout -b feature-branch
   ```
2. Commit changes and push:
   ```sh
   git commit -m "Your message"
   git push origin feature-branch
   ```
3. Submit a Pull Request.

## License
This project is licensed under the MIT License.
