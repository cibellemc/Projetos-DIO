import { Component } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent {
  produtos: string[] = []
  menuType: string = "";

  constructor(){
    this.produtos = [
      "mouse",
      "teclado",
      "cabo",
      "fonte"
    ]
  }

  //reatividade, se muda produtos, muda layout
  add(){
    this.produtos.push("ci") // add a lista
    // this.produtos.pop() remove útimo da lista
  }

  remove(index: number){
    this.produtos.splice(index, 1)
  }
}
