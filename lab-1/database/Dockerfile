FROM postgres:12.13-alpine

WORKDIR /var/lib/postgresql/data

ENV POSTGRES_USER=admin
ENV POSTGRES_PASSWORD=admin123

ADD db/*.sql /docker-entrypoint-initdb.d/

EXPOSE 5432