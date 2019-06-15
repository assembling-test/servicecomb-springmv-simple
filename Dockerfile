FROM 100.125.0.198:20202/hwstaff_l00387732/openjdk:8

WORKDIR /home/apps/

COPY target/*.jar app.jar

RUN sh -c 'touch app.jar'

ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar -Xmx256m app.jar" ]
