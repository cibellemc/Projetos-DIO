import { Component, DoCheck, AfterContentChecked, AfterViewChecked, AfterViewInit, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-check-sample',
  templateUrl: './check-sample.component.html',
  styleUrls: ['./check-sample.component.css']
})
export class CheckSampleComponent implements DoCheck, AfterContentChecked, AfterViewChecked, AfterViewInit, OnDestroy {
  quantidade: number = 0
  constructor(){
  }
  ngOnDestroy(): void {
    console.log("Goodbye my friend");
  }
  adicionar(){
    this.quantidade += 1
  }
  decrementar(){
    this.quantidade -= 1
  }
  ngDoCheck(): void {
    console.log("ngDoCheck");
  }
  ngAfterContentChecked(): void {
    console.log("ngAfterContentChecked");
  }
  ngAfterViewChecked(): void {
    console.log("ngAfterViewChecked");
  }
  ngAfterViewInit(): void {
    console.log("ngAfterViewInit");
    
  }

}
