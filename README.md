# PayPal Clone - Microservices Architecture

A comprehensive PayPal clone built using Spring Boot microservices architecture with API Gateway, providing secure payment processing, user management, and transaction handling.
## 🚀 Services

### 1. **API Gateway** (Port: 8080)
- **Purpose**: Single entry point for all client requests
- **Features**: 
  - JWT Authentication Filter
  - Request routing to appropriate services
  - Load balancing and security
- **Endpoints**: Routes requests with `/auth/**`, `/transactions/**`, etc.

### 2. **User Service** (Port: 8081)
- **Purpose**: User authentication and profile management
- **Features**:
  - User registration and login
  - JWT token generation
  - Password encryption
  - H2 in-memory database for development
- **Endpoints**:
  - `POST /auth/signup` - User registration
  - `POST /auth/login` - User authentication
  - `GET /auth/profile` - Get user profile

### 3. **Transaction Service**
- **Purpose**: Handle all payment transactions
- **Features**:
  - Create and manage transactions
  - Transaction history
  - Integration with external payment providers
- **Endpoints**:
  - `POST /transactions` - Create transaction
  - `GET /transactions/{id}` - Get transaction by ID
  - `GET /transactions/user/{userId}` - Get user transactions

### 4. **Wallet Service**
- **Purpose**: Manage user digital wallets
- **Features**:
  - Wallet creation and balance management
  - Fund transfers between wallets
  - Transaction processing

### 5. **Notification Service**
- **Purpose**: Handle all communications
- **Features**:
  - Email notifications
  - SMS alerts
  - Real-time notifications
  - Transaction confirmations

### 6. **Reward Service**
- **Purpose**: Manage loyalty programs and rewards
- **Features**:
  - Points calculation
  - Cashback processing
  - Reward redemption

## 🛠️ Technologies Used

- **Framework**: Spring Boot 3.x
- **Build Tool**: Maven
- **Security**: Spring Security + JWT
- **Database**: H2 (Development), PostgreSQL/MySQL (Production)
- **Communication**: OpenFeign for service-to-service calls
- **Gateway**: Spring Cloud Gateway
- **Documentation**: SpringDoc OpenAPI 3
- **Containerization**: Docker & Docker Compose

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+
- Docker (optional, for containerized deployment)
- IDE (IntelliJ IDEA recommended)

## 🚀 Quick Start

### 1. Clone the Repository
```bash
git clone <repository-url>
cd paypal-clone
