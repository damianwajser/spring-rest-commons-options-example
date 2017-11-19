# Deprecated

FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/ms-parameters-0.0.1-SNAPSHOT.jar app.jar
ADD conf/entrypoint.sh /entrypoint.sh
RUN chmod +x entrypoint.sh
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT ["/entrypoint.sh"]
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
