import { Component } from '@angular/core';
import { BehaviorSubject, Subject } from 'rxjs';

@Component({
  selector: 'app-p9-subject',
  imports: [],
  template: `
    <p>
      p9-subject works!
    </p>
  `,
  styles: ``
})
export class P9SubjectComponent {

  ngOnInit() {

    //Using Subject
    const subject = new Subject<number>();

    subject.subscribe(val => console.log('Sub 1:', val));
    subject.next(1);
    subject.next(2);

    subject.subscribe(val => console.log('Sub 2:', val));
    subject.next(3);

    //Using BehaviorSubject
    const bSubject = new BehaviorSubject<number>(0); // initial value = 0

    bSubject.subscribe(val => console.log('BSub 1:', val));
    bSubject.next(1);
    bSubject.next(2);

    bSubject.subscribe(val => console.log('BSub 2:', val));
    bSubject.next(3);


  }
}
