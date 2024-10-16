

A programação reativa é um paradigma de programação que trata fluxos de dados e a propagação de mudanças. Em vez de executar instruções sequenciais, ela foca em reagir a eventos ou mudanças de estado. De acordo com o Manifesto Reativo, uma aplicação reativa deve ser: resiliente, elástica, responsiva e orientada à mensagem.

Alguns conceitos fundamentais da programação reativa incluem:

    Fluxos de dados (stream): sequências de eventos ou valores que são observados e manipulados ao longo do tempo, suportando diversos operadores para se chegar a um resultado. Por exemplo: cliques do usuário, mensagens de uma fila ou alterações em uma base de dados.
    Observáveis (observable): fontes de dados que podem ser observadas. Eles emitem eventos que os observadores podem escutar e reagir.
    Observadores (observer): entidades que escutam eventos emitidos pelos observáveis e executam ações em resposta a esses eventos.
    Operadores: funções que permitem transformar, combinar e filtrar fluxos de dados. Por exemplo: map, filter, merge e concat.
    Backpressure: maneira de lidar com fluxos de dados que produzem eventos mais rapidamente do que podem ser consumidos. Técnicas de backpressure ajudam a evitar sobrecarga e perda de dados.

A programação reativa é especialmente útil em aplicativos que precisam lidar com muitos eventos ou requerem alta escalabilidade e desempenho, como sistemas de tempo real, aplicações web interativas e processamento de dados assíncrono.

O Spring Framework oferece um excelente conjunto de recursos para trabalhar com programação reativa, principalmente através do projeto Spring WebFlux, como vemos a seguir:
Spring WebFlux

O Spring WebFlux é o módulo do Spring Framework projetado para criar aplicações reativas. Ele oferece suporte a dois modelos de programação:

    Anotação (Annotation-based): similar ao modelo tradicional do Spring MVC, usando anotações como @Controller, @RestController e @RequestMapping.

    Funcional (Functional): usando handlers e routers, em que os endpoints são definidos de forma programática.

Reactor

O Reactor é uma biblioteca reativa baseada no padrão Reactive Streams, que serve como base para o Spring WebFlux. Ela fornece dois tipos principais de publicadores:

    Mono: representa um único valor assíncrono ou vazio.
    Flux: representa uma sequência de 0 a N valores assíncronos.

Controladores reativos

No Spring WebFlux, você pode definir controladores usando anotações, assim como no Spring MVC, mas retornando os tipos Mono e Flux, citados anteriormente.
WebClient

O WebClient é uma alternativa reativa ao RestTemplate e é usado para fazer chamadas HTTP assíncronas.
Data access com Spring Data R2DBC e Spring Data MongoDB

Para acesso reativo a bancos de dados, o Spring oferece suporte através de projetos como o Spring Data R2DBC, para bancos de dados relacionais, e Spring Data MongoDB, para MongoDB, proporcionando repositórios reativos.
Suporte a SSE (Server-Sent Events) e WebSockets

O Spring WebFlux facilita a criação de aplicações que usam SSE e WebSockets para comunicação bidirecional e em tempo real.
Testes Reativos

Para testes, o Spring fornece suporte para testar fluxos reativos com WebTestClient e StepVerifier.

Veremos muitos desses recursos ao longo do curso.
