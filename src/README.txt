Anotacoes:

Nessa aula foi feito uma api de que classifica linguagens de programacao.

Foi utilizado:

- Spring Web: para hostear a API 
- Spring data e mongo db atlas: Para cadastrar as linguagens em um banco de dados na nuvem
- Maven para gerenciar as dependencias (Essa ferramenta ja veio no pacote do spring)

Observacoes:

- O arquivo pom.xml contem todas as configuracoes de dependencias necessarias pela aplicacao. Quaisquer dependencia instalada sera apresentada neste arquivo.
- Para realizar a conexao com o mongoDB, foi insrido a string de conexao disponibilizada pelo mongo, no arquivo: resources/application.properties
   spring.data.mongodb.uri= "string de conexao"


Explicando as classes:

Linguagem: classe utilizada para contruir o principal objeto da aplicacao, atraves dos componentes basicos de uma classe: atributos (variáveis que armazenam informações sobre o objeto) e métodos (funções que definem o comportamento do objeto).
Foi utilizado as notacoes @Document e @Id. Sao duas notacoes da biblioteca spring data MongoDb.
@Document: Utilizado para informar que a classe e um documento que será mapeado para uma coleção do mongoDB. Neste exemplo, a coleção é definida como "principaisLinguagens".

@Id: A anotação @Id é usada para definir o identificador do objeto. O Spring Data MongoDB usa o valor atribuído ao campo anotado com @Id como a chave primária do documento correspondente na coleção MongoDB.

_____________________

Linguagemcontroller: Classe responsavel por manipular (exibir, incluir) as linguagens em uma endereco web.
Inicialmente ela pega as linguagens cadastradas no mongoDB e apresenta no endereco localhost:8080/linguagens

Foi utilizado as seguintes notacoes:
@RestController: A classe sera capaz de lidar com as solicitações HTTP e fornecer respostas HTTP com conteúdo no formato JSON, XML ou outros formatos utilizados por aplicações REST.
@Autowired: Realizou as injecoes de dependencias para que seja possivel conectar a clase ao mongoDB. E uma anotação em Spring que indica a injeção de dependência automática de um bean (objeto gerenciado pelo container do Spring) em um campo, método ou construtor de outra classe.
@Getmapping e @PostMapping: são anotações usadas em aplicativos da web Spring para mapear solicitações HTTP GET E POST para métodos específicos em um controlador.

_____________________

LinguagemRepository: Ela define um repositório para a classe Linguagem e, por meio da notação extends, herda métodos de MongoRepository, como findAll(), findById(), save(), deleteById(), entre outros.

A interface MongoRepository é parametrizada por dois tipos: o primeiro é a entidade que está sendo gerenciada pelo repositório (no caso, a classe Linguagem), e o segundo é o tipo da chave primária da entidade (no caso, uma String que representa o ID da Linguagem).

Dessa forma, o Spring Data MongoDB é capaz de gerar dinamicamente uma implementação do repositório, que pode ser injetada em outras classes que precisam acessar o banco de dados.



