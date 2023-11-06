namespace Calculadora.Services
{
    public class CalculadoraImplementacao
    {
        public int Somar(int num1, int num2)
        {
            return num1 + num2;
        }

        public bool EhPar(int num1)
        {
            return num1 % 2 == 0;
        }
    }
}