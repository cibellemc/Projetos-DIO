// AULA 04 - LISTAS
static void PercorreListaDeString(List<string> list)
{
    for (int i = 0; i < list.Count; i++)
    {
        Console.WriteLine($"Posição {i} = {list[i]}");
    }

}

List<string> estados = new()
{
    "PI",
    "PA",
    "BA",
    "BH"
};
Console.WriteLine("Primeira execução:");
PercorreListaDeString(estados);

Console.WriteLine("\nAdicionando Espírito Santo:");
estados.Add("ES");
PercorreListaDeString(estados);

Console.WriteLine("\nRemovendo Belo Horizonte:");
estados.Remove("PA");
PercorreListaDeString(estados);

/* AULA 01 - TESTANDO AMBIENTE
Console.WriteLine("Hello, World!");
Console.WriteLine("Funcionou!"); */

/* AULA 02 - SLN E REFERÊNCIAS
using ExemploFundamentos.Commun.Models;

Pessoa pessoa = new("joao", 30);
pessoa.Apresentar(); */

/* AULA 03 - ARRAYS
int[] numerosInteiros = new int[3];
int[] numerosInteiros2 = new int[] { 4, 5, 6, 7 };
int[] numerosInteirosDobrados = new int[numerosInteiros.Length * 2];

numerosInteiros[0] = 1;
numerosInteiros[1] = 2;
numerosInteiros[2] = 3;

Console.WriteLine("\nPercorrendo com For:");
for (int i = 0; i < numerosInteiros.Length; i++)
{
    Console.WriteLine($"Posição {i} = {numerosInteiros[i]}");
}

Console.WriteLine("\nPercorrendo com ForEach:");
int count = numerosInteiros.Length;
foreach (int numero in numerosInteiros2) 
{
    Console.WriteLine($"Posição {count} = {numero}");
    count++;
} 

// MUDAR TAMANHO DO ARRAY
// classe array - método para redimensionar tamanho
// internamente, faz uma cópia com a nova quantidade. Recebe a referência de memória e o novo tamanho.
Array.Resize(ref numerosInteiros, numerosInteiros.Length * 2); 

static void PercorreArray(int[] array)
{

    for (int i = 0; i < array.Length; i++)
    {
        Console.WriteLine($"Posição {i} = {array[i]}");
    }
}

// COPIAR ARRAY
* classe array - método para copiar um array em outro
* recebe o array a ser copiado, o array onde "colar" e quantos valores copiar 
Array.Copy(numerosInteiros, numerosInteirosDobrados, numerosInteiros.Length);

Console.WriteLine($"- Cópia -");
PercorreArray(numerosInteirosDobrados);

Console.WriteLine($"\n- Preenchendo posições -");
while (count <= numerosInteirosDobrados.Length - 1)
{
    Console.WriteLine($"Posição {count}:");
    numerosInteirosDobrados[count] = Convert.ToInt32(Console.ReadLine());
    count++;
}

Console.WriteLine($"\n- Array Dobrado -");
PercorreArray(numerosInteirosDobrados);
*/
