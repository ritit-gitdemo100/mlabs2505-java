import { Component } from '@angular/core';
import { P1Tdf1Component } from './p1-tdf1/p1-tdf1.component';
import { P2Rcf1Component } from './p2-rcf1/p2-rcf1.component';
import { P3Tdf2Component } from './p3-tdf2/p3-tdf2.component';
import { P4Rcf2Component } from './p4-rcf2/p4-rcf2.component';

@Component({
  selector: 'app-root',
  imports: [
    P1Tdf1Component,
    P2Rcf1Component,
    P3Tdf2Component,
    P4Rcf2Component
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'p6-forms';
}
