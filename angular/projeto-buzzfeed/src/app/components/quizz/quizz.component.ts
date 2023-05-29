import { Component } from '@angular/core';
import quizz_questions from "../../../assets/data/quizz-questions.json"

@Component({
  selector: 'app-quizz',
  templateUrl: './quizz.component.html',
  styleUrls: ['./quizz.component.css']
})
export class QuizzComponent {
  title: string = ""

  questions: any
  questionSelected: any

  answers: string[] = []
  answerSelected: string = ""

  // ponteiro
  questionIndex: number = 0
  questionMaxIndex: number = 0

  // resposta só aparece quando for true
  finished: boolean = false

  ngOnInit(): void {
    if (quizz_questions) {
      this.finished = false
      this.title = quizz_questions.title

      this.questions = quizz_questions.questions 
      this.questionSelected = this.questions[this.questionIndex]

      this.questionIndex = 0
      this.questionMaxIndex = this.questions.length
    }
  }

  playerChoose(value: string){
    this.answers.push(value)
    this.nextStep()
  }

  async nextStep(){
    this.questionIndex++

    if (this.questionMaxIndex > this.questionIndex) {
      this.questionSelected = this.questions[this.questionIndex]
    } else {
      this.finished = true

      const finalAnswer: string = await this.checkResult(this.answers)
      // garantir que são do mesmo tipo
      this.answerSelected = quizz_questions.results[finalAnswer as keyof typeof quizz_questions.results]

    }
  }
  
  // verificar opção ganhadora
  async checkResult (answers: string[]){
    const result = answers.reduce((previus, current, i, arr) => {
      // o item anterior tem mais que o corrente? retorna previous, se não o atual
      if(arr.filter(item => item === previus).length >
      arr.filter(item => item === current).length){
        return previus
      } else {
        return current
      }
    })
    return result
  }
}
