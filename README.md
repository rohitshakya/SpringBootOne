# First Spring Project - Hotel and User Management APIs

This project is developed using Spring Boot and is designed to manage hotels, users, and ratings. It provides REST APIs to create, read, update, and delete (CRUD) hotels, users, and their ratings.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them:

- JDK 1.8 or later
- Maven 3.2+
- Spring Boot 2.5.0 or later
- An IDE (IntelliJ, VS Code etc.)
- MySQL or any other relational database (for storing data)

### Installing

A step by step series of examples that tell you how to get a development environment running:

1. Clone the repository to your local machine.
2. Open the project in your IDE.
3. Configure `src/main/resources/application.properties` with your database connection details.
4. Run the project as a Spring Boot application.

The server will start on the default port 8080.

## API Endpoints

### Hotels

- **GET** `/api/v1/hotels` - Retrieve all hotels.
- **POST** `/api/v1/addHotels` - Add a new hotel.

### Ratings

- **GET** `/api/v1/ratings` - Retrieve all ratings.
- **POST** `/api/v1/addRatings` - Add a new rating.

### Users

- **GET** `/api/v1/users` - Retrieve all users.
- **POST** `/api/v1/users` - Create a new user.
- **PUT** `/api/v1/{userId}` - Update an existing user.
- **DELETE** `/api/v1/{userId}` - Delete a user.

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/yourproject/tags).

## Authors

* **Rohit Shakya** - *Initial work* - [github.com/rohitshakya](https://github.com/rohitshakya)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

---
