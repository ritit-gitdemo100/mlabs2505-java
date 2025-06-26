import { Component } from '@angular/core';
import { RootstudService } from '../services/rootstud.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-p1stud',
  imports: [CommonModule],
  template: `
    <h2>Student List</h2>
    <ul>
      <li *ngFor="let student of students">
        {{ student.name }} 
      </li>
    </ul>
  `,
  styles: ``
})
export class P1studComponent {
 
  students: any[] = [];

  //Construction Injection
  constructor(private studentService: RootstudService) { }

  ngOnInit() {
    this.students = this.studentService.students;
  }

}
