import { Component } from '@angular/core';
import { P1ObservableComponent } from './p1-observable/p1-observable.component';
import { P2ObservableComponent } from './p2-observable/p2-observable.component';
import { P3ObservableComponent } from './p3-observable/p3-observable.component';
import { P4ObservableComponent } from './p4-observable/p4-observable.component';
import { P5ObservableComponent } from './p5-observable/p5-observable.component';
import { P6RxjsComponent } from './p6-rxjs/p6-rxjs.component';
import { P7RxjsComponent } from './p7-rxjs/p7-rxjs.component';
import { P8RxjsComponent } from './p8-rxjs/p8-rxjs.component';
import { P9SubjectComponent } from './p9-subject/p9-subject.component';
import { P10AsyncComponent } from './p10-async/p10-async.component';

@Component({
  selector: 'app-root',
  imports: [
    P1ObservableComponent,
    P2ObservableComponent,
    P3ObservableComponent,
    P4ObservableComponent,
    P5ObservableComponent,
    P6RxjsComponent,
    P7RxjsComponent,
    P8RxjsComponent,
    P9SubjectComponent,
    P10AsyncComponent,
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'p9-rxjs';
}
