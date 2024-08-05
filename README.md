# MovieMania

## Project Overview
MovieMania is a full-stack application where users can review movies, see a list of movies, and interact with various features related to movie information. This repository contains both the frontend and backend code.

## Table of Contents
- [Project Overview](#project-overview)
- [Prerequisites](#prerequisites)
- [Frontend](#frontend)
  - [Installation](#installation-frontend)
  - [Running the Development Server](#running-the-development-server)
  - [Building the Application](#building-the-application)
  - [Folder Structure](#folder-structure-frontend)
- [Backend](#backend)
  - [Installation](#installation-backend)
  - [Running the Development Server](#running-the-development-server)
  - [Folder Structure](#folder-structure-backend)
  - [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)


## Prerequisites
- Node.js (v14 or later)
- npm or yarn
- Java 11 or later
- Maven

## Frontend

### Installation (Frontend)

1. Clone the repository:
    ```sh
    git clone https://github.com/shiva1239/MovieMania.git
    cd MovieMania/frontend
    ```

2. Install dependencies:
    ```sh
    npm install
    # or
    yarn install
    ```

### Running the Development Server

To start the development server, run:
```sh
npm start
# or
yarn start

The application will be available at [http://localhost:3000](http://localhost:3000).
```
 ### Building the Application
To build the application for production, run:

```sh
npm run build
# or
yarn build
```

### Folder Structure (Frontend)
- `public`: Static files
- `src`: Source code
  - `components`: React components
  - `pages`: Page components
  - `services`: API services
  - `styles`: CSS and styles
  - `utils`: Utility functions

## Backend


### Installation (Backend)

1. Clone the repository:
    ```sh
    git clone https://github.com/shiva1239/MovieMania.git
    cd MovieMania/frontend
    ```

2. Install dependencies:
    ```sh
    mvn clean install
    ```

### Running the Development Server

To start the development server, run:
```sh
mvn spring-boot:run

The application will be available at [http://localhost:8080](http://localhost:8080).
```
### Folder Structure (Backend)
- `src/main/java`: Main source code
  - `dev/shiva/movieist`: Main package
    - `controller`: REST controllers
    - `service`: Service layer
    - `repository`: Data access layer
    - `model`: Data models
- `src/main/resources`: Resources
  - `application.properties`: Configuration file

### API Documentation
API documentation is available at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) when the application is running.

## Contributing
1. Fork the repository.
2. Create a new branch:
    ```sh
    git checkout -b feature/your-feature
    ```
3. Commit your changes:
    ```sh
    git commit -m 'Add some feature'
    ```
4. Push to the branch:
    ```sh
    git push origin feature/your-feature
    ```
5. Create a Pull Request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

