# A multistage Dockerfile to build a Java Project built with ANT

# Stage one: Build stage
FROM openjdk:27-ea-slim AS builder

# Install Apache ANT
RUN apt update && \
    apt install -y ant && \
    rm -rf /var/lib/apt/lists/*

# Set working directory
WORKDIR /app

# Copy build files
COPY build.xml .
COPY src ./src

# Create lib directory (if it doesn't exist in your repo)
RUN mkdir -p lib

# Run Ant build
RUN ant clean jar

# Stage two: Runtime stage
FROM openjdk:27-ea-slim

# Set working directory
WORKDIR /app

# Copy the build jar from the build stage
COPY --from=builder /app/build/jar/*.jar app.jar

# Add a new user to improve security
RUN useradd -m appuser

# Switch to a new user
USER appuser

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]