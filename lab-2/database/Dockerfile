FROM postgres:12.13-alpine

WORKDIR /var/lib/postgresql/data

ADD db/*.sql /docker-entrypoint-initdb.d/

EXPOSE 5432