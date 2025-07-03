import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-stafflayout',
  imports: [RouterLink, RouterOutlet],
  template: `
    <nav>
      <a routerLink="">Home</a> |  
       <a routerLink="add">Add Staff </a> | 
      <a routerLink="edit">Edit Staff </a> 
    </nav>
    <hr>

    <router-outlet></router-outlet>
  `,
  styles: ``
})
export class StafflayoutComponent {

}
