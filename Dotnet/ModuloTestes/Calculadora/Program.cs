using Calculadora.Services;

CalculadoraImplementacao c = new();

int num1 = 1;
int num2 = 1;

Console.WriteLine($"{num1} + {num2} = {c.Somar(num1, num2)}");