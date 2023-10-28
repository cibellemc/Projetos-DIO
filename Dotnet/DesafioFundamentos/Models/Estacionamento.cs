namespace DesafioFundamentos.Models
{
    public class Estacionamento
    {
        private decimal precoInicial = 0;
        private decimal precoPorHora = 0;
        private List<string> veiculos = new();

        public Estacionamento(decimal precoInicial, decimal precoPorHora)
        {
            this.precoInicial = precoInicial;
            this.precoPorHora = precoPorHora;
        }

        public bool placaFormatoInvalido(string placa){
            return string.IsNullOrWhiteSpace(placa);
        }

        public void AdicionarVeiculo()
        {
            // TODO: Pedir para o usuário digitar uma placa (ReadLine) e adicionar na lista "veiculos"
            Console.WriteLine("Digite a placa do veículo para estacionar:");
            string placa = Console.ReadLine();

            while ( placaFormatoInvalido(placa))         
            {
                Console.WriteLine("Formato inválido!\nDigite a placa do veículo para estacionar: ");
                placa = Console.ReadLine();
            }
            veiculos.Add(placa);
        }

        public void RemoverVeiculo()
        {
            // Pedir para o usuário digitar a placa e armazenar na variável placa
            Console.WriteLine("Digite a placa do veículo para remover:");
            string placa = Console.ReadLine();

            // Verifica se a placa está em branco ou veículo não existe
            if ( !veiculos.Any(x => x.ToUpper() == placa.ToUpper()))         
                {
                Console.WriteLine("\nDesculpe, esse veículo não está estacionado aqui. Confira se digitou a placa corretamente");
            }
            else {
                // TODO: Pedir para o usuário digitar a quantidade de horas que o veículo permaneceu estacionado,
                Console.WriteLine("Digite a quantidade de horas que o veículo permaneceu estacionado:");
                int horasEstacionado = Convert.ToInt32(Console.ReadLine());

                // TODO: Realizar o seguinte cálculo: "precoInicial + precoPorHora * horas" para a variável valorTotal                
                decimal valorTotal = precoInicial + (precoPorHora * horasEstacionado) ; 

                // TODO: Remover a placa digitada da lista de veículos
                veiculos.Remove(placa);

                Console.WriteLine($"\nO veículo {placa} foi removido.\nTotal a pagar: R$ {valorTotal}");
                Console.WriteLine($"\nDescrição do serviço:\nPreço base: R$ {precoInicial}\nValor pago por {horasEstacionado} hora(s): R$ {valorTotal - precoInicial}");
            }
        }

        public void ListarVeiculos()
        {
            // Verifica se há veículos no estacionamento
            if (veiculos.Any())
            {
                Console.WriteLine("Os veículos estacionados são:");
                
                // TODO: Realizar um laço de repetição, exibindo os veículos estacionados
                foreach (string carro in veiculos)
                {
                    Console.WriteLine(carro);
                }
            }
            else
            {
                Console.WriteLine("Não há veículos estacionados.");
            }
        }
    }
}