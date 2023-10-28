using System;

namespace ExemploFundamentos.Commun.Models
{
    public class Pessoa
    {
        public string Nome { get; set; }
        public int Idade { get; set; }

        public Pessoa(string nome, int idade)
        {
            Nome = nome;
            Idade = idade;
        }

        public void Apresentar()
        {
            Console.WriteLine($"Meu nome é {Nome} e tenho {Idade} anos de idade.");
        }
    }
}
