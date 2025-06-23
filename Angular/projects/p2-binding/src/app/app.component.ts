import { Component } from '@angular/core';
import { P1InterpolationComponent } from './p1-interpolation/p1-interpolation.component';
import { P2InterpolationComponent } from './p2-interpolation/p2-interpolation.component';
import { P3PropertyComponent } from './p3-property/p3-property.component';
import { P4EventComponent } from './p4-event/p4-event.component';
import { P5TempvarComponent } from './p5-tempvar/p5-tempvar.component';
import { P6ClassComponent } from './p6-class/p6-class.component';
import { P7StyleComponent } from './p7-style/p7-style.component';
import { P8TwowayComponent } from './p8-twoway/p8-twoway.component';
import { P9OptionalComponent } from './p9-optional/p9-optional.component';

@Component({
  selector: 'app-root',
  imports: [
    P1InterpolationComponent, 
    P2InterpolationComponent,
    P3PropertyComponent,
    P4EventComponent,
    P5TempvarComponent,
    P6ClassComponent,
    P7StyleComponent,
    P8TwowayComponent,
    P9OptionalComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'p2-binding';
}
