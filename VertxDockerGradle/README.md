# Vert.x with Gradle inside Docker

## Running
```bash
docker build -t vertxgradle . && docker run -p 8080:8080 -t vertxgradle
```

## Check that everything is cool
```
open http://localhost:8080
```