# Como usar este repositório

## Ambiente

Instale JDK 21 e Maven 3.9+, depois confirme:

```bash
java -version
mvn -version
```

Para executar os testes:

```bash
mvn test
```

Os testes da Semana 01 **falham intencionalmente** até que você implemente os métodos marcados `TODO`. Isso não é um problema no ambiente: é o ponto de partida dos exercícios.

## Estrutura

- `src/main/java/.../week01`: espaço para você implementar as soluções.
- `src/test/java/.../week01`: contratos e testes automatizados.
- `docs/semana-01-diagnostico.md`: roteiro de avaliação inicial.
- `.github/workflows/java-ci.yml`: executa os testes a cada push e pull request.
- Issues/PRs: acompanhe tentativas e revisões, sem publicar seus dados pessoais.

## Regras

1. Tente por 25–35 minutos antes de pedir dicas.
2. Explique solução, Big O e edge cases em suas próprias palavras.
3. Refatore depois que os testes passarem.
4. Refaça problemas em 2, 7 e 21 dias sem olhar o código anterior.
5. Use IA para revisar **depois** da tentativa. Em avaliações, não use IA.
6. O progresso mensal e as notas detalhadas ficam no seu Google Drive.

## Primeira tarefa

Leia `docs/semana-01-diagnostico.md`; implemente `TwoSum.findIndices` ou `FirstUniqueCharacter.firstUniqueCodePoint`; execute `mvn test` e faça commit com uma explicação de raciocínio.
