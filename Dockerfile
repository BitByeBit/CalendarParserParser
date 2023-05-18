FROM eclipse-temurin:17-focal

LABEL org.opencontainers.image.source=https://github.com/bitbyebit/calendarparserparser

ENV SPRING_PORT=9999

WORKDIR /srv

COPY target/calendar-parser-parser.jar calendar-parser-parser.jar

EXPOSE ${SPRING_PORT}
