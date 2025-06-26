import { Component } from '@angular/core';
import { P1studComponent } from './p1stud/p1stud.component';
import { P2studComponent } from './p2stud/p2stud.component';
import { P3empComponent } from './p3emp/p3emp.component';
import { P8hooksComponent } from './p8hooks/p8hooks.component';
import { P5inputparentComponent } from './p5inputparent/p5inputparent.component';
import { P7outputparentComponent } from './p7outputparent/p7outputparent.component';

@Component({
  selector: 'app-root',
  imports: [
    P1studComponent, 
    P2studComponent,
    P3empComponent,
    P5inputparentComponent,
    P7outputparentComponent,
    P8hooksComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
}
