Necessário:
* http-server
    pra acessar usa http-server ./ tudo na pasta
* desabilitar cache em network na ferramenta do desenvolvedor, pra garantir atualizações em tempo real

Modo de desenvolvimento:
Mobile first : se fizer primeiro pra pc, tem que reescrever muito código

Sites úteis:
https://pokeapi.co/docs/v2#pokemon
https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/35.svg

Conteúdo:

* API - serve dados

* Estrutura de uma Requisição http:
1º URL: ip e porta do servidor (endereço do recurso que a gente quer)

url: https://pokeapi.co/docs/v2/pokemon 

    ${IP}: https://pokeapi.co - dns converte
        https:127.0.1:3000

    ${path}: o que quer do servidor, caminho de identificação do recurso
        /docs/v2/pokemon

2º Request method- tipo de solicitação: 
    GET | POST | PUT | DELETE | PATCH ..
    buscar | inserir novo | atualizar | deletar |

    Argumentos pras buscas:
        https://pokeapi.co/docs/v2/pokemon/${1}

    Query String: chave-valor
        https://pokeapi.co/docs/v2/pokemon?type=grass&name=1

        https://pokeapi.co/docs/v2/pokemon?offset=0&limit=2
        offset=0 => página
        &limit=2 => elementos por página

3º Request Headers: "configurações" da requisição
    accept no Request headers: o que o solicitante aceita (text/htmt, image, json, linguagem: pt-BR, pt;q=0.9, en-US;q=0.8, autorização)
    accept no Response headers: application json

4º Request body: dependendo do tipo da requisição 
    get (na resposta tem body) e delete não faz tanto
    post, put faz sentido {dados do novo}

5º Status code: o que aconteceu com a requisição
    200-299 sucesso
    400 erro por parte do cliente

6º Response headers

7º Response body: não necessariamente, no get precisa mas em casos de post somente o status já responde

