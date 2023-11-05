### Comandos
1. Criar API
```
dotnet new webapi
```

2. Criar migration
```
dotnet-ef migrations add CriacaoTabelaContatos
```

3. Executar migration
```
dotnet-ef database update
```

### Instalações

* Entity Framework - apenas uma vez
```
dotnet tool install --global dotnet-ef
```

* Pacote Entity Framework - instalação em cada projeto
```
dotnet add package Microsoft.EntityFrameworkCore.Design
dotnet add package Microsoft.EntityFrameworkCore.SqlServer
```

### Contexto
* Centraliza todas as informações do DB
* Herda de DBContext, que tem todas as operrações a serem realizadas no DB
* Construtor especial

### Arquivos
* appsettings.Development é para testes
* appsettings.json é para produção

### Migration 
* Mapeamento para refletir no banco

#### Erro:
```
A connection was successfully established with the server, but then an error occurred during the login process. (provider: SSL Provider, error: 0 - A cadeia de certificação foi emitida por uma autoridade que não é de confiança.)
```

#### Solução:
```
    "ConnectionStrings": {
      "ConexaoPadrao": "Server=localhost\\sqlexpress; Initial Catalog=Agenda; Integrated Security=true; *TrustServerCertificate=True*"
    }
```