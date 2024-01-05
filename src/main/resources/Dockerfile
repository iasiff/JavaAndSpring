FROM bellsoft/liberica-runtime-container:jdk-17-slim-glibc AS builder
WORKDIR /app
COPY target/*.jar .
RUN mkdir -p /app/dependency
WORKDIR /app/dependency
RUN jar -xf ../*.jar
RUN rm -f ../*.jar

FROM bellsoft/liberica-runtime-container:jdk-17-slim-glibc
EXPOSE 8080
VOLUME /tmp
ARG DEPENDENCY=/app/dependency
COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
ENTRYPOINT ["java","-Xmx512m","-XX:+UseZGC","-cp","app:app/lib/*","lr.sprngbut.SprngbutApplication"]

# -XX:+UseZGC -XX:+UseG1GC
# bellsoft/liberica-runtime-container:jdk-17-slim-musl

# JAVA DEBUG
# Root == child
# info == info error warn
# error == error only
# warn == error warn
# debug == info error debug warn
