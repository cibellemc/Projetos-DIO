namespace Calculadora
{
    public class Calculadora
    {
        private List<string> _Historico;
        private string Data;
        public Calculadora(string data)
        {
            _Historico = new List<string>();
            Data = data;
        }

        public int Somar(int numero1, int numero2)
        {
            int resultado = numero1 + numero2;
            _Historico.Insert(0, $"\nData: {Data} - Resultado: {resultado}");

            return resultado;
        }

        public int Multiplicar(int numero1, int numero2)
        {
            int resultado = numero1 * numero2;
            _Historico.Insert(0, $"\nData: {Data} - Resultado: {resultado}");

            return resultado;
        }

        public int Dividir(int numero1, int numero2)
        {
            int resultado = numero1 / numero2;
            _Historico.Insert(0, $"\nData: {Data} - Resultado: {resultado}");

            return resultado;
        }

        public int Subtrair(int numero1, int numero2)
        {
            int resultado = numero1 - numero2;
            _Historico.Insert(0, $"\nData: {Data} - Resultado: {resultado}");

            return resultado;
        }

        public List<string> Historico()
        {
            // remove o excesso. só preciso dos 3 primeiros (posições 1,2,3)
            _Historico.RemoveRange(3, _Historico.Count - 3);
            return _Historico;
        }
    }
}