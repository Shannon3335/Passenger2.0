FROM openjdk:17

COPY target/ /tmp
WORKDIR /tmp
# The ENTRYPOINT will set executable that will run when container is initiated
EXPOSE 8080
EXPOSE 5432
CMD java -jar Passenger_sequel-0.0.1-SNAPSHOT.jar