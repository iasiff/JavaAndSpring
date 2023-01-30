FROM bellsoft/liberica-openjdk-alpine-musl:17 AS builder
WORKDIR /app
COPY target/*.jar .
RUN mkdir -p /app/dependency
WORKDIR /app/dependency
RUN jar -xf ../*.jar
RUN rm -f ../*.jar

FROM bellsoft/liberica-openjdk-alpine-musl:17
EXPOSE 8080
VOLUME /tmp
ARG DEPENDENCY=/app/dependency
COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
ENTRYPOINT ["java","-Xmn32m","-Xmx32m","-XX:+UseZGC","-cp","app:app/lib/*","lr.sprngbut.SprngbutApplication"]

# -XX:+UseZGC -XX:+UseG1GC

