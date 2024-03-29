using Calculadora.Services;

namespace CalculadoraTestes;

public class CalculadoraTestes
{
    private CalculadoraImplementacao _calc;

    public CalculadoraTestes()
    {
        _calc = new CalculadoraImplementacao();
    }

    [Fact] // se remover deixa de ser um teste
    public void DeveSomar5Com10ERetornar15()
    {
        // Arrange - cenário
        int numero = 5;
        int numero2 = 10;

        // Act - executar
        int resultado = _calc.Somar(numero, numero2);

        // Assert - validar resultado esperado
        Assert.Equal(15, resultado);
    }

    [Fact] // se remover deixa de ser um teste
    public void DeveSomar10Com10ERetornar20()
    {
        // Arrange - cenário
        int numero = 10;
        int numero2 = 10;

        // Act - executar
        int resultado = _calc.Somar(numero, numero2);

        // Assert - validar resultado esperado
        Assert.Equal(20, resultado);
    }

    [Fact]
    public void DeveRetornarSe4EhParERetornarTrue()
    {
        // Arrange - cenário
        int numero = 10;

        // Act - executar
        bool resultado = _calc.EhPar(numero);

        // Assert - validar resultado esperado
        Assert.True(resultado);
    }

    [Theory] 
    [InlineData(new int[] {2,4})]    
    [InlineData(new int[] {6,8,10})]    
    public void DeveVerificarSeOsNumerosSaoParesERetornarVerdadeiro(int[] numeros)
    {
        // Act e Assert
        // foreach (int numero in numeros)
        // {
        //     Assert.True(_calc.EhPar(numero)); 
        // }

        // Act e Assert
        Assert.All(numeros, numero => Assert.True(_calc.EhPar(numero)));
    }
}