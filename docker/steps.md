1. Instalamos postgresql, pgadmin y docker
2. Vamos a directorio .../docker y ejecutamos

docker build -t fakepostgres .
docker run -d --name fakeflix -p 5555:5432 fakepostgres

3. Conectamos pgadmin a la base de datos

- Obtenemos la IP de la misma
docker inspect fakeflix | grep -w "IPAddress" | head -1

- pgadmin -> new connection -> ip, fakeuser, fakedb

pgadmin -> new connection -> IPAddress, user=fake, pass=fakepass, database=fakedb


