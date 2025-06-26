import { Component } from '@angular/core';
import { GradePipe } from '../pipes/grade.pipe';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-p9-custom',
  imports: [GradePipe, CommonModule],
  template: `
      <table  border=1 width='400px' cellpadding='1px'>
        <tr><th>Roll</th><th>Name</th><th>Mark</th><th>Grade</th></tr>
        <tr *ngFor="let stud of students">
              <td>{{stud.id}}</td>
              <td>{{stud.name}}</td>
              <td>{{stud.mark}}</td>
              <td>{{stud.mark | grade}}</td>
        </tr>
      </table>
  `,
  styles: ``
})
export class P9CustomComponent {

  public students = [
    {id: 101, name: 'Raj', mark: 88},
    {id: 102, name: 'Mani', mark: 68},
    {id: 103, name: 'Vinod', mark: 52},
    {id: 104, name: 'Preethi', mark: 78},
    {id: 105, name: 'Prem', mark: 58}
  ];
  
}
