import { Component, inject } from '@angular/core';
import { RootstudService } from '../services/rootstud.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-p2stud',
  imports: [CommonModule],
  template: `
     <h2>Student Details </h2>
    <div *ngFor="let student of students" class="divbox">
      ID: {{ student.id }} <br />
      Name: {{ student.name }} <br />
      Age: {{ student.age }}
    </div>
  `,
  styles: [`
      .divbox{
        background-color:pink;
        width:300px;
        margin:10px;
        padding:10px;
      }
    `]
})
export class P2studComponent {

  //Angular 19 introduced a handy way to inject dependencies 
  // without a constructor using inject().

  private studentService = inject(RootstudService);
  students = this.studentService.students;  
  
}
