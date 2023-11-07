namespace CalculadoraTests;
using Calculadora;

public class CalculadoraTests
{
    public Calculadora ConstruirClasse()
    {
        string Data = "07/11/2023";
        Calculadora calculadora = new(Data);

        return calculadora;
    }

    [Theory]
    [InlineData(1, 2, 3)]
    [InlineData(4, 5, 9)]
    public void DeveSomarDoisNumeros(int int1, int int2, int resultado)
    {
        Calculadora calculadora = ConstruirClasse();

        int resultadoSoma = calculadora.Somar(int1, int2);

        // esperado e atual
        Assert.Equal(resultadoSoma, resultado);
    }

    [Theory]
    [InlineData(1, 2, 2)]
    [InlineData(4, 5, 20)]
    public void DeveMultiplicarDoisNumeros(int int1, int int2, int resultado)
    {
        Calculadora calculadora = ConstruirClasse();

        int resultadoMultiplicacao = calculadora.Multiplicar(int1, int2);

        // esperado e atual
        Assert.Equal(resultadoMultiplicacao, resultado);
    }

    [Theory]
    [InlineData(1, 2, -1)]
    [InlineData(4, 5, -1)]
    public void DeveSubtrairDoisNumeros(int int1, int int2, int resultado)
    {
        Calculadora calculadora = ConstruirClasse();

        int resultadoSubtracao = calculadora.Subtrair(int1, int2);

        // esperado e atual
        Assert.Equal(resultadoSubtracao, resultado);
    }

    [Theory]
    [InlineData(2, 2, 1)]
    [InlineData(4, 2, 2)]
    public void DeveDividirDoisNumeros(int int1, int int2, int resultado)
    {
        Calculadora calculadora = ConstruirClasse();

        int resultadoDivisao = calculadora.Dividir(int1, int2);

        // esperado e atual
        Assert.Equal(resultadoDivisao, resultado);
    }

    [Fact]
    public void TestarDivisaoPorZero()
    {
        Calculadora calculadora = ConstruirClasse();

        Assert.Throws<DivideByZeroException>(() => calculadora.Dividir(3, 0));
    }

    [Fact]
    public void TestarHistorico()
    {
        Calculadora calculadora = ConstruirClasse();
        calculadora.Somar(1, 2);
        calculadora.Somar(3, 2);
        calculadora.Somar(2, 2);
        calculadora.Somar(6, 2);

        var lista = calculadora.Historico();
        Assert.NotEmpty(lista);
        Assert.Equal(3, lista.Count);
    }


}