using Microsoft.EntityFrameworkCore;
using ModuloAPI.Entities;

namespace ModuloAPI.Context
{
    public class AgendaContext : DbContext
    {
        // recebe configuração e passa p/ o pai
        public AgendaContext(DbContextOptions<AgendaContext> options) : base(options)
        {

        }

        // significa que é uma classe e também será uma tabela no banco
        public DbSet<Contato> Contatos { get; set; }
    }
}