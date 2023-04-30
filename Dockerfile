FROM eclipse-temurin:17-focal

ENV SPRING_PORT=9999

WORKDIR /srv

COPY target/calendar-parser-parser.jar calendar-parser-parser.jar

EXPOSE ${SPRING_PORT}
