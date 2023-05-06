import { Component } from '@angular/core';

@Component({
  selector: 'app-comp-atributos',
  templateUrl: './comp-atributos.component.html',
  styleUrls: ['./comp-atributos.component.css']
})
export class CompAtributosComponent {
  estilo: string = "desable"
  corFundo: string = "blue"
  corDaFonte: string = "red"
  item: string = ""
  lista: string[] = []
  isEnableBlock: boolean = true

  trocar(){
    this.estilo === "enable" ? this.estilo = "desable" : this.estilo = "enable"
  }

  add(){
    this.lista.push(this.item)
  }
}
