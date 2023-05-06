import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InputComponent } from './input/input.component';
import { ListagemComponent } from './listagem/listagem.component';



@NgModule({
  declarations: [
    InputComponent,
    ListagemComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    InputComponent,
    ListagemComponent
  ]
})
export class ListaModule { }
