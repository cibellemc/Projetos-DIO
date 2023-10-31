using System.Text;
using DesafioHotel.Models;

Console.OutputEncoding = Encoding.UTF8;

// Cria os modelos de hóspedes e cadastra na lista de hóspedes
List<Pessoa> hospedes = new();

Pessoa p1 = new(nome: "Hóspede 1");
Pessoa p2 = new(nome: "Hóspede 2");
Pessoa p3 = new(nome: "Hóspede 3");
Pessoa p4 = new(nome: "Hóspede 4");

hospedes.Add(p1);
hospedes.Add(p2);
hospedes.Add(p3);
hospedes.Add(p4);

// Cria a suíte
Suite suiteGold = new(tipoSuite: "Gold", capacidade: 4, valorDiaria: 60);
Suite suitePremium = new(tipoSuite: "Premium", capacidade: 5, valorDiaria: 100);
// Suite suiteEconomica = new(tipoSuite: "Economica", capacidade: 2, valorDiaria: 35);

// Cria uma nova reserva, passando a suíte e os hóspedes
// Reserva reservaEconomica = new(diasReservados: 5);
// reservaEconomica.CadastrarSuite(suiteEconomica);
// reservaEconomica.CadastrarHospedes(hospedes);

Reserva reservaGold = new(diasReservados: 2);
reservaGold.CadastrarSuite(suiteGold);
reservaGold.CadastrarHospedes(hospedes);

Reserva reservaPremium = new(diasReservados: 15);
reservaPremium.CadastrarSuite(suitePremium);
reservaPremium.CadastrarHospedes(hospedes);


// Exibe a quantidade de hóspedes e o valor da diária
// Console.WriteLine($"\nHóspedes: {reservaEconomica.ObterQuantidadeHospedes()}");
// Console.WriteLine($"Valor diária: {reservaEconomica.CalcularValorDiaria()}");

Console.WriteLine($"\nHóspedes: {reservaGold.ObterQuantidadeHospedes()}");
Console.WriteLine($"Valor diária: {reservaGold.CalcularValorDiaria()}");

Console.WriteLine($"\nHóspedes: {reservaPremium.ObterQuantidadeHospedes()}");
Console.WriteLine($"Valor diária: {reservaPremium.CalcularValorDiaria()}");