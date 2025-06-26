import { Component } from '@angular/core';
import { NullempService } from '../services/nullemp.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-p3emp',
  imports: [CommonModule],
  //include providers in the components for using service with providedin as null
  providers:[NullempService],
  template: `
    <h2>Employee List</h2>
    <table>
      <tr><th>Id</th><th>Name</th><th>Position</th></tr>
      <tr *ngFor="let emp of employees">
        <td>{{ emp.id }} </td>
        <td> {{ emp.name }} </td>
        <td> {{ emp.position }} </td>
      </tr>
    </table>
  `,
  styles: [`
      td, th {
       border:1px solid black; 
       padding:4px 10px;
      }
    `]
})
export class P3empComponent {
  employees:any[] = [];

  constructor(private empService: NullempService) {}

  ngOnInit() {
    this.employees = this.empService.employees;
  }
}
