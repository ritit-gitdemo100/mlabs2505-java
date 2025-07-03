import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-studlist',
  imports: [RouterLink],
  template: `
    <p>
      studlist works!
    </p>
    <p>
      <a routerLink="add">Add Student </a> | 
      <a routerLink="edit">Edit Student </a> 
    </p>
  `,
  styles: ``
})
export class StudlistComponent {


}
