# Desafio POO

Neste desafio, criei uma classe `iPhone` aplicando alguns dos pilares da Orientação a Objetos: abstração, herança e encapsulamento.

### Abstração
- A classe `iPhone` encapsula o comportamento de um dispositivo móvel avançado, concentrando-se nos aspectos relevantes para sua funcionalidade. Métodos abstratos, como `ligar`, `atender`, `iniciarCorreioDeVoz`, são implementados para representar ações que o usuário pode realizar com o telefone sem se preocupar com os detalhes internos de como essas ações são executadas.

### Herança
- A classe `iPhone` pode herdar características de classes mais genéricas, como `ReprodutorMusical` ,`AparelhoTelefonico`, se desejado. Por exemplo, o `ReprodutorMusical` pode ter métodos e atributos que são comuns a todos os smartphones, enquanto um `iPhone` específico pode herdar esses comportamentos básicos e adicionar funcionalidades exclusivas que são específicas dos iPhones.

### Encapsulamento
- O encapsulamento é aplicado ao definir atributos privados dentro da classe `iPhone`, como Métodos públicos e privatos, como são disponibilizados para permitir acesso controlado a esses atributos. Isso garante que o estado interno do objeto `iPhone` seja manipulado apenas de maneira segura e controlada, evitando alterações inesperadas ou não autorizadas.
