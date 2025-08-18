# BBAPi 🎬  

A Java Spring Boot REST API for managing and exploring movies, user watchlists, and reviews. Built with **Spring Boot** and **Maven**, this project provides the foundation for BB Movies’ backend services.  

---

## 📖 User Story  

> As a user of BB Movies, I would like to search for a movie by title, actor, director, or genre.  
> I would also like to have an account where I can manage my watchlist and review movies.  

---

## 🗄️ Database Schema  

The system currently supports three main entities:  

### **Movies**  
| Field    | Type      | Description                     |  
|----------|-----------|---------------------------------|  
| id       | Long (PK) | Unique movie identifier          |  
| title    | String    | Movie title                      |  
| director | String    | Director of the movie            |  
| cast     | String    | Main cast (comma-separated)      |  
| genre    | String    | Movie genre                      |  

### **User**  
| Field      | Type      | Description                              |  
|------------|-----------|------------------------------------------|  
| id         | Long (PK) | Unique user identifier                   |  
| name       | String    | User’s name                              |  
| favourites | String    | User’s list of favourite movies (basic placeholder, will evolve into a watchlist relation) |  

### **Review**  
| Field     | Type      | Description                              |  
|-----------|-----------|------------------------------------------|  
| movie_id  | Long (FK) | ID of the reviewed movie                 |  
| user_id   | Long (FK) | ID of the reviewing user                 |  
| review    | String    | User’s written review of the movie       |  

---

## 🛠️ Tech Stack  

- **Java 17+**  
- **Spring Boot** (REST)  
- **Maven** (build & dependency management)  
- **H2** (Database)  

---

## 🚀 Getting Started  

### Prerequisites  
- Java 17  
- Maven 3.8+ 

### Running the Application  

```bash
# Clone repository
https://github.com/paulinaborys/BBAPi.git
cd bbapi

# Build project
mvn clean install

# Run project
mvn spring-boot:run

