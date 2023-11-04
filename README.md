# Engenharia de Software 3 - Design Patterns Strategy
<p>Usando seu conhecimento sobre o design pattern “Strategy” implemente duas classes concretas para o conjunto de classes abaixo.</p>

![image](https://github.com/matheusromeiro/Design_Pattern_Strategy/assets/65318621/bf0f6756-0181-4ef6-a805-0e9eef608668)

- Uma classe deve suportar média aritmética e considerar como aprovados os casos nos quais a média for superior a 5,0.
- A outra deve usar média geométrica e considerar como aprovados os casos em que a média for superior a 7,0.

### Exemplo de uso das classes implementadas:

```
public class Main {
  public static void main(String[] args) {

    Aritmetica calculo = new Aritmetica();

    // Geometrica calculo = new Geometrica();

    Disciplina d = new Disciplina(calculo);

    d.setNome( "Padroes de Desenvolvimento");
    d.setP1(10); d.setP2(5);
    d.CalcularMedia();
    System.out.println(
      String.format("P1:%.2f P2:%.2f Media:%.2f  Situacao: %s",d.getP1(),d.getP2(), d.getMedia(), d.getSituacao())
    );
  }
}
```

### O QUE VOCÊ DEVE ENTREGAR
<p>Como resposta a esta tarefa, deve ser fornecidoum  link  para  um  repositóriopúblicono  GitHub  criado  por  você,  que  contenha  a  sua  implementação  pararesolução do problema proposto.</p>
