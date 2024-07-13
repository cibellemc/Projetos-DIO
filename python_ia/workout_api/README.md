## Para criar virtualenv no Windows
https://pt.stackoverflow.com/questions/543028/como-usar-o-virtualenv-do-python-no-windows

## Para rodar servidor
````
python -m uvicorn main:app --host 0.0.0.0 --port 8000 --reload
````

## Para ver a documentação
/docs

## Para ativar o ambiente virtual
```
workoutapi\Scripts\activate
```

## Comandos Docker
* Para verificar versões
```
docker --version
docker-compose --version
```

* Para criar o container
```
docker-compose up -d
```

* Ver containers
```
docker ps
```

## Vendo o banco no pgAdmin
1. Crie um novo servidor
2. Na General Tab preencha:
    * Name: Dê um nome ao seu servidor (por exemplo, "Local PostgreSQL").
3. Na Connection Tab:
    Host name/address: localhost (ou o endereço IP do servidor PostgreSQL).
    * Port: 5432 (ou a porta configurada para o PostgreSQL).
    * Maintenance database: postgres (ou o nome do banco de dados que você quer conectar).
    * Username: postgres (ou o nome de usuário configurado).
    * Password: Insira a senha correspondente ao usuário.
4. Salve

## Para iniciar o alembic 
```
alembic init alembic
```