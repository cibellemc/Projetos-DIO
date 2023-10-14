import { Component, Input } from '@angular/core';

interface Jogo {
  nome: string;
  categoria: string;
  preco: string;
  plataformas: string;
  imagemUrl: string;
}

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent {
  @Input()
  gameCover: string = ""

  @Input()
  gameLabel: string = ""

  @Input()
  gameType: string = ""

  @Input()
  gamePrice: string = ""

  jogos: Jogo[] = [
    {
      nome: 'The Crew™ Motorfest Gold',
      categoria: 'Oferta',
      preco: 'R$407,91',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/imagem-the-crew.jpg'
    },
    {
      nome: 'Hogwarts Legacy Versão PS5 Deluxe',
      categoria: 'Oferta',
      preco: 'R$209,93',
      plataformas: 'PS5',
      imagemUrl: 'assets/imagem-hogwarts.jpg'
    },

    {
      nome: 'Detroit: Become Human',
      categoria: 'Coleção',
      preco: 'R$79,99',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/imagem-detroit.webp'
    },

    {
      nome: "Assassin's Creed® Mirage",
      categoria: 'Novidades',
      preco: 'R$79,99',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/imagem-assassins-creed.jpg'
    },

    {
      nome: 'Battlefield 1',
      categoria: 'Coleção',
      preco: 'R$79,99',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/bt-1.jpg'
    },

    {
      nome: 'Fallout 4',
      categoria: 'Coleção',
      preco: 'R$59,99',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/imagem-fallout-4.jpg'
    },

    {
      nome: 'EA SPORTS FC™ 24',
      categoria: 'Novidades',
      preco: 'R$59,99',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/imagem-ea-sports.jpg'
    },

    {
      nome: 'Honkai: Star Rail',
      categoria: 'Novidades',
      preco: 'R$39,99',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/imagem-honkai.jpg'
    },

    {
      nome: "Call of Duty",
      categoria: 'Coleção',
      preco: 'R$99,99',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/imagem-cod-black-ops-3.jpeg'
    },
    {
      nome: 'Days Gone',
      categoria: 'Coleção',
      preco: 'R$69,99',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/imagem-days-gone.jpeg'
    },

    {
      nome: 'Final Fantasy XV',
      categoria: 'Coleção',
      preco: 'R$89,99',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/imagem-final-fantasy-15.jpg'
    },
    {
      nome: 'Infamous Second Son',
      categoria: 'Coleção',
      preco: 'R$49,99',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/imagem-infamous-second-son.jpg'
    },
    {
      nome: 'Monster Hunter World',
      categoria: 'Coleção',
      preco: 'R$69,99',
      plataformas: 'PS4 | PS5',
      imagemUrl: 'assets/imagem-monster-hunter-world.jpeg'
    },
  ];
  
}
